package br.edu.unoesc.webmob.offtrail.model;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Trilheiro {

    @DatabaseField(generatedId = true)
    private Integer codtri;
    @DatabaseField(canBeNull = true)
    private String nomtri;
    @DatabaseField(canBeNull = true)
    private String idatri;



    @DatabaseField(foreign = true, foreignColumnName = "codusu")
    private Trilheiro trilheiro;


}
