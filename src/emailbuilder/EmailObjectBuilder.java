package emailbuilder;

public class EmailObjectBuilder implements EmailBuilder {
    private String from, to, subject, body;

    @Override
    public EmailBuilder setFrom(String from) {
        this.from=from;
        return this;
    }

    @Override
    public EmailBuilder setTo(String to) {
        this.to=to;
        return this;

    }

    @Override
    public EmailBuilder setSubject(String subject) {
        this.subject=subject;
        return this;
    }

    @Override
    public EmailBuilder setBody(String body) {
       this.body=body;
       return this;
    }
    public Email getResult(){
        if (from == null || to == null) throw new IllegalStateException("Поля From и To обязательны для заполнения");
        return new Email(from, to, subject, body);
    }
}
