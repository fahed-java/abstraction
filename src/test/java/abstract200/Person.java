package abstract200;

public abstract class Person {
    // هنا قمنا بتعريف الخصائص المشتركة لدى جميع البشر
    String name;  // الاسم
    String gender;  //الجنس
    String birthday; // الميلاد
    boolean isMarried;  // متزوج أم لا

    // هنا قمنا بتعريف الكونستركتور
    public Person(String n, String g, String b, boolean i) {
        name = n;
        gender = g;
        birthday = b;
        isMarried = i;
    }

    // Getter هنا قمنا بتعريف دوال الـ

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public boolean getIsMarried() {
        return isMarried;
    }

    // Setter هنا قمنا بتعريف دوال الـ
    public void setName(String n) {
        name = n;
    }

    public void setGender(String g) {
        gender = g;
    }

    public void setBirthday(String b) {
        birthday = b;
    }

    public void setIsMarried(boolean i) {
        isMarried = i;
    }

    // abstract و التي نوعها displayInfo() هنا قمنا بتعريف الدالة
    public abstract void displayInfo(); // هذه الدالة لعرض البيانات,سواء بيانات الطالب أو الموظف

}
