package digital_clock;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;


public class ClockController implements Initializable {

    @FXML
    private Label hour2;

    @FXML
    private Label hour1;

    @FXML
    private Label minute1;

    @FXML
    private Label minute2;

    @FXML
    private Label label;


    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmm");
    LocalDateTime now = LocalDateTime.now();
    String output =dtf.format(now);
    String[] timeArray=output.split("");



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {




        hour1.setText(timeArray[0]);

        hour2.setText(timeArray[1]);
        minute1.setText(timeArray[2]);
        minute2.setText(timeArray[3]);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0.5),
                evt -> label.setVisible(false)),
                new KeyFrame(Duration.seconds(1),
                        evt -> label.setVisible(true)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }
}



