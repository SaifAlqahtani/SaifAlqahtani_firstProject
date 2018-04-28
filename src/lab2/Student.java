package lab2;

public class Student {

    private int id ;
    private String name ;
    private int age ; 
    
    
    public Student(){
        id = 0 ; 
        name = null ; 
        age = 0 ;
    }
    public Student(int i , String n ,int a){
        id = i ;
        name = n ; 
        age = a ; 
    }
    public void setId (int d){
        id = d ;
    }
    public void setName (String m){
        name = m ; 
        
    }
    public void setAge (int g){
        age = g ;
    }
    public int getId(){
        return id ;
    }
    public String getName(){
        return name ; 
    }
    public int getAge(){
        return age;
    
		
	}
    
    
}
