import javax.management.ValueExp;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.Vector;
import java.util.concurrent.Semaphore;

public interface MessageAPI extends java.rmi.Remote {

    void MsqQ_Init(String ServerAddress) throws RemoteException, MalformedURLException;
    EMomError MsgQ_CreateQueue(String msgqname) throws RemoteException, MalformedURLException;
    EMomError MsgQ_CloseQueue(String msgqname) throws RemoteException, MalformedURLException;
    EMomError MsgQ_SendMessage(String msgqname, String message, int type) throws RemoteException, MalformedURLException;
    String MsgQ_ReceiveMessage(String msgqname, int type) throws RemoteException, MalformedURLException;
    EMomError MsgQ_CreateTopic(String topicname, String mode) throws RemoteException, MalformedURLException;
    EMomError MsgQ_CloseTopic(String topicname) throws RemoteException, MalformedURLException, InterruptedException;
    EMomError MsgQ_Publish(String topic, String message, int type) throws RemoteException, MalformedURLException;
    EMomError MsgQ_Subscribe(String topic, TopicListenerInterface listener) throws RemoteException, MalformedURLException;
    Semaphore getSemaphore(int subs) throws RemoteException, MalformedURLException;
    void catchSem() throws RemoteException, MalformedURLException, InterruptedException;
    void releaseSem() throws RemoteException, MalformedURLException;
}
