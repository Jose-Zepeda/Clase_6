package pkgLista;
import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

    public void ejemplo1(){
        List<String> taskList = new ArrayList<>();
        taskList.add("Sacar al perro");
        taskList.add("Ir de compras");
        taskList.add("Hacer la cama");
        taskList.add("Ir a votar");

        //ESTE CICLO FOR LO QUE HACE ES ITERAR, QUE ES RECORRER TODO EL OBJETO

        int pos = 0;
for (String item : taskList){
    System.out.println(pos+" Tarea:"+item);
    pos++;
}
    }

    public void ejercicio1(){
        //HACER LISTA DE NUMEROS CON LOS NUMEROS CON LOS VALORES 1000, 2000, 3000, 4000
        //HACER UNA ITERACION Y MOSTRAR LA SUMA DE LOS VALORES

        List<Short> listaNumeros = new ArrayList<>();
        listaNumeros.add((short) 1000);
        listaNumeros.add((short) 2000);
        listaNumeros.add((short) 3000);
        listaNumeros.add((short) 4000);

        short suma = 0;
        for (Short item : listaNumeros){

            System.out.printf(String.valueOf(item));
            suma = (short) (suma+item);
            System.out.println("------------------");
            System.out.println(suma);
        }
    }

    public void listaTareas(){
        List<ClsTaskList> tl = new ArrayList<>();
        ClsTaskList tarea = new ClsTaskList();

        tarea.setTaskName("Ir a votar");
        tarea.setTaskDescription("Escuela, mesa 5");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        tarea.setTaskName("Sacar al chucho");
        tarea.setTaskDescription("Llevar a firulais al parque");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        tarea.setTaskName("Hacer la cama");
        tarea.setTaskDescription("Mi mama me regana");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        for (ClsTaskList item: tl) {

            System.out.println(item.getTaskName());

        }
    }
    }


