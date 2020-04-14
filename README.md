# AVAS - Auxílio a Vítimas de Assédio Sexual
_Denúncia - backend_

AVAS - Auxílio a Vítimas de Assédio Sexual será uma plataforma que armazenará denúncias de situações de assédio ocorridas em eventos universitários e oferecerá auxílio as vítimas, caso assim desejem.

De cada denúncia, esperamos as seguintes possibilidades:
- Ao informar o horário e local onde ocorreu o assédio, a vítima pode ajudar a organização do evento a melhorar a monitoração;
- Ao informar quem foi o agressor uma advogada que esteja conduzindo um caso contra o mesmo indivíduo pode utilizar as informações fornecidas para fortalecer o caso.


## Começando

Essas instruções fornecerão uma cópia do projeto em execução na sua máquina local para fins de desenvolvimento e teste. Consulte implantação para obter notas sobre como implantar o projeto em um sistema ativo.

### Pré-requisitos

O que você precisa para instalar o software e como instalá-lo:
1. Java 1.7+
2. Maven/Gradle

### Instalando

Para instalar um client da API execute os seguintes comandos:

```shell
mvn clean install
java -jar target/avas-denuncia.jar
```

Para fazer deploy em um repositório remoto, configure os settings da aplicação e execute:

```shell
mvn clean deploy
```

## Executando os testes

Para rodar os testes unitários execute:
```shell script
mvn test
```

## Deploy
O deploy em [ambiente dev](https://avas-denuncia-backend.herokuapp.com/) é feito automaticamente ao fazer merge com a [branch develop](https://github.com/LuanaFn/avas-denuncia-backend/tree/develop).
O deploy em ambiente de homologação e produção será feito no [GKE](https://cloud.google.com/kubernetes-engine) e ainda não está completamente configurado.

## Documentação dos endpoints da API
Para uma documentação detalhada dos endpoints da API, consulte o [wiki do repositório](https://github.com/LuanaFn/avas-denuncia-backend/wiki/).

## Construído com

* [SemVer](https://semver.org/) - Estrutura de versionamento
* [Hexagonal architecture](https://en.wikipedia.org/wiki/Hexagonal_architecture_(software) - Arquitetura dos arquivos da aplicação
* [Maven](https://maven.apache.org/) - Gerenciamento de dependências
* [Spring boot](https://spring.io/projects/spring-boot) - Framework para aplicações Java

## Contribuindo

Leia [CONTRIBUTING.md] (CONTRIBUTING.md) para obter detalhes sobre nosso código de conduta e o processo para enviar solicitações pull para nós.

## Controle de versão

Usamos [SemVer] (http://semver.org/) para versionar. Para as versões disponíveis, consulte as [tags neste repositório](https://github.com/your/project/tags).

## Autores

* **Luana Nascimento** - *Trabalho inicial* - [LuanaFn] (https://github.com/LuanaFn)

Veja também a lista de [colaboradores](https://github.com/LuanaFn/avas-denuncia-backend/contributors) que participaram deste projeto.

## Licença

Este projeto está licenciado sob a GNU GPL - consulte o arquivo [LICENSE.md](LICENSE.md) para obter detalhes
