/*
Ryan Songcuan
4/17/22
Module 7 Assignment: JavaFX File

1. Create a CSS style sheet that defines a class for white fill and black stroke color and an ID for red and green color.
2. Write a program that displays four circles and uses the style class and ID. The sample run of the program is shown in
 the following image. Use the mystyle.css found early in Chapter 31, something like the following code:
.plaincircle{
 -fx-fill: white;
 -fx-stroke: black;
}
.circleborder{
 -fx-stroke-width: 5;
 -fx-stroke-dash-array: 12 2 4 2;
}
.border{
 -fx-border-color: black;
 -fx-border-width: 5;
}
#redcircle{
 -fx-fill: red;
 -fx-stroke: red;
}
#greencircle{
 -fx-fill: green;
 -fx-stroke: green;
}
3. Write test code that ensures your code functions correctly.
 */

package javafx_csd420;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class M7 extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox();
        //hBox.setSpacing(1);
        Scene scene = new Scene(hBox, 400, 400);
        scene.getStylesheets().add("mystyle.css");

        Pane pane1 = new Pane();
        Circle circle1 = new Circle(50, 200, 40);
        pane1.getChildren().addAll(circle1);
        pane1.getStyleClass().add("border");
        circle1.getStyleClass().add("plaincircle");

        Pane pane2 = new Pane();
        Circle circle2 = new Circle(50, 200, 40);
        pane2.getChildren().addAll(circle2);
        circle2.getStyleClass().add("plaincircle");
        
        Pane pane3 = new Pane();
        Circle circle3 = new Circle(50, 200, 40);
        pane3.getChildren().addAll(circle3);
        circle3.setId("redcircle");
        
        Pane pane4 = new Pane();
        Circle circle4 = new Circle(50, 200, 40);
        pane4.getChildren().addAll(circle4);
        circle4.setId("greencircle");
        
        hBox.getChildren().addAll(pane1, pane2, pane3, pane4);

        primaryStage.setTitle("Module 7");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
