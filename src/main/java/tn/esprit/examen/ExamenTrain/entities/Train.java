package tn.esprit.examen.ExamenTrain.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Train implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idTrain;
@Enumerated(EnumType.STRING)
etatTrain etat;
Date dateDepart;
Date dateArrivee;
Double heureDepart;
Double heureArrivee;
int nbPlaceLibre;
@ManyToOne
    Gare vient;
@ManyToOne
    Gare vaVers;
@OneToMany(mappedBy = "train")
    Set<Client> clients;
}