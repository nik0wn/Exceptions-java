import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        int [] array1 = {1,2,2,3,5};
        Error0Array el = getError0ArrayNull(array, array1);
        if(!el.flag){
            System.out.println(Arrays.toString(el.array));
        } else{
            System.out.println(el.text + el.code);
        }

    }
    static Error0Array getError0ArrayNull(int [] array, int [] array1){
        int [] temp;
        if (array.length != array1.length){
            return new Error0Array(true, 0, ERRORCODE.ErrorCodeArraySize, "ERRO ");
        } else {
            temp = new int[array.length];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = array[i] - array1[i];
            }
        }
        return new Error0Array(false, temp, 0, "");
    }

}
class Error0Array{
    boolean flag;
    int element;
    int [] array;
    int code;
    String text;
    public Error0Array(boolean flag, int element, int code, String text) {
        this.flag = flag;
        this.element = element;
        this.code = code; 
        this.text = text;
    }
    public Error0Array(boolean flag, int [] array, int code, String text) {
        this.flag = flag;
        this.array = array;
        this.code = code; 
        this.text = text;
    }
}
class ERRORCODE{
    public static int ErrorCodeArraySize = 2044; // Длина масивов отличаются 
}