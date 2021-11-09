package com.company;

public class HotDog extends HotDogMaker{

    public HotDog(Sausage sausage) {
        super(sausage);
    }

    @Override
    public void makeHotDog() {
        System.out.println("Adding bun");
        if(isWithKetchup()){
            System.out.println("Adding ketchup");
        }
        if(isWithMustard()){
            System.out.println("Adding mustard");
        }
        if(isWithOnions()){
            System.out.println("Adding onions");
        }
        sausage.makeSausage();
    }
}
