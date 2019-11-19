package com.sirenka.datamanager.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.util.UUID;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Offer {

    @Id
    private final UUID id = UUID.randomUUID();

    @Getter
    private String url;
    @Getter
    private String company_name;
    @Getter
    private String company_logo_url;
    @Getter
    private String job_title;
    @Getter
    private String salary;
}
