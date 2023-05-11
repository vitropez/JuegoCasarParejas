/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laclave;

import java.sql.*;
import java.lang.NullPointerException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yagoa
 */
public class ClasePrincipal {

    String driver = "com.mysql.cj.jdbc.Driver";
    Connection con;
    String sql;
    String url = "jdbc:mysql://localhost:3306/Juego?useSSL=false";

    String sqllog;
    ResultSet rs;
    static String nombreUsu;
    String password;
    static String eleccion;
    static String mensaje = "";
    static List<String> mejores = new ArrayList<>();

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JuegoFrame().setVisible(true);

            }
        });
    }

    void InsertarResultado(int result, String name) {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "32789380m");
            sqllog = "UPDATE usuario SET puntuacion='" + result + "' WHERE nombre='" + name + "'";
            Statement stm = con.createStatement();
            stm.executeUpdate(sqllog);

            System.out.println("ok");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ha ocurrido un error");

        }

    }

    void CrearUsuario(String name, String pass, String pref) {

        try {

            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "32789380m");
            sql = "INSERT INTO usuario (nombre, contrasena,preferencias) VALUES (?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, name);
            pstm.setString(2, pass);
            pstm.setString(3, pref);
            pstm.executeUpdate();
            eleccion = pref;

            System.out.println("ok");
       

        } catch (NullPointerException | ClassNotFoundException | SQLException e) {
            mensaje = "el usuario ya exixte";
            System.out.println("ha ocurrido un error");

        }
    }

    void Loging(String name, String pass) {
        try {

            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "32789380m");
            sqllog = "SELECT * FROM usuario WHERE nombre='" + name + "'";
            Statement stm = con.createStatement();
            rs = stm.executeQuery(sqllog);
            while (rs.next()) {
                int id = rs.getInt(1);
                nombreUsu = rs.getString(2);
                password = rs.getString(3);
                eleccion = rs.getString(4);

            }

            if (nombreUsu.equals(name) && (password.equals(pass))) {

                new JuegoFrame().setVisible(false);
                new JuegoEntornarCartas().setVisible(true);

            

            System.out.println("ok");
            }else{
                 mensaje = "ususario no encontrado";
                }
        } catch (NullPointerException | ClassNotFoundException | SQLException e) {
            mensaje = "ususario no encontrado";
            System.out.println("ha ocurrido un error");

        }

    }

    void Modificar(String pref, String name) {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "32789380m");
            sqllog = "UPDATE usuario SET preferencias='" + pref + "' WHERE nombre='" + name + "'";
            Statement stm = con.createStatement();
            stm.executeUpdate(sqllog);

            System.out.println("ok");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ha ocurrido un error");

        }

    }

    void ValoresMax() {
        mejores.clear();
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "32789380m");
            sqllog = "SELECT nombre ,puntuacion FROM juego.usuario WHERE puntuacion>=(SELECT MIN(puntuacion)) AND puntuacion<=20 order by puntuacion ASC limit 5;";
            Statement stm = con.createStatement();
            rs = stm.executeQuery(sqllog);
            while (rs.next()) {
                mejores.add(rs.getString(1));

            }

            System.out.println("ok");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ha ocurrido un error");

        }

    }

}
