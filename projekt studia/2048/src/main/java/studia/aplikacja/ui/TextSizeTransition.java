package studia.aplikacja.ui;

import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.scene.control.Labeled;
import javafx.util.Duration;

public class TextSizeTransition extends Transition {

    private final Labeled UIcontrol;
    private final int start;
    private int end;

    public TextSizeTransition(Labeled UIcontrol, int start, int end, Duration duration) {
        this.UIcontrol = UIcontrol;
        this.start = start;
        this.end = end - start;
        setCycleDuration(duration);
        setInterpolator(Interpolator.LINEAR);
        UIcontrol.setStyle("-fx-font-size: " + start);
    }

    @Override
    protected void interpolate(double frac) {
        int size = (int) ((end * frac) + start);
        if(size<=end)
            UIcontrol.setStyle("-fx-font-size: " + size);
    }

    public void setEnd(int end) {
        this.end = end;
    }
}