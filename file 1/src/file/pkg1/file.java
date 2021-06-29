package file.pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class file {
    
    //class Add ostad
    public void writeInFile(int code,String Fname,String Lname,String reshte,String grade){
        
        File F=new File("E:\\a.txt");
        try {
            FileWriter Fw=new FileWriter(F,true);
            PrintWriter P=new PrintWriter(Fw);
            P.print(code+" * "+Fname+" * "+Lname+" * "+reshte+" * "+grade+" * ");
            P.println();
            P.close();
            Fw.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
    
    }
    
    // اعلام موجودیت اولین مقدار اطلاعات هر استاد در فایل ای
    
    public boolean ReadFromFile(int code){
        int n=0;
        boolean t=false; 
        File F=new File("E:\\a.txt");
        try {
            Scanner sc=new Scanner(F);
            br:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    
                    if(Integer.parseInt(pars[i][0])==code){
                        t=true;
                        break br;
                    }else
                        t=false;
                }
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return t;
    }
    
    //اعلام موجودیت اولین مقدار اطلاعات هر درس در فایل بی 
    
    public boolean ReadFromFile2(int code){
        int n=0;
        boolean t=false;
        File F=new File("E:\\b.txt");
        try {
            Scanner sc=new Scanner(F);
            br:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][0])==code){
                        t=true;
                        break br;
                    }else
                        t=false;
                }
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return t;
    }
    
    
    //اعلام موجودیت اولین مقدار اطلاعات برنامه هفتگی در فایل سی
    
    public boolean ReadFromFile3(int code){
        int n=0;
        boolean t=false;
        File F=new File("E:\\c.txt");
        try {
            Scanner sc=new Scanner(F);
            br:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][0])==code){
                        t=true;
                        break br;
                    }else
                        t=false;
                }
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return t;
    }
    
    
    //search
    
    public boolean ReadFromFile4(int code){
        int n=0;
        int x = 0;
        boolean t=false;
        int w,w1;
        
        //پیدا کردن کد مدرس
        
        File F=new File("E:\\a.txt");
        try {
            Scanner sc=new Scanner(F);
            br:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][0])==code){
                        t=true;
                        //w=Integer.parseInt(pars[i][0]);
                        break br;
                    }else
                        t=false;
                }
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        //پیداکردن کد استاد در برنامه هفتگی
        // پیدا کردن نام استاد
        if(t=true){
         
        File FF=new File("E:\\a.txt");
        try {
            Scanner sc=new Scanner(FF);
            b:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][0])==code){
                        t=true;
                       
                        System.out.println("Fname :"+ pars[i][2]);
                        System.out.println("Lname :"+ pars[i][4]);
                        
                        break b;
                    }else
                        t=false;
                }
                
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            
        File F1=new File("E:\\c.txt");
        try {
            Scanner sc=new Scanner(F1);
            b:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][2])==code){
                        t=true;
                        
                        x=Integer.parseInt(pars[i][0]);
                        break b;
                    }else
                        t=false;
                }
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        //پیدا کردن نتیجه حضور غیاب با استفاده از کد استاد
        if(t=true){
        File F2=new File("E:\\d.txt");
        try {
            Scanner sc=new Scanner(F2);
            b1:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][0])==x){
                        System.out.print("Result : ");
                        for(int j=0;j<5;j++){
                        System.out.print(pars[i][j]+" ");
                        }
                        System.out.println();
                        break b1;
                    }
                }
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
        }
        return t;
      
    }
    
    
    
    //Search code dars
    
    public boolean ReadFromFile5(int code){
        int n=0;
        int x = 0;
        boolean t=false;
        
        
        //پیدا کردن کد درس
        
        File F=new File("E:\\b.txt");
        try {
            Scanner sc=new Scanner(F);
            br:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][0])==code){
                        t=true;
                        System.out.println("Name lesson : "+pars[i][2]);
                        break br;
                    }else
                        t=false;
                }
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
       
        // پیدا کردن کد استاد
        if(t=true){
         
        File FF=new File("E:\\c.txt");
        try {
            Scanner sc=new Scanner(FF);
            b:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][4])==code){
                        t=true;
                       x=Integer.parseInt(pars[i][2]);
                        
                        break b;
                    }else
                        t=false;
                }
                
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          
        //پیدا کردن نام استاد بر اساس کداستاد
        File F1=new File("E:\\a.txt");
        try {
            Scanner sc=new Scanner(F1);
            b:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][0])==x){
                        t=true;
                        System.out.println("Fname : "+ pars[i][2]);
                        System.out.println("Lname : "+ pars[i][4]);
                        break b;
                    }else
                        t=false;
                }
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        }
        return t;
      
    }
    
    
    //سرچ کردن کد استاد 2
    
    public boolean ReadFromFile6(int code){
        int n=0;
        int x = 0;
        boolean t=false;
        
        
        //پیدا کردن کد استاد
        
        File F=new File("E:\\a.txt");
        try {
            Scanner sc=new Scanner(F);
            br:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][0])==code){
                        t=true;
                        System.out.println("Fname : "+pars[i][2]);
                        System.out.println("Lname : "+pars[i][4]);
                        break br;
                    }else
                        t=false;
                }
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        //پیدا کردن کد درس
        
        if(t=true){
         
        File FF=new File("E:\\c.txt");
        try {
            Scanner sc=new Scanner(FF);
            b:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][2])==code){
                        t=true;
                       x=Integer.parseInt(pars[i][4]);
                        
                        break b;
                    }else
                        t=false;
                }
                
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          
       
        }
        
        //نام درس
        
       if(t=true){
         
        File FF=new File("E:\\b.txt");
        try {
            Scanner sc=new Scanner(FF);
            b:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][0])==x){
                        t=true;
                        System.out.println("lesson : "+ pars[i][2]);
                        
                        break b;
                    }else
                        t=false;
                }
                
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          
       
        }
        // پیدا کردن کدبرنامه هفتگی استاد و چاپ ان
        if(t=true){
         
        File FF=new File("E:\\c.txt");
        try {
            Scanner sc=new Scanner(FF);
            b:while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
                
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(Integer.parseInt(pars[i][2])==code){
                        t=true;
                        System.out.print("barname haftegi: "+ pars[i][0]+"*");
                       for (int j =6 ; j <13 ; j++) {
                           System.out.print(" "+pars[i][j]);
                       }
                        System.out.println();
                        break b;
                    }else
                        t=false;
                }
                
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          
       
        }
        return t;
      
    }
    
    public boolean ReadFromFile7(){
        int n=0;
        boolean t=false;
        
        int d[]=new int[100];
            for (int i = 0; i <100; i++){
                    d[i]=0;
            
            }
            
        File F=new File("E:\\d.txt");
        try {
            Scanner sc=new Scanner(F);
            while (sc.hasNext()) {
                
                String pars[][]=new String[10][];
               
                for (int i = n; i < n+1; i++) {
                    pars[i]=(sc.nextLine()).split(" * ");
                    if(pars[i][4].contains("no")){
                        d[i]++;
                    }
                       
                }
                n++;
                
            }
            n=0;
               sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return t;
    }
    
}
