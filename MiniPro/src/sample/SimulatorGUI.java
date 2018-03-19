package sample;

import java.util.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimulatorGUI extends Application
{

	public static void main(String[] args)
	{
		launch(args);

	}

	static  Scene sceneWindow = null;

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
		primaryStage.setTitle("Mini-Project");

		sceneWindow = new Scene(root, 644, 400);

		primaryStage.setScene(SimulatorGUI.sceneWindow);
		primaryStage.show();
	}

}