package library.android.ssociety.bloggreendao.Entities;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by seb on 30/04/17.
 */

@Entity
public class Livre {

    @Id
    private Long Id;

    @NotNull
    private String titre;

    @NotNull
    private String auteur;

    @NotNull
    private Integer annee_publication;

    @Transient
    private String champ_non_serialise;

    public Integer getAnnee_publication() {
        return this.annee_publication;
    }

    public void setAnnee_publication(Integer annee_publication) {
        this.annee_publication = annee_publication;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    @Generated(hash = 715629692)
    public Livre(Long Id, @NotNull String titre, @NotNull String auteur,
            @NotNull Integer annee_publication) {
        this.Id = Id;
        this.titre = titre;
        this.auteur = auteur;
        this.annee_publication = annee_publication;
    }

    @Generated(hash = 416716574)
    public Livre() {
    }


}
