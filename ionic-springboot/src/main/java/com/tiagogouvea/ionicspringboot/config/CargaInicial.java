/*
*
* Aula com Nataniel Paiva
*
* Esse projeto poderá ser distribuído da forma que você achar melhor
* O importante é que você aprenda de verdade!
*
 */
package com.tiagogouvea.ionicspringboot.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.tiagogouvea.ionicspringboot.entity.Role;
import com.tiagogouvea.ionicspringboot.entity.User;
import com.tiagogouvea.ionicspringboot.repository.RoleRepository;
import com.tiagogouvea.ionicspringboot.repository.UserRepository;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@Component
public class CargaInicial implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    UserRepository usuarioRepository;

    @Autowired
    RoleRepository perfilRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {

        List<Role> perfis = perfilRepository.findAll();

        if (perfis.isEmpty()) {
            perfilRepository.save(new Role("ROLE_ADMIN"));
            perfilRepository.save(new Role("ROLE_USER"));

            Role perfil = perfilRepository.findByName("ROLE_ADMIN");

            List<Role> novosPerfis = new ArrayList<>();

            novosPerfis.add(perfil);

            User user = new User();
            
            user.setEmail("tiagoaraujodegouvea@gmail.com");
            user.setName("Tiago Gouvêa");
            user.setPass("123456");
            user.setRoles(novosPerfis);
            
            usuarioRepository.save(user);

        }

    }

}
