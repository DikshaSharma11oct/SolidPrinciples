package com.example.lsp;

public class Instagram  extends SocialMedia{

    @Override
    public void chatWithFriends() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chatWithFriends'");
    }

    @Override
    public void publishPosts(Object post) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'publishPosts'");
    }

    @Override
    public void sendPhotosAndVideos() {
        
    }
    
    //But this method doesn't support videoCalls so better to make interface then implement those classes
    @Override
    public void groupVideocalls(String users) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'groupVideocalls'");
    }
    
}
