import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pontuacao = 0;

        System.out.println("Digite a mensagem: ");
        String mensagem = teclado.nextLine().toLowerCase();
        mensagem = mensagem.replaceAll("[^a-záàâãéèêíìîóòôõúùûç0-9 ]", ""); //Removendo tudo que não é numero ou letras
        mensagem = mensagem.replaceAll("[áàâã]", "a"); // substitui as letras com acentos por sem acento
        mensagem = mensagem.replaceAll("[éèê]", "e");
        mensagem = mensagem.replaceAll("[íìî]", "i");
        mensagem = mensagem.replaceAll("[óòôõ]", "o");
        mensagem = mensagem.replaceAll("[úùû]", "u");
        mensagem = mensagem.replaceAll("[ç]", "c");
        System.out.println(mensagem);

        //Palavras
        Map<String, Integer> palavras = Map.ofEntries( //PESQUISAR SOBRE

                // ======================
                // Urgência
                // ======================
                Map.entry("urgente", 2),
                Map.entry("imediatamente", 2),
                Map.entry("agora", 1),
                Map.entry("rapido", 1),
                Map.entry("prazo", 1),
                Map.entry("expira", 2),
                Map.entry("expirou", 2),
                Map.entry("hoje", 1),
                Map.entry("ultima", 1),
                Map.entry("chance", 1),
                Map.entry("limitado", 2),
                Map.entry("restam", 1),

                // ======================
                // Financeiro
                // ======================
                Map.entry("pix", 3),
                Map.entry("transferencia", 3),
                Map.entry("deposito", 2),
                Map.entry("boleto", 2),
                Map.entry("pagamento", 2),
                Map.entry("pagar", 2),
                Map.entry("taxa", 2),
                Map.entry("dinheiro", 2),
                Map.entry("valor", 1),
                Map.entry("cartao", 3),
                Map.entry("credito", 2),
                Map.entry("debito", 2),
                Map.entry("saldo", 2),
                Map.entry("conta", 2),
                Map.entry("pague", 2),

                // ======================
                // Dados pessoais
                // ======================
                Map.entry("senha", 5),
                Map.entry("cpf", 4),
                Map.entry("rg", 4),
                Map.entry("cvv", 5),
                Map.entry("codigo", 4),
                Map.entry("token", 4),
                Map.entry("login", 3),
                Map.entry("usuario", 2),
                Map.entry("email", 2),
                Map.entry("telefone", 2),
                Map.entry("identidade", 3),

                // ======================
                // Bancos
                // ======================
                Map.entry("banco", 2),
                Map.entry("nubank", 2),
                Map.entry("caixa", 2),
                Map.entry("bradesco", 2),
                Map.entry("itaú", 2),
                Map.entry("santander", 2),
                Map.entry("inter", 2),
                Map.entry("sicredi", 2),
                Map.entry("picpay", 2),
                Map.entry("pagbank", 2),
                Map.entry("mercadopago", 2),
                Map.entry("mercado", 1),
                Map.entry("paypal", 2),

                // ======================
                // Prêmios
                // ======================
                Map.entry("parabens", 2),
                Map.entry("ganhou", 3),
                Map.entry("ganhador", 3),
                Map.entry("premio", 3),
                Map.entry("brinde", 2),
                Map.entry("sorteio", 2),
                Map.entry("recompensa", 2),
                Map.entry("gratuito", 2),
                Map.entry("gratis", 2),
                Map.entry("presente", 2),

                // ======================
                // Ameaças
                // ======================
                Map.entry("bloqueado", 3),
                Map.entry("bloqueada", 3),
                Map.entry("cancelado", 3),
                Map.entry("cancelada", 3),
                Map.entry("fraude", 3),
                Map.entry("suspeita", 2),
                Map.entry("irregularidade", 3),
                Map.entry("crime", 2),
                Map.entry("processo", 2),
                Map.entry("judicial", 2),
                Map.entry("multa", 2),

                // ======================
                // Links
                // ======================
                Map.entry("http", 3),
                Map.entry("https", 3),
                Map.entry("www", 2),
                Map.entry(".com", 1),
                Map.entry(".net", 1),
                Map.entry(".org", 1),
                Map.entry("bit.ly", 5),
                Map.entry("tinyurl", 5),
                Map.entry("cutt.ly", 5),

                // ======================
                // Ações
                // ======================
                Map.entry("clique", 2),
                Map.entry("acesse", 2),
                Map.entry("entre", 1),
                Map.entry("abra", 1),
                Map.entry("confirme", 2),
                Map.entry("verifique", 2),
                Map.entry("atualize", 2),
                Map.entry("cadastre", 2),
                Map.entry("envie", 2),
                Map.entry("baixe", 2),
                Map.entry("instale", 3),

                // ======================
                // Entregas
                // ======================
                Map.entry("encomenda", 2),
                Map.entry("pedido", 2),
                Map.entry("pacote", 2),
                Map.entry("entrega", 2),
                Map.entry("rastreio", 2),
                Map.entry("rastreamento", 2),
                Map.entry("objeto", 2),
                Map.entry("transportadora", 2),

                // ======================
                // Empresas
                // ======================
                Map.entry("correios", 2),
                Map.entry("gov.br", 2),
                Map.entry("serasa", 2),
                Map.entry("amazon", 2),
                Map.entry("shopee", 2),
                Map.entry("magalu", 2),
                Map.entry("mercadolivre", 2),
                Map.entry("mercado livre", 2)
        );

        //Frases
        Map<String, Integer> frases = Map.ofEntries(

                // PIX
                Map.entry("faca um pix", 6),
                Map.entry("realize um pix", 6),
                Map.entry("envie um pix", 6),
                Map.entry("pix urgente", 6),
                Map.entry("pix imediato", 6),

                // Links
                Map.entry("clique aqui", 5),
                Map.entry("clique no link", 5),
                Map.entry("acesse o link", 5),
                Map.entry("abra este link", 5),

                // Dados
                Map.entry("confirme seus dados", 6),
                Map.entry("atualize seus dados", 6),
                Map.entry("atualize seu cadastro", 6),
                Map.entry("confirme sua identidade", 6),
                Map.entry("informe sua senha", 8),
                Map.entry("digite sua senha", 8),
                Map.entry("envie o codigo", 7),
                Map.entry("codigo de verificação", 7),

                // Banco
                Map.entry("atividade suspeita", 5),
                Map.entry("tentativa de acesso", 5),
                Map.entry("acesso nao autorizado", 6),
                Map.entry("detectamos uma tentativa", 6),
                Map.entry("detectamos um acesso", 6),
                Map.entry("sua conta foi bloqueada", 8),
                Map.entry("sua conta sera cancelada", 8),

                // Prêmios
                Map.entry("voce ganhou", 5),
                Map.entry("parabens voce ganhou", 6),
                Map.entry("resgate seu premio", 6),
                Map.entry("ganhe dinheiro", 4),
                Map.entry("oferta exclusiva", 4),
                Map.entry("oferta imperdivel", 4),

                // Entregas
                Map.entry("objeto retido", 5),
                Map.entry("taxa de entrega", 5),
                Map.entry("pagamento pendente", 5),
                Map.entry("encomenda retida", 5),

                // Urgência
                Map.entry("ultima chance", 4),
                Map.entry("tempo limitado", 4),
                Map.entry("nao perca", 4),
                Map.entry("acao imediata", 4)
        );

        //Verificação
        for (Map.Entry<String, Integer> palavra : palavras.entrySet()) {

            if (mensagem.contains(palavra.getKey())) {
                pontuacao += palavra.getValue();
            }
        }

        for (Map.Entry<String, Integer> frase : frases.entrySet()) {

            if (mensagem.contains(frase.getKey())) {
                pontuacao += frase.getValue();
            }
        }

        //laços de condição
        if (pontuacao <= 4){
            System.out.println("🟢 Risco baixo de golpe");
        } else if(pontuacao > 4 & pontuacao < 10){
            System.out.println("🟠 Risco moderado de golpe");
        } else {
            System.out.println("🔴 Risco alto de golpe");
        }

    System.out.println("A pontuação de suspeita da mensagem foi: " + pontuacao);

    }
}