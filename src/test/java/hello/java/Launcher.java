package hello.java;

import com.openrules.core.DecisionModel;
import com.openrules.core.Goal;

public class Launcher {

    public static void main(String[] args) {
        DecisionModel model = new DecisionModelHello();
        Goal goal = model.createGoal();

        for(int i=0; i<bankStatementsArray.get().length; i++){
            BankStatement bankStatment = bankStatementsArray.get()[i];
            Expectation expectation = expectationsArray.get()[i];
            goal.use("BankStatement", bankStatment);
            goal.use("Expectation", expectation);
            goal.execute();
        }
    }
}
