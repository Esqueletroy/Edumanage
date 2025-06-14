package edumanagemenu;

/**
 *
 * @author sebas
 */
import java.util.Scanner;

public class EduManageMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        cursos.add("Logica de Programacion");
        cursos.add("Gestion de Bases de Datos");
        cursos.add("Introduccion a la Programacion");

        do {
            System.out.println("\n=== MENU PRINCIPAL EDU-MANAGE ===");
            System.out.println("1. Gestion de Estudiantes");
            System.out.println("2. Gestion de Cursos");
            System.out.println("3. Gestion de Notas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuEstudiantes(scanner);
                    break;
                case 2:
                    menuCursos(scanner);
                    break;
                case 3:
                    menuNotas(scanner);
                    break;
                case 0:
                    System.out.println("Cerrando sesion...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
    }

    public static void menuEstudiantes(Scanner scanner) {
        int opcion;
        do {
            System.out.println("\n--- GESTION DE ESTUDIANTES ---");
            System.out.println("1. Ver estudiantes registrados");
            System.out.println("2. Registrar nuevo estudiante");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (estudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        for (int i = 0; i < estudiantes.size(); i++) {
                            System.out.println((i + 1) + ". " + estudiantes.get(i));
                        }
                    }
                    break;

                case 2:
                    String nombre;
                    do {
                        System.out.print("Ingrese nombre del estudiante (0 para volver): ");
                        nombre = scanner.nextLine();
                        if (!nombre.equals("0")) {
                            estudiantes.add(nombre);
                            System.out.println("Estudiante registrado.");
                        }
                    } while (!nombre.equals("0"));
                    break;

                case 0:
                    System.out.println("Regresando al menu principal...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
    }

    public static void menuCursos(Scanner scanner) {
        int opcion;
        do {
            System.out.println("\n--- GESTION DE CURSOS ---");
            System.out.println("1. Ver cursos");
            System.out.println("2. Registrar nuevo curso");
            System.out.println("3. Elegir curso");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (cursos.isEmpty()) {
                        System.out.println("No hay cursos.");
                    } else {
                        for (int i = 0; i < cursos.size(); i++) {
                            System.out.println((i + 1) + ". " + cursos.get(i));
                        }
                    }
                    break;

                case 2:
                    String curso;
                    do {
                        System.out.print("Ingrese nombre del curso (0 para volver): ");
                        curso = scanner.nextLine();
                        if (!curso.equals("0")) {
                            cursos.add(curso);
                            System.out.println("Curso registrado.");
                        }
                    } while (!curso.equals("0"));
                    break;

                case 3:
                    if (cursos.isEmpty()) {
                        System.out.println("No hay cursos disponibles.");
                    } else {
                        System.out.println("Seleccione un curso:");
                        for (int i = 0; i < cursos.size(); i++) {
                            System.out.println((i + 1) + ". " + cursos.get(i));
                        }
                        System.out.print("Opcion (0 para volver): ");
                        int eleccion = scanner.nextInt();
                        if (eleccion > 0 && eleccion <= cursos.size()) {
                            System.out.println("Seleccionaste: " + cursos.get(eleccion - 1));
                        } else if (eleccion != 0) {
                            System.out.println("Opcion invalida.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Regresando al menu principal...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
    }

    public static void menuNotas(Scanner scanner) {
        int opcion;
        do {
            System.out.println("\n--- GESTION DE NOTAS ---");
            System.out.println("1. Ver notas simuladas");
            System.out.println("2. Evaluar nota individual");
            System.out.println("3. Calcular suma total");
            System.out.println("4. Registrar varias notas");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("Nota " + i + ": " + (i * 1.5));
                    }
                    break;

                case 2:
                    System.out.print("Ingrese una nota: ");
                    double nota = scanner.nextDouble();
                    if (nota >= 3.0) {
                        System.out.println("Aprobado.");
                    } else {
                        System.out.println("Reprobado.");
                    }
                    break;

                case 3:
                    double suma = 0;
                    int i = 1;
                    while (i <= 3) {
                        System.out.print("Ingrese nota " + i + ": ");
                        suma += scanner.nextDouble();
                        i++;
                    }
                    System.out.println("Suma total: " + suma);
                    break;

                case 4:
                    double n;
                    do {
                        System.out.print("Ingrese una nota (0 para volver): ");
                        n = scanner.nextDouble();
                        if (n != 0) {
                            System.out.println("Nota registrada: " + n);
                        }
                    } while (n != 0);
                    break;

                case 0:
                    System.out.println("Regresando al menu principal...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
    }
}