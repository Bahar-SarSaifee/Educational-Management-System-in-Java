package file.pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//کلاس درس
public class lesson {
    
    public void writeInFile(int code,String name,String name2,int vahed){
        
        File F=new File("E:\\b.txt");
        try {
            FileWriter Fw1=new FileWriter(F,true);
            PrintWriter P1=new PrintWriter(Fw1);
            P1.print(code+" * "+name+" * "+name2+" * "+vahed+" * ");
            P1.println();
            P1.close();
            Fw1.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
    
    }
}
