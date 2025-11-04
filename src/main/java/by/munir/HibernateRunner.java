package by.munir;

import by.munir.model.entity.Matches;
import by.munir.model.entity.Players;
import org.hibernate.cfg.Configuration;

public class HibernateRunner {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();

        configuration.configure();
        try (var sessionFactory = configuration.buildSessionFactory();
        var session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.persist(Players.builder()
                            .name("Munir")
                    .build());
            session.getTransaction().commit();
        }
    }
}