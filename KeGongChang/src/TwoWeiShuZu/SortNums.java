package TwoWeiShuZu;
//使用冒泡排序（升序）
public class SortNums {
    public static void main(String[] args) {
        int[] nums = {200,16,51,21,63,89,100};
        System.out.println("********冒牌排序前：********");
        for (int num:nums){
            System.out.print(num+"\t");
            System.out.println();
        }

        //冒泡排序
        for (int i=0; i < nums.length-1; i++){          //轮数
            for (int j=0; j < nums.length-1-i; j++){    //每轮比较的次数
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("********冒牌排序后：********");
        for (int num:nums){
            System.out.print(num+"\t");
        }
    }
}
