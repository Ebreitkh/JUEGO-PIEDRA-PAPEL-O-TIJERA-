/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Beth
 */
public class Juego {

    int JugadaPersona = 0;
    int JugadaCompu = 0;
    String JugadaTextoPersona;
    String JugadaTextoCompu;

    Random R = new Random(2);
    Scanner Sc = new Scanner(System.in);
    //creamos el objeto persona
    Persona P = new Persona();

    public void Jugar() {

        int contador = 1;
        System.out.println("****************************************");
        System.out.println("\tPIEDRA,PAPEL O TIJERA\n");

        P.solicitarDatosPersona();

        System.out.println("\tCOMIENZA EL JUEGO!\n");

        System.out.println("\tJUGADOR\n");

        P.mostrarDatosPersona();

        while (contador <= 3) {

            System.out.println("\t(RONDA " + contador + ")");
            System.out.println("Seleccione su jugada escribiendo un numero:");
            System.out.println("0:PIEDRA");
            System.out.println("1:PAPEL");
            System.out.println("2:TIJERA");

            int Opcion = Sc.nextInt();

            switch (Opcion) {

                case 0:
                    JugadaTextoPersona = "PIEDRA";
                    break;
                case 1:
                    JugadaTextoPersona = "PAPEL";
                    break;
                case 2:
                    JugadaTextoPersona = "TIJERA";
                    break;
            }

            ImprimirJugadaenLetras();

            if (JugadaTextoPersona == "PIEDRA" && JugadaTextoCompu == "TIJERA") {

                JugadaPersona = JugadaPersona + 1;

            } else if (JugadaTextoPersona == "PAPEL" && JugadaTextoCompu == "PIEDRA") {

                JugadaPersona = JugadaPersona + 1;

            } else if (JugadaTextoPersona == "TIJERA" && JugadaTextoCompu == "PAPEL") {

                JugadaPersona = JugadaPersona + 1;

            }
            
            else if (JugadaTextoPersona =="TIJERA"  && JugadaTextoCompu == "PIEDRA") {

                JugadaCompu = JugadaCompu + 1;

            } else if (JugadaTextoPersona == "PIEDRA" && JugadaTextoCompu == "PAPEL") {

                JugadaCompu = JugadaCompu + 1;

            } else if (JugadaTextoPersona == "PAPEL" && JugadaTextoCompu == "TIJERA") {

                JugadaCompu = JugadaCompu + 1;

            }
                       
            contador++;            

        }
        
        BuscarelImprimrGanadorFinal();
        
        

    }

    public void GenerarJuegoComputador() {

        int OpcionPC = R.nextInt(3);

        switch (OpcionPC) {

            case 0:
                JugadaTextoCompu = "PIEDRA";
                break;
            case 1:
                JugadaTextoCompu = "PAPEL";
                break;
            case 2:
                JugadaTextoCompu = "TIJERA";
                break;

        }

    }

    public void ImprimirJugadaenLetras() {

        GenerarJuegoComputador();

        System.out.println("=====");
        System.out.println("Jugada Persona: " + JugadaTextoPersona);
        System.out.println("Jugada Compu: " + JugadaTextoCompu);
        System.out.println("=====");

        if (JugadaTextoPersona == JugadaTextoCompu) {

            System.out.println("EMPATE");
        }

    }

    public void BuscarelImprimrGanadorFinal() {
        
        System.out.println("\t----------------------GANADOR----------------------");
        
        if(JugadaPersona<JugadaCompu){
            System.out.println("COMPUTADOR");
            System.out.println("Número de aciertos: "+JugadaCompu);
        }
        else if(JugadaPersona>JugadaCompu){
            
            System.out.println("PERSONA");
            System.out.println("Número de aciertos: "+JugadaPersona);
        }
        else{
            
            System.out.println("HA OCURRIDO UN EMPATE");
            
        }
            

    }
}
