package br.edu.unoesc.webmob.offtrail.model;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable

public class Usuario {



    public Integer getCodusu() {
        return codusu;
    }

    public void setCodusu(Integer codusu) {
        this.codusu = codusu;
    }

    public String getEmausu() {
        return emausu;
    }

    public void setEmausu(String emausu) {
        this.emausu = emausu;
    }

    public String getSenusu() {
        return senusu;
    }

    public void setSenusu(String senusu) {
        this.senusu = senusu;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    @DatabaseField(generatedId = true)
    private Integer codusu;
    @DatabaseField(canBeNull = true)
    private String emausu;
    @DatabaseField(canBeNull = true)
    private String senusu;


    @DatabaseField(foreign = true, foreignColumnName = "codusu")
    private Usuario usuario;

}