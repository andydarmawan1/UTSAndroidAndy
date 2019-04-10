package com.andy.uts_andydarmawan_mi2d;

import com.andy.uts_andydarmawan_mi2d.models.Note;
import com.andy.uts_andydarmawan_mi2d.models.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {
    private static List<User> users;
    private static List<Note> notes;

    static {
        users = new ArrayList<>();
        users.add(new User("andy", "rahasia"));
        users.add(new User("nabilah", "rahasia"));
        users.add(new User("abu", "rahasia"));

        notes = new ArrayList<>();
        notes.add(new Note("Note 1", new Date(),  "Lorem ipsum dolor sit amet, consectetur adipiscing "));
        notes.add(new Note("Note 2", new Date(), "Ut enim ad minim veniam, quis nostrud exercitation "));
        notes.add(new Note("Note 3", new Date(), "Duis aute irure dolor in reprehenderit in voluptate "));
        notes.add(new Note("Note 4", new Date(), "Excepteur sint occaecat cupidatat non proident, sunt "));
        notes.add(new Note("Note 3", new Date(), "Duis aute irure dolor in reprehenderit in voluptate"));
        notes.add(new Note("Note 5", new Date(), "Excepteur sint occaecat cupidatat non proident, "));
        notes.add(new Note("Note 6", new Date(), "Duis aute irure dolor in reprehenderit "));
        notes.add(new Note("Note 7", new Date(), "Excepteur sint occaecat cupidatat non proident, "));
        notes.add(new Note("Note 8", new Date(), "Duis aute irure dolor in reprehenderit "));
        notes.add(new Note("Note 9", new Date(), "Excepteur sint occaecat cupidatat non proident"));
        notes.add(new Note("Note 10", new Date(), "Duis aute irure dolor in reprehenderit"));
        notes.add(new Note("Note 11", new Date(), "Excepteur sint occaecat cupidatat non proident"));
        notes.add(new Note("Note 12", new Date(), "Duis aute irure dolor in reprehenderit "));
        notes.add(new Note("Note 13", new Date(), "Excepteur sint occaecat cupidatat non proident"));

    }
    public static List<User> getUsers() {
        return users;
    }

    public static List<Note> getNotes() {
        return notes;
    }
}
