package com.example.assignment_4_game;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {

    public Tile(int width, int height) {
        setWidth(SnakesAndLadders.TileSize);
        setHeight(SnakesAndLadders.TileSize);
        setFill(Color.LIGHTBLUE);
        setStroke(Color.BLACK);
    }
}
