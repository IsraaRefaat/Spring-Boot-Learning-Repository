package com.esraa;

import com.esraa.model.Student;
import com.esraa.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		StudentService sts = context.getBean(StudentService.class);

		Student student = context.getBean(Student.class);
		student.setId(4);
		student.setName("James");
		student.setMarks(75);

		sts.addStudent(student);

		List<Student> students = sts.getStudents();

		System.out.println(students);

	}

}
