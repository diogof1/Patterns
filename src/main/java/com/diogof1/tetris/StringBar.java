package com.diogof1.tetris;

public class StringBar extends Bar {
    private boolean happyHour;
    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        notifyObservers();
        happyHour = true;
    }

    @Override
    public void endHappyHour() {
        happyHour = false;
    }
    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
