package com.company;

public class Main {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.Add(1.0, 2.0, 4.0, 5.0);
        calculate.Add(1, 2, 4, 5).IsEven();

        System.out.println(calculate.Add(2).MultiplyBy(3).IsEven());
        System.out.println(calculate.Add(2).MultiplyBy(3).Result());
    }
}
