package L4;

public class NotificationExample {
    public static void main(String[] args) {
        NotificationService emailService = new EmailService("user@example.com");
        NotificationService smsService = new SMSNotificationService("9876543210");

        emailService.sendNotifications("hello, this is an email notification.");
        smsService.sendNotifications("hi there, this is an sms notification.");

        emailService.subscribeToTopic("news");
        smsService.subscribeToTopic("alerts");
    }
}
