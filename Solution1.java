package offer;

import java.lang.module.FindException;

public class Solution1 {
    public static void main(String[] args) {
        int [][] array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean flag=Find(7,array);
        System.out.println(flag);
    }
    public  static boolean Find(int target, int [][] array) {
        int rows=array.length;
        int columns=array[0].length;
//        System.out.println(rows);
//        System.out.println(columns);
//        System.out.println("===========");
        boolean flag=false;
        if(rows<0||columns<0)
            return flag;
        int row=0;
        int column=columns-1;
        while(row<rows&&column>=0){
            if(target==array[row][column]){
                flag=true;
                return flag;
            }else if(target<array[row][column]){
                column--;
            }else{

                row++;
            }
        }
        return flag;
    }
}
