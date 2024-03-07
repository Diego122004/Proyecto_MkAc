package proyect_mac;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminUsuarios {

    ArrayList<Usuario> usuario = new ArrayList();
    File archuUsuarios = null;

    public AdminUsuarios(String path) {
        archuUsuarios = new File(path);

    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    public File getArchuUsuarios() {
        return archuUsuarios;
    }

    public void setArchuUsuarios(File archuUsuarios) {
        this.archuUsuarios = archuUsuarios;
    }

    @Override
    public String toString() {
        return "AdminUsuarios{" + "usuario=" + usuario + ", archuUsuarios=" + archuUsuarios + '}';
    }

 
    public void setUsuriarios(Usuario usr) {
        usuario.add(usr);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archuUsuarios, false);
            bw = new BufferedWriter(fw);
            for (Usuario t : usuario) {

                bw.write(t.getNombre() + ";");
                bw.write(t.getContraseña() + ";");

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        usuario = new ArrayList();
        if (archuUsuarios.exists()) {
            try {
                sc = new Scanner(archuUsuarios);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    usuario.add(new Usuario(sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
