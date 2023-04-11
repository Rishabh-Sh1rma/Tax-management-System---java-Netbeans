
package team;
import java.util.*;
import java.util.logging.*;
import javax.mail.*;
import javax.mail.internet.*;


public class email {
    
    public static void sendMail (String recepient) throws Exception{
        Properties prop = new Properties();
        
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        
        String myAccount = "rishabhar1974@gmail.com";
        String password = "yjsdpyzrbaeqxyng";
        
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccount, password);
            }
        });
        
        Message message = prepareMessage(session, myAccount, recepient);
        
        Transport.send(message);
        System.out.println("Message sent succesfully");
    }
    
    private static Message prepareMessage (Session session, String myAccount, String recepient){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccount));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("JAVA MAIL");
            message.setText("My First Mail!");
            return message;
        } 
        catch (AddressException ex) {
            Logger.getLogger(email.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (MessagingException ex) {
            Logger.getLogger(email.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String [] args) throws Exception{
      email.sendMail("rishabh1974@@gmail.com");
  }  
}