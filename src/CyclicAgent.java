import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class CyclicAgent extends Agent {
    @Override
    protected void setup() {
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                System.out.println(getLocalName() + ": I am running...");
                block(2000); // Wait 2 seconds before running again
            }
        });
    }
}
