package br.com.felipec.rabbitmqplugin.messager;

import br.com.felipec.rabbitmqplugin.service.RabbitService;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class RabbitMQListenerService {

  @Autowired
  RabbitService rabbitService;

  @Autowired
  AmqpTemplate template;

  private void sendMessage(){
    template.convertAndSend("Caller", "g");
  }

  @RabbitListener(queues = "CalledPlugin")
  private void listen(String message) {
    rabbitService.saveMessage();
    sendMessage();
  }

}
