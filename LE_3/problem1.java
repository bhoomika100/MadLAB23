/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Bharatvanshi {
    public abstract void fight();
    public abstract void obey();
}

class Pandav extends Bharatvanshi {
    public void fight() {
        // code to implement fighting skills
    }
    public void obey() {
        // code to implement obedience
    }
    public void kind() {
        // code to implement kindness
    }
}

class Kaurav extends Bharatvanshi {
    public void fight() {
        // code to implement fighting skills
    }
    public void obey() {
        // code to implement disobedience
    }
    public void cruel() {
        // code to implement cruelty
    }
}

class Vikarn extends Kaurav {
    public void kind() {
        // code to implement kindness
    }
    public void cruel() {
        // override cruel method and provide empty implementation
    }
}


