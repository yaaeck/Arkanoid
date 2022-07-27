package com.javarush.task.task24.task2413;

import javax.swing.*;
import java.awt.*;

public class Layer extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        //Draw right wall
        g.fillRect(Arkanoid.game.getWidth() * 10 + 10,0, 10, Arkanoid.game.getWidth() * 15);
        //Draw left wall
        g.fillRect( 0,0, 10, Arkanoid.game.getWidth() * 15);
        //Draw stand
        g.fillRect((int) (Arkanoid.game.getStand().getX() * 10), (int) Arkanoid.game.getStand().getY() * 10, 10, 10);
        //Draw ball
        g.fillOval((int) (Arkanoid.game.getBall().getX() * 10), (int) (Arkanoid.game.getBall().getY() * 10), 10, 10);
        //Draw bricks
        for (Brick brick : Arkanoid.game.getBricks()) {
            g.fillRect((int) (brick.getX() * 10), (int) (brick.getY() * 10), 10, 10);
        }
    }
}
