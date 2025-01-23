package secao5;

public class Condicionais {
    
    public static void main(String[] args) {
        
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);
        System.out.println(str1 == "java");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));

        String str3 = "JAVA";

        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));

        int numero = 10;

        if(numero > 125) {
            System.out.println("O número é maior que 5");
        }

        String texto = "Texto";

        if(texto.equals("Texto")) {
            System.out.println("O texto é: Texto!");
        } 


    }
}
