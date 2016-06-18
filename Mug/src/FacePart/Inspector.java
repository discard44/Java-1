package FacePart;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class Inspector extends FacePart {

    public static Button btnChange;
    public static Stage second;
    public static Scene scene2;
    public static double lastValue;

    public static void display() {// displays second window with the button and the scrollbar on it.
        //seco public static void display() nd window
        second = new Stage();
        VBox pane2 = new VBox(20); // layout for the screen
        scene2 = new Scene(pane2, 200, 200);

        rightEye = new Eye();// sets object
        FacePart face = new FacePart();
        btnChange = new Button("Change");
        btnChange.setOnAction(e -> FacePart.getPart().btnAction());// button to change the image on the screen

        sl = new Slider(0, 1, 0.5);
        sl.setMin(400);
        sl.setMax(600);
        sl.setValue(500);
        sl.setBlockIncrement(10);

        lastValue = 155;
        sl.setOnMouseDragged(e -> FacePart.getPart().scrollAction(pane, lastValue));

        pane2.getChildren().addAll(btnChange, sl);
        second.setScene(scene2);

        second.setResizable(false);

        second.setTitle("Inspector");
        second.show();

    }

}
