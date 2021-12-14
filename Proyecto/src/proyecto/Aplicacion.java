package luis;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Empresa empresa = new Empresa("Empresa");
        String opc = "";
        do {
            System.out.println("================================================");
            System.out.println("1) Ingresar empleado");
            System.out.println("2) Eliminar empleado");
            System.out.println("3) Mostrar todos los empleados");
            System.out.println("4) Eliminar todos los empleados");
            System.out.println("5) Salir");
            System.out.println("================================================");
            opc = input.nextLine();
            switch (opc) {
                case "1":
                    addEmpleado(empresa);
                    break;
                case "2":
                    deleteEmpleado(empresa);
                    break;
                case "3":

                    for (Empleado empleado : empresa.mostrarEmpleados()) {
                        System.out.println(empleado);
                    }
                    break;
                case "4":
                    empresa.DeleteEmpleados();
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (!opc.equalsIgnoreCase("5"));

    }

    public static void addEmpleado(Empresa empresa) {
        Scanner input = new Scanner(System.in);
        Empleado empleado = new Empleado();
        System.out.println("Ingresa el ID");
        empleado.setID(input.nextLine());
        System.out.println("Ingresa el nombre");
        empleado.setNombre(input.nextLine());
        System.out.println("Ingresa la fecha de nacimiento");
        System.out.println("Dia");
        Fecha fecha = new Fecha();
        fecha.setDia(Integer.parseInt(input.nextLine()));
        System.out.println("Mes");
        fecha.setMes(Integer.parseInt(input.nextLine()));
        System.out.println("Año");
        fecha.setAnio(Integer.parseInt(input.nextLine()));
        System.out.println("Ingresa el salario");
        empleado.setSalario(Double.parseDouble(input.nextLine()));
        System.out.println("Ingresa el horario");
        empleado.setHorario(input.nextLine());
        empleado.setFNacimiento(fecha);
        empresa.addEmpleado(empleado);
    }

    public static void deleteEmpleado(Empresa empresa) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el ID del empleado");
        if (empresa.removeEmpleado(input.nextLine()) != null) {
            System.out.println("Empleado eliminado");
        } else {
            System.out.println("Empleado no eliminado");
        }

    }
}
