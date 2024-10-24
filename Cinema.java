import java.util.Scanner;
class Sala{

    public String numero="1";
    public String cap_Max="20";

    Filme filme1;
    Filme filme2;

    public Sala(Filme filme1, Filme filme2){
        this.filme1= filme1;
        this.filme2= filme2;
  
    }

    public void exibir_infor() {
        System.out.println("Numero da sala: " + numero);

        System.out.println("Capacidade maxima da sala: " + cap_Max);

        System.out.println("Filme: " + filme1.titulo);
        System.out.println("Filme: " + filme2.titulo);
     
    }

    public void exibir_filmeES(Filme filme){
        System.out.println("--INFORMAÇOES DO FILME ESCOLHIDO--");
        System.out.println();
    }
}
   



class Filme{

    String titulo;
    String genero;
    String drc;//duração do filme

    public Filme(String titulo, String genero, String drc){
        this.titulo= titulo;
        this.genero= genero;
        this.drc=drc;
    }

}


class Cliente{
    String nome;
    String cpf;
    String endereco;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void exibir_Info(){
        System.out.println("Nome do cliente: " + nome);
        System.out.println("CPF do cliente: " + cpf);
        System.out.println("Endereço do cliente: " + endereco);
    }
}



class Ingresso{

    Cliente cliente1;
    Sala sala1;
    String assento;
    int cod =22;//codigo do ingresso

    public Ingresso(Cliente cliente1, Sala sala1, String assento){
        this.assento= assento;
        this.cliente1= cliente1;
        this.sala1= sala1;
    }

  


}




public class Cinema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op=0;//variavel de opcao de filme

        Filme filme1= new Filme("Batman","Acao e Aventura","120 minutos");
        Filme filme2= new Filme("Star Wars","Espacial","139 minutos");

        Sala sala1= new Sala(filme1, filme2);

        System.out.println("--INSERIR DADOS CADASTRAIS--");

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf= teclado.nextLine();

        System.out.println("Digite seu endereco: ");
        String endereco= teclado.nextLine();

        System.out.println("--INFORMACOES DA SALA--");
        sala1.exibir_infor();

        System.out.println("Escolha um filme:\nfilme 1(1)\nfilme 2(2)");
        op= teclado.nextInt();
        if (op == 1) {
            sala1.exibir_filmeES(filme1);
        } else if (op == 2) {
            sala1.exibir_filmeES(filme2);
        } else {
            System.out.println("Opcao errada!");
        }
    }
}
