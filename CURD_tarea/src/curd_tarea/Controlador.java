package curd_tarea;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Controlador {
     private Persona []grupo;
     public Controlador(){
         this.grupo=new Persona[0];
     }
     public Persona[] getGrupo() {
         return grupo;
     }
     public void setGrupo(Persona[] grupo) {
         this.grupo = grupo;
     }

    public static void Escribir(Persona[] grupo) throws IOException {
        File obj = new File("Archivos\\Personas_legible.txt");
        FileWriter writer = new FileWriter(obj);
        for (int i = 0; i < grupo.length; i++) {
            writer.write(grupo[i].getName() + " " + grupo[i].getEdad() + " " + grupo[i].getAltura() + "\n");
        }

        writer.flush();
        writer.close();
    }

    public void Exportar(Persona[] p, String s) throws IOException {
        File file = new File("Archivos\\"+s+".txt");
        FileOutputStream salida = new FileOutputStream(file);
        ObjectOutputStream obj = new ObjectOutputStream(salida);
        obj.writeInt(p.length);
        for (int i = 0; i < p.length; i++) {
            obj.writeObject(p[i]);
        }

        obj.flush();
        obj.close();
    }

    public Persona[] Importar(Persona[]newgroup, String s) throws IOException, ClassNotFoundException {
        File file = new File("Archivos\\"+s+".txt");
        FileInputStream entrada = new FileInputStream(file);
        ObjectInputStream obj = new ObjectInputStream(entrada);
        int tam = obj.readInt();
        Persona[] g = new Persona[tam];
        for (int i = 0; i < tam; i++) {
            Object o = obj.readObject();
            Persona p = (Persona) o;
            g[i] = p;
            System.out.println(g[i].getName());
        }
        newgroup=g;
        obj.close();
        return newgroup;
    }
    public void addPersona(Persona p) {
        if(this.grupo.length == 0) {
          this.grupo=new Persona[1];
          this.grupo[0]=p;
        }else{
            Persona [] temp=new Persona[this.grupo.length];
            for (int i = 0; i < temp.length; i++) {
                temp [i]=this.grupo[i];
            }
            this.grupo=new Persona[temp.length+1];
            for (int i = 0; i < temp.length; i++) {
                this.grupo[i]=temp[i];
            }
            this.grupo[temp.length]=p;
        }
        
    }
    public void deletePersona(String s){
        for (int i = 0; i < this.grupo.length; i++) {
            if(s.equals(this.grupo[i].getName().trim())){
                if(i!=this.grupo.length-1){
                Persona [] temp=new Persona[this.grupo.length];
                 //int pos=i;
                for (int j = 0; j < temp.length-1; j++) {
                    if (j<i) {
                        temp [j]=this.grupo[j];
                    }else{
                        temp [j]=this.grupo[j+1];
                    }  
                }
                this.grupo=new Persona[temp.length-1];
                for (int j = 0; j < temp.length-1; j++) {
                    this.grupo[j]=temp[j];
                }
                }else{
                     this.grupo[this.grupo.length-1]=null;
                     Persona [] temp=new Persona[this.grupo.length-1];
                     for (int j = 0; j < temp.length; j++) {
                         temp[j]=this.grupo[j];
                     }
                     this.grupo=new Persona[temp.length];
                     this.grupo=temp;
                }
               
            }
        }
    }
   
}