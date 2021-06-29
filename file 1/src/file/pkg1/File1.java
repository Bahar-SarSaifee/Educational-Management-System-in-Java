package file.pkg1;

import java.util.Scanner;

public class File1 {

    public static void main(String[] args) {
       
        

        file fi=new file();
        Scanner sc=new Scanner(System.in);
        while(true){
       
        System.out.println("Please Enter a number: ");
        System.out.println("1.Add Ostad");
        System.out.println("2.Add Dars");
        System.out.println("3.Add Barname haftegi");
        System.out.println("4.natije hozur ghiyab");
        System.out.println("5.Search");
       
        int n=sc.nextInt();
        
      //Add ostad 
       if(n==1){
        System.out.println("Enter Code: ");    
        int code=sc.nextInt();
        
        boolean t=fi.ReadFromFile(code);
        
        if(t==false){
        System.out.println("Enter Fname: "); 
        String Fname=sc.next();
        System.out.println("Enter Lname: "); 
        String Lname=sc.next();
        System.out.println("Enter Reshte: "); 
        String R=sc.next();
        System.out.println("Enter Madrak: "); 
        String G=sc.next();
        
        fi.writeInFile(code, Fname, Lname,R,G);
        }
       }
       //Add dars
        else if(n==2){
        lesson le=new lesson();
        System.out.println("Enter code Dars: "); 
        int code=sc.nextInt();
        
        boolean t=fi.ReadFromFile(code);
        
        if(t=false){
        System.out.println("Enter name: "); 
        String name=sc.next();
        System.out.println("Enter name Reshte: "); 
        String name2=sc.next();
        System.out.println("Enter vahed: "); 
        int vahed=sc.nextInt();
        
        le.writeInFile(code, name, name2, vahed);
        }
        }
        //Add barname
        else if(n==3){
         
        programme po=new programme();
        System.out.println("Enter code programme: "); 
        int code2=sc.nextInt();
        System.out.println("Enter code modares: "); 
        int code3=sc.nextInt();
        
        //چک کردن کد مدرس که حتما موجود باشد
        
        boolean t1=fi.ReadFromFile(code3);
        aa:if(t1==true){
        System.out.println("Enter code dars: "); 
        int code4=sc.nextInt();
        
        //چک کردن کد درس که حتما موجود باشد
        
        boolean t2=fi.ReadFromFile2(code4);
        
        if(t2==true){
        System.out.println("Enter Shomare class: "); 
        int class1=sc.nextInt();
        System.out.println("Enter Day: "); 
        String day=sc.next();
        System.out.println("Enter beg: "); 
        String beg=sc.next();
        System.out.println("Enter End: "); 
        String end=sc.next();
        po.writeInFile(code2, code3, code4, class1, day, beg, end);
        }else{
            System.out.println("Wrong!");
             break aa;
        }
           
        }else
               System.out.println("Wrong!");
        
        }
        
        
        //نتیجه حضور غیاب
        else if(n==4){
        Result Re=new Result();
        System.out.println("Enter code barname: "); 
        int code=sc.nextInt();
        
        //چک کردن کد برنامه هفتگی که حتما باید موجود باشد
        
        boolean t3=fi.ReadFromFile3(code);
        
        if(t3==true){
        System.out.println("Enter Date: "); 
        String Date=sc.next();
        System.out.println("Enter Yes/No: "); 
        String v=sc.next();
        Re.writeInFile(code, Date, v);
        }else
               System.out.println("Wrong!");
        }
       
       //search
        else if(n==5){
            System.out.println("1.code ostad");
            System.out.println("2.code dars");
            System.out.println("3.code ostad2");
            int m=sc.nextInt();
            
            if(m==1){
            int co=sc.nextInt();
            
            // چک کردن کد استاد که موجود باشد
            
            boolean t4=fi.ReadFromFile4(co);
            if(t4==false)
                break;
            }
            else if(m==2){
            
                int co1=sc.nextInt();
                
                //سرچ کردن کد مدرس
                
                boolean t5=fi.ReadFromFile5(co1);
               if(t5==false)
                break;
            }
            
            else if(m==3){
            
                int co2=sc.nextInt();
                
                //سرچ کردن کد استاد
                
                boolean t6=fi.ReadFromFile6(co2);
               if(t6==false)
                break;
            }
            
            
            else
               System.out.println("Wrong!");

        }else 
            break;
        
        }
    }
    
    
}
