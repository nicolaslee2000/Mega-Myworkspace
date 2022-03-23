package day12gettersetter;
class Student {
   private String name;
   private int kr, en, ma;
   private double avg;
   private boolean pass;
   private char grade;
   
   
   Student(){}
   Student(String name){
      setName(name);
   }
   Student(String name, int kr, int en, int ma){
      setName(name);
      setKr(kr);
      setEn(en);
      setMa(ma);
   }
   
   
   
   public void setName(String name) {
      this.name = name;
   }
   public void setKr(int kr) {
      this.kr = kr >= 0 && kr <= 100 ? kr : 0; 
      setAvg();
   }
   public void setEn(int en) {
      this.en = en >= 0 && en <= 100 ? en : 0;
      setAvg();
   }
   public void setMa(int ma) {
      this.ma = ma >= 0 && ma <= 100 ? ma : 0; 
      setAvg();
   }
   private void setAvg() {
      avg = (kr + en + ma) / 3.0;
      setPass();
      setGrade();
   }
   private void setPass() {
      pass = avg >= 60;
   }
   private void setGrade() {
      switch ((int)avg / 10) {
      case 10: case 9:
         grade = 'A'; 
         return;
      case 8:
         grade = 'B'; 
         return;
      case 7:
         grade = 'C'; 
         return;
      case 6:
         grade = 'D'; 
         return;
      }
      grade= 'F';
   }
   
   public String getName(){
      return name;
   }
   
   public int getKr() {
      return kr;
   }
   public int getEn() {
      return en;
   }
   public int getMa() {
      return ma;
   }
   public double getAvg() {
      return avg;
   }
   public boolean isPass() {
      return pass;
   }
   public char getGrade() {
      return grade;
   }
   
   
}

public class Quiz01 {
   public static void main(String[] args) {
      Student s = new Student("홍길동", 100, 100, -100);
      
      
      System.out.println("이름 : " + s.getName());
      System.out.println("국어 : " + s.getKr());
      System.out.println("영어 : " + s.getEn());
      System.out.println("수학 : " + s.getMa());
      System.out.println("평균 : " + s.getAvg());
      System.out.println("합격 : " + (s.isPass() ? "합격" : "불합격"));
      System.out.println("학점 : " + s.getGrade());
      
      s.setMa(88);
//      s.setAvg();
//      s.setPass();
//      s.setGrade();
      System.out.println("이름 : " + s.getName());
      System.out.println("국어 : " + s.getKr());
      System.out.println("영어 : " + s.getEn());
      System.out.println("수학 : " + s.getMa());
      System.out.println("평균 : " + s.getAvg());
      System.out.println("합격 : " + (s.isPass() ? "합격" : "불합격"));
      System.out.println("학점 : " + s.getGrade());
      
   }
}






