package main.edu.um.labtic.server.persistencia;

import main.edu.um.labtic.server.negocios.entidades.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CineRepository extends JpaRepository<Cine, Long> {
}
/*import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
    @Autowired
    NoteRepository noteRepository;

    @PostMapping("/note")
    public void save(@RequestBody Note note) {
        noteRepository.save(note);
    }
}
*/