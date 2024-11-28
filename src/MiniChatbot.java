import java.util.Scanner;

public class MiniChatbot {

    public void saudacao() {
        System.out.println("Olá! Eu sou o MiniChatbot. Como posso lhe ajudar?");
    }

    public void qualNome() {
        System.out.println("Eu sou o MiniChatbot!");
    }

    public void comoVai() {
        System.out.println("Estou funcionando perfeitamente, obrigado!");
    }

    public void respostaPadrao() {
        System.out.println("Desculpe, não entendi sua pergunta. Pode perguntar novamente?");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiniChatbot chatbot = new MiniChatbot();

        chatbot.saudacao();
        while (true) {
            System.out.print("Usuário: ");
            String input = scanner.nextLine().toLowerCase();  // Recebe a entrada do usuário

            if (input.contains("oi") || input.contains("olá")) {
                System.out.println("MiniChatbot: Olá! Como posso ajudar?");
            } else if (input.contains("como você está")) {
                chatbot.comoVai();
            } else if (input.contains("qual é o seu nome")) {
                chatbot.qualNome();
            } else if (input.equals("sair")) {
                System.out.println("MiniChatbot: Tchau! Até a próxima.");
                break;
            } else {
                chatbot.respostaPadrao();
            }
        }
        scanner.close();
    }
}