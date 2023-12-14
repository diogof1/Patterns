package com.diogof1.tetris;

public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder(drink.getText());
        StringBuilder reversed_string = stringBuilder.reverse();
        drink.setText(reversed_string.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder(drink.getText());
        StringBuilder reversed_string = stringBuilder.reverse();
        drink.setText(reversed_string.toString());
    }
}
