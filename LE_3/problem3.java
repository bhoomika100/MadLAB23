/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface SwimBehavior {
    public void swim();
}

interface FlyBehavior {
    public void fly();
}

interface QuackBehavior {
    public void quack();
}

class RubberDuck implements SwimBehavior {
    public void swim() {
        // code to implement swimming
    }
    public void squeak() {
        // code to implement squeaking
    }
}

class WoodenDuck implements SwimBehavior {
    public void swim() {
        // code to implement swimming
    }
}

class RedHeadDuck implements SwimBehavior, FlyBehavior, QuackBehavior {
    public void swim() {
        // code to implement swimming
    }
    public void fly() {
        // code to implement flying
    }
    public void quack() {
        // code to implement quacking
    }
}

class LakeDuck implements SwimBehavior, QuackBehavior {
    public void swim() {
        // code to implement swimming
    }
    public void quack() {
        // code to implement quacking
    }
}


