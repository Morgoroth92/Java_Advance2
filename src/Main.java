public class Main {
    public static void main(String[] args) throws Exception {

        isDigit('2');
    }

    public static boolean isDigit(char c) throws Exception {
        if (Character.isDigit(c)) {
            System.out.println("Il carattere inserito è una numero: " + c);
        } else throw new Exception("Il carattere inserito non è un numero: " + c);
        return false;
    }

}
