package config;

import dao.DaoApi;
import dao.DaoImpl2;
import dao.IDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoAliasConfig {
    // Alias "dao" qui renvoie DaoApi comme implémentation
    @Bean(name = "dao2")
    public IDao daoAlias() {
        return new DaoImpl2(); // changer selon le résultat souhaité
    }
}