package com.deep.threading;

import java.util.ArrayList;
import java.util.List;

public class DiningTable {

    Person p1 = new Person("p1");
    Person p2 = new Person("p2");
    Person p3 = new Person("p3");
    Person p4 = new Person("p4");
    Person p5 = new Person("p5");
    ChopStick c1 = new ChopStick("c1");
    ChopStick c2 = new ChopStick("c2");
    ChopStick c3 = new ChopStick("c3");
    ChopStick c4 = new ChopStick("c4");
    ChopStick c5 = new ChopStick("c5");
    private List<Person> persons = new ArrayList<Person>();
    private List<ChopStick> chopSticks = new ArrayList<ChopStick>();

    public static void main(String args[]) {
        DiningTable o = new DiningTable();
        o.execute(args);
    }

    private void execute(String[] args) {
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        chopSticks.add(c1);
        chopSticks.add(c2);
        chopSticks.add(c3);
        chopSticks.add(c4);
        chopSticks.add(c5);

        /*Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();*/


        for (Person p : persons) {
            Thread t = new Thread(p);
            t.start();
        }

    }

    class Person implements Runnable {

        String name;
        List<ChopStick> chopSticksAcquired = new ArrayList<ChopStick>();

        Person(String name) {
            this.name = name;
        }

        @Override
        public void run() {

            try {
                boolean isEating = false;
                while (!isEating) {
                    isEating = eat();
                    System.out.println("Person " + this.name + " is " + (isEating ? "eating " : "waiting to eat"));
                    Thread.sleep(500);
                }

                Thread.sleep(5000);
                System.out.println("Person " + this.name + " has finished eating");
                finishEating();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        private void finishEating() {
            for (ChopStick c : chopSticksAcquired) {
                System.out.println("Person " + this.name + " is releasing ChopStick " + c.name);
                c.setAvailable();
            }
        }

        private boolean eat() {
            int chopStickAcquired = 0;
            for (ChopStick c : chopSticks) {
                synchronized (c) {
                    if (c.isAvailable()) {
                        c.setUnavailable();
                        System.out.println("Person " + this.name + " has acquired ChopStick " + c.name);
                        chopSticksAcquired.add(chopStickAcquired, c);
                        chopStickAcquired++;
                    }
                }
                if (chopStickAcquired == 2)
                    break;
            }
            return chopStickAcquired == 2;
        }
    }

    class ChopStick {

        String name;
        private boolean available = true;

        ChopStick(String name) {
            this.name = name;
        }

        public synchronized boolean isAvailable() {
            return available;
        }

        public synchronized void setUnavailable() {
            available = false;
        }

        public synchronized void setAvailable() {
            available = true;
        }
    }
}