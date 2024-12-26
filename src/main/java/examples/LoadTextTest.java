package examples;

import java.nio.ByteBuffer;

import static com.raylib.Raylib.*;

public class LoadTextTest {
    public static void main(String[] args) {

        ByteBuffer text = LoadFileText("resources/lighting.fs");
        System.out.println(text.capacity());  // 1
        text.get(0);
        while(text.hasRemaining())
        {
            System.out.printf("%c", (char)text.get());
        }
        System.out.println();
    }
}
