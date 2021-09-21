public class Addition {
    public static void main(String [] args)
    {
        int a = 4;
        int b = 7;
        Add1.add(a,b);    /// calling method from another class without creating object
        Add1 var = new Add1();    // creating object
        var.add(a,b);     // calling a method from another class
        var.sub(a,b);
        var.mul(a,b);
        var.Div(b,a);
        var.mod(a,b);
    }


}
