package com.esraa.repo;

import com.esraa.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        String sql = "insert into student (id,name,marks) values(?,?,?)";
        int rows = jdbc.update(sql,student.getId(),student.getName(),student.getMarks());
        System.out.println("rows inserted: "+rows);
    }

    public List<Student> findAll() {

        RowMapper<Student> mapper = ( rs,  rowNum) -> {

                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setMarks(rs.getInt("marks"));
                return student;

        };

        String sql = "select * from student";
        return jdbc.query(sql,mapper);

    }
}
