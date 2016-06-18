package FacePart;

import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class Face extends FacePart {

    private final String fac;

    public Face() {
        this.fac = "/Image/cat2.png";
    }

    public Face(String f) {
        this.fac = f;
    }

    public String getFace() {
        return fac;
    }

    @Override
    public void btnAction() {

        counter = (counter % 3) + 1;
        if (counter == 1) {
            iv.setImage(new Image("/Image/cat2-2.png"));
        } else if (counter == 2) {
            iv.setImage(new Image("/Image/cat2-3.png"));
        } else {
            iv.setImage(new Image("/Image/cat2.png"));
        }
    }

    @Override
    public void scrollAction(Pane t, double value) {
        iv.fitWidthProperty().bind(sl.valueProperty());
        iv.setX(t.getWidth() / 8);

        iv2.setX(iv.getFitWidth() / 4 + iv.getX());
        iv2.setFitWidth((iv.getFitWidth()) / 4.5);

        iv3.setX(iv.getFitWidth() / 1.9 + iv.getX());
        iv3.setFitWidth((iv.getFitWidth()) / 4.5);

        iv4.setX(iv.getFitWidth() / 3.1 + iv.getX());
        iv4.setFitWidth((iv.getFitWidth()) / 2.5);

        iv5.setX(iv.getFitWidth() / 3.1 + iv.getX());
        iv5.setFitWidth(iv.getFitWidth() / 2.5);
    }
}
