 abstract class Pen
 {
    abstract void write();
    abstract void refill();
 }

 class Main extends Pen
 {
    public void write()
    {
        System.out.println("Writing with the pen");
    }

    public void refill()
    {
        System.out.println("Refilling the pen");
    }

    public static void main(String[] args)
    {
        Pen myPen = new Main();
        myPen.write();
        myPen.refill();
    }

 }