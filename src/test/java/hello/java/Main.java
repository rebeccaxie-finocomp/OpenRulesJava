package hello.java;

import com.openrules.core.DecisionModel;
import com.openrules.core.Goal;

public class Main {

    public static void main(String[] args) {
        DecisionModel model = new DecisionModelHello();
        Goal goal = model.createGoal();
//        goal.put("trace", "On");
//        goal.put("debug", "On");

        for(int i=0; i<bankStatementsArray.get().length-1; i++){
            ExpectationGroup expectationGroup = new ExpectationGroup();
            BankStatement bankStatment = bankStatementsArray.get()[i];
            Expectation[] expectations = {expectationsArray.get()[i]};
            expectationGroup.setExpectations(expectations);

            goal.use("BankStatement", bankStatment);
            goal.use("ExpectationGroup", expectationGroup);
            goal.execute();
            System.out.println(expectationGroup.getExpectations()[0].match);
        }

        ExpectationGroup expectationGroup = new ExpectationGroup();
        BankStatement bankStatment = bankStatementsArray.get()[2];
        Expectation[] expectations = {expectationsArray.get()[2], expectationsArray.get()[3]};
        expectationGroup.setExpectations(expectations);

        goal.use("BankStatement", bankStatment);
        goal.use("ExpectationGroup", expectationGroup);
        goal.execute();
        System.out.println(expectationGroup.getExpectations()[0].match);
    }
}
