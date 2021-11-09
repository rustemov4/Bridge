package com.company;

public abstract class HotDogMaker {

    protected Sausage sausage;
    protected HotDogMaker(Sausage sausage){
        this.sausage = sausage;
    }
    public abstract void makeHotDog();
    public boolean isWithKetchup() {
        return isWithKetchup;
    }

    public void setWithKetchup(boolean withKetchup) {
        isWithKetchup = withKetchup;
    }

    public boolean isWithMustard() {
        return isWithMustard;
    }

    public void setWithMustard(boolean withMustard) {
        isWithMustard = withMustard;
    }

    public boolean isWithOnions() {
        return isWithOnions;
    }

    public void setWithOnions(boolean withOnions) {
        isWithOnions = withOnions;
    }

    private boolean isWithKetchup;
    private boolean isWithMustard;
    private boolean isWithOnions;
}
