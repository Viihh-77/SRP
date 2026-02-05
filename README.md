# 🛒 Sistema de Gerenciamento de Pedidos — SRP (TechStore)

## 📌 Contextualização
Este projeto simula um sistema de gerenciamento de pedidos de um e-commerce fictício chamado **TechStore**.  
O objetivo principal é demonstrar, na prática, a aplicação do **Princípio da Responsabilidade Única (SRP — Single Responsibility Principle)**.

Originalmente o sistema tinha uma única classe `ProcessadorDePedido` responsável por todo o ciclo de vida de um pedido (verificação de estoque, cálculo de frete e impostos, comunicação com gateway de pagamento, notificação externa etc.), o que gerou alto acoplamento e dificuldade de manutenção.

## ❗ Problema Identificado
A classe `ProcessadorDePedido` violava o SRP ao acumular múltiplas responsabilidades, resultando em:

- Código difícil de manter 🧩
- Alto risco de bugs ao alterar regras 🔥
- Baixa legibilidade e organização 📉
- Dificuldade para evoluir o sistema 🚧

## 🔧 Solução Aplicada — Refatoração com SRP
O sistema foi refatorado para separar responsabilidades. Cada classe agora tem uma única responsabilidade, reduzindo acoplamento e melhorando manutenibilidade.

A classe `ServicoPedido` passou a coordenar o fluxo do sistema, delegando regras específicas para classes especializadas.

## 🧱 Estrutura de Responsabilidades
As responsabilidades do sistema foram separadas nas seguintes classes:

- 🏷️ ValidaEstoque  
  Responsável por verificar se há quantidade suficiente de produtos no estoque.

- 🚚 CalcularFreteImposto  
  Responsável por calcular o valor do frete e os impostos do pedido.

- 📧 EnviaEmail  
  Responsável por enviar notificações por e-mail relacionadas ao pedido.

- 💾 SalvaBanco  
  Responsável por persistir os dados do pedido no banco de dados.

- 🔄 ServicoPedido  
  Responsável apenas por coordenar o fluxo do pedido, chamando as classes corretas na ordem adequada.

- ▶️ Main  
  Classe responsável por iniciar a execução do sistema.

## ✅ Benefícios da Separação de Responsabilidades
A aplicação do SRP trouxe diversos benefícios:

- Redução do acoplamento entre classes
- Código mais organizado e legível
- Facilidade de manutenção e evolução
- Menor risco de erros ao alterar regras específicas
- Sistema mais próximo de um cenário real de e-commerce

## 🎯 Objetivo do Projeto
Demonstrar a importância do SRP na construção de sistemas escaláveis e manuteníveis, especialmente em contextos críticos como e-commerce, onde mudanças são frequentes e erros podem gerar grandes prejuízos.
