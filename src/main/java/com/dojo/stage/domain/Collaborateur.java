package com.dojo.stage.domain;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collaborateur {

    private String uid;
    private String civilite;
    private String nom;
    private String prenom;
    private String fonction;
    private String telephone;
    private String mail;
    private String etage;
    private String uoAffectation;
    private String codeImmeubleEmplacementCollaborateur;
    private String region;
    private String codeRegion;
    private String niveauTerritoire;
    private String codeTerritoire;
    private String niveauEntite;
    private String codeEntite;
    private String niveauAgence;
    private String codeAgence;
    private String localisationCollaborateur;
    private String pj;
    private String aMigrer;

    public Collaborateur (){}

    public Collaborateur(String uid, String civilite, String nom, String prenom, String fonction, String telephone, String mail, String etage, String uoAffectation, String codeImmeubleEmplacementCollaborateur, String region, String codeRegion, String niveauTerritoire, String codeTerritoire, String niveauEntite, String codeEntite, String niveauAgence, String codeAgence, String localisationCollaborateur, String pj, String aMigrer) {
        this.uid = uid;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.telephone = telephone;
        this.mail = mail;
        this.etage = etage;
        this.uoAffectation = uoAffectation;
        this.codeImmeubleEmplacementCollaborateur = codeImmeubleEmplacementCollaborateur;
        this.region = region;
        this.codeRegion = codeRegion;
        this.niveauTerritoire = niveauTerritoire;
        this.codeTerritoire = codeTerritoire;
        this.niveauEntite = niveauEntite;
        this.codeEntite = codeEntite;
        this.niveauAgence = niveauAgence;
        this.codeAgence = codeAgence;
        this.localisationCollaborateur = localisationCollaborateur;
        this.pj = pj;
        this.aMigrer = aMigrer;
    }

    public void update(Collaborateur updatedCollaborateur) {
        this.civilite = updatedCollaborateur.getCivilite();
        this.nom = updatedCollaborateur.getNom();
        this.prenom = updatedCollaborateur.getPrenom();
        this.fonction = updatedCollaborateur.getFonction();
        this.telephone = updatedCollaborateur.getTelephone();
        this.mail = updatedCollaborateur.getMail();
        this.etage = updatedCollaborateur.getEtage();
        this.uoAffectation = updatedCollaborateur.getUoAffectation();
        this.codeImmeubleEmplacementCollaborateur = updatedCollaborateur.getCodeImmeubleEmplacementCollaborateur();
        this.region = updatedCollaborateur.getRegion();
        this.codeRegion = updatedCollaborateur.getCodeRegion();
        this.niveauTerritoire = updatedCollaborateur.getNiveauTerritoire();
        this.codeTerritoire = updatedCollaborateur.getCodeTerritoire();
        this.niveauEntite = updatedCollaborateur.getNiveauEntite();
        this.codeEntite = updatedCollaborateur.getCodeEntite();
        this.niveauAgence = updatedCollaborateur.getNiveauAgence();
        this.codeAgence = updatedCollaborateur.getCodeAgence();
        this.localisationCollaborateur = updatedCollaborateur.getLocalisationCollaborateur();
        this.pj = updatedCollaborateur.getPj();
        this.aMigrer = updatedCollaborateur.getaMigrer();
    }



    public String getUid() {
        return uid;
    }

    public String getCivilite() {
        return civilite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMail() {
        return mail;
    }

    public String getEtage() {
        return etage;
    }

    public String getUoAffectation() {
        return uoAffectation;
    }

    public String getCodeImmeubleEmplacementCollaborateur() {
        return codeImmeubleEmplacementCollaborateur;
    }

    public String getRegion() {
        return region;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public String getNiveauTerritoire() {
        return niveauTerritoire;
    }

    public String getCodeTerritoire() {
        return codeTerritoire;
    }

    public String getNiveauEntite() {
        return niveauEntite == null ? "":niveauEntite;
    }

    public String getCodeEntite() {
        return codeEntite;
    }

    public String getNiveauAgence() {
        return niveauAgence;
    }

    public String getCodeAgence() {
        return codeAgence == null ? "":codeAgence;
    }

    public String getLocalisationCollaborateur() {
        return localisationCollaborateur;
    }

    public String getPj() {
        return pj;
    }

    public String getaMigrer() {
        return aMigrer;
    }

    public Output toOutput (Regle regle) {
        return  new Output(
            this.uid,
            this.nom,
            this.prenom,
            this.mail,
                regle.getDomaine(),
                regle.buildTeam(this.getNiveauEntite(),this.getCodeAgence()),
                regle.buildProfil(this.getNiveauEntite()),
                regle.buildCompetences()
        );
    }

    public Output toOutput (SaisieTransformation saisieTransformation) {
        return  new Output(
            this.uid,
            this.nom,
            this.prenom,
            this.mail,
            saisieTransformation.getDomaine(),
            saisieTransformation.getEquipe(),
            saisieTransformation.getProfil(),
            saisieTransformation.getCompetences()
        );
    }

    @Override
    public String toString() {
        return "Collaborateur{" +
                "uid='" + uid + '\'' +
                ", civilite='" + civilite + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", fonction='" + fonction + '\'' +
                ", telephone='" + telephone + '\'' +
                ", mail='" + mail + '\'' +
                ", etage='" + etage + '\'' +
                ", uoAffectation='" + uoAffectation + '\'' +
                ", codeImmeubleEmplacementCollaborateur='" + codeImmeubleEmplacementCollaborateur + '\'' +
                ", region='" + region + '\'' +
                ", codeRegion='" + codeRegion + '\'' +
                ", niveauTerritoire='" + niveauTerritoire + '\'' +
                ", codeTerritoire='" + codeTerritoire + '\'' +
                ", niveauEntite='" + niveauEntite + '\'' +
                ", codeEntite='" + codeEntite + '\'' +
                ", niveauAgence='" + niveauAgence + '\'' +
                ", codeAgence='" + codeAgence + '\'' +
                ", localisationCollaborateur='" + localisationCollaborateur + '\'' +
                ", pj='" + pj + '\'' +
                ", aMigrer='" + aMigrer + '\'' +
                '}';
    }
}
