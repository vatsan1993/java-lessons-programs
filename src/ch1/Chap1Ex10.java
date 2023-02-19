// Author: S. Srivatsan
// Version: 1.0
// Description: A program that calculates the distance travelled by light in 1000 days.

package ch1;

public class Chap1Ex10 {
    public static void main(String[] args) {
        int lightspeed= 186000; // in miles/sec
        int days= 1000;
        long seconds= days * 24* 60* 60;
        long distance= lightspeed *seconds;
        System.out.println(distance);
    }
}
