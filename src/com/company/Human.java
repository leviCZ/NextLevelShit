package com.company;

public class Human {
    private int Age;
    private int Height;
    private int Weight;
    private String Name;

    public Human(){
        RandomGenerator randomGenerator = new RandomGenerator();
        this.Age = randomGenerator.randomStats("Age");
        this.Height = randomGenerator.randomStats("Height");
        this.Weight = randomGenerator.randomStats("Weight");
        this.Name = randomGenerator.getRandomString();
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}