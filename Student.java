public class Student {
    String studentName,studentNo;
    int classes;
    Course MAT;
    Course FIZ;
    Course KIM;
    double examAverage;
    double mathAverage, physicsAverage, chemicalAverage;
    boolean isPass;

    Student(String studentName, int classes,  String studentNo, Course MAT, Course FIZ, Course KIM) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.classes = classes;
        this.MAT = MAT;
        this.FIZ = FIZ;
        this.KIM = KIM;
        calculateExamAverage();
        this.isPass = false;
    }


    public void addBulkOralExam(int MAT, int FIZ, int KIM) {

        if (MAT >= 0 && MAT <= 100) {
            this.MAT.oralExam = MAT;
        }

        if (FIZ >= 0 && FIZ <= 100) {
            this.FIZ.oralExam = FIZ;
        }

        if (KIM >= 0 && KIM <= 100) {
            this.KIM.oralExam = KIM;
        }

    }
    public void addBulkWrittenExam(int MAT, int FIZ, int KIM) {

        if (MAT >= 0 && MAT<= 100) {
            this.MAT.writtenExam = MAT;
        }

        if (FIZ >= 0 && FIZ <= 100) {
            this.FIZ.writtenExam = FIZ;
        }

        if (KIM >= 0 && KIM <= 100) {
            this.KIM.writtenExam = KIM;
        }

    }


    public void isPass() {
        if ((this.MAT.writtenExam == 0 && this.MAT.oralExam == 0 ) || (this.MAT.writtenExam == 0 && this.MAT.oralExam == 0)
                || (this.KIM.writtenExam == 0 && this.KIM.oralExam == 0))
        {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.examAverage);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calculateExamAverage() {

        this.mathAverage = this.MAT.writtenExam *0.8 + this.MAT.oralExam * 0.2;
        this.physicsAverage = this.FIZ.writtenExam *0.8 + this.FIZ.oralExam * 0.2;
        this.chemicalAverage = this.KIM.writtenExam *0.8 + this.KIM.oralExam * 0.2;
        this.examAverage = (mathAverage + physicsAverage + chemicalAverage) / 3;
    }

    public boolean isCheckPass() {
        calculateExamAverage();
        return this.examAverage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.studentName);
        System.out.println("Matematik Notu : " + this.mathAverage);
        System.out.println("Fizik Notu : " + this.physicsAverage);
        System.out.println("Kimya Notu : " + this.chemicalAverage);
    }
}

