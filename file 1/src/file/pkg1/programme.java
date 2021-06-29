package file.pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//کلاس برنامه هفتگی
public class programme {
    public void writeInFile(int code2,int code3,int code4,int class1,String day,String Beg,String End){
        
        File F=new File("E:\\c.txt");
        try {
            FileWriter Fw2=new FileWriter(F,true);
            PrintWriter P2=new PrintWriter(Fw2);
            P2.print(code2+" * ");
            
            P2.print(+code3+" * "+code4+" * "+class1+" * "+day+" * "+Beg+" * "+End+" * ");
            P2.println();
            P2.close();
            Fw2.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
    
    }
    
}
