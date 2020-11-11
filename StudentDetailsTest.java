package in.co.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDetailsTest {
	public static void main(String[] args) {
		try{
			
		
		StudentDetails st=new StudentDetails();
		st.setId(1);
		st.setName("ravi");
		st.setRoll("101");
		st.setDegree("B.E");
		st.setPhone("9630889958");
        
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(st);
		tr.commit();
		session.close();
		sf.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
