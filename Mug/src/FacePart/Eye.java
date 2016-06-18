package FacePart;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class Eye extends FacePart {

    private final String eyeImage;

    public Eye() {// constructor
        this.eyeImage = "/Image/Cateye1.png";
    }

    public Eye(String f)// constructor
    {
        this.eyeImage = f;
    }

    public String getEye()// constructor
    {
        return eyeImage;
    }

    @Override
    public void btnAction()// btnaction changes the image on the parent screen 
    {
        counter = (counter % 3) + 1;
        if (counter == 1) {
            iv2.setImage(new Image("/Image/cateye2.png"));
            iv3.setImage(new Image("/Image/cateye2.png"));
        } else if (counter == 2) {
            iv2.setImage(new Image("/Image/cateye3.png"));
            iv3.setImage(new Image("/Image/cateye3.png"));
        } else {
            iv2.setImage(new Image("/Image/Cateye1.png"));
            iv3.setImage(new Image("/Image/Cateye1.png"));
        }
    }

    @Override
    public void scrollAction(Pane p, double value)// doesn't work
    {
        value = sl.getValue() - 500;

        iv2.setX(150 + iv.getFitWidth() / 4 * (100 - value) / 100 - iv2.getFitWidth() / 3);
        iv3.setX(150 + iv.getFitWidth() / 4 * (100 + value) / 100 + iv3.getFitWidth() / 2.9);

    }

}
