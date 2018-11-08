package br.edu.unoesc.webmob.offtrail.model;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Grupo_Trilheiro {


    @DatabaseField(generatedId = true)
    private Integer codgri;
    @DatabaseField(canBeNull = true)
    private String datcad;
    @DatabaseField(foreign = true, foreignColumnName = "codgri")
    private Grupo_Trilheiro grupo_trilheiro;
}
