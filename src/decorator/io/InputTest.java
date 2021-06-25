package decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: Java伴我余生
 * @date: 2021-06-24
 * @description: 来测试自定义的I/O 装饰者
 */
public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt")));
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
