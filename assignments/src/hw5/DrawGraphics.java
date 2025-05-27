package hw5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxes;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes = new ArrayList<>();
        box = new BouncingBox(60, 80, Color.RED);
        box.setMovementVector(-1, 0);
        boxes.add(box);
        box = new BouncingBox(120, 150, Color.BLUE);
        box.setMovementVector(2, 0);
        boxes.add(box);
        box = new BouncingBox(200, 50, Color.GREEN);
        box.setMovementVector(-1, 1);
        boxes.add(box);
        box = new BouncingBox(200, 50, Color.RED);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        for (BouncingBox bouncingBox : boxes)
            bouncingBox.draw(surface);
    }
}