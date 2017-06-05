package com.shellcore.java.files;

import com.shellcore.java.files.entities.UserProfile;

import java.io.*;

/**
 * Guardar un objeto en un archivo
 * SerializableObject
 * Created by Cesar. 02/06/2017.
 */
public class SerializableMain {

    public static void main(String[] args) throws Exception {
        String userProfile = "./src/userProfile.txt";

        ObjectOutputStream output = null;

        UserProfile localProfile = new UserProfile("Jaime", "jaimito@gmail.com", "Green", "Some other data");

        // Serializable
        try {
            output = new ObjectOutputStream(new FileOutputStream(userProfile));
            output.writeObject(localProfile);
        } finally {
            if (output != null) {
                output.close();
            }
        }

        // Deserializable
        UserProfile restoredProfile;
        ObjectInputStream input = null;

        try {
            input = new ObjectInputStream(new FileInputStream(userProfile));
            restoredProfile = (UserProfile) input.readObject();

            System.out.println(restoredProfile);
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
