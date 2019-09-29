package offer;

public class Solution3 {
    public static void main(String[] args) {
        int [] numbers={2,3,1,0,2,5,3};
        int []  duplication={1,2};
        boolean t=duplicate(numbers, 7, duplication);
        System.out.println(t);

    }

        // Parameters:
        //    numbers:     an array of integers
        //    length:      the length of array numbers
        //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
        //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
        //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
        // Return value:       true if the input is valid, and there are some duplications in the array number
        //                     otherwise false
        public static  boolean duplicate(int numbers[],int length,int [] duplication) {
            //修改数组 将对应数字放入对应下表中去
            if(numbers==null||numbers.length<0){
                return false;
            }
            for(int i=0;i<length;i++){
                if(numbers[i]<0||numbers[i]>numbers.length)
                    return false;
            }
            for(int i=0;i<length;i++){
                while(numbers[i]!=i){
                    if(numbers[i]==numbers[numbers[i]]){
                       duplication[0]=numbers[i];
                        return true;
                    }
                    //注意：这里必须用temp表示 不能用numbers[i]代表temp 因为在第二行numbers[i]的值已经被更改 再执行第三行相当于值并没有被改变
                    int temp=numbers[i];
                    numbers[i]=numbers[temp];
                    numbers[temp]=temp;
                }
            }
            return false;

        }
    }

