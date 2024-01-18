package com.example.ocp;

public class MobileNotificationService implements NotificationService{

    // this class is closed for modification but open for extending feature or functionality

    @Override
    public void transaction(String medium) {
        // write logic here
        throw new UnsupportedOperationException("Unimplemented method 'transaction'");
    }

    @Override
    public void sendOtp(String medium) {

        // write logic here
        throw new UnsupportedOperationException("Unimplemented method 'sendOtp'");
    }

    

}