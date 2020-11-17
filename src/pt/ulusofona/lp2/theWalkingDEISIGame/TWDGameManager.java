package pt.ulusofona.lp2.theWalkingDEISIGame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

 class TWDGameManager {
    public TWDGameManager() {
    }

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

            }
            leitorFicheiro.close();
            return true;
        } catch (FileNotFoundException exception) {
            return false;
        }
    }








public int[]getWorldSize(){
        return null;
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
