package org.example;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_Deserialise {
    public static void main(String[] args) {
        User user = null;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\my_files\\GitHub\\Java-Serialisation\\UserInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();

            in.close();
            fileIn.close();

            System.out.println(user.name);
            System.out.println(user.password);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}