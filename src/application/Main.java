package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;
	BorderPane rootLayout;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			this.primaryStage = primaryStage;

			

			
			initRootLayout();
			initInterfaceLayout();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initRootLayout() {
		
		try {
			// Load Root Layout from fxml file
			FXMLLoader loader = new FXMLLoader();	
			loader.setLocation(Main.class.getResource("view/RootLayout.fxml"));	
			this.rootLayout = (BorderPane) loader.load();
			// Show the scene containing the root layout
			Scene scene = new Scene(this.rootLayout);
			
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			this.primaryStage.setScene(scene);
			this.primaryStage.getIcons().add(new Image("file:resources/images/grh.png"));

			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	public void initInterfaceLayout() {
		try {

			// Load Person Overview
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/InterfaceLayout.fxml"));
			AnchorPane interfaceOverview = (AnchorPane) loader.load();
			
			// Set Interface overview into the center of root layout
			this.rootLayout.setCenter(interfaceOverview);
			
			this.primaryStage.show();	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
