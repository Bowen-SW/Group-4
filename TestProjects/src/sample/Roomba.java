package sample;

import javafx.scene.shape.Circle;

public class Roomba extends Circle {

    private final double scale;
    private double direction;
    private double speed;

    Roomba() {
        this(1.0d);
    }

    Roomba(double scale) {
        super(scale * 12.8d);
        this.scale = scale;
    }

}
