/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_uliseslargaespada;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Random;

/**
 *
 * @author ularg
 */
public class Lab7P1_UlisesLargaespada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamar a main menu
        mainMenu();
    }
    
    public static void mainMenu() {
        System.out.println("-- Bienvenido al programa resolver el Lab 7 --");
        
        // Initialize scanner
        Scanner entry = new Scanner(System.in);
        
        // Ask for the name
        System.out.println("Como te llamas?");
        System.out.print("Ingresa tu nombre: ");
        
        String nombre = entry.nextLine();
        
        System.out.println("Bienvenido " + nombre + ", espero disfrutes los ejercicios!");
        System.out.println();
        
        // Iniciar menu repetitivo
        do {
            System.out.println("Elija que juego desea jugar: ");
            System.out.println("1 - El calamar Pablo");
            System.out.println("2 - Torre de control");
            System.out.println("3 - Salir");
            
            int option = entry.nextInt();
            
            switch (option) {
                case 1 -> calamarPablo(nombre);
                
                case 2 -> torreDeControl(nombre);
                                
                case 3 -> System.out.println("Gracias por usar el este programa, feliz dia!");
                
                default -> System.out.println("Elija una opcion de las anteriores");
            }
            
            // Salir del programa 
            if (option == 3) {
                break;
            }
        } while(true);
    }
    
    // Llamar el metodo de calamar Pablo
    public static void calamarPablo(String nombre) {
        System.out.println("Bienvenido al juego del calamar Pablo");
        System.out.println("En este juego e pediremos seleccionar dos paises para crear su seleccion, luego le daremos los resultados de los partidos del domingo 27 de noviembre");
        
        // Iniciar lista de paises
        String[] listaPaises = {
            "España",
            "Alemania",
            "Costa Rica",
            "Japon",
            "Belgica",
            "Croacia",
            "Canada",
            "Marruecos"
        };
        
        // Metodos para llamar 
        System.out.println("Ingrese el primer pais");
        String pais1 = checkPais(listaPaises);
        iniciarSeleccion(pais1, listaPaises);
        
        System.out.println("Ingrese el segundo pais");
        String pais2 = checkPais(listaPaises);
        iniciarSeleccion(pais2, listaPaises);
        
        //Metodo para comparar los paises y dar el resultado
        imprimirTablaDePartidos();
        
        System.out.println("Gracias por participar " + nombre + ", ten un buen dia!");
        System.out.println();
    }
    
    // Metodo para comprobar si el pais esta en la lista y guardarlo
    public static String checkPais(String[] listaPaises) {
        // Initialize scanner
        Scanner entry = new Scanner(System.in);
        
        // Iniciar pais
        String pais;

        boolean check1 = true;
        
        // Guardar pais de seleccion
        do {            
            pais = entry.nextLine();
            
            for (int i = 0; i < listaPaises.length; i += 1) {
                if(listaPaises[i].equalsIgnoreCase(pais)) {
                    check1 = false;
                    pais = listaPaises[i];
                }
            }
            
            if (check1 == false) {
                break;
            }

            System.out.println("Su pais no esta en la lista, ingrese de nuevo");
        } while(true);
                
        return pais;
    }
    
    // Metodo para llamar clase e instanciarla
    public static void iniciarSeleccion(String pais, String[] listaPaises) {
        Seleccion España = new Seleccion("Grupo E", "España", "Luis Enrique", 26, true, "Primero", 0);
        Seleccion Alemania = new Seleccion("Grupo E", "Alemania", "Hansi Flick", 26, true, "Tercero", 0);
        Seleccion CostaRica = new Seleccion("Grupo E", "Costa Rica", "Luis Fernando Suarez", 26, false, "Cuarto", 0);
        Seleccion Japon = new Seleccion("Grupo E", "Japon", "Hajime Moriyasu", 26, false, "Segundo", 0);
        Seleccion Belgica = new Seleccion("Grupo F", "Belgica", "Roberto Martinez", 26, false, "Primero", 0);
        Seleccion Croacia = new Seleccion("Grupo F", "Croacia", "Zlatko Dalic", 26, false, "Segundo", 0);
        Seleccion Canada = new Seleccion("Grupo F", "Canada", "John Herdman", 26, false, "Cuarto", 0);
        Seleccion Marruecos = new Seleccion("Grupo F", "Marruecos", "Walid Regragui", 26, false, "Tercero", 0);
                
        switch(pais) {
            case "España" -> {
                imprimirSeleccion(España);
            }
            
            case "Alemania" -> {
                imprimirSeleccion(Alemania);
            }
            
            case "Costa Rica" -> {
                imprimirSeleccion(CostaRica);
            }
            
            case "Japon" -> {
                imprimirSeleccion(Japon);
            }
            
            case "Belgica" -> {
                imprimirSeleccion(Belgica);
            }
            
            case "Croacia" -> {
                imprimirSeleccion(Croacia);
            }
            
            case "Canada" -> {
                imprimirSeleccion(Canada);
            }
            
            case "Marruecos" -> {
                imprimirSeleccion(Marruecos);
            }
        }        
    }
    
    // Metodo para imprimir la seleccion
    public static void imprimirSeleccion(Seleccion pais) {
        System.out.println();
        System.out.println("Alemania pertenece al " + pais.getNombreGrupo() + ".");
        System.out.println("Su director tecnico es" + pais.getDirectorTecnico() + ".");
        System.out.println("Tiene " + pais.getJugadoresConvocados() + " jugadores convocados.");
        
        if (pais.isGanadoMundial()) {
            System.out.println("Si ha ganado un mundial");
        } else {
            System.out.println("No ha ganado un mundial");
        }
        
        String posicion = pais.getPosicionTabla();
        
        switch (posicion) {
            case "Primero" -> System.out.println("Esta en la primera posicion del grupo");
            case "Segundo" -> System.out.println("Esta en la segunda posicion del grupo");
            case "Tercero" -> System.out.println("Esta en la tercera posicion del grupo");
            case "Cuarto" -> System.out.println("Esta en la cuarta posicion del grupo");
        }
        
        System.out.println("--Se ha creado exitosamente la seleccion de Alemania--");
        
        System.out.println();
    }
    
    // Metodo para llamar a los partidos en especifico
    public static void imprimirTablaDePartidos() {
        System.out.println("Estos son los resultados de los partidos del domingo 27 de noviembre");
        
        Seleccion España = new Seleccion("Grupo E", "España", "Luis Enrique", 26, true, "Primero", 0);
        Seleccion Alemania = new Seleccion("Grupo E", "Alemania", "Hansi Flick", 26, true, "Tercero", 0);
        Seleccion CostaRica = new Seleccion("Grupo E", "Costa Rica", "Luis Fernando Suarez", 26, false, "Cuarto", 0);
        Seleccion Japon = new Seleccion("Grupo E", "Japon", "Hajime Moriyasu", 26, false, "Segundo", 0);
        Seleccion Belgica = new Seleccion("Grupo F", "Belgica", "Roberto Martinez", 26, false, "Primero", 0);
        Seleccion Croacia = new Seleccion("Grupo F", "Croacia", "Zlatko Dalic", 26, false, "Segundo", 0);
        Seleccion Canada = new Seleccion("Grupo F", "Canada", "John Herdman", 26, false, "Cuarto", 0);
        Seleccion Marruecos = new Seleccion("Grupo F", "Marruecos", "Walid Regragui", 26, false, "Tercero", 0);
        
        resultadoDeSelecciones(Japon, CostaRica);
        resultadoDeSelecciones(Belgica, Marruecos);
        resultadoDeSelecciones(Croacia, Canada);
        resultadoDeSelecciones(España, Alemania);
    }
    
    // Metodo para dar el resultado de los partidos
    public static void resultadoDeSelecciones(Seleccion pais1, Seleccion pais2) {
        System.out.println("-----Resultados-------");
        // Get nombres de cada pais
        String nombreP1 = pais1.getNombreSeleccion();
        String nombreP2 = pais2.getNombreSeleccion();
        
        // Establecer numeros random
        int randomGoals1 = new Random().nextInt((5) + 1);
        int randomGoals2 = new Random().nextInt((5) + 1);
        
        // Set goals para cada pais 
        pais1.setCantidadGoles(randomGoals1);
        pais2.setCantidadGoles(randomGoals2);
        
        // Get goals para cada pais
        int goalsP1 = pais1.getCantidadGoles();
        int goalsP2 = pais2.getCantidadGoles();
        
        // Imprimri resultados de partidos
        System.out.println("Juega " + nombreP1 + " contra " + nombreP2);
        System.out.println(nombreP1 + " anoto " + goalsP1 + " goles");
        System.out.println(nombreP2 + " anoto " + goalsP2 + " goles");
        
        if(goalsP1 > goalsP2) {
            System.out.println("Ha ganado " + nombreP1);
        } else if(goalsP2 > goalsP1) {
            System.out.println("Ha ganado " + nombreP2);
        } else {
            System.out.println("Ha sido un empate...");
        }
        
        System.out.println("----------------------");
        System.out.println();
    }
    
    // Llamar metodo torre de Control
    public static void torreDeControl(String nombre) {
        // Initialize scanner
        Scanner entry = new Scanner(System.in);
        
        System.out.println("--Bienvenido al sistema de torre de control--");
        
        Avion avion1 = ingresarAvion();
        Avion avion2 = ingresarAvion();
        Avion avion3 = ingresarAvion();
        
        do {
            System.out.print("Desea cambiarle el estado a un avion [Y/N]: ");
            String response = entry.nextLine();

            if(response.equalsIgnoreCase("Y")) {
                System.out.println("Aviones disponibles: ");
                System.out.println("1. " + avion1.getModeloAvion());
                System.out.println("2. " + avion2.getModeloAvion());
                System.out.println("3. " + avion3.getModeloAvion());

                llamarAvionValidar(avion1, avion2, avion3);
                
            } else if(response.equalsIgnoreCase("N")){
                break;
            }
        } while(true);
        
        
        System.out.println("Muchas gracias por participar en la torre de control " + nombre);
        System.out.println();
    }
    
    // Metodo para solicitar entradas y guardar el avion
    public static Avion ingresarAvion() {
        // Initialize scanner
        Scanner entry = new Scanner(System.in);
        
        // Estado por defecto
        String estadoAvion = "Estacionado";
        
        // Pedir entradas al usuario las entradas y almacenarlos
        System.out.print("Ingrese el modelo del avion: ");
        String modeloAvion = entry.nextLine();
        
        System.out.print("Ingrese el codigo del avion: ");
        String codigoAvion = entry.nextLine();
        
        System.out.print("Ingrese el año de fabricacion: ");
        int yearFabricacion = entry.nextInt();
        
        System.out.print("Ingrese la capacidad maxima de pasajeros: ");
        int capacidadMax = entry.nextInt();
        
        System.out.print("Ingrese el peso del avion: ");
        int pesoAvion = entry.nextInt();
        
        System.out.print("Ingrese el nombre de la aerolinea: ");
        entry.nextLine();
        String nombreAerolinia = entry.nextLine();
        
        Avion nuevoAvion = new Avion(modeloAvion, codigoAvion, yearFabricacion, capacidadMax, pesoAvion, nombreAerolinia, estadoAvion);
        
        System.out.println("--Se ha agregado el avion exitosamente--");
        System.out.println();
 
        return nuevoAvion;
    }
    
    public static void llamarAvionValidar(Avion avion1, Avion avion2, Avion avion3) {
        // Initialize scanner
        Scanner entry = new Scanner(System.in);
        
        System.out.print("Ingrese el numero del avion al que le desea cambiar el estado: ");
        do{
            int selection = entry.nextInt();

            switch(selection) {
                case 1 -> {
                    cambiarEstadoAvion(avion1);
                }

                case 2 -> {
                    cambiarEstadoAvion(avion2);
                }

                case 3 -> {
                    cambiarEstadoAvion(avion3);
                }
            }

            if(selection >= 0 && selection <= 3) {
                break;
            }

            System.out.println("El numero no es valido, ingrese de nuevo: ");
        }while(true);
    }
    
    // Metodo para cambiar estado al avion
    public static void cambiarEstadoAvion(Avion avion) {
        // Initialize scanner
        Scanner entry = new Scanner(System.in);
        
        System.out.println("--Se ha elegido el " + avion.getModeloAvion() + "--");
        System.out.println();
        
        System.out.println("Estados disponibles: ");
        System.out.println("1. Despegando");
        System.out.println("2. Aterrizando");
        System.out.println("3. Estacionado");
        
        System.out.print("Seleccione el nuevo estado: ");
        int nuevoEstado = entry.nextInt();
        
        switch(nuevoEstado) {
            case 1 -> {
                avion.setEstadoAvion("Despegando");
            }
            
            case 2 -> {
                avion.setEstadoAvion("Aterrizando");
            }
            
            case 3 -> {
                avion.setEstadoAvion("Estacionado");
            }
        }
        
        System.out.println("--" + avion.getModeloAvion() + " ahora esta " + avion.getEstadoAvion() + "--");
        System.out.println();
    }
}
