package pt.ulusofona.lp2.theWalkingDEISIGame;

public class Humano {
    int iDHumano=1;
    String nomeHumano="Humano;";

    Humano(int iDHumano,String nomeHumano){
        this.iDHumano=iDHumano;
        this.nomeHumano=nomeHumano;
    }
    public int getId(){

        return 0;
    }
    public String getImagePNG(){
        return "";
    }
    public String toString(){
        Equipa nomeDaEquipa= new Equipa();
        Tipo tipoDaCriatura= new Tipo();
        if(tipoDaCriatura=tipoDaCriatura.zombie){
            Equipamentos quantidadeDeEquipamentos= new Equipamentos();
            return iDHumano+" | "+ tipoDaCriatura.zombie+" | "+nomeDaEquipa.nomeDaEquipa  +" | "+"avo"+" | "+quantidadeDeEquipamentos.quantidadeDeEquipamentos;
        }


    }
}
