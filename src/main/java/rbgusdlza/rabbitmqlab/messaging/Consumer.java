package rbgusdlza.rabbitmqlab.messaging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {

    @RabbitListener(queues = "sample.queue")
    public void consume(Message message){
        log.info("consumer consumes message: {}", message);
    }
}
