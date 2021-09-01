package com.company;

import java.util.Random;

public class RandomGenerator {
    int numberSave;
    private Random r;
    public RandomGenerator()
    {
            r = new Random();
    }

    public String getRandomString()
    {

        String[] randomString = {"Jan", "ShitCar", "John", "Pepa", "Petr", "Martin", "Jiri", "Mann", "itGuy"};
        return randomString[r.nextInt(randomString.length)];
    }
    public int randomStats(String type)
    {

        switch(type)
        {
            case "Age":
                 numberSave = r.nextInt(90 - 10) + 10;
                break;
            case "Height":
                numberSave = r.nextInt(200 - 100) + 100;
                 break;

            case "Weight":
                numberSave = r.nextInt(200 - 50) + 50;
                break;
        }
        return numberSave;
    }

}
