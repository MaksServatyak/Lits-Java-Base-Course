package Homework16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBilder {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();
    StringBuilder stringBuilder = new StringBuilder(name);
    private boolean StringBilder;

    public StringBilder() throws IOException {
    }

    public void undo() {
        System.out.println(name);
        stringBuilder.deleteCharAt(2);
        stringBuilder.reverse();
        StringBuilder c = stringBuilder.append(2);
        StringBilder=false;


        System.out.println(stringBuilder);

        stringBuilder.delete(0, stringBuilder.length());

        System.out.println(stringBuilder);
    }
}
