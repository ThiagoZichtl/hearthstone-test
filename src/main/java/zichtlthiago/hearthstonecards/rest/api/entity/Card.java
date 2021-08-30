package zichtlthiago.hearthstonecards.rest.api.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="cartas")
public class Card implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String description;
    CardClass cardClass;
    CardType cardType;
    Integer attack;
    Integer defense;

    public Card() {
    }

    public Card(Integer id, String name, String description, CardClass cardClass, CardType cardType, Integer attack, Integer defense) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cardClass = cardClass;
        this.cardType = cardType;
        this.attack = attack;
        this.defense = defense;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CardClass getCardClass() {
        return cardClass;
    }

    public void setCardClass(CardClass cardClass) {
        this.cardClass = cardClass;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

}
