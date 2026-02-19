package com.centroweg.pablo.librarysystem.infra.security;

import com.centroweg.pablo.librarysystem.domain.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserDetailsBadge implements UserDetails {

    private User entity;

    public UserDetailsBadge(User entity) {
        this.entity = entity;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return entity.getPassword();
    }

    @Override
    public String getUsername() {
        return entity.getEmail();
    }
}
