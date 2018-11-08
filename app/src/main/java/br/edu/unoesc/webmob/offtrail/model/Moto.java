package br.edu.unoesc.webmob.offtrail.model;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Moto {


    public Integer getCodmoto() {
        return codmoto;
    }

    public void setCodmoto(Integer codmoto) {
        this.codmoto = codmoto;
    }

    public String getDesmod() {
        return desmod;
    }

    public void setDesmod(String desmod) {
        this.desmod = desmod;
    }

    public String getDesmarc() {
        return desmarc;
    }

    public void setDesmarc(String desmarc) {
        this.desmarc = desmarc;
    }

    public String getCinmot() {
        return cinmot;
    }

    public void setCinmot(String cinmot) {
        this.cinmot = cinmot;
    }

    public String getCormot() {
        return cormot;
    }

    public void setCormot(String cormot) {
        this.cormot = cormot;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    @DatabaseField(generatedId = true)
    private Integer codmoto;
    @DatabaseField(canBeNull = true)
    private String desmod;
    @DatabaseField(canBeNull = true)
    private String desmarc;
    @DatabaseField(canBeNull = true)
    private String cinmot;
    @DatabaseField(canBeNull = true)
    private String cormot;


    @DatabaseField(foreign = true, foreignColumnName = "codmoto")
    private Moto moto;

}
