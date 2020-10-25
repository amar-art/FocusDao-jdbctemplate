package com.jdbcTemplate.focusDao.dao;

import com.jdbcTemplate.focusDao.model.Customer;
import com.jdbcTemplate.focusDao.model.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.tree.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

@Repository
 public class CustomerDaoImpl implements CustomerDao {

    private final JdbcTemplate jdbcTemplate;

    private static final String insert_customer = ""
            + "INSERT INTO customer"
            + "(first_name,"
            + " age,"
            + " create_date)  "
            + "  VALUES   (?,"
            + "            ?,"
            + "            Now())";


    @Autowired
    public CustomerDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void insert(Customer customer) {

        jdbcTemplate.update(insert_customer, new Object[]{customer.getFirstName(), customer.getAge()});

    }

   public Customer findById(int id) {

            String sql = "SELECT * FROM CUSTOMER WHERE ID = ?";

            return (Customer) jdbcTemplate.queryForObject(
                    sql,
                    new Object[]{id},
                    new BeanPropertyRowMapper(Customer.class));

        }

    /* //findById  2 eme approche
    public Customer findById(int id) {

        String sql = "SELECT * FROM CUSTOMER WHERE ID = ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Customer(
                        rs.getString("first_name"),
                        rs.getInt("age")
                ));

    }
*/
      public List<CustomerDTO> findAll() {

        String sql = "SELECT * FROM CUSTOMER";

        return jdbcTemplate.query(
                sql,
                (rs, rowNum) ->
                        new CustomerDTO(
                                rs.getInt("id"),
                                rs.getString("first_name"),
                                rs.getInt("age"),
                                rs.getDate("create_date")));


    }


}