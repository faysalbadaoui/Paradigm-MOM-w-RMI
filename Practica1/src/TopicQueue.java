import java.util.HashMap;
import java.util.Vector;

public class TopicQueue {
    Vector<TopicListenerInterface> clientsSuscribed;
    Vector<Message> messages;
    public String modeP = "";
    public TopicQueue(String mode){
        clientsSuscribed = new Vector<>();
        messages = new Vector<>();
        modeP = mode;
    }
    public void addMessage(Message mess){
        messages.add(mess);
    }
    public void subClient(TopicListenerInterface cl){
        clientsSuscribed.add(cl);
    }
    public void unsubClient(TopicListenerInterface cl){
        clientsSuscribed.remove(cl);
    }
    public String getMode(){
        return modeP;
    }
}
