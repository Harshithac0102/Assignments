package com.sonata;

public class StudentDetails {


    int stdId;
    String stdName;
    String stdClass;


public void display() {
	System.out.println(" Student id is: "+stdId+"\n Student name is :"+stdName+"\n Student class is :"+stdClass);
    
}

    public static void main(String[] args) {
    	StudentDetails st = new StudentDetails();
        st.stdId=1;
        st.stdName="Harsha";
        st.stdClass="BE";
        st.display();
        //StudentDetails st1=new StudentDetails();
        st.stdId=2;
        st.stdName="Siri";
        st.stdClass="BE";
        st.display();
        
    }
}
