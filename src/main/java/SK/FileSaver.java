package SK;
import TD.Animal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class FileSaver {
    public static void saveSeller(Seller seller) throws IOException {
        checkDirExists("Sellers");
        String filePath = "Sellers\\"+seller.getLogin()+".txt";
        File file = new File(filePath);
        if(!file.exists()){
            byte [] inputBytes = seller.getPassword().getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(inputBytes);
            FileOutputStream fos = new FileOutputStream(filePath);
            FileChannel fileChannel = fos.getChannel();
            fileChannel.write(buffer);
            fileChannel.close();
            fos.close();
        }
    }

    public static void saveCheck(Seller seller, Animal animal){
        checkDirExists("Bills");
        String filePath = "Bills\\" + new SimpleDateFormat("dd.MM.yy_HH.mm.ss").format(Calendar.getInstance().getTime())+".txt";
    }

    private static void checkDirExists(String dirName){
        File file = new File(dirName);
        if(!file.exists())
            file.mkdir();
    }

}
