package L4;

public class SMSNotificationService implements NotificationService {
    private String phonenumber;

    public SMSNotificationService(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending notification to " + phonenumber);
    }

    @Override
    public void subscribeToTopic(String topic) {
        System.out.println("Subscribed " + phonenumber + " to SMS notification for topic " + topic);
    }
}
