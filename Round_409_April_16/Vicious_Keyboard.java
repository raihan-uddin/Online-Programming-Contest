package Round_409_April_16;

import java.util.Scanner;

/**
 * Created by Raihan on 20-Apr-17.
 */

/*
 * problem Link
 * http://codeforces.com/contest/801/problem/A
*/

public class Vicious_Keyboard {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        String ns = s.replace("VK", "");
        String[] sp = s.split("VK");

        int ans = (s.length() - ns.length()) >> 1;

        for (String ss: sp){
            if (ss.contains("VV") || ss.contains("KK")){
                ++ans;
                break;
            }
        }
        System.out.println(ans);
    }
}
