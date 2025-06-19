interface ABC {
    void test(); 
}

class Z implements ABC {
    public void test() { 
        System.out.println("testing");
    }

}

class  Main{
    public static void main(String[] args) {
        Z obj = new Z();
        obj.test();
}
}
