package offer;

public class Solution2 {
    public static void main(String[] args) {
       StringBuffer str=new StringBuffer(" helloworld");
       String str1=replaceSpace(str);
        System.out.println(str1);
    }
    //从后向前遍历
    public static String replaceSpace(StringBuffer str) {
        //获取数组长度
        int len=str.length();
        //用于存储空格个数
        int numberOfBlank=0;
        //特殊情况
        if(str==null||len<0){
            return null;
        }
        //遍历数组统计空格个数
        for(int i=0;i<len;i++){
            if(str.charAt(i) == ' '){
                numberOfBlank++;
            }
        }
        //从新计算数组所需个数
        int newLen=len+numberOfBlank*2;
        //指向原数组的索引
        int indexOld=len-1;
        //指向新数组的索引
        int IndexNew=newLen-1;
        //设置改变StringBuffer数组长度
        str.setLength(newLen);
        while(IndexNew>indexOld&&indexOld>=0){
            if(' ' == str.charAt(indexOld)){
                str.setCharAt(IndexNew--, '0');
                str.setCharAt(IndexNew--, '2');
                str.setCharAt(IndexNew--, '%');
                indexOld--;
            }else {
                str.setCharAt(IndexNew--, str.charAt(indexOld--));
            }
        }
        return String.valueOf(str);
    }
}
