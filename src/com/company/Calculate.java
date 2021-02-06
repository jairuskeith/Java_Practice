package com.company;

public class Calculate {

    private Double result = 0.0;
    private Double[] values;

    //
    Calculate(Double... values) {
        this.values = values;
    }

    //
    public Calculate Add(Double... values) {
        for (Double value : values) {
            result += value;
        }

        return this;
    }

    //
    public Calculate Add(Integer... values) {
        for (Integer value : values) {
            result += value;
        }

        return this;
    }

    public Double Add(Double... values) {
        for (Double value : values) {
            result += value;
        }

        return result;
    }

    //
    public Calculate Subtract(Double... values) {
        for (Double value : values) {
            result += value;
        }

        return this;
    }

    //
    public Calculate MultiplyBy(Integer value) {
        result *= value;
        return this;
    }

    //
    public Calculate MultiplyBy(Double value) {
        result *= value;
        return this;
    }

    public Calculate DivideBy(Double value) {
        result = result /  value;
        return this;
    }

    public Boolean IsEven() {
        return result % 2 == 0;
    }

    public Double Result() {
        return result;
    }
}
