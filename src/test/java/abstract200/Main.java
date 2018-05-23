package abstract200;

public class Main {
    public static void main(String[] args) {

        // و هو عبارة عن إنسان له خصائص طالب Student هنا قمنا بإنشاء كائن من الكلاس
        Student s = new Student("محمد", "ذكر", "1994", false, "علوم الحاسب");
        s.displayInfo();

        // و هو عبارة عن إنسان له خصائص موظف أو عامل Employee هنا قمنا بإنشاء كائن من الكلاس
        Employee e = new Employee("رنا", "أنثى", "1986", true, "إدارة التعليم");
        e.displayInfo();

    }

}
