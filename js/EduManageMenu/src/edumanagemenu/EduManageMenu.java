package edumanagemenu;

/**
 *
 * @author sebas
 */
import java.util.Scanner;

public class EduManageMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==============================");
            System.out.println("  BIENVENIDO A EDUMANAGE");
            System.out.println("==============================");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Ver modelo entidad-relacion");
            System.out.println("3. Informacion de contacto");
            System.out.println("4. Calcular promedio de notas");
            System.out.println("5. Listar estudiantes simulados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante:");
                    String nombre = input.next();
                    System.out.println("Estudiante " + nombre + " registrado exitosamente.");
                    System.out.println("\nPresione ENTER para volver al menu...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 2:
            System.out.println("Mostrando modelo entidad-relacion...\n");
            System.out.println("Entidades:");
            System.out.println("- Estudiantes (Id, Nombre, Apellido, Correo...)");
            System.out.println("- Profesores (Id, Nombre, Especialidad...)");
            System.out.println("- Cursos (Id, Nombre)");
            System.out.println("- Matriculas (Id, Id_Estudiante, Id_Curso)");
            System.out.println("- Asignaciones (Id, Id_Profesor, Id_Curso)");
            System.out.println("\nRelaciones: Matriculas (muchos a muchos entre estudiantes y cursos), etc.\n");
            System.out.println("\nPresione ENTER para volver al menu...");
                    input.nextLine();
                    input.nextLine();
            
            break;

                case 3:
                    System.out.println("Contactanos en: edumanage@institucion.edu\n");
                    System.out.println("\nPresione ENTER para volver al menu...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 4:
                    System.out.println("Ingrese las tres notas:");
                    double n1 = input.nextDouble();
                    double n2 = input.nextDouble();
                    double n3 = input.nextDouble();
                    double promedio = (n1 + n2 + n3) / 3;
                    System.out.printf("El promedio es: %.2f\n\n", promedio);
                    System.out.println("\nPresione ENTER para volver al menu...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 5:
                    System.out.println("Lista de estudiantes:");
                    System.out.println("- Laura Gómez");
                    System.out.println("- Juan Pérez");
                    System.out.println("- Camila López\n");
                    System.out.println("\nPresione ENTER para volver al menu...");
                    input.nextLine();
                    input.nextLine();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.\n");
            }

        } while (opcion != 0);

        input.close();
    }
}
