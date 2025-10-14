package ch5;

public class ex4_arraycopy {
    public static void main(String[] args) {
        int[] oldAry = {1,2,3};
        int[] newAry = new int[5];

        for(int i=0; i < oldAry.length ; i++ ){
            newAry[i] = oldAry[i];

        }

        for(int i = 0 ; i<newAry.length;i++){
            System.out.println(newAry[i] + ",");
        }

}
}
