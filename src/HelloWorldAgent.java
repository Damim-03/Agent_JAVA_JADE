import jade.core.Agent;

public class HelloWorldAgent extends Agent {
    @Override
    protected void setup() {
        System.out.println("Hello World, I'm an agent!");
    }
}
