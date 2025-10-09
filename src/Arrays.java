import java.util.ArrayList;

public class Arrays {
    public static void ArrayListsAndWrapper() {

        // autoboxing
        Integer number1=36;
        Integer number2=45;
        Integer number3=11;
        Integer a = 478;
        Double b = 1.56;
        Boolean c = true;

        String d = Integer.toString(a);
        String e = Double.toString(b);
        String f = Boolean.toString(c);

        System.out.println(d+f+e); //748true1.56
        //unboxing
        int number = a;
        double grade = b;
        boolean isOk = c;

        System.out.println("*****************************");
        ArrayList<Integer> list =new ArrayList<>();
        list.add(a);
        list.add(12); //Java automatically converts it to an Integer object
        list.add(number1);
        list.add(number2);
        list.add(number3);

        System.out.println(list);
        System.out.println(list.set(0,7));// replace the element at the given index with the provided element and return the previous element
        System.out.println(list.get(2)); // return the element at the given index
        System.out.println(list.size()); // return the number of elements in list

        System.out.println(list);
    }
}
