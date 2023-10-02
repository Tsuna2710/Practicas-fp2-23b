
import java.io.*;
import java.util.ArrayList;


public class main {
    public static void main(String [] args){
        ArrayList<Student> Lista = new ArrayList<>();
        String Nombre,Materno,Paterno;
        Student Estudiante;

        try{
            BufferedReader reader= new BufferedReader(new FileReader("Datos.csv"));
            String line = null;
            while((line=reader.readLine()) != null){
                String[] parts=line.split(";");
                Estudiante=new Student(parts[0],parts[1],parts[2]);
                Lista.add(Estudiante);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        for(int i=0;i<Lista.size(); i++){
        System.out.println(Lista.get(i).toString());
        }
        
        ordenarPorNombreBurbuja(Lista);
        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("Ordenar por nombre");

        for(int i=0;i<Lista.size(); i++){
        System.out.println(Lista.get(i).getName());
        }
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

}
