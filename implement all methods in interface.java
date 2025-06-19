interface xyz {
    public void run();
    public void start();
    public void stop();
}

class test implements xyz {
    public void start() {
        System.out.println("start method called");
    }

    public void run() {
        System.out.println("run method called");
    }

    public void stop() {
        System.out.println("stop method called");
    }
}

class Main {
    public static void main(String[] args) {
        test t = new test(); 

        t.start();
        t.run();
        t.stop();
    }
}
