package abstract200;

public class Employee extends Person {
    String workPlace;     // هنا قمنا بتعريف خاصية مكان العمل و التي يملكها فقط الموظفون و العمال

    // هنا قمنا بتعريف الكونستركتور
    public Employee(String n, String g, String b, boolean i, String w) {
        super(n, g, b, i);       // Person هنا سيتم إرسال أول أربع قيم إلى كونستركتور الكلاس
        workPlace = w;
    }

    // بشكل ملائم للموظفين أو العمال displayInfo() للدالة Override هنا فعلنا
    @Override
    public void displayInfo() {
        System.out.println("اسم الموظف: " + getName());
        System.out.println("الجنس: " + getGender());
        System.out.println("الميلاد: " + getBirthday());
        if(getIsMarried() == true)
            System.out.println("متزوج : نعم ");
        else
            System.out.println("متزوج : لا ");
        System.out.println("مكان العمل " + workPlace);
        System.out.println("---------------------------------");
    }
}
