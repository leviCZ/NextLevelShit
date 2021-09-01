package com.company;
import java.util.ArrayList;

public class Cemetery implements City{


    public static void main(String[] args){

        ArrayList<Human> humans = new ArrayList<Human>();
        RandomGenerator randomGenerator = new RandomGenerator();
        randomGenerator.getRandomString();
        for(int i = 0; i <= 100; i++)
        {

            humans.add(new Human());
        }
        for (Human human: humans
             ) {
            System.out.println(human.getName());
            System.out.println(human.getHeight());

        }
    }

    @Override
    public void cityPopulation() {


    }
}