package jp.ac.titech.itpro.sdl.hilbert;

public class Turtle {
    public interface Drawer {
        void drawLine(double x0, double y0, double x1, double y1);
    }
    private Drawer drawer;

    public Turtle(Drawer drawer) {
        this.drawer = drawer;
    }

    public static final double R = Math.PI / 2, L = -R;
    public static final double N = 0.0, E = Math.PI / 2, S = Math.PI, W = E + S;

    private double x[] = {0.0, 0.0};
    private double y[] = {0.0, 0.0};
    //private double x = 0.0, y = 0.0;
    //private double xr = 0.0, yr = 0.0;
    private double dir = 0.0;

    public void setPos(double x, double y, double xr) {
        this.x[0] = x;
        this.y[0] = y;
        this.x[1] = xr;
        this.y[1] = y;
    }

    public void setDir(double dir) {
        this.dir = dir;
    }

    public void forward(double step, int index) {
        int pn = 1;
        if (index == 1)
            pn = -1;
        double x1 = x[index] + pn * Math.sin(dir) * step;
        double y1 = y[index] - Math.cos(dir) * step;
        drawer.drawLine(x[index], y[index], x1, y1);
        x[index] = x1;
        y[index] = y1;
    }

    public void rotate(double th) {
        dir = (dir + th + Math.PI * 2) % (Math.PI * 2);
    }
}
