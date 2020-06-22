package at.codersbay.datastructures;

import java.util.Objects;

/**
 * A Fractional is a class that consists of a numerator and a denominator
 * e.g.: 1/2, 1/3, 24/37, ..
 */

public class Fractional {

    public Integer numerator;
    public Integer denominator;

    public Fractional(Integer numerator, Integer denominator) {

        if (numerator == null) {
            throw new IllegalArgumentException("You shall not pass null!");
        }
        if (denominator == null) {
            throw new IllegalArgumentException("You shall not pass null!");
        }
        if (denominator == 0) {
            throw new IllegalArgumentException("You shall not divide through zero!");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Integer getNumerator() {
        // TODO implement to fix tests in FractionalTest1

        return this.numerator;
    }

    public Integer getDenominator() {
        // TODO implement to fix tests in FractionalTest1

        return this.denominator;
    }

    public Float asFloat() {
        // TODO implement to fix tests in FractionalTest2
        return (float)numerator/this.denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fractional that = (Fractional) o;
        return (this.numerator*that.denominator) == (that.numerator*this.denominator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public Fractional multiply(Fractional other) {
        // TODO implement to fix tests in FractionalTest4

        Integer newmerator = this.numerator*other.numerator;
        Integer denewminator = this.denominator*other.denominator;

        return new Fractional(newmerator, denewminator);
    }

    public Fractional multiply(Integer other) {
        // TODO implement to fix tests in FractionalTest4

        return new Fractional(numerator*other, denominator);
    }

    public Fractional divide(Fractional other) {
        // TODO implement to fix tests in FractionalTest5
        return new Fractional(this.numerator*other.denominator, other.numerator*this.denominator);
    }

    public Fractional divide(Integer other) {
        // TODO implement to fix tests in FractionalTest5

        return new Fractional(this.numerator, this.denominator*other);
    }

    public Fractional add(Fractional other) {
        // TODO implement to fix tests in FractionalTest6
        if(this.denominator.equals(other.denominator)){
            return new Fractional(this.numerator+other.numerator, this.denominator);
        }
        else{
            return new Fractional((this.numerator*other.denominator)+(other.numerator*this.denominator),other.denominator*this.denominator);
        }
    }

    public Fractional add(Integer other) {
        // TODO implement to fix tests in FractionalTest6

        return new Fractional(this.numerator+(other*this.denominator), this.denominator );
    }

    public Fractional subtract(Fractional other) {
        // TODO implement to fix tests in FractionalTest7
        if(this.denominator.equals(other.denominator)){
            return new Fractional(this.numerator-other.numerator, this.denominator);
        }
        else{
            return new Fractional((this.numerator*other.denominator)-(other.numerator*this.denominator),
                    other.denominator*this.denominator);
        }
    }

    public Fractional subtract(Integer other) {
        // TODO implement to fix tests in FractionalTest7


        return new Fractional(this.numerator-(this.denominator*other), this.denominator);
    }

}