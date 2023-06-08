package edu.goit;

import edu.goit.entity.Note;
import edu.goit.service.NoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Module13SpringMVCApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(Module13SpringMVCApplication.class, args);

        NoteService noteService = (NoteService) context.getBean("noteService");
        Note note = Note.builder()
                .title("Title first note")
                .content("Content first note").build();
        noteService.add(note);
        note = Note.builder()
                .title("Title second note")
                .content("Content second note").build();
        noteService.add(note);

    }

}
