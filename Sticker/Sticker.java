package Sticker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sticker {

    private static String[] split;

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String firstSticker = reader.readLine();
            int countStickers = Integer.parseInt(reader.readLine());
            StringBuilder builder = new StringBuilder(firstSticker);
            for (int i = 0; i < countStickers; i++) {
                String str = reader.readLine();
                split = str.split(" ");
                int start = Integer.parseInt(split[0]);
                int end = Integer.parseInt(split[1]);
                String fragment = split[2];
                for (int j = start - 1, k = 0; j <= end - 1; j++, k++) {
                    builder.setCharAt(j, fragment.charAt(k));
                }
            }
            System.out.println(builder);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
