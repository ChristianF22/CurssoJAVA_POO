package OutrosTopicos_Java;

public class FuncaoPara_String {

    // Formatar: toLowerCase(), toUpperCase(), trim()
    //• Recortar: substring(inicio), substring(inicio, fim)
    //• Substituir: Replace(char, char), Replace(string, string)
    //• Buscar: IndexOf, LastIndexOf
   // • str.Split(" ")
    public static void main(String [] args){
       
        String original = "Christian e Nicole";
        // Converter o valor da string para as letras minusculas
        String s01 = original.toLowerCase();
        System.out.println(s01);
        // Converter o calor da String para as letras Maiusculas
        String s02 = original.toUpperCase();
        System.out.println(s02);
        // Retorna o valor da String para o valor original e tambem elimina os espaços em branco
        String s03 = original.trim();
        System.out.println(s03);

        // Essa função vai recorta o valor da  String
        String s04 = original.substring(2);
        System.out.println(s04);
        // Essa função vai recortar o valor da String
        String s05 = original.substring(2 , 14);
        System.out.println(s05);

        // Essa função vai substituir um valor por outro
        String s06 = original.replace('r', 'y');
        System.out.println(s06);
        // Essa função vai substituir uma sub String por outra
        String s07 = original.replace("Ni", "Amor");
        System.out.println(s07);

        //Essa função tem por objeto buscar o valor de acordo com a localidade
        int s08 = original.indexOf("Ni");
        System.out.println(s08);
        // Essa função tem por objetivo pdescobri qual a posição do utilmo valor
        int s09 = original.lastIndexOf("le");
        System.out.println(s09);

        // A operação split tem por objeto cortar o valor da string.
        String s10 = "potato apple lemon";

        String [] vect = s10.split(" ");
        
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

        
    }
}
