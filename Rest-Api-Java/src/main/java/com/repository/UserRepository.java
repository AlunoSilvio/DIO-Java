package com.repository;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Spring;

import org.springframework.stereotype.Repository;

import com.user.User;

@Repository
public class UserRepository {

    public void save ( User user ) {

        if ( user.getId() == null )
        System.out.println("Save - Recebendo o usuário na camada de repositório");
        
        else
        System.out.println("Update - Atualizando o usuário na camada de repositório");

        System.out.println(user);
    }

    public void update ( User user ) {

        System.out.println("Atualizar - Atualizando o usuário na camada de repositório");
        System.out.println(user);
    }

    public void deleteById ( Integer id ) {

        System.out.println (String.format("APAGAR/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println (id);
    }

    public List<User> findAll () {

        List <User> user = new ArrayList<>();
        
        user.add ( new User ("Silvio", "password123" ) );
        user.add ( new User ("tuninho","password123" ) );

        return user;
    }

    public User finById (Integer id) {

        System.err.println( String.format ( "Get/id - Recebendo o id : %d para localizar um usuário", id ) );
        return new User ("Silvio", "senha123");
    }

    public User findByUsername ( String userName) {

        System.out.println ( Spring.format ( "Find/username - Recebendo o username %s para localizar um usuário", userName ) );
        return new User ( "userName", "password123");
    }
}
