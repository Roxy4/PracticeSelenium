package Message;

public class Message {
    String S;
    String R;
    String M;

    public Message() {
    }

    boolean sendMessage(String s, String r, String m) {
        if (s.isEmpty() || r.isEmpty() || m.isEmpty())
            return false;
        else{
            return true;

        }


    }

}




