package org.example.abdul.streamApp;

public class C implements Runnable{
    private Thread thread;
    private Foo foo;

    public C (Foo foo) {
        this.foo = foo;
        thread = new Thread(this, "C");
        thread.start();
    }


    @Override
    public void run() {
            foo.third(this);
    }
}
