# Trabalho Rest Client

Este repositório contém um Rest Client desenvolvido em Java usando o NetBeans, que permite a leitura dos dados da API Alpha Vantage. A API Alpha Vantage fornece informações sobre cotações de ações, séries temporais, indicadores técnicos e muito mais.

## Requisitos

Certifique-se de ter o seguinte software instalado em seu sistema:

Java Development Kit (JDK)
NetBeans IDE
Maven

## Configuração

Siga as etapas abaixo para configurar e executar o Rest Client:

- Clone o repositório para o seu sistema local.
- Abra o NetBeans IDE e selecione "Open Project".
- Navegue até o diretório onde o repositório foi clonado e selecione o projeto.
- O NetBeans irá importar o projeto e resolver as dependências do Maven automaticamente.
- Abra o arquivo src/main/java/RestClient.java para acessar a classe principal do cliente REST.
- Dentro da classe RestClient, você encontrará métodos para se comunicar com a API Alpha Vantage e ler os dados desejados.
- Certifique-se de ter uma chave de API válida da Alpha Vantage. Se você não tiver uma, poderá obter uma gratuitamente no site oficial da Alpha Vantage.
- Substitua o valor da variável apiKey no código pelo seu próprio valor de chave de API.

## Uso

Após configurar o projeto, você pode usar o Rest Client para acessar os dados da API Alpha Vantage. A classe RestClient contém métodos convenientes para ler dados específicos, como cotações de ações ou séries temporais.

Para usar o cliente REST, você pode chamar os métodos relevantes a partir do ponto de entrada principal do programa ou criar um novo método de acordo com suas necessidades.

## Dependências

O projeto utiliza o Maven como gerenciador de dependências e inclui a dependência do Gson para facilitar o parsing dos dados JSON retornados pela API Alpha Vantage.

A dependência do Gson está definida no arquivo pom.xml. O Maven irá baixar automaticamente essa dependência durante o processo de compilação e execução.

Certifique-se de que seu ambiente tenha acesso à internet para que o Maven possa baixar as dependências corretamente.
