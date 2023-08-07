package CreateFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile
{

    public String creteFile() throws IOException
    {
        String fileName = "example.txt";
        File file = new File(fileName);

        // Если файл не существует, создаем его
        if (file.createNewFile())
        {
            System.out.println("Файл создан: " + file.getName());
        }
        else
        {
            System.out.println("Файл уже существует.");
        }
        return fileName;
    }
}


//            // Записываем данные в файл
//            FileWriter writer = new FileWriter(file);
//            writer.write("Привет, мир!");
//            writer.close();
//            System.out.println("Данные записаны в файл.");
//
//        } catch (IOException e) {
//            System.out.println("Произошла ошибка при создании файла.");
//            e.printStackTrace();
//        }


