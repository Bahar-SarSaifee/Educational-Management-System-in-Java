package file.pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//کلاس نتیجه حضور غیاب
public class Result {
    
    public void writeInFile(int code,String Date,String v){
        
        File F=new File("E:\\d.txt");
        try {
            FileWriter Fw1=new FileWriter(F,true);
            PrintWriter P1=new PrintWriter(Fw1);
            P1.print(code+" * "+Date+" * "+v+" * ");
            P1.println();
            P1.close();
            Fw1.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
    
    }
}
