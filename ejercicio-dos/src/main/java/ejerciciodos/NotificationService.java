package ejerciciodos;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public String saludo(){
        return "Saludos desde Chile";
    }
}
