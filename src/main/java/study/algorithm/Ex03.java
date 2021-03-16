package study.algorithm;

import java.util.Scanner;

public class Ex03 {

    // 순차탐색
    // 배열 data에 정수 targat이 있는지 검색한다.
    int search(int n, int data[], int targat){
        for(int i = 0; i < n; i++){
            if(data[i] == targat) {
                return i;
            }
        }
        return -1;
    }

    // 최악의 경우 시간복잡도는 O(n)이다.

    public static void main(String[] args) {
        int arrayNum, selectNum, targat;
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
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 배열에 들어간 데이터 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");

        System.out.print("입력한 n 번만큼 조회한다.\n숫자입력 : ");
        selectNum = sc.nextInt();

        System.out.print("입력한 n 조회.\n숫자입력 : ");
        targat = sc.nextInt();

        Ex03 ex03 = new Ex03();

        int result = ex03.search(selectNum,listN,targat);
        System.out.println(result);
    }



}
