public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int writtenExam;
    int oralExam;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.writtenExam = 0;
        this.oralExam = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İslem Basarili");
        } else {
            System.out.println(t.name + "bu dersi veremez");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin hocasi : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine atanmamistir.");
        }
    }
}