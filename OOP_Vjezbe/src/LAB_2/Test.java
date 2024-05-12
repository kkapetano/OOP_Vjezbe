package LAB_2;

public class Test {



    public static void main(String[] args) {

        // generate array of five strings

        String[] strings = AUX_CLS.generateStringArray(5);



        // list all elements
        System.out.println("***************** Listing elements *****************\n");
        AUX_CLS.listArrayElements(strings);




        // Do not change this line

        System.out.println("--------------------------------------------");
        System.out.println("***************** Listing index positions and elements *****************");
        // list all elements and index positions

        AUX_CLS.listArrayElementsAndIndexPos(strings);



    }

}

