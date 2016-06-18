package FacePart;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

class Mouth extends FacePart {

    private final String mouth;

    public Mouth() {
        this.mouth = "/Image/mouth1.png";
    }

    public Mouth(String f) {
        this.mouth = f;
    }

    public String getMouth() {
        return this.mouth;
    }

    @Override
    public void btnAction() {

        counter = (counter % 3) + 1;
        if (counter == 1) {
            iv5.setImage(new Image("/Image/mouth2.png"));
        } else if (counter == 2) {
            iv5.setImage(new Image("/Image/mouth3.png"));
        } else {
            iv5.setImage(new Image("/Image/mouth1.png"));
        }
    }

    @Override
    public void scrollAction(Pane t, double value) {
        value = sl.getValue() - 500;

        iv5.setFitWidth(iv.getFitWidth() / 2.5 * (100 - value) / 100);

    }
}
