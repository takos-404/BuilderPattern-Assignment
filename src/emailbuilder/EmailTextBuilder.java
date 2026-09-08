package emailbuilder;

public class EmailTextBuilder implements EmailBuilder {
    private final StringBuilder sb = new StringBuilder();

    @Override
    public EmailBuilder setTo(String to) {
        sb.append("To: ").append(to).append("\n");
        return this;
    }

    @Override
    public EmailBuilder setFrom(String from) {
        sb.append("From: ").append(from).append("\n");
        return this;
    }

    @Override
    public EmailBuilder setSubject(String subject) {
        sb.append("Subject: ").append(subject).append("\n");
        return this;
    }

    @Override
    public EmailBuilder setBody(String body) {
        sb.append("Body: ").append(body).append("\n");
        return this;
    }
    public String getResult(){
        return sb.toString();
    }
}
