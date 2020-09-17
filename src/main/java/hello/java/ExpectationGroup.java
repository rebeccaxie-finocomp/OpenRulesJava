package hello.java;

import java.util.Date;

public class ExpectationGroup {
    Expectation[] expectations;
    double total;

    public Expectation[] getExpectations() {
        return this.expectations;
    }
    public void setExpectations(Expectation[] expectations) {
        this.expectations = expectations;
    }

    public double getTotal(){return this.total;}
    public void setTotal(double total) {this.total = total;}
}