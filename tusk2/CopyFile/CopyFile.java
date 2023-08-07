package CopyFile;

import java.io.*;

public class CopyFile
{
    public void copyFile(File sourceFilePath, File destinationFilePath) throws FileNotFoundException, IOException
    {
        try (InputStream in = new FileInputStream(sourceFilePath);
             OutputStream out = new FileOutputStream(destinationFilePath))
        {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0)
            {
                out.write(buffer, 0, length);
            }
        }
    }
}
