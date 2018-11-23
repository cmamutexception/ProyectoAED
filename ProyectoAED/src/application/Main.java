package application;
	

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root, 400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
//			scene.setOnAction(new EventHandler<ActionEvent>() {
//		        @Override
//		        public void handle(MouseEvent mouseEvent) {
//		            // Insertar aqu� el c�digo a ejecutar cuando se suelte el rat�n
//		            System.out.println("Mouse released X : Y - " + 
//		                    mouseEvent.getX() + " : " + mouseEvent.getY());
//		        }
//		    });
//			// De
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
  
      
	public static void main(String[] args) {
		launch(args);
	}
}
