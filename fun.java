package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class fun
{
    public static String extender(String input) {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        Set<Character> vowels = new HashSet<Character>();

        for (int i=0; i<input.length(); i++) {
            sb.append(input.charAt(i));
            char curr = Character.toLowerCase(input.charAt(i));

            if (vowels.contains(curr)) {
                for (int count=0; count<rand.nextInt(4) + 2; count++) {
                    sb.append(curr);
                }
            } else {
                for (int count=0; count<rand.nextInt(3) + 0; count++) {
                    sb.append(curr);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println(extender("Pikachu"));

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\austonj\\Documents\\Temp\\Pokemon_cries.txt"))) {
            String line = br.readLine();

            while (line != null && !line.isEmpty()) {
                System.out.println(extender(line));
                line = br.readLine();
            }
        }
    }
}
