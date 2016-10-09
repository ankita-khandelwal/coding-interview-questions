package com.deep.core;

/**
 * Description:
 *
 * @author Created by deepmistry
 *         7/11/15.
 */
public class JavaCheck {

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        foo(aDog);

        if (aDog.getName().equals("Max")) { //true
            System.out.println("Java passes by value.");

        } else if (aDog.getName().equals("fifi")) {
            System.out.println("Java passes by reference.");
        } else if (aDog.getName().equals("fofo")) {
            System.out.println("Java is crazy ");
        }
    }

    public static void foo(Dog d) {
        d.setName("fifi");
        /*
            Dog newDog = new Dog("fofo");
            d = newDog;
            d.setName("Max");
        */
    }

    static class Dog{

        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
             this.name = name;
        }
    }
}
