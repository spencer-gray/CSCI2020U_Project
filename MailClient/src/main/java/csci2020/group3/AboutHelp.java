package csci2020.group3;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class AboutHelp {
    public void aboutButtonClicked() throws Exception{
        System.out.println("User clicked Help>About button");
        // Create new popup window
        final Stage about_window = new Stage();
        about_window.initModality(Modality.APPLICATION_MODAL);


        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(10);
        pane.setVgap(10);

        final Text aboutInfo = new Text("Email Client 2019");
        final Text created = new Text("Created by: ");
        final Text spencer = new Text("\tSpencer Gray");
        final Text hassan = new Text("\tHassan Tariq");
        final Text sailesh = new Text("\tSailesh Sharma");

        aboutInfo.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));


        GridPane.setConstraints(aboutInfo, 0, 0);
        GridPane.setConstraints(created, 0, 2);
        GridPane.setConstraints(spencer, 0, 3);
        GridPane.setConstraints(hassan, 0, 4);
        GridPane.setConstraints(sailesh, 0, 5);

        pane.getChildren().addAll(aboutInfo, created, spencer, hassan, sailesh);

        // Creating Scene and showing stage
        about_window.setTitle("About");
        Scene aboutScene = new Scene(pane,270 , 180);
        about_window.setScene(aboutScene);
        about_window.show();


    }


}