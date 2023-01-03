package task1;

public class task1 {
    public static void main(String[] args) {
        int [] array = {1,3,4,5,63,12};
        int [] array1 = null;
        Error0Array el = getError0ArrayNull(array,3,0);
        if(!el.flag){
            System.out.println(el.element);
        } else{
            System.out.println(el.text + el.code);
        }
        Error0Array el1 = getError0ArrayPer(array, 1000, 0);
        if(!el1.flag){
            System.out.println(el1.element);
        } else{
            System.out.println(el1.text + el1.code);
        }
        Error0Array el2 = getError0ArrayNotNull(array1);
        if(!el2.flag){
            System.out.println(el2.element);
        } else{
            System.out.println(el2.text + el2.code);
        }
    }

    static Error0Array getError0ArrayNull(int [] array,int index ,int value){
        if (value == 0){
           return new Error0Array(true, value, ERRORCODE.ErrorCodeArrayNull, "ERROR " );
        } 
        return new Error0Array(false, array[index] / value, 0, " ");
    }

    static Error0Array getError0ArrayPer(int [] array , int index, int value){
        if (array.length < index || index < 0){
            return new Error0Array(true, index, ERRORCODE.ErrorCodeArrayIndex, "ERROR " );
        }
        return new Error0Array(false, array[index] = value, 0, " ");
    }
    static Error0Array getError0ArrayNotNull(int [] array){
        if (array == null){
            return new Error0Array(true, 0, ERRORCODE.ErrorCodeArrayNotNull, "ERROR " );
        }
        return new Error0Array(false, array.length, 0, " ");
    }
}

class Error0Array{
    boolean flag;
    int element;
    int code;
    String text;
    public Error0Array(boolean flag, int element, int code, String text) {
        this.flag = flag;
        this.element = element;
        this.code = code; 
        this.text = text;
    }
}
class ERRORCODE{
    public static int ErrorCodeArrayNull = 2038; // Деление на ноль невозможно
    public static int ErrorCodeArrayIndex = 2039; // Индекс масива больше длены масива или индекс меньше нуля
    public static int ErrorCodeArrayNotNull = 2040; // Длина массива должна быть от 1 элемента
}