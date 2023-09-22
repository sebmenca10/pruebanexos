package org.pruebanexos.dao;

import org.pruebanexos.controller.Departamento;
import org.pruebanexos.controller.Empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
    private Connection con;

    public EmpleadoDAO(Connection con) {
        this.con = con;
    }

    public List<Empleado> listar() {
        List<Empleado> resultado = new ArrayList<>();

       /* try {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
           */
        return resultado;
    }

    public void guardar(Empleado empleado) {

    }

    public int modificar() {
        return 0;
    }

    public int eliminar(Integer id) {
        return 0;
    }

}
