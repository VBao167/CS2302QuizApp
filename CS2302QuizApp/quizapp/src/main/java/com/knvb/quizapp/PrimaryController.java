package com.knvb.quizapp;

import com.knvb.utils.MyAlert;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleSignIn() throws IOException{
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("/com/knvb/quizapp/question.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show();
    }
    public void handleSignUp(){
        MyAlert.getInstance().showMsg("Sign up: Success!!");
    }
    public void handlePractice(){
        MyAlert.getInstance().showMsg("Practice: Coming soon!!");
    }
    public void handleTest(){
        MyAlert.getInstance().showMsg("Test: Not update!!");
    }
}
