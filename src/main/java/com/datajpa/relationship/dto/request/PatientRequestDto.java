package com.datajpa.relationship.dto.request;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
@Data
public class PatientRequestDto {
    private String nom;
    private String prenom;
    private String genre;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dateNaissance;
    private Integer numIdendite;
    private String photo;
    private String domicile;
    private Boolean estAssure;
    private String  assurance;
    private Double tauxAssurance;
    private String email;
    private Long paiementId;
    private Long salleAttenteId;
    private Long seviceConsultationId;
    private Long detailPatientId;
}
