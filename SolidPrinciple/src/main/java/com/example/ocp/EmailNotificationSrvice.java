package com.example.ocp;

public class EmailNotificationSrvice implements NotificationService{

     // this class is closed for modification but open for extending feature or functionality
    @Override
    public void transaction(String medium) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transaction'");
    }

    @Override
    public void sendOtp(String medium) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendOtp'");
    }
    
}
