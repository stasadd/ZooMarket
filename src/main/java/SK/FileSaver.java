package SK;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public abstract class FileSaver {
    public static void saveSeller(Seller seller) throws IOException {
        String filePath = "Sellers\\"+seller.getLogin()+".txt";
        File file = new File(filePath);
        if(!file.exists()){
            byte [] inputBytes = seller.getLogin().getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(inputBytes);
            FileOutputStream fos = new FileOutputStream(filePath);
            FileChannel fileChannel = fos.getChannel();
            fileChannel.write(buffer);
            fileChannel.close();
            fos.close();
        }
    }
}
