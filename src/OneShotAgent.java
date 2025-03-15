import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class OneShotAgent extends Agent {
    @Override
    protected void setup() {
        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                System.out.println(getLocalName() + ": Executing one-time task.");
            }
        });
    }
}
