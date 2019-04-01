package SK;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class FileLoader {
    public static boolean UserExists(String login, String password) throws IOException {
        String filePath = "Sellers\\"+login+".txt";
        File file = new File(filePath);
        if(file.exists()){
            Path path = Paths.get(filePath);
            FileChannel fileChannel =  FileChannel.open(path);
            ByteBuffer buffer = ByteBuffer.allocate(8);
            int noOfBytesRead = fileChannel.read(buffer);
            String pass = "";
            while (noOfBytesRead != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    pass += (char) buffer.get();
                }
                buffer.clear();
                noOfBytesRead = fileChannel.read(buffer);
            }
            fileChannel.close();
            if(pass == password)
                return true;
        }
        return false;
    }
}
