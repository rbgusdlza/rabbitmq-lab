package rbgusdlza.rabbitmqlab;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MqController {

    private static final String EXCHANGE_NAME = "sample.exchange";

    private final RabbitTemplate rabbitTemplate;

    @GetMapping("send-message")
    public String publish() {
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, "sample.routing.#", "hello from korea");
        return "Message sending!";
    }
}
