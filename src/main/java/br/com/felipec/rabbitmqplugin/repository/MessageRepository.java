package br.com.felipec.rabbitmqplugin.repository;

import br.com.felipec.rabbitmqplugin.model.Message;
import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, BigInteger> { }
