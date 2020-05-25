package com.srihari.java.b_advanced.b_generics.f_inheritance;

public class GenericApplication {
    public static void main(String[] args) {
        User user = new Instructor(10);
        // we can pass new User() or new Instructor()
        CustomUtil.printUser(user);

        var users = new CustomList<User>();
        CustomUtil.printUsers1(users);

        var instructors = new CustomList<Instructor>();
        CustomUtil.printUsers2(instructors);
    }
}
