package by.munir.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mathces")
public class Matches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "player1_id")
    private Long players1;
    @Column(name = "player2_id")
    private Long players2;
    private Long winner;

    public Matches() {
    }

    public Matches(Long id, Long players1, Long players2, Long winner) {
        this.id = id;
        this.players1 = players1;
        this.players2 = players2;
        this.winner = winner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlayers1() {
        return players1;
    }

    public void setPlayers1(Long players1) {
        this.players1 = players1;
    }

    public Long getPlayers2() {
        return players2;
    }

    public void setPlayers2(Long players2) {
        this.players2 = players2;
    }

    public Long getWinner() {
        return winner;
    }

    public void setWinner(Long winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "Matches{" +
               "id=" + id +
               ", players1=" + players1 +
               ", players2=" + players2 +
               ", winner=" + winner +
               '}';
    }
}
