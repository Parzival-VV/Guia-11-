
package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.BarcoVelero;
import Entidades.YateDeLujo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class BarcoServicio {

    //Banco de barcos para ejecutar en el ejercicio.
    public ArrayList<Barco> bancoDeBarcos() {

        ArrayList<Barco> barcos = new ArrayList();

        Barco b1 = new BarcoVelero(3, 3145, 12, 1998);
        Barco b2 = new BarcoVelero(5, 6352, 27, 1983);

        barcos.add(b1);
        barcos.add(b2);

        Barco b3 = new BarcoMotor(95, 4120, 19, 2010);
        Barco b4 = new BarcoMotor(125, 1533, 21, 2014);

        barcos.add(b3);
        barcos.add(b4);

        Barco b5 = new YateDeLujo(9, 500, 1215, 38, 1985);
        Barco b6 = new YateDeLujo(150, 2500, 3917, 105, 2019);

        barcos.add(b5);
        barcos.add(b6);

        return barcos;
    }
    

    //Metodo que nos permite sellecionar un barco del los que estan diponibles y lo asigna al objeto alquiler.
    public void seleccionBarco(Alquiler a1) {

        ArrayList<Barco> barcos = bancoDeBarcos();
        Barco b1;

        System.out.println("**\nSELECCIONE EL BARCO QUE DESEA: ");

        for (int i = 0; i < barcos.size(); i++) {
            
            System.out.println("\nOPCION:  " + (i + 1) + "\n");

            if (barcos.get(i) instanceof BarcoVelero) {

                BarcoVelero object = (BarcoVelero) barcos.get(i);

                System.out.println("\nTipo de Barco: Barco a Vela." + "\n"
                        + "Numero de matricula: " + object.getMatricula() + "\n"
                        + "Metros de eslora: " + object.getEslora() + "\n"
                        + "Año de fabricacion: " + object.getAnioFabricacion() + "\n"
                        + "Cantidad de mastiles: " + object.getMastiles());

            } else if (barcos.get(i) instanceof BarcoMotor) {

                BarcoMotor object = (BarcoMotor) barcos.get(i);

                System.out.println("\nTipo de Barco: Barco a Motor." + "\n\n"
                        + "Numero de matricula: " + object.getMatricula() + "\n"
                        + "Metros de eslora: " + object.getEslora() + "\n"
                        + "Año de fabricacion: " + object.getAnioFabricacion() + "\n"
                        + "Cantidad de caballos a vapor: " + object.getCV());

            } else if (barcos.get(i) instanceof YateDeLujo) {

                YateDeLujo object = (YateDeLujo) barcos.get(i);

                System.out.println("\nTipo de Barco: Barco a Motor." + "\n\n"
                        + "Numero de matricula: " + object.getMatricula() + "\n"
                        + "Metros de eslora: " + object.getEslora() + "\n"
                        + "Año de fabricacion: " + object.getAnioFabricacion() + "\n"
                        + "Cantidad de caballos a vapor: " + object.getCV() + "\n"
                        + "Cantidad de camarotes: " + object.getCamarotes());

            }

        }

        MiddleWorks mw = new MiddleWorks();
        Scanner leer = new Scanner(System.in);
        int opcion;

        System.out.println("\nIngrese opcion: ");

        while (true) {

            opcion = mw.validarInteger(leer);

            if (opcion > 0 && opcion <= barcos.size()) {

                break;

            } else {
                mw.msjeFueraDeRango();
            }
        }

        b1 = barcos.get(opcion - 1);

        a1.setBarco(b1);
    }
    

    public void mostrarBarcoSelleccionado(Barco b1) {

        System.out.println("\n**** BARCO SELECCIONADO ****\n");

        if (b1 instanceof BarcoVelero) {

            BarcoVelero object = (BarcoVelero) b1;

            System.out.println("\nTipo de Barco: Barco a Vela." + "\n"
                    + "Numero de matricula: " + object.getMatricula() + "\n"
                    + "Metros de eslora: " + object.getEslora() + "\n"
                    + "Año de fabricacion: " + object.getAnioFabricacion() + "\n"
                    + "Cantidad de mastiles: " + object.getMastiles() + "\n\n");

        } else if (b1 instanceof BarcoMotor) {

            BarcoMotor object = (BarcoMotor) b1;

            System.out.println("\nTipo de Barco: Barco a Motor." + "\n\n"
                    + "Numero de matricula: " + object.getMatricula() + "\n"
                    + "Metros de eslora: " + object.getEslora() + "\n"
                    + "Año de fabricacion: " + object.getAnioFabricacion() + "\n"
                    + "Cantidad de caballos a vapor: " + object.getCV() + "\n\n");

        } else if (b1 instanceof YateDeLujo) {

            YateDeLujo object = (YateDeLujo) b1;

            System.out.println("\nTipo de Barco: Barco a Motor." + "\n\n"
                    + "Numero de matricula: " + object.getMatricula() + "\n"
                    + "Metros de eslora: " + object.getEslora() + "\n"
                    + "Año de fabricacion: " + object.getAnioFabricacion() + "\n"
                    + "Cantidad de caballos a vapor: " + object.getCV() + "\n"
                    + "Cantidad de camarotes: " + object.getCamarotes() + "\n\n");

        }

    }

}
