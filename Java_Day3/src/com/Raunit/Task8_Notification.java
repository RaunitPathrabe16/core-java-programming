package com.Raunit;

abstract class Notification {

    abstract void sendMessage();
}

class EmailNotification extends Notification {

    void sendMessage() {
        System.out.println("Email Notification Sent");
    }
}

class SMSNotification extends Notification {

   
    void sendMessage() {
        System.out.println("SMS Notification Sent");
    }
}

public class Task8_Notification {

    public static void main(String[] args) {

        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        email.sendMessage();
        sms.sendMessage();
    }
}
