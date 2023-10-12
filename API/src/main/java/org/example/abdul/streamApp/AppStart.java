package org.example.abdul.streamApp;

public class AppStart {
    public static void main(String[] args) {
        Foo foo = new Foo();
        new C(foo);
        new A(foo);
        new B(foo);

    }
}