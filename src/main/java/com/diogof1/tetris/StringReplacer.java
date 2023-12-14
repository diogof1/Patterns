package com.diogof1.tetris;

public class StringReplacer implements StringTransformer{
    private char chrToBeReplaced;
    private char chrToReplace;
    public StringReplacer(char a, char x) {
        this.chrToBeReplaced = a;
        this.chrToReplace = x;
    }

    @Override
    public void execute(StringDrink drink) {
        String str = drink.getText();
        String new_str = str.replace(chrToBeReplaced, chrToReplace);
        drink.setText(new_str);
    }
    @Override
    public void undo(StringDrink drink) {
        String str = drink.getText();
        String new_str = str.replace(chrToReplace, chrToBeReplaced);
        drink.setText(new_str);
    }

}
