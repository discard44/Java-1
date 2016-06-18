/*
* Max Perrigo
* CSIS 1410
* James Chen
* version 1.0
* Midterm what a mug program
 */
package FacePart;

import javafx.scene.control.Slider;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FacePart extends Application implements EventHandler<Event> {

    public int counter, mouseCount;
    public static Face face;
    public static Eye rightEye, leftEye;
    public static ImageView iv, iv2, iv3, iv4, iv5;
    public static FacePart activePart;
    public static Nose nose;
    public static Mouth mouth;
    public static Slider sl;
    public static Pane pane;
    private static boolean showing = false;

    @Override
    public void start(Stage primaryStage) {

        face = new Face();
        rightEye = new Eye();
        leftEye = new Eye(); // end of objects for face and eyes
        nose = new Nose();
        mouth = new Mouth();
        pane = new Pane();
        Scene scene = new Scene(pane, 700, 500);

        iv = new ImageView(face.getFace());// calls the image
        iv.addEventHandler(MouseEvent.MOUSE_CLICKED, face);

        iv.setFitHeight(500);
        iv.setFitWidth(500);
        iv.setX(pane.getWidth() / 8);

        iv2 = new ImageView(rightEye.getEye());// communicates with other windows to change the image
        iv2.addEventHandler(MouseEvent.MOUSE_CLICKED, rightEye);

        iv2.setFitWidth(100);
        iv2.setFitHeight(100);
        iv2.setX(iv.getX() + 3 * 40);
        iv2.setY(500 / 3.0);// set pos and size

        iv3 = new ImageView(leftEye.getEye());// communicates with other windows to change the image
        iv3.addEventHandler(MouseEvent.MOUSE_CLICKED, leftEye);

        iv3.setFitWidth(100);
        iv3.setFitHeight(100);
        iv3.setX(iv.getX() + 9 * 30);
        iv3.setY(500 / 3);// sets pos and size

        iv4 = new ImageView(nose.getNose());
        iv4.setX(700 / 3);
        iv4.setY(500 / 1.8);
        iv4.setFitWidth(200);
        iv4.addEventHandler(MouseEvent.MOUSE_CLICKED, nose);

        iv5 = new ImageView(mouth.getMouth());
        iv5.setX(700 / 2.7);
        iv5.setY(500 / 1.5);
        iv5.setFitWidth(150);
        iv5.setFitHeight(100);

        iv5.addEventHandler(MouseEvent.MOUSE_CLICKED, mouth);

        primaryStage.setScene(scene);
        pane.getChildren().addAll(iv, iv2, iv3, iv4, iv5);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Facial");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {// makes the second window when mouse is clicked
        if (!showing){
            showing = true;
        Inspector.display();
        setFacePart(this);
        }
    }

    public static void setFacePart(FacePart f) {// sets the part that you want to change
        activePart = f;
    }

    public static FacePart getPart() {// get method to change the part the part
        return activePart;
    }

    public void scrollAction(Pane p, double value) {// overidden method

    }

    public void btnAction() {// overidden method

    }

}
