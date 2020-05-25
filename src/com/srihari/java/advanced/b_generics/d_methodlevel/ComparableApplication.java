package com.srihari.java.advanced.b_generics.d_methodlevel;

public class ComparableApplication {
    public static void main(String[] args) {
        var max1 = CustomUtil.max(1, 4);
        var max2 = CustomUtil.max(new CustomUser(10), new CustomUser(20));
        System.out.println(max1 +" ## "+ max2);
    }
}
