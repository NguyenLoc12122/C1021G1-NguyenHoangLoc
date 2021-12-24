package ss16_file.bai_tap;

import bai_tap_tutor.bai2.model.Student;
import com.sun.xml.internal.ws.api.server.Module;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyFileText {
    public static final String FINAL_INPUT = "D:\\codegym\\C1021G1-NguyenHoangLoc\\Module 2\\src\\ss16_file\\bai_tap\\read.txt";
    public static final String FiNAL_OUTPUT = "D:\\codegym\\C1021G1-NguyenHoangLoc\\Module 2\\src\\ss16_file\\bai_tap\\write.txt";

    public static String readFile() throws IOException {
        String result = "";
        FileReader fileReader = null;
        int i;
        try{
         fileReader = new FileReader(FINAL_INPUT);
        while ((i =fileReader.read()) != -1){
            result += (char) i;
        }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
        return result;
    }
    public static void writeFile(String str) throws IOException {
        FileWriter fileWriter = new FileWriter(FiNAL_OUTPUT);
        fileWriter.write(str);
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        String input = readFile();
        System.out.println(input);
        writeFile(input);
    }
}

