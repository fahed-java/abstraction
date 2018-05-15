package constrctorSuper;

public class A {
    public int x;
    public int y;

    // A هنا قمنا بتعريف الكونستركتور الإفتراضي للكلاس
    // سيتم تنفيذه بشكل تلقائي في أي كلاس يرث منه .A و بما أنه لا يوجد غيره في الكلاس
    public A() {      // هذا كونستركتور
        x = 50;
        y = 100;
    }
}