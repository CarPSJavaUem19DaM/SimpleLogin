package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("view/View.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root);			
			primaryStage.setScene(scene);
			primaryStage.setTitle("SimpleLogin");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
