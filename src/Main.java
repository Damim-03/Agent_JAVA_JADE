import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

public class Main {
    public static void main(String[] args) {
        try {
            // Get the JADE runtime
            Runtime runtime = Runtime.instance();

            // Create a default profile
            Profile profile = new ProfileImpl();
            profile.setParameter(Profile.GUI, "true"); // Enables JADE GUI

            // Create the main container
            AgentContainer mainContainer = runtime.createMainContainer(profile);

            // Start the agents
            AgentController senderAgent = mainContainer.createNewAgent("SenderAgent", "SenderAgent", new Object[]{});
            AgentController receiverAgent = mainContainer.createNewAgent("ReceiverAgent", "ReceiverAgent", new Object[]{});

            senderAgent.start();
            receiverAgent.start();

        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
    }
}
