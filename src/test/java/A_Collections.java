import java.util.ArrayList;
import java.util.List;

public class A_Collections {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();
        lst.add("Hello");
        lst.add("Hello");
        lst.add("Hello");
        lst.add("World");
        lst.add("World");
        lst.add("World");
        lst.add("olleH");
        System.out.println(lst.size());
        System.out.println(lst.contains("Hello"));
        System.out.println(lst.indexOf("World"));
        System.out.println(lst.get(3));
        System.out.println(lst.set(3, "dlroW"));
        System.out.println(lst.get(3));

//        for (int i=0; i<lst.size(); i++) {
//            lst.add(""+i);
//        }
        for (String a: lst) {
            System.out.println(a);

        }







//
//        for (String a:lst){
//            System.out.println(a);
//        }
//
//        int index = 0;
//
//        for (int i=0; i<lst.size(); i++){
//            if(lst.get(i).equals("olleH")){
//                index=i;
//            }
//        }
//        System.out.println(index);








//        String[] obj = new String[10];

//        int[] arr1 = getIntArray();
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = i;
//
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = i;
//            System.out.println(arr1[i] + "");
//
//        }
//
//        System.out.println(getIntArray(arr1).length);
//
//    }
//
//    public static int[] getIntArray() {
//        return new int[10];
//    }
//
//    public static int[] getIntArray(int[] arr) {
//        int[] arrDefault = new int[arr.length + 10];
//        for (int i = 0; i < arr.length; i++) {
//            arrDefault[i] = arr[i];
//
//        }
//        return arrDefault;
//    }
    }
}

