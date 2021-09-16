
class exception {

public static void main(String[] args){
    try{

        int data=25/0;
        System.out.println(data);
    }
    catch(ArithmeticException e){
        System.out.println("getting eror" +e);
    }
}

}