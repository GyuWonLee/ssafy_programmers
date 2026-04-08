import java.util.ArrayList;
import java.util.List;


public class Solution {
    class Solution {
        public long solution(long n) {
            for(int i = 0; i < 10; i++) {
                long temp = n % 10;
                n /= 10;
                System.out.println(temp);
            }
            return n;
        }
    }
}