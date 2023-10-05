package fc.java.course2.part1;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] arr = new int[6];  // 랜덤한 번호 6개를 저장하기 위한 배열
        boolean isDuplicate;
        int num;
        int i=0;
        while( i < 6) {
            num = rnd.nextInt(45) +1 ; // 1~ 45까지 랜덤한 숫자를 뽑아냅니다.
            isDuplicate = false;
            for(int j=0; j<i ; j++){
                if (arr[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate)
                arr[i++] = num;
        }

        for(int a : arr) {
            System.out.print(a+" ");
        }

    }



}
