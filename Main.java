/**
 * this is a new main method that would replace SyllabusChatbotRunner.java file
 * it also makes the UserInterface.java class unnecessary
 * This uses JavaFX to create a very primitive (but functional) UI
 * that
 * 1) takes in the user's Name
 * 2) asks them to press a button to select the course they want info on
 * this would then call to the syllabus class and build a syllabus
 * 3) asks the user what question they want to ask then sends that as a string to the NLP
 * 4) asks the user if they need anything else, and loops through again if they do, else exits.
 */
package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	Scene first, second, third, fourth;
	final Button course1 = new Button("ECO101");
	final Button course2 = new Button("Stats");
	final Button course3 = new Button("That Ed course");
	Label message1, message2, message3;
	TextField userEntry;
	String userName;
	Stage window;
	User user;
	TextArea ta;
	
	
	@Override
	public void start(Stage primaryStage) {	
		

		//below is supposed to deal with if user wants to exit but I'm not sure why it doesn't work
		
		
		TextArea textArea = new TextArea();
		TextArea textArea2 = new TextArea();

        Button button = new Button("submit");
        button.setMinWidth(50);

        button.setOnAction(action -> {
        	textArea2.appendText(textArea.getText());
        	userName=textArea.getText();
            //here is where I am lost. I can add entries from here
        	//to a textArea, but how do I get them out of here
        	//like to a method?
        	//And how do I progress through the steps?
        	//1. greet user and get name
        	//2. ask which course
        	//3. ask question
        	//4. send course and question to NLP 
            
            textArea.clear();
        });

        VBox vbox = new VBox(textArea, button, textArea2);

        Scene scene = new Scene(vbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
		
		primaryStage.show();
		System.out.println(userName);
	}
	
	
		
		
	

	 
}
