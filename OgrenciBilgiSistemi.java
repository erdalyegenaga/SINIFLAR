public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Course MAT = new Course("Matematik", "MAT101", "MAT");
        Course FIZ = new Course("Fizik", "FZK101", "FZK");
        Course KIM = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayse", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        MAT.addTeacher(t1);
        FIZ.addTeacher(t2);
        KIM.addTeacher(t3);

        Student s1 = new Student("Ali", 4, "140144015", MAT, FIZ, KIM);
        s1.addBulkOralExam(30,50,40);
        s1.addBulkWrittenExam(50,20,100);
        s1.isPass();

        Student s2 = new Student("Mehmet", 4, "2211133", MAT, FIZ, KIM);
        s2.addBulkOralExam(40,50,30);
        s2.addBulkWrittenExam(100,60,40);
        s2.isPass();

        Student s3 = new Student("Yesim", 4, "221121312", MAT,FIZ, KIM);
        s3.addBulkOralExam(70,100,40);
        s3.addBulkWrittenExam(50,20,90);
        s3.isPass();
    }
}
