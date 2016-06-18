
package FacePart;


import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

class Nose extends FacePart{
    private final String nose;
    public Nose()
    {
        this.nose = "/Image/nose1.png";
    }
    public Nose(String f) {
        this.nose = f;  
    }
 
    public String getNose()
    {
        return this.nose;
    }
    @Override
    public void btnAction()
    {
        counter = (counter % 4) +1;
        if (counter == 1)
        {
           iv4.setImage(new Image("/Image/nose3.png")); 
        }else if (counter == 2)
        {
            iv4.setImage(new Image("/Image/nose2.png"));
        }else if (counter == 3)
        {
            iv4.setImage(new Image("/Image/nose1.png"));
        }else
        {
            iv4.setImage(new Image("/Image/nose4.png"));

        }
    }
    @Override
	public void scrollAction(Pane t, double value) {
            value = sl.getValue() - 500;
            
            iv4.setY(+ iv.getFitHeight()/2 * (100 - value)/100 );
            System.out.println(iv4.getY());

	}
    
}
