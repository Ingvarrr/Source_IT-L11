/**
 * Created by vig on 11/7/16.
 */
public class Main2 {
    public static void main(String[] args) throws Exception {
//        System.out.println("0");
//        if (true)
//            throw new RuntimeException("Here");
//        System.out.println("1");
//    }


        //        try {
//            doSmth1();
//            //close file here
//        } catch (Exception ex) {
//            System.out.println("here");
//            //close file here
//        }finally {                     //перебивает значения в return, передает значение последним, всегда выполняется
//            System.out.println("finally");
//            //
//        }
//
//
//        }
    /*
    <access modifier> [static] [abstract] [final] <returnType> methodName([params]) [throws <ExceptionClass>]
     */
    public static String doSmth1() throws Exception {
        System.out.println("1-1");
        try {
            return doSmth2();
        } catch (Exception x){
            return "ex1";
        } finally {
            System.out.println("1-2");
            return "1";
        }
    }
    public static String doSmth2() throws Exception {
        System.out.println("2-1");
        doSmth3();
        System.out.println("2-2");
        return "2";
    }
    public static void doSmth3() throws Exception {
        System.out.println("3-1");
        doSmth4();
        System.out.println("3-2");
    }
    public static void doSmth4() throws Exception {
        System.out.println("4-1");
        doSmth5();
        System.out.println("4-2");
        doSmth6();
        System.out.println("4-3");
    }
    public static void doSmth5() throws Exception {
        System.out.println("5-1");
        if(true)
            return;
        System.out.println("5-2");
    }
    public static void doSmth6() throws Exception {
        throw new Exception("Here in 6!!!");
    }
}

/*public class Mian2 {
    public static void main(String[] args) {

//        System.out.println("0");
//        if(true)
//        throw new RuntimeException("Here");
//        System.out.println("1");

        doSmth1();

//        try {
//            System.out.println(doSmth1());
//            //close file here
//        } catch (Exception ex) {
//            System.out.println("here");
//            //close file here
//        } finally {
//            System.out.println("finally");
//        }
//


    }

    /*
    <access modifier> [static] [abstract] [final] <returnType> methodName([params]) [throws <ExceptionClass>]
     */

//N2
/*public static String doSmth1()  {
    System.out.println("1-1");

    return doSmth2();
}
    public static String doSmth2() {
        System.out.println("2-1");
        doSmth3();
        System.out.println("2-2");
        return "2";
    }
    public static void doSmth3()  {
        System.out.println("3-1");
        doSmth4();
        System.out.println("3-2");
    }
    public static void doSmth4()  {
        System.out.println("4-1");
        doSmth5();
        System.out.println("4-2");
        doSmth6();
        System.out.println("4-3");
    }
    public static void doSmth5()  {
        System.out.println("5-1");
        if(true)
            return;
        System.out.println("5-2");
    }
    public static void doSmth6()  {
        throw new RuntimeException("Here in 6!!!");
    }
}*/