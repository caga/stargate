package dataj; //import entity.*;
import login.User;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

import javax.persistence.*;

public class Dao {

	//public static void main(String[] args) {
	//	Dao dao = new Dao();
	//	dao.run();
	//}

	public void run(User kisi) {
		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
//		Scanner input=new Scanner(System.in);
//		System.out.println("\n Lütfen İşleminizi Seçiniz: \n 1-Yeni kayıt \n 2- Kayıt dökümü");
//	int secim=input.nextInt();	
	
		try {
			factory = Persistence.createEntityManagerFactory("PersistenceUnit");
			entityManager = factory.createEntityManager();
//			Query query =entityManager.createQuery("Select e.firstName from Person e");
//			List<String>list=query.getResultList();
//	System.out.println("İsimler:");
//			for(String e:list){
//				System.out.println(e);
//			}

			System.out.println("Dao içindeyim...persist :"+kisi.getName());
		 	persistPerson(entityManager,kisi);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
			if (factory != null) {
				factory.close();
			}
		}
	}


	private void persistPerson(EntityManager entityManager,User kisi) {
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			//Person person = new Person();
			//person.setFirstName("Ertan");
			//person.setLastName("Atay");
	//kayit(kisi);		
			
		entityManager.persist(kisi);
			transaction.commit();
		} catch (Exception e) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}
	}
	private void kayit(User kisi){
	//	System.out.println("\n Lütfen kaydedilecek personel ismini girin");
	//	Scanner input=new Scanner(System.in);
	//	kisi.setName(input.next());
	//	System.out.println("\n Soyadını girin");
	//	kisi.setPassword(input.next());
	//	input.close();
	}
}

