Resytor - Sistema de Recuperação Vetorial
=========================================
![image](https://raw.githubusercontent.com/luizventurote/resytor/master/doc/logo/Logo.png)

Trabalho de matéria de Sistemas Distribuídos do IFES Campus Colatina.

## Ações do cliente ##
* Enviar mensagem
* Exibir as dez últimas mensagens
* Exibir as mensagens que casam com os parâmetros de pesquisa (argumentos: palavras-chave)

## Ações do servidor ##
* Receberas as mensagens
* Interpretar as mensagens do cliente
* Montar modelo vetorial

## Tarefas

| Interface gráfica                                  |
|----------------------------------------------------|
| Opção para enviar mensagens                        |
| Opção para recuperar as 10 últimas mensagens       |
| Opção de pesquisa de mensagens por palavras-chave  |

| Conexão Cliente/Servidor                                 |
|----------------------------------------------------------|
| Classes que fazem a conexão entre cliente e servidor     |

| Interpretador                                            |
|----------------------------------------------------------|
| Verificar a ação do cliente                              |
| Executar ação desejada                                   |

| Armazenamento das mensagens                               |
|-----------------------------------------------------------|
| Métodos para realizar o CRUD das mensagens                |
| O armazenamento pode ser feito por arquivo ou por um SGBD |

| Tabela de ponderação de termos                           |
|----------------------------------------------------------|
| Eliminar as stopwords                                    |
| Criar uma tabela para armazenar os termos das mensagens  |
| Adicionar os termos e a sua quantidade na tabela         |
| Calcular o tamanho de cada documento                     |
| Calcular a frequência total do termo na coleção (Fi)     |
| Calcular a frequência de documento do termo (ni)         |
| Calcular a frequência de termo (TFij)                    |