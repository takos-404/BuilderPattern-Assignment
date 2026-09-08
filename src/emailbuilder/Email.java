package emailbuilder;

public class Email {
    private final String from,to,subject,body;
    public Email(String from, String to, String subject, String body) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
    @Override
    public String toString() {
        return "Sendind from: "+from+
                "\nto: "+to+"\nTheme: "+subject+"\nMessage: "+body;
    }
}

