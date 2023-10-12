package org.example.abdul.streamApp;

public class A implements Runnable {
    private Thread thread;
    private Foo foo;

    public A (Foo foo) {
        this.foo = foo;
        thread = new Thread(this, "A");
        thread.start();
    }


    @Override
    public void run() {

        foo.first(this);
    }
}
