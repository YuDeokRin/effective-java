package me.chapter04.item26.genericdao;

public class Account implements Entity {

    private long id;
    private String username;

    public Account(long id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    public String getUsername(){
        return username;
    }
}
