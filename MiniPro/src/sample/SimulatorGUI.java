package sample;

import java.io.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SimulatorGUI extends Application
{
    Controller c;

	public static void main(String[] args)
	{
		launch(args);
	}

	static  Scene sceneWindow = null;

	@Override
	public void start(Stage primaryStage) throws Exception
	{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GUI.fxml"));
        Parent root = loader.load();
        c = loader.getController();
		primaryStage.setTitle("Mini-Project");

		sceneWindow = new Scene(root, 644, 400);

		primaryStage.setScene(SimulatorGUI.sceneWindow);
		primaryStage.show();

	}

    @Override
    public void stop()
    {
            c.printInTerminal();

            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Logs/"+c.getNameDate()+"logs.txt"), "utf-8"))) {
                writer.write(c.getValuesOfTerminal());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Analytics/"+c.getNameDate()+"analytics.txt"), "utf-8"))) {

                for(String str: c.getAnalytics()){
                writer.write(str);
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }

}