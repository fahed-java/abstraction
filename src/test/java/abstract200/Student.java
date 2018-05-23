package abstract200;

public class Student extends Person {

    String specialization;     // هنا قمنا بتعريف خاصية التخصص و التي يملكها فقط التلاميذ

    // هنا قمنا بتعريف الكونستركتور
    public Student(String n, String g, String b, boolean i, String s) {
        super(n, g, b, i);       // Person هنا سيتم إرسال أول أربع قيم إلى كونستركتور الكلاس
        specialization = s;
    }

    // بشكل ملائم للتلامذة displayInfo() للدالة Override هنا فعلنا
    @Override
    public void displayInfo() {
        System.out.println("اسم الطالب: " + getName());
        System.out.println("الجنس: " + getGender());
        System.out.println("الميلاد: " + getBirthday());
        System.out.println("التخصص: " + specialization);
        System.out.println("---------------------------------");
    }
}
