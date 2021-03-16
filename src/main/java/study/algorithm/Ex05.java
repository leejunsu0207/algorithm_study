package study.algorithm;

public class Ex05 {

    // 버블정렬(bubble sort)
    void bubbleSort(int data[], int n) {

        for (int temp : data) {
            System.out.print(temp+" ");
        }
        System.out.println("\n↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 정렬전 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");

        for ( int i=n-1; i>0; i--) {
            for ( int j=0; j<i; j++ ) {
                if (data[j] > data[j+1]) {
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }

        for (int temp : data) {
            System.out.print(temp+" ");
        }
        System.out.println("\n↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 정렬후 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
    }

    // 시간복잡도 O(n²)

    public static void main(String[] args) {
        int arrayNum;
        arrayNum = (int)(Math.random() * 100 + 1);

        int[] listN = new int[arrayNum];

        for(int i = 0; i < listN.length; i++){
            listN[i] = (int)(Math.random() * 100 + 1);
        }

        Ex05 ex05 = new Ex05();
        ex05.bubbleSort(listN,arrayNum);
    }


}
