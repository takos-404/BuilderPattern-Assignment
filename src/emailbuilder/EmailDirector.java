package emailbuilder;

public class EmailDirector {
    private static final String NO_REPLY_EMAIL = "noreply@mycompany.com";
    private static final String SUPPORT_EMAIL = "support@mycompany.com";
    public void makeWelcomeEmail(EmailBuilder b){
        b.setFrom(NO_REPLY_EMAIL).setTo("new.user@gmail.com").setSubject("Добро пожаловать!").setBody("Привет! Спасибо за регистрацию на нашем сервисе.");
    }
    public void makeSupportTicketEmail(EmailBuilder builder) {
        builder.setFrom(SUPPORT_EMAIL).setTo("angry.client@yahoo.com").setSubject("Ваша заявка принята").setBody("Здравствуйте! Мы получили ваше обращение и скоро ответим.");
    }
}
