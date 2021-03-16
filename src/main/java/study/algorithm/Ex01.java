package study.algorithm;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Ex01 {

    // 상수시간 복잡도
    // 입력으로 n개의 데이터가 저장된 배열 data가 주어지고,
    // 그중 n/2 번째의 데이터를 반환한다.
    int sample(@NotNull int data[], @NotNull int n){
        int k = n /2;
        return data[k];
    }

    // n에 관계없이 상수기간이 소요된다.
    // 이 경우 알고리즘의 시간복잡도는 O(1)이다.

    public static void main(String[] args) {

        int arrayNum, selectNum;
        Scanner sc = new Scanner(System.in);

        arrayNum = (int)(Math.random() * 100 + 1);
        System.out.println("배열길이 : "+arrayNum);

        int[] listN = new int[arrayNum];

        for(int i = 0; i < listN.length; i++){
            listN[i] = (int)(Math.random() * 100 + 1);
        }

        for (int listData: listN) {
            System.out.print(listData+",");
        }
        System.out.println();
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 배열에 들어간 데이터 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        System.out.print("입력한 n / 2 번째의 데이터를 반환한다 \n숫자입력 : ");
        selectNum = sc.nextInt();

        Ex01 ex01 = new Ex01();

        int result = ex01.sample(listN,selectNum);
        System.out.println(result);




    }


}
