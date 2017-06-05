package com.shellcore.java.files.entities;

import java.io.Serializable;

/**
 * Created by Cesar. 02/06/2017.
 */
public class UserProfile implements Serializable {

    private String name;
    private String email;
    private String themeColor;

    public transient String something; // Dato que va a ser ignorado por la biblioteca "Serializable"

    public UserProfile(String name, String email, String themeColor, String something) {
        this.name = name;
        this.email = email;
        this.themeColor = themeColor;
        this.something = something;
    }

    @Override
    public String toString() {
        return "User: " + this.name
                + "\nEmail: " + this.email
                + "\nTheme Color: " + this.themeColor
                + "\nSomething (transient): " + this.something;
    }
}
