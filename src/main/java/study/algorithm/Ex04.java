package study.algorithm;

import java.util.Scanner;

public class Ex04 {

    // Quadratic
    // 배열 x에 중복된 원소가 있는기 검사하는 함수

    boolean is_distinct(int n, int x[]){
        for (int i=0; i<n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (x[i] == x[j]) {
                    return false;
                }
            }
        }

        return true;

    }

    // 최악의 경우 배열에 저장된 모든 원소 쌍을 비교하므로
    // 비교 연산의 횟수는 n(-1)/2이다.
    // 최악의 경우 시간복잡도는 O(n²)으로 나타낸다.

    public static void main(String[] args) {

        int arrayNum, selectNum;
        boolean result;
        Scanner sc = new Scanner(System.in);

        arrayNum = (int)(Math.random() * 1000 + 1);
        System.out.println("배열길이 : "+arrayNum);

        int[] listN = new int[arrayNum];

        for(int i = 0; i < listN.length; i++){
            listN[i] = (int)(Math.random() * 1000 + 1);
        }

        for (int listData: listN) {
            System.out.print(listData+",");
        }
        System.out.println();
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 배열에 들어간 데이터 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        System.out.print("입력한 n번 만큼 중복검사한다. \n숫자입력 : ");
        selectNum = sc.nextInt();

        Ex04 ex04 = new Ex04();
        result = ex04.is_distinct(selectNum, listN);
        System.out.println("결과 : "+result);

    }
}
