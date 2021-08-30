package zichtlthiago.hearthstonecards.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import zichtlthiago.hearthstonecards.rest.api.entity.Card;
import zichtlthiago.hearthstonecards.rest.api.entity.CardClass;
import zichtlthiago.hearthstonecards.rest.api.entity.CardType;

import java.util.List;
import java.util.Optional;

public interface CardRepository extends CrudRepository<Card, Integer> {

    Optional<Card> findByName(String nome);

    Optional<List<Card>> findByCardClass(CardClass cardClass);

    Optional<List<Card>> findByCardType(CardType cardType);

}
