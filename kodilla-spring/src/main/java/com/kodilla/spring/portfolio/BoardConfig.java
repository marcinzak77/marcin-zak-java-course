package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDo")
    TaskList tasks;


    @Bean(name = "toDo")
    public TaskList createToDoList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "inProgress")
    public TaskList createInProgressList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "doneList")
    public TaskList createDoneList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean
    public Board createBoard() {
        Board board = new Board(createToDoList(), createInProgressList(),createDoneList());
        return board;
    }
}
