import jade.core.Agent;

public class TaskAgent extends Agent {
    @Override
    protected void setup() {
        System.out.println(getLocalName() + ": Computing the sum of first 10 numbers...");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(getLocalName() + ": The sum is " + sum);
    }
}
