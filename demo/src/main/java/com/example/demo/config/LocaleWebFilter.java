package com.example.demo.config;

import org.springframework.context.i18n.SimpleLocaleContext;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

import java.util.Locale;

@Component
public class LocaleWebFilter implements WebFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        String lang = exchange.getRequest().getQueryParams().getFirst("lang");
        if (lang != null) {
            Locale locale = Locale.forLanguageTag(lang);
            exchange.getAttributes().put("LOCALE_CONTEXT", new SimpleLocaleContext(locale));
        }
        return chain.filter(exchange);
    }
}
