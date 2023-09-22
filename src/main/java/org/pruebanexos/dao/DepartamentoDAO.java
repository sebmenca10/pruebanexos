package org.pruebanexos.dao;

import org.pruebanexos.controller.Departamento;
import org.pruebanexos.controller.Empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoDAO {

    private Connection con;

    public DepartamentoDAO(Connection con) {
        this.con = con;
    }

    public List<Departamento> listar() {
        List<Departamento> resultado = new ArrayList<>();

       /* try {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
           */
        return resultado;
    }

    public void guardar(Departamento departamento) {

    }

    public int modificar() {
        return 0;
    }

    public int eliminar(Integer id) {
        return 0;
    }
}
