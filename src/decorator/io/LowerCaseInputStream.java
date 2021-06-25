package decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: Java伴我余生
 * @date: 2021-06-24
 * @description: 由于java.io包内的很多类都是用装饰者模式
 * BufferedInputStream及LineNumberInputStream都扩展自FilterInputStream，而FilterInputStream是一个抽象的装饰类。
 *
 * 编写自己的 Java I/0装饰者: ：编写一个装饰者，把输入流内的所有大写字符转成小写
 * 举例：当读取“I know the Decorator Pattern there fore I RULE!”，
 * 装饰者会将它转成“i know the decorator pattern there fore i rule!”
 *
 * 1. 首先，扩展FilterInputStream，这是所有InputStream的抽象装饰者。
 */
public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    //现在，必须实现两个read()方法，一个针对字节，一个针对字节数组，把每个是大写字符的字节（每个代表一个字符）转成小写。
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
