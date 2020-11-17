package pt.ulusofona.lp2.theWalkingDEISIGame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

 class TWDGameManager {
    public TWDGameManager() {
    }
     LinkedHashMap<String, String> ficheiro1 = new LinkedHashMap<String, String>();
    public boolean startGame(File ficheiroInicial) {
        File nomeFicheiro = ficheiroInicial;
        try {
            File ficheiro;
            ficheiro = new File(String.valueOf(nomeFicheiro));
            Scanner leitorFicheiro = new Scanner(new FileInputStream(ficheiro));
// enquanto o ficheiro tiver linhas não-lidas
            while (leitorFicheiro.hasNextLine()) {
// ler uma linha do ficheiro
                String linha = leitorFicheiro.nextLine();
// partir a linha no caractere separador
                String dados[] = linha.split(":");

                int iDCriatura=Integer.parseInt(dados[0]);
                int iDTipo= Integer.parseInt(dados[1]);
                String nomeCriatura= dados[2];
                int x= Integer.parseInt(dados[3]);
                int y= Integer.parseInt(dados[4]);
                int iDEquipamento= Integer.parseInt(dados[5]);
                int nColunas=Integer.parseInt(dados[6]);
                int nLinhas=Integer.parseInt(dados[7]);
                int iDEquipaIniciaJogo= Integer.parseInt(dados[8]);
                ficheiro1.put(String.valueOf(iDCriatura),nColunas+" "+nLinhas);


            }
            leitorFicheiro.close();
            return true;
        } catch (FileNotFoundException exception) {
            return false;
        }
    }



public int[]getWorldSize(){
        int[] bairroCoordenadas= new int[2];
        bairroCoordenadas[0]=2;


        return bairroCoordenadas;
        }

public int getInitialTeam(){
        return 0;
        }

public List<Humano> getHumans(){
        return null;
        }

public List<Zombie> getZombies(){
        return null;
        }

public boolean move(int xO,int
        yO,int xD,int yD){
        return true;
        }

public boolean gameIsOver(){
        return true;
        }

public List<String> getAuthors(){
        return null;
        }

public int getCurrentTeamId(){
        return 0;
        }

public int getElementId(int x,int
        y){
        return 0;
        }
public List<String> getSurvivors(){
        return null;
        }
public boolean isDay(){
        return true;
        }

public boolean hasEquipment(int
        creatureId,int equipmentTypeId){
        return true;
        }




        }
