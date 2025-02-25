package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorities.Authorities;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();
        Map<String, String> users = new ConcurrentHashMap<>();
        users.put("Ivan", "123456");
        users.put("Nata", "1234567");

        if (users.containsKey(user) && users.get(user).equals(password)){
            list.add(Authorities.WRITE);
            list.add(Authorities.READ);
            list.add(Authorities.DELETE);
        } else {
            return new ArrayList<>();
        }
        return list;
    }
}
