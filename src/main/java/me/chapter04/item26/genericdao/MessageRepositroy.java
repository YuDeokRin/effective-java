package me.chapter04.item26.genericdao;

import java.util.Optional;
import java.util.Set;
import java.util.HashSet;


public class MessageRepositroy {
    private Set<Message> messages;

    public MessageRepositroy() {
        this.messages = new HashSet<>();
    }

    public Optional<Message> findById(Long id) {
        return messages.stream().filter(a -> a.getId().equals(id)).findAny();
    }

    public void add(Message message) {
        this.messages.add(message);
    }
}
