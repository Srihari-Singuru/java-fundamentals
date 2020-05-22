package com.srihari.java.advanced.generics.inheritance;

public class CustomUtil {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) > 0 ? first : second;
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    public static void printUsers1(CustomList<User> users){
        // TODO
    }

    // class CAP#1
    public static void printUsers2(CustomList<?> users){
        Object obj = users.get(0); // We cannot replace Object with either User ot Instructor
    }

    // class CAP#1 extends User {}
    // with extends, we can only read, but not add to list
    public static void printUsers3(CustomList<? extends User> users){
        User obj = users.get(0);    // We cannot replace User with Instructor

        // With "? extends User", we cannot add User or Instructor to the list, but only Object
        //users.add("Don't know which object to give"); // We cannot
    }

    // with super, we can only add, but not read from list
    public static void printUsers4(CustomList<? super User> users){
        Object obj = users.get(0);    // We cannot read User or Instructor, but only Object

        // With "? super User", we can add to the list
        users.add(new User(10));
        users.add(new Instructor(10));
    }
}
