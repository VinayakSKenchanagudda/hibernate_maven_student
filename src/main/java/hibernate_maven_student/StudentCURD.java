package hibernate_maven_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentCURD {
	public EntityManager getEntityManager()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void saveStudent(Student student)
	{
		
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	
	public void updateStudent(int id,String name)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student= entityManager.find(Student.class, id);
		student.setName(name);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
	
	public void deletStudent(int id)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student student= entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
	}
	
	public void getStudentDetails(int id)
	{
		EntityManager entityManager=getEntityManager();
		Student student= entityManager.find(Student.class, id);
		System.out.println(student);
	}
}
