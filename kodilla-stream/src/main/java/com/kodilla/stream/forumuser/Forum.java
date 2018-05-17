package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Rek92", 'M', LocalDate.of(1992,2,2), 77 ));
        userList.add(new ForumUser(2, "miraqulum", 'F', LocalDate.of(1999, 5, 20), 123 ));
        userList.add(new ForumUser(4, "Gofer", 'F', LocalDate.of(1987, 8, 11), 9 ));
        userList.add(new ForumUser(5, "UglyKid", 'M', LocalDate.of(1990,2, 9), 223 ));
        userList.add(new ForumUser(6, "Kuiden", 'M', LocalDate.of(1980, 3, 10), 0 ));
        userList.add(new ForumUser(7, "SinCin", 'M', LocalDate.of(1970, 11, 11), 50 ));
        userList.add(new ForumUser(8, "Lapirus", 'F', LocalDate.of(1985,5, 12), 11 ));
        userList.add(new ForumUser(9, "MerUR", 'F', LocalDate.of(1985,5, 12), 5 ));
        userList.add(new ForumUser(10, "Niko", 'M', LocalDate.of(1998,6, 15), 311 ));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
