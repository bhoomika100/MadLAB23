/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Testable {
    void display();
}
class Test implements Testable {
    public void display() {
        System.out.println("Test class display method.");
    }
}
abstract class AbsTest implements Testable {
    public void display() {
        System.out.println("AbsTest class display method.");
    }
}


