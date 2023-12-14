package com.diogof1.tetris;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String str = drink.getText();
        StringBuilder stringBuilder = new StringBuilder();
        for(char chr : str.toCharArray()) {
            if(Character.isLowerCase(chr))
                stringBuilder.append(Character.toUpperCase(chr));
            else
                stringBuilder.append(Character.toLowerCase(chr));
        }
        drink.setText(stringBuilder.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        String str = drink.getText();
        StringBuilder stringBuilder = new StringBuilder();
        for(char chr : str.toCharArray()) {
            if(Character.isLowerCase(chr))
                stringBuilder.append(Character.toUpperCase(chr));
            else
                stringBuilder.append(Character.toLowerCase(chr));
        }
        drink.setText(stringBuilder.toString());
    }
}
