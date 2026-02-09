package src;
import java.util.*;
public class Assign_Cookies {
        public static int findContentChildren(int[] g, int[] s) {

            Arrays.sort(g);
            Arrays.sort(s);

            int i = 0, j = 0;

            while (i < g.length && j < s.length) {

                if (s[j] >= g[i]) {
                    i++;
                }
                j++;
            }

            return i;
        }

        public static void main(String[] args) {

            int[] greed = {1, 2, 3};
            int[] cookies = {1, 1};

            System.out.println(findContentChildren(greed, cookies));
        }


    }