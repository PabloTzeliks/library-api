package com.centroweg.pablo.librarysystem.app.service;

import com.centroweg.pablo.librarysystem.infra.persistence.repository.JpaUserRepository;
import com.centroweg.pablo.librarysystem.infra.security.UserDetailsBadge;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements UserDetailsService {

    private final JpaUserRepository userRepository;

    public AuthenticationService(JpaUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email)
                .map(UserDetailsBadge::new)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado com o email: " + email));
    }
}
