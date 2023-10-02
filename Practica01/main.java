
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> Lista = new ArrayList<>();
        Student Estudiante;
        
        try{
            BufferedReader reader= new BufferedReader(new FileReader("Datos.csv"));
            String line = null;
            while((line=reader.readLine()) != null){
                String[] parts=line.split(";");
                Estudiante=new Student(parts[0],parts[1],parts[2],parts[3],parts[4],parts[5]);
                Lista.add(Estudiante);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        for(int i=0;i<Lista.size(); i++){
        System.out.println(Lista.get(i).toString());
        }
        
        //ordenarPorNombreBurbuja(Lista);
        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("==========================");
        //System.out.println("Ordenar por nombre");

        //for(int i=0;i<Lista.size(); i++)
          //  System.out.println(Lista.get(i).getName());

        System.out.println("Ingrese el nombre de a nave a buscar: ");
		String nombre=sc.next();
        int pos=busquedaBinariaNombre(Lista,nombre);
        
        if (pos!=-1) {
			System.out.println(Lista.get(pos).toString());
		}
		else System.out.println("No encontrado");

    }
    public static void ordenarPorNombreBurbuja ( ArrayList<Student> list ){
        for(int i=0;i< list.size() ;i++){
            for (int j=0;j< list.size()-1;j++){
                if( list.get(j).getName(). compareTo ( list.get(j+1).getName()) >0){
                    intercambiar (list,j,j+1) ;
                }
            }
        }
    }
    public static void intercambiar ( ArrayList<Student> list,int i, int j){
        Student aux ;
        aux= list.get(i);
        list.set(i, list.get(j));
        list.set(j, aux);
    }

    public static int busquedaBinariaNombre(ArrayList<Student> list, String s){
		for(int i=0;i<list.size();i++){
			if(s.equals(list.get(i).getName())) return i;
		}
		return -1;   
	}

}
