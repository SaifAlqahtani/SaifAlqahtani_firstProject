package lab2;

public class Section {

private String course ;
private Student[] studentList ;
private int nStudent ; 
Student s = new Student();
    public Section(String c , int ns ){
        course = c ; 
        nStudent = ns ;
    }
    public int searchStudent(int x){
    
    for (int i=0 ; i< nStudent ;i ++){
    	if (studentList[i].getId()== x){
    		return i ; 
    	}
    }
            	return -1 ;

    }
    public void addStudent(int i , String n , int a){
    	if(nStudent < studentList.length){
    		Student s1 = new Student(i , n , a) ;
    	studentList[nStudent] = s1 ;
    	nStudent++ ; 
    	}
    	
    }
    
    public void deleteStudent (int x ){
    	
    	if(searchStudent(x)== -1){
    		
    	}
    	else {
        studentList[x] = studentList[nStudent-1] ;
        studentList[nStudent-1] = null; 
        nStudent --;
        
    	}
    }
    public void printList(){
    	if( nStudent > 0 ){
    		for(int i =0 ; i<nStudent ;i++){
    		System.out.println("id is = "+ s.getId()) ;
    		System.out.println("Name is = " + s.getName()) ;
    		System.out.println("age is = "+ s.getAge());

    		}
    	}
    }
    
    
    
    

   

    

	public static void main(String[] args) {

		Section s = new Section("CSC113" , 3);
       s.addStudent(435103895, "Saif", 21);
       s.addStudent(436102774, "Khalid", 20);
		
	}

}
