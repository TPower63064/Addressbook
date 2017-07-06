import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent; 
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.WindowEvent;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import javafx.scene.control.ListView;
import java.util.ArrayList;
public class MockCourseWork
   {
    private static TextField txtFieldUser;
    private static TextField txtFieldStreet;
    private static TextField txtFieldNumber;
    private static ListView<Address> addListView;
    private static ArrayList<Address> addArrList = new ArrayList<Address>();
    public static void main(String args[])
    {
        launchFX();
     }
    
    private static void launchFX()
    {
        new JFXPanel();
        Platform.runLater(() -> initialiseGUI());
    }
    
       private static void terminate()
    {
     System.out.println("bye bye!");
     System.exit(0);
    }

    private static void initialiseGUI()
    {
        Stage stage = new Stage();
        stage.setTitle ("Address book application");
        stage.setResizable(false);
        Pane rootPane = new Pane();
        stage.setScene(new Scene(rootPane));
        stage.setWidth(1024);
        stage.setHeight(768);
        stage.setOnCloseRequest((WindowEvent we) -> terminate());
        stage.show();
        
        addListView = new ListView<Address>();
        addListView.setLayoutX(700);
        addListView.setLayoutY(50);
        rootPane.getChildren().add(addListView);
        
        Button view = new Button();
        view.setText ("View current address records");
        view.setLayoutX(50);
        view.setLayoutY(50);
        view.setOnAction((ActionEvent ae) -> printMessage());
        rootPane.getChildren().add(view);
        
        txtFieldUser = new TextField();
        txtFieldUser.setLayoutX(50);
        txtFieldUser.setLayoutY(100);
        txtFieldUser.setPrefWidth(400);
        txtFieldUser.setPromptText("Enter the name of user");
        rootPane.getChildren().add(txtFieldUser);
        
        txtFieldStreet = new TextField();
        txtFieldStreet.setLayoutX(50);
        txtFieldStreet.setLayoutY(150);
        txtFieldStreet.setPrefWidth(400);
        txtFieldStreet.setPromptText("Enter the address street");
        rootPane.getChildren().add(txtFieldStreet);
        
        txtFieldNumber = new TextField();
        txtFieldNumber.setLayoutX(50);
        txtFieldNumber.setLayoutY(200);
        txtFieldNumber.setPrefWidth(400);
        txtFieldNumber.setPromptText("Enter the address number");
        rootPane.getChildren().add(txtFieldNumber);
        
        Button add = new Button();
        add.setText ("Add address");
        add.setLayoutX(50);
        add.setLayoutY(500);
        add.setOnAction((ActionEvent ae) -> printMessage());
        rootPane.getChildren().add(add);
    }
    
    private static void addNewItem() {
        String User = txtFieldUser.getText();
        String Number = txtFieldNumber.getText();
        String Street = txtFieldStreet.getText();
        addArrList.add(new Address(User, Number, Street));
        
        addListView.getItems().clear();
        
        for(Address add : addArrList) {
            addListView.getItems().add(add);
        }
    }
    
        private static void printMessage () {
        String message1 = txtFieldUser.getText();
        String message2 = txtFieldNumber.getText();
        String message3 = txtFieldStreet.getText();
        System.out.println(message1+", "+message2+", "+message3);
    }

    private static void View() {
      // read to text file

      try {
            FileReader fr = new FileReader("U:\\College work\\Computer science\\java\\MockCoursework\\address.txt");
            BufferedReader br = new BufferedReader (fr);
            String line = null;
            while ((line = br.readLine()) != null){
             String message1 = txtFieldUser.getText();
             String message2 = txtFieldNumber.getText();
             String message3 = txtFieldStreet.getText();
             System.out.println(message1+", "+message2+", "+message3);
           }
           br.close();
        }
        catch (IOException e)
          {
            System.out.println(e.getMessage());
        }
     }

    //private static void Write() {
        // write to text file
           // try {
         
       // String Content = null;
       // FileWriter fw = new FileWriter("U:\\College work\\Computer science\\java\\MockCoursework\\address.txt");
        //BufferedWriter bw = new BufferedWriter (fw);
          //while ((Content = bw.writeContent()) != null){
         //    String message1 = txtFieldUser.getText();
          //  String message2 = txtFieldNumber.getText();
           //  String message3 = txtFieldStreet.getText();
           // System.out.println(message1+", "+message2+", "+message3);
         //   }
       // bw.close();
    }
       // catch (IOException e) {
            
      //  System.out.println("Done");
    
       
     
          
         //   System.out.println(e.getMessage());
        
    
   
       
    
