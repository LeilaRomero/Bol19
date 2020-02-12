package bol19;

import javax.swing.JOptionPane;

/**
 *
 * @author Leila
 */
public class Bol19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] tabla = new int[3][3];
        String[] Equipos = new String [3];
        String[] Jornada = new String [3];
        int[] Total= new int [3];
        int Opcion;
        Metodos obj = new Metodos();

        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***"
                    +"\n 1 -- Equipos"
                    + "\n 2 -- Jornadas"
                    + "\n 3 -- Goles"
                    + "\n 4 -- Mostrar la tabla"
                    + "\n 5 -- Ordenar los equipos"
                    + "\n 6 -- Goles por equipo"
                    + "\n 7 -- Tabla ordenada"
                    + "\n 8 -- Goles por jornada"
                    + "\n 9 -- Buscar"
                    + "\n 10 -- Salir"));
            switch (Opcion) {
                case 1:
                    obj.crearTablaEquipo(Equipos);
                    break;
                case 2:
                    obj.crearTablaJornada(Jornada);
                    break;
                case 3:
                    obj.crearTablaGoles(tabla, Equipos, Jornada);
                    break;
                case 4:
                    obj.mostrarTabla(tabla, Equipos, Jornada);
                    break;
                case 5:
                    obj.ordenarEquipos(tabla, Equipos, Total);
                    break;
                case 6:
                    obj.totalGolesEquipo(Equipos, Total);
                    break;
                case 7:
                    obj.mostraTablaOrdenada(tabla, Equipos, Jornada, Total);
                    break;
                case 8:
                    obj.buscarCantidadGolesEnJornada(Equipos, Jornada, tabla);
                    break;
                case 9:
                    obj.consultar(Equipos, Jornada, tabla);
                    break;
                case 10:
                    obj.salir();
            }
        } while (Opcion < 10);
    }
    
}
