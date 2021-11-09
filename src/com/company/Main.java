package com.company;

public class Main {

    public static void main(String[] args) {
        HotDogMaker hotDogMaker = new HotDog(new BeefSausage());
        hotDogMaker.setWithKetchup(true);
        hotDogMaker.setWithOnions(true);
        hotDogMaker.setWithMustard(true);
        hotDogMaker.makeHotDog();
    }
}
