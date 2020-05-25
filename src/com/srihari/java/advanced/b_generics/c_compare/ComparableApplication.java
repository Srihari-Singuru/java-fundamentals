package com.srihari.java.advanced.b_generics.c_compare;

public class ComparableApplication {
    public static void main(String[] args) {
        var user1 = new CustomUser(1);
        var user2 = new CustomUser(2);

        if(user1.compareTo(user2) < 0)
            System.out.println("User1 < User2");
        else if(user1.compareTo(user2) == 0)
            System.out.println("User1 = User2");
        else
            System.out.println("User1 > User2");
    }
}
