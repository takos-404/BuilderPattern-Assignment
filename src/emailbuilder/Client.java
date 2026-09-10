package emailbuilder;

public class Client {
    public static void main(String[] args) {
        try {
            EmailDirector director = new EmailDirector();
            EmailObjectBuilder objBuilder = new EmailObjectBuilder();
            director.makeSupportTicketEmail(objBuilder);
            Email email = objBuilder.getResult();
            System.out.println(email);

            System.out.println("----next lesgo----");

            EmailTextBuilder textBuilder = new EmailTextBuilder();
            director.makeSupportTicketEmail(textBuilder);
            String res = textBuilder.getResult();
            System.out.println(res);
        } catch(IllegalStateException e) {
            System.out.println("Exception is: " + e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
}
