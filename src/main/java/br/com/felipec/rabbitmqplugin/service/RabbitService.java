package br.com.felipec.rabbitmqplugin.service;

import br.com.felipec.rabbitmqplugin.model.Message;
import br.com.felipec.rabbitmqplugin.repository.MessageRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitService {

  @Autowired
  private MessageRepository messageRepository;

  public String saveMessage(){
    var message = new Message();
    message.setMessage(UUID.randomUUID() + " - RBT" );
    messageRepository.save(message);
    return "Success!";
  }
}
