# rabbit-mq-plugin
Projeto que recebe e envia uma mensagem ao serviço pai.

Este projeto é responsável por ter uma escuta das publicações do serviço pai, salvar um registro na base de dados através do JPA e retornar uma mensagem de sucesso para o serviço principal através de uma publicação em outra fila do RabbitMQ(que chama esta API).

Resultado da POC:
![image](https://user-images.githubusercontent.com/53479337/144547117-e62b05b1-f89c-4417-a128-5678b25e6475.png)

## outros serviços: 

serviço pai: https://github.com/Zodh/call-plugins-parent

serviço rest template: https://github.com/Zodh/rest-template-plugin
