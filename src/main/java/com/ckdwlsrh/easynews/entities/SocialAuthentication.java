package com.ckdwlsrh.easynews.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SocialAuthentication {

    @Id
    private int id;
    
    private String platform;

    private String sns_service_id;
}
