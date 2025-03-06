package org.example;

import java.io.*;

public class User implements Serializable {

    private static final long serialVersionUID  = 20250306;
    String name;
    transient String password; // doesn't serialise it

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        User user = new User();
        user.name = "Jason Super";
        user.password = "pro MAX 20";

        user.sayHello();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

            long serialID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
            System.out.println(serialID);
            out.writeObject(user);  // 9008275230601175212

            out.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
