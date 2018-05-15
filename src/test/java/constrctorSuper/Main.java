package constrctorSuper;

public class Main {
    public static void main(String[] args) {

        // A من أجل عرض قيم المتغيرات التي ورثها من الكلاس B هنا قمنا بإنشاء كائن من الكلاس
        B b = new B();

        System.out.println("x: " + b.x);
        System.out.println("y: " + b.y);

    }
}
