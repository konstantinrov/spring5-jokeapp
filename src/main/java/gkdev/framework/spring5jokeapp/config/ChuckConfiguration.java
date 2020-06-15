package gkdev.framework.spring5jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Konstantin Romanov
 * @created 01/04/2020 - 18:23
 * @project spring5-jokeapp
 */
//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

    // see alternative xml config -> chuck-config.xml
}
