package ua.edu.ucu.apps.demo.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Receiver implements UserInterface{
    private User user;
    @Override
    public void update(String info) {
        System.out.println("Email - " + user.getEmail() + "; notification: " + info);
    }
}