package TwoWeiShuZu;
// 复习： 冒泡排序(升序)
public class SortNums02 {
    public static void main(String[] args) {
        //声明一个数组
        int[] list = {20,80,50,40,30,50};
        //冒泡排序
        for (int i=0; i< list.length-1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
