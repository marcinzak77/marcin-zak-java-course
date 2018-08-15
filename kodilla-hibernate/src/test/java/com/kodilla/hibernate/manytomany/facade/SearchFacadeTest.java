package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTest {
    int softwareMachineId;
    int dataMaestersId;
    int greyMatterId;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchFacade searchFacade;

    @Before
    public void prepareTestData() {
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        greyMatterId = greyMatter.getId();
    }

    @After
    public void cleanTestData() {
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
            System.out.println("Done clean up");
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void shouldFindCompaniesContainingChainOfLetters() {
        //Given

        //When
        List<Company> queryResult = searchFacade.getCompaniesContaingLetters("ste");
        List<Company> queryResultTwo = searchFacade.getCompaniesContaingLetters("ter");

        //Then
        Assert.assertEquals(1, queryResult.size());
        Assert.assertEquals(2, queryResultTwo.size());
    }

    @Test
    public void shouldFindEmployeesContainingChainOfLetters() {
        //Given

        //When
        List<Employee> queryResult = searchFacade.getEmployeesCotainingLetters("son");

        //Then
        Assert.assertEquals("Clarckson", queryResult.get(0).getLastname());
    }
}