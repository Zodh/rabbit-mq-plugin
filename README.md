# rabbit-mq-plugin
Projeto que recebe e envia uma mensagem ao serviço https://github.com/Zodh/call-plugins-parent.

Este projeto é responsável por ter uma escuta das publicações do serviço https://github.com/Zodh/call-plugins-parent, salvar um registro na base de dados através do JPA e retornar uma mensagem de sucesso para o serviço principal através de uma publicação em outra fila do RabbitMQ(que chama esta API).

Resultados da prova de conceito:
![image](https://user-images.githubusercontent.com/53479337/144547117-e62b05b1-f89c-4417-a128-5678b25e6475.png)

---

![image](https://user-images.githubusercontent.com/53479337/144550430-e91797b7-746b-4f7c-8731-d7fb1aed40dd.png)

---

![image](https://user-images.githubusercontent.com/53479337/144550718-3a57d538-ea80-41f5-80e6-b46f32f0d514.png)

## outros serviços: 

serviço pai: https://github.com/Zodh/call-plugins-parent

serviço rest template: https://github.com/Zodh/rest-template-plugin
