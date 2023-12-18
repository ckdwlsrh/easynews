package com.ckdwlsrh.easynews.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Column(unique = true)
    private String email;

    private boolean is_active;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id")
    private LocalAuthentication localAuthentication;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id")
    private SocialAuthentication socialAuthentication;
}
