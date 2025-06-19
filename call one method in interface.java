interface xyz {
    void run(); 

    default void start() {
        System.out.println("Default start");
    }

    default void stop() {
        System.out.println("Default stop");
    }
}

class Test implements xyz {
    public void run() {
        System.out.println("Running only...");
    }

}

class Main{
    public static void main(String[] args) {
        Test t = new Test();
        t.run(); 
    }
}
