package org.northcoders.dao;
import org.northcoders.model.Data;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Locale;

public class FakeBooksDAO {
//    public static Data getAllBooks(){
//        WebClient client = WebClient.builder()
//                            .baseUrl("https://fakerapi.it")
//                            .build();
//
//        return client.get()
//                    .uri("/api/v1/books").accept(MediaType.APPLICATION_JSON)
//                    .retrieve()
//                    .bodyToMono(Data.class)
//                    .block();
//
//    }

    private WebClient client;

    public FakeBooksDAO(){
        client = WebClient.create("https://fakerapi.it");
    }

    public Data getAllBooks(){
        return this.client.get()
                .uri("/api/v1/books").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Data.class)//transforms raw res into mono<response> class obj
                .block(); //transforms mono<response> into java class obj
    }
    public Data getAllBooks(int limit){
        return this.client.get()
                .uri(uriBuilder -> uriBuilder.path("/api/v1/books").queryParam("_quantity",limit).build())
                .retrieve()
                .bodyToMono(Data.class)
                .block();
    }
    public Data getAllBooks(Locale locale){
        return this.client.get()
                .uri(uriBuilder -> uriBuilder.path("/api/v1/books").queryParam("_locale",locale).build())
                .retrieve()
                .bodyToMono(Data.class)
                .block();
    }
}
