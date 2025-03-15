import jade.core.Agent;

public class SimpleAgent extends Agent {
    @Override
    protected void setup() {
        System.out.println("Agent " + getLocalName() + " is started.");
    }

    @Override
    protected void takeDown() {
        System.out.println("Agent " + getLocalName() + " is shutting down.");
    }
}
