package ConditionerTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditioner {

    private static String[] split;

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int countTests = Integer.parseInt(reader.readLine());
            for (int i = 0; i < countTests; i++) {
                int countPerson = Integer.parseInt(reader.readLine());
                int maxTemp = 30;
                int minTemp = 15;
                for (int j = 0; j < countPerson; j++) {

                    String wantsTemp = reader.readLine();
                    split = wantsTemp.split(" ");
                    String sign = split[0];
                    int number = Integer.parseInt(split[1]);

                    if (sign.equals(">=") && minTemp <= number) {
                        minTemp = number;
                    } else if (sign.equals("<=") && maxTemp >= number) {
                        maxTemp = number;
                    }

                    if (maxTemp == minTemp) {
                        System.out.println(maxTemp);
                    } else if (minTemp < maxTemp) {
                        System.out.println((int) (Math.random() * (maxTemp - minTemp) + minTemp));
                    } else {
                        System.out.println(-1);
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
