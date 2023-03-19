import java.rmi.RemoteException;

public interface MessageAPI extends java.rmi.Remote{
    /*void MsqQ_Init(String ServerAddress);
EMomError MsgQ_CreateQueue(String msgqname);
EMomError MsgQ_CloseQueue(String msgqname);
EMomError MsgQ_SendMessage(String msgqname, String message, int type);
String MsgQ_ReceiveMessage(String msgqname, int type);
EMomError MsgQ_CreateTopic(String topicname, EPublishMode mode);
EMomError MsgQ_CloseTopic(String topicname);
EMomError MsgQ_Publish(String topic, String message, int type);
EMomError MsgQ_Subscribe(String topic, TopicListenerInterface listener);*/
    void sendMessage(String message) throws RemoteException;
    String receiveMessage(String recipient) throws RemoteException;
}