import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class SenderAgent extends Agent {
    @Override
    protected void setup() {
        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.addReceiver(new jade.core.AID("ReceiverAgent", AID.ISLOCALNAME));
                msg.setContent("Hello, ReceiverAgent!");
                send(msg);
                System.out.println(getLocalName() + ": Message sent to ReceiverAgent.");
            }
        });
    }
}
