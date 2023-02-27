/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murach.data;

import murach.business.User;
import java.io.FileWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UserDB {

    public void insert(User user, String path) {
        try {
//            FileWriter myWriter = new FileWriter(path);
//            myWriter.write(user.getEmail() + "|" + user.getFirstName() + "|" + user.getLastName() + "|" + user.getListLikeMusic());
//            myWriter.close();

            File file = new File(path);
            //Here true is to append the content to file
            FileWriter fw = new FileWriter(file, true);
            //BufferedWriter writer give better performance
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(user.getEmail() + "|" + user.getFirstName() + "|" + user.getLastName() + "|" + user.getListLikeMusic() + "\n");
            //Closing BufferedWriter Stream
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//E:\Documents\NetBeansProjects\WebApplication1\build\web\WEB-INF\EmailList.txt
