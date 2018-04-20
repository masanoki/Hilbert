package jp.ac.titech.itpro.sdl.hilbert;

public class HilbertTurtle extends Turtle {

    public HilbertTurtle(Drawer drawer) {
        super(drawer);
    }

    public void run(int order, double step, double turn, int index) {
        rotate(- turn);
        draw(order - 1, step, - turn, index);
        forward(step, index);
        rotate(turn);
        draw(order - 1, step, turn, index);
        forward(step, index);
    }

    public void draw(int order, double step, double turn, int index) {
        if (order > 0) {
            rotate(- turn);
            draw(order - 1, step, - turn, index);
            forward(step, index);
            rotate(turn);
            draw(order - 1, step, turn, index);
            forward(step, index);
            draw(order - 1, step, turn, index);
            rotate(turn);
            forward(step, index);
            draw(order - 1, step, - turn, index);
            rotate(- turn);
        }
    }
}

