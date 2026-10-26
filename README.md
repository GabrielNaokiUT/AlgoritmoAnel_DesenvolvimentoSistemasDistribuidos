# Algoritmo de Eleição em Anel (Ring Election Algorithm)

Uma implementação didática em **Java** do **Algoritmo de Eleição em Anel**, um dos algoritmos fundamentais de consenso e escolha de líder em **Sistemas Distribuídos**.

## ⚙️ Funcionamento do Algoritmo

O algoritmo executa em **duas fases distintas**:

### 1. Fase ELECTION (Busca do Maior ID)
- O nó iniciador envia uma mensagem de eleição contendo o seu próprio `ID` para o próximo nó do anel.
- Cada nó que recebe a mensagem compara o `ID` da mensagem com o seu próprio `ID`:
  - Se o seu próprio `ID` for maior, ele substitui o `ID` da mensagem pelo seu e a repassa.
  - Se for menor, apenas repassa a mensagem com o `ID` atual.
- A mensagem percorre todo o anel até retornar ao nó iniciador, garantindo que o maior `ID` do sistema tenha sido identificado.

### 2. Fase COORDINATOR (Anúncio do Líder)
- O nó iniciador identifica qual foi o maior `ID` registrado.
- Ele envia uma nova mensagem circulando pelo anel informando a todos os nós quem é o novo líder/coordenador eleito.
- A fase se encerra quando a notificação percorre todos os nós do anel.

## ✒️ Autor 

* **Autor:** [GabrielNaokiUT](https://github.com/GabrielNaokiUT)
---
Desenvolvido para fins acadêmicos | Desenvolvimento de Sistemas Distribuídos | 4ºperíodo - ADS | Faculdade SENAI FATESG
