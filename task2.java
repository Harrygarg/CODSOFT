import java.util.* ;

public class task2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n************************  Grading Calculator **************************");
        System.out.println("\n                  Enter marks in all subjects ");
        System.out.print("\n\nEnter marks in English   : ");
        int english = sc.nextInt();
        System.out.print("Enter marks in Punjabi   : ");
        int punjabi = sc.nextInt();
        System.out.print("Enter marks in Physics   : ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry : ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths     : ");
        int maths = sc.nextInt();
        System.out.println("\n***********************************************************************");

        int total = maths + physics + chemistry + english + punjabi ;
        float average = total / 5f ;

        
        System.out.println("\n\n***********************  RESULT  **************************");
         
        System.out.println("\nTotal Marks        = "+total + " / 500");
        System.out.println("Average Percentage = "+average);
        if(average>=90)
        {
            System.out.println("Grade : A+ ");
        }
        else if(average >= 80)
        {
            System.out.println("Grade : A ");
        }
        else if(average >= 80)
        {
            System.out.println("Grade : B+ ");
        }
        else if(average >= 70)
        {
            System.out.println("Grade : B ");
        }
        else if(average >= 60)
        {
            System.out.println("Grade : C ");
        }
        else if(average >= 50)
        {
            System.out.println("Grade : D ");
        }
        else if(average >= 40)
        {
            System.out.println("Grade : E ");
        }
        else
        {
            System.out.println("Grade : F ");
        }
        System.out.println("\n***********************************************************");
        
        sc.close();
    }

   
}