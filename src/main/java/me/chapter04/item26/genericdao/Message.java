package me.chapter04.item26.genericdao;

public class Message<T> implements Entity{

    private Long id;
    private String body;

    @Override
    public Long getId() {
        return this.id;
    }

    public String getBody(){
        return body;
    }
}
