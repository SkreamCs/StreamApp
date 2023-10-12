package org.example.abdul.streamApp;

public class B implements Runnable{
    private Thread thread;
    private Foo foo;

    public B (Foo foo) {
        this.foo = foo;
        thread = new Thread(this, "B");
        thread.start();
    }


    @Override
    public void run() {
            foo.second(this);
    }
}
