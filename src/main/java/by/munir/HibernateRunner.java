package by.munir;

import by.munir.model.entity.Matches;
import by.munir.model.entity.Players;
import org.hibernate.cfg.Configuration;

public class HibernateRunner {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        Players players1 = Players.builder()
                .name("Vosif")
                .build();
        Players players2 = Players.builder()
                .name("Khanjar")
                .build();
        Matches matches = Matches.builder()
                .winner(12L)
                .players1(players1)
                .players2(players2)
                .build();


        configuration.configure();
        try (var sessionFactory = configuration.buildSessionFactory();
             var session = sessionFactory.openSession()) {

            session.beginTransaction();
            session.persist(players1);
            session.persist(players2);
            session.persist(matches);
            session.getTransaction().commit();
        }
    }
}