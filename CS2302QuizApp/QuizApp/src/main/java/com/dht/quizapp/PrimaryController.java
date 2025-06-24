package com.dht.quizapp;

import com.dht.utils.MyAlert;
import com.dht.utils.MyStage;
import com.dht.utils.theme.DarkThemeFactory;
import com.dht.utils.theme.DefaultThemeFactory;
import com.dht.utils.theme.LightThemeFactory;
import com.dht.utils.theme.Theme;
import com.dht.utils.theme.ThemeManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class PrimaryController implements Initializable {
    @FXML private ComboBox<Theme> cbThemes;
    
    public void handleQuestionManagement(ActionEvent event) throws IOException {
        MyStage.getInstance().showStage("questions.fxml");
//        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
//        
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.setTitle("Quiz App");
//        stage.show();
    }
    
    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMsg("Practice: Comming soon...");
    }
    
    public void handleExam(ActionEvent event) {
        MyAlert.getInstance().showMsg("Exam: Comming soon...");
    }
    
    public void handleRegister(ActionEvent event) {
        MyAlert.getInstance().showMsg("Register: Comming soon...");
    }
    
    public void handleLogin(ActionEvent event) {
        MyAlert.getInstance().showMsg("Login: Comming soon...");
    }
    
    public void handleTheme(ActionEvent event){
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme();
        ThemeManager.applyTheme(this.cbThemes.getScene());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(Theme.values()));
    }
}
