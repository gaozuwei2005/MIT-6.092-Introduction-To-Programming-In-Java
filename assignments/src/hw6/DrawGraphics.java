package hw6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> movers;

    public DrawGraphics() {
        movers = new ArrayList<>();
        movers.add(new Bouncer(100, 170, new Rectangle(15, 20, Color.RED)));
        movers.get(0).setMovementVector(3, 1);
        movers.add(new Bouncer(200, 150, new Oval(20, 30, Color.BLUE)));
        movers.get(1).setMovementVector(-2, 2);
        movers.add(new StraightMover(30, 180, new Rectangle(15, 20, Color.GREEN)));
        movers.get(2).setMovementVector(3, -5);
        movers.add(new StraightMover(140, 120, new Oval(20, 30, Color.CYAN)));
        movers.get(3).setMovementVector(-2, -3);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover mover : movers)
            mover.draw(surface);
    }
}
