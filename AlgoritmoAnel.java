public class AlgoritmoAnel {
    static int[] IdNos = {5, 2, 9, 1, 7}; //ID dos nós

    public static void main(String[] args) { // Método principal que inicializa as variáveis
        int totalNos = IdNos.length;
        int indiceIniciador = 1;
        int idCandidatoAtual = IdNos[indiceIniciador];
        int contadorMensagens = 0;

        System.out.println("Nó " + idCandidatoAtual + " inicia a eleição.");

        int indiceAtual = (indiceIniciador + 1) % totalNos; // Inicia a eleição a partir do próximo nó no anel

        // FASE 1: ELECTION - Coleta do maior ID 
        while (indiceAtual != indiceIniciador) {  //Percorre o anel em busca do maior ID
            if (IdNos[indiceAtual] > idCandidatoAtual) {
                idCandidatoAtual = IdNos[indiceAtual];
            }

            System.out.println("Nó " + IdNos[indiceAtual] + " recebe e passa adiante ELECTION(" + idCandidatoAtual + ")"); 
            indiceAtual = (indiceAtual + 1) % totalNos; // Move para o próximo nó no anel
            contadorMensagens++;
        }
        contadorMensagens++; 

        System.out.println("\nELECTION voltou ao nó " + IdNos[indiceIniciador] + ". Maior ID encontrado: " + idCandidatoAtual); 

        // FASE 2: COORDINATOR - Anúncio do líder para todos os nós
        System.out.println("\n--- FASE 2: COORDINATOR ---");
        indiceAtual = (indiceIniciador + 1) % totalNos; 
        while (indiceAtual != indiceIniciador) { // Percorre o anel novamente para anunciar o líder
            System.out.println("Nó " + IdNos[indiceAtual] + " fica sabendo que o líder é " + idCandidatoAtual);
            indiceAtual = (indiceAtual + 1) % totalNos;
            contadorMensagens++;
        }
        contadorMensagens++;

        System.out.println("\nO NOVO LÍDER É O NÓ " + idCandidatoAtual + "!"); 
        System.out.println("Total de mensagens: " + contadorMensagens);
    }
}
