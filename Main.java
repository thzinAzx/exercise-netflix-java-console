import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static int Menu() {
        System.out.println("╔══════════════╗");
        System.out.println("║ 1 - Básico   ║");
        System.out.println("║ 2 - Padrão   ║");
        System.out.println("║ 3 - Premium  ║");
        System.out.println("║4 - Sair      ║");
        System.out.println("╚══════════════╝");

        System.out.println("Digite o número correspondente ao plano desejado:");
        int plano = scanner.nextInt();

        if (plano < 1 || plano > 4) {
            System.out.println("Código de plano inválido.");
            return Menu();
        }
        return plano;
    }

    public static int InserirIdade() {
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida.");
            return InserirIdade();
        }

        if (idade >= 18) {
            System.out.println("Categoria: Adulto (Filmes de Ação e Documentários).");
            return idade;
        } else if (idade >= 13) {
            System.out.println("Categoria: Adolescente (Séries Teen e Aventura).");
            return idade;
        } else {
            System.out.println("Categoria: Infantil (Desenhos e Animações).");
            return idade;
        }
    }

    public static String Regiao() {
        System.out.println("Digite a sua região (Brasil, EUA, Europa): ");
        String regiao = scanner.next();

        if (regiao.equalsIgnoreCase("Brasil")) {
            return "Destaque: Assista agora produções originais brasileiras!";
        }

        return "";
    }

    public static void Plano(int plano) {
        switch (plano) {
            case 1:
                System.out.println("Você escolheu o plano de resolução 720p - 1 tela disponível.");
                InserirIdade();
                System.out.println(Regiao());
                break;
            case 2:
                System.out.println("Você escolheu o plano de resolução 1080p (Full HD) - 2 telas disponíveis.");
                InserirIdade();
                System.out.println(Regiao());
                break;
            case 3:
                System.out.println("Você escolheu o plano de resolução 4K + HDR - 4 telas disponíveis.");
                InserirIdade();
                System.out.println(Regiao());
                break;
            case 4:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 4.");
                Menu();
        }
    }

    public static void main(String[] args) {
        int plano = Menu();
        Plano(plano);
    }
}
