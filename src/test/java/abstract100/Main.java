package abstract100;

public  class Main {
    public static void main(String[] args) {

        B b = new B();     // B هنا قمنا بإنشاء كائن من الكلاس

        b.print();         // A من الكلاس B التي ورثها الكلاس print() هنا قمنا باستدعاء الدالة

        b.setX(55);        // setX() عن طريق الدالة A من الكلاس B الذي ورثه الكلاس x هنا قمنا بتغيير قيمة المتغير

        System.out.println("b.x contain: " + b.getX());       // getX() عن طريق الدالة x هنا قمنا بعرض قيمة المتغير
    }
}
