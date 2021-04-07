package Rectangle;


import com.sun.scenario.effect.Color4f;
import com.sun.scenario.effect.DropShadow;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class RectangleController implements Initializable {
    @FXML
    private Slider radiusSlider;

    @FXML
    private Slider spreadSlider;

    @FXML
    private Slider ySlider;

    @FXML
    private Slider xSlider;
    @FXML
    private Rectangle rectangle;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        DropShadow dropShadow2 = new DropShadow();
        dropShadow2.setGaussianWidth(10);
        dropShadow2.setColor(Color4f.BLACK);
        dropShadow2.setRadius((float) radiusSlider.getValue());
        dropShadow2.setGaussianHeight(10);
        dropShadow2.setGaussianRadius(10);
        dropShadow2.setSpread((float) spreadSlider.getValue());
        dropShadow2.setOffsetX((int) xSlider.getValue());
        dropShadow2.setOffsetY((int) ySlider.getValue());
        rectangle.setEffect(dropShadow2);








    }



}
