package zichtlthiago.hearthstonecards.rest.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zichtlthiago.hearthstonecards.rest.api.entity.Card;
import zichtlthiago.hearthstonecards.rest.api.entity.CardClass;
import zichtlthiago.hearthstonecards.rest.api.entity.CardType;
import zichtlthiago.hearthstonecards.rest.api.repository.CardRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    @Autowired
    private CardRepository repo;

    public Card findById(Integer id) {
        Optional<Card> c = repo.findById(id);
        return c.orElseThrow(() -> new ErrorID(id));
    }

    public List<Card> findByCardType(CardType cardType){
        Optional<List<Card>> c = repo.findByCardType(cardType);
        return c.orElseThrow(() -> new ErrorType(cardType));
    }

    public List<Card> findByCardClass(CardClass cardClass){
        Optional<List<Card>> c = repo.findByCardClass(cardClass);
        return c.orElseThrow(() -> new ErrorClass(cardClass));
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public Card insert(Card carta) {
        return repo.save(carta);
    }

    public List<Card> findAll(){
        return (List<Card>) repo.findAll();
    }
}
