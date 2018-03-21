package sample;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class SimulatorGUI extends Application
{
    @FXML TextArea terminal;
    Controller c;

    public static String getTime()
    {
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("hh:mm:ss");
        return ("[" + ft.format(dNow)+ "] ");
    }

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
    public void stop() throws IOException
    {
            //System.out.println(c.getValuesOfTerminal());
            c.printInTerminal();

            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("logs.txt"), "utf-8"))) {
                writer.write(c.getValuesOfTerminal());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }

}