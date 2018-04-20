package jp.ac.titech.itpro.sdl.hilbert;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

class MultiThread implements Runnable {
    private int order = 0;
    private double step = 0.0, turn = 0.0;
    private HilbertTurtle turtle;
    public MultiThread(int order, double step, double turn, HilbertTurtle turtle) {
        this.order = order;
        this.step = step;
        this.turn = turn;
        this.turtle = turtle;
    }
    public void run() {
        turtle.draw(order, step, turn, 1);
    }
}
