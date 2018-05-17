package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForumUsers = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForumUsers.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> ChronoUnit.DAYS.between(user.getDateOfBirth(), LocalDate.now())>7304)
                .filter(user -> user.getPostPublished() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        for (Map.Entry entry: theResultMapOfUsers.entrySet()) {
            System.out.println(entry);
        }
    }
}