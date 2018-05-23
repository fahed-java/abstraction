package overloading111;

public class Main {




    public static void main(String[] args) {

        A m = new A();     // لإستدعاء الدوال منه MyMath هنا قمنا بإنشاء كائن من الكلاس

        System.out.println("الرقم الأكبر هو: " +m.max(5, 20));           // هنا سيتم إستدعاء الدالة التي تأخذ 2 باراميتر
        System.out.println("الرقم الأكبر هو: " +m.max(5, 20, 15));       // هنا سيتم إستدعاء الدالة التي تأخذ 3 باراميترات
        System.out.println("الرقم الأكبر هو: " +m.max(5, 20, 15, 30));   // هنا سيتم إستدعاء الدالة التي تأخذ 4 باراميترات

    }

}