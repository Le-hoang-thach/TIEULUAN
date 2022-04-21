package Thicuoiky;
import java.io.File;
import java.io.FileReader;

import java.io.PrintWriter;
import java.util.List;

public class FileService {
    NhapThongTin nhapThongTin = new NhapThongTin();
    public void writeToFile(List<HangHoa> hangHoa)  {
       File file = new File("Hanghoa.txt");
       PrintWriter out;
       try {
           out = new PrintWriter(file);
           for (HangHoa hangHoa2 : hangHoa) {
               out.println(hangHoa2.toString());
           }
           out.close();
       } catch (Exception e) {
           //TODO: handle exception
           System.out.println("File write error");
       }

    }
    public void readFile(List<HangHoa> hangHoa){
        try {
            File file1 = new File("Hanghoa.txt");
            FileReader fileReader = new FileReader(file1);
            for (HangHoa hangHoa1 : hangHoa) {
                System.out.println(hangHoa1.toString());
               
            }
            fileReader.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("File write error");
        }
    }
    
}
