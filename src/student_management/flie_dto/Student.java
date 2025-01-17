package student_management.flie_dto;

public class Student {
   private int stdNo;
   private String stdName;
   private int kor;
   private int math;
   private int eng;

   public Student() {
      
   }

   public Student(int stdNo) {
      this.stdNo = stdNo;
   }

   public Student(int stdNo, String stdName, int kor, int math, int eng) {
      this.stdNo = stdNo;
      this.stdName = stdName;
      this.kor = kor;
      this.math = math;
      this.eng = eng;
   }



   public void setStdNo(int stdNo) {
      this.stdNo = stdNo;
   }

   public void setStdName(String stdName) {
      this.stdName = stdName;
   }

   public void setKor(int kor) {
      this.kor = kor;
   }

   public void setMath(int math) {
      this.math = math;
   }

   public void setEng(int eng) {
      this.eng = eng;
   }

   public int getStdNo() {
      return stdNo;
   }

   public String getStdName() {
      return stdName;
   }

   public int getKor() {
      return kor;
   }

   public int getMath() {
      return math;
   }

   public int getEng() {
      return eng;
   }

   public int total() {
      return kor + math + eng;
   }

   public double avg() {
      return total() / 3.0;
   }

   @Override
   public String toString() {
      return String.format("%3d %10s %18d %9d %9d %9d      %.2f", stdNo, stdName, kor, math, eng, total(), avg());
   }

}