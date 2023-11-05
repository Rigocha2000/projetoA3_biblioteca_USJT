/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Guilherme
 */
public class Livro {

    private int id;
    private String Genero;
    private String Autor;
    private String Titulo;
    private double NotaMedia;
    private int FK_IdUser;

    public Livro(String Genero, String Autor, String Titulo, double NotaMedia, int FK_IdUser) {
        this.Genero = Genero;
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.NotaMedia = NotaMedia;
        this.FK_IdUser = FK_IdUser;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public double getNotaMedia() {
        return NotaMedia;
    }

    public void setNotaMedia(double NotaMedia) {
        this.NotaMedia = NotaMedia;
    }

    public int getFK_IdUser() {
        return FK_IdUser;
    }

    public void setFK_IdUser(int FK_IdUser) {
        this.FK_IdUser = FK_IdUser;
    }


    public boolean cadastrar () {
        //definir comando SQL
        String sql = "INSERT INTO Livro (Genero, Autor, Titulo, NotaMedia, FK_IdUser) VALUES (?, ?, ?, ?, ?)";
        
        //abrir conexão como recurso do try
        try (Connection c = ConnectionFactory.obtemConexao()){
            //pre compilar o comando SQL
            PreparedStatement ps = c.prepareStatement(sql);
            //preencher com valores o statement SQL
            ps.setString(1, Genero);
            ps.setString(2, Autor);
            ps.setString(3, Titulo);
            ps.setDouble(4, NotaMedia);
            ps.setInt(5, FK_IdUser);
            //executa o comando
            ps.execute();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        
    }

}
