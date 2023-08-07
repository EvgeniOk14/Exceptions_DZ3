package WriteFile;

import ReadFile.ReadTextFormat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{
    public void writeFile(String filePath) throws IOException, ClassNotFoundException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
        {
            //writer.write(content);
            writer.write("Привет, мир!");
            writer.close();
            System.out.println("Данные записаны в файл.");
            ReadTextFormat readTextFormat = new ReadTextFormat();
            readTextFormat.read(filePath);

        }
        catch (IOException e)
        {
            System.out.println("Произошла ошибка при создании файла.");
            e.printStackTrace();
        }
    }
}



//            FileWriter writer = new FileWriter(file);
//            writer.write("Привет, мир!");
//            writer.close();
//            System.out.println("Данные записаны в файл.");
//
//        } catch (IOException e) {
//            System.out.println("Произошла ошибка при создании файла.");
//            e.printStackTrace();
//        }+