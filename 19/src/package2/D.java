package package2;

class D extends B{
    private int num = 1;

    @Override
    public void func() {
        System.out.println("D.func()" + "," + num);
    }
}
