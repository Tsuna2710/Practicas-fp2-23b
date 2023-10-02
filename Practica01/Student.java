public class Student {
    String Name;
	String Materno;
	String Paterno;
    public Student(String Paterno, String Materno, String Name){
        this.Materno=Materno;
        this.Name=Name;
        this.Paterno=Paterno;
    }
    public String getName(){
		return Name;
	}

	public String getMaterno(){
		return Materno;
	}

	public String getPaterno(){
		return Paterno;
	}

    public String toString(){
        return Paterno+"\t"+Materno+"\t"+Name;
    }
    
}
