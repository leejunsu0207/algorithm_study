package study.algorithm;

import java.util.Scanner;

public class Ex02 {

    // 선형 시간복잡도
    // 입력으로 n개의 데이터가 저장된 배열 data가 주어지고
    // 그합을 구하며 반환한다.
    int sum(int data[], int n){
        int sum = 0;
        for(int i =0; i < n; i++){
            sum = sum + data[i];
        }
        return sum;
    }

    // 선형시간복잡도를 가진다고 말하고
    // O(n)이라고 표기한다.

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

        System.out.print("입력한 n 번만큼 합 실행한다.\n숫자입력 : ");
        selectNum = sc.nextInt();

        Ex02 ex02 = new Ex02();

        int result = ex02.sum(listN,selectNum);
        System.out.println(result);

    }

}
