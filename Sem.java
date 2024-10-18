import java.util.*;
public class Sem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Total semesters: ");
        int totsem=sc.nextInt();
        int semsgpa=0,semcredit=0;
        for(int i=1;i<=totsem;i++){
            System.out.println("Semester "+i);
            System.out.println("Enter Subject Marks");
            System.out.print("Subject 1:");
            int sub1=sc.nextInt();
            System.out. print("Credits: ");
            int credit1 = sc.nextInt();
            semsgpa+=sub1;
            semcredit+=credit1;
            System.out.print("Subject 2:");
            int sub2=sc.nextInt();
            System.out. print("Credits: ");
            int credit2 = sc.nextInt();
            semsgpa+=sub2;
            semcredit+=credit2;

            System.out.print("Subject 3:");
            int sub3=sc.nextInt();
            System.out. print("Credits: ");
            int credit3 = sc.nextInt();
            semsgpa+=sub3;
            semcredit+=credit3;
            System.out.print("Subject 4:");
            int sub4=sc.nextInt();
            System.out. print("Credits: ");
            int credit4 = sc.nextInt();
            semsgpa+=sub4;
            semcredit+=credit4;
            System.out.print("Subject 5:");
            int sub5=sc.nextInt();
            System.out. print("Credits: ");
            int credit5 = sc.nextInt();            
            semsgpa+=sub5;
            semcredit+=credit5;
        }
        Semgpa(semsgpa, semcredit);
        // semesterSGPA += gradePoints * credits;
        // sgpa = semesterSGPA / semesterCredits;
    }
    
    public static void Semgpa(int semsgpa,int semcredit){
        int SGPA = semcredit * semsgpa;
        // int sgpa = sub1+sub2+sub3+sub4+sub5;
        // int scredit = credit1+credit2+credit3+credit4+credit5;
        // int SGPA = sgpa*scredit;

        float CGPA = (semsgpa) / 5;
        double percentage = CGPA * 9.5;
        System.out.println("Sem total GPA: "+semsgpa);
        System.out.println("Sem total Credit: "+semcredit);
        System.out.println("Total SGPA: "+SGPA);
        System.out.println("Total CGPA: "+CGPA);
        System.out.println("Total percentage: "+percentage);
        
        // System.out.print("Total Gradepoint of: "+totsgpa);
    }

}
