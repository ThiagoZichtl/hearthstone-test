package zichtlthiago.hearthstonecards.rest.api.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import zichtlthiago.hearthstonecards.rest.api.entity.Card;
import zichtlthiago.hearthstonecards.rest.api.entity.CardClass;
import zichtlthiago.hearthstonecards.rest.api.entity.CardType;
import zichtlthiago.hearthstonecards.rest.api.repository.CardRepository;
import zichtlthiago.hearthstonecards.rest.api.service.CardService;

import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(path = "/cards")
public class Controller {

    @Autowired
    private CardRepository repo;

    @Autowired
    private CardService serv;

    // APAGA CARTA POR ID
    @DeleteMapping(value= "/delete/id={id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        serv.delete(id);
        return ResponseEntity.noContent().build();
    }


    // CADASTRA CARTA
    @PostMapping(path = "/add")
    public Object insert(@RequestBody Card carta){

        if(carta.getAttack()<10 || carta.getDefense()<10 || carta.getAttack()>0 || carta.getDefense()>0 ) {
            carta = serv.insert(carta);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id={id}").buildAndExpand(carta.getId()).toUri();
            return ResponseEntity.created(uri).body(carta);
        }else{
            return "Valor de Ataque e Defesa deve ser entre 0 e 10";
        }
    }

    //LISTA DE CARTAS
    @GetMapping(path = "/list")
    public ResponseEntity<List<Card>> findAll(){
        List<Card> list = serv.findAll();
        return ResponseEntity.ok().body(list);
    }

    // CONSULTA POR ID
    @GetMapping(path = "/id={id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id){
        Card carta = serv.findById(id);
        return ResponseEntity.ok().body(carta);
    }

    // CONSLUTA POR NOME
    @GetMapping(value = "/name={name}")
    public ResponseEntity<Card> findByName(@PathVariable("name") String name){
        return repo.findByName(name).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }


    // CONSULTA CARTAS PELO TIPO
    @GetMapping(value = "/type={cardType}")
    public ResponseEntity<List<Card>> findByType(@PathVariable CardType cardType){
        List<Card> list = (List<Card>) serv.findByCardType(cardType);
        return ResponseEntity.ok().body(list);
    }

    // CONSULTA CARTAS PELA CLASSE
    @GetMapping(value = "/class={cardClass}")
    public ResponseEntity<List<Card>> findByClass(@PathVariable CardClass cardClass){
        List<Card> list = (List<Card>) serv.findByCardClass(cardClass);
        return ResponseEntity.ok().body(list);
    }

}
