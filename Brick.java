package com.javarush.task.task24.task2413;

/**
 * Класс для объекта "кирпич".
 */
public class Brick extends BaseObject {
    //картинка для отрисовки
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    public Brick(double x, double y) {
        super(x, y, 3);
    }

    /**
     * Ничего не делаем - кирпич неподвижен
     */
    @Override
    void move() {
        //do nothing
    }
}
