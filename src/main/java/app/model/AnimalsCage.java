package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    //@Autowired
    private Animal animal;
    private Timer time;

    @Autowired
    public void AnimalCage(@Qualifier("dog") Animal animal,Timer time) {
        this.animal = animal;
        this.time = time;
    }
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(time.getTime().longValue());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return time;
    }
}
