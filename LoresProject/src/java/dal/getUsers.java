/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Users;

/**
 *
 * @author MSI
 */
public class getUsers extends Users {

    public ArrayList<Users> getEmployees() {
        ArrayList<Users> users = new ArrayList<>();
        try {
            String sqlQuery = "u.userAccount, e.PasswordHash from Users u";
            PreparedStatement stm = connection.prepareStatement(sqlQuery);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                employees.add(new Employees(rs.getString(1), rs.getLong(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(getEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees;
    }
}
