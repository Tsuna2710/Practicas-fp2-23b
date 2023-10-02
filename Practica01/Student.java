public class Student {
    String Name;
	String Materno;
	String Paterno;
    String Gender;
    String CUI;
    String Status;
    String Email;


    public Student(String Paterno, String Materno, String Name, String Gender,String CUI,String Status){
        this.Materno=Materno;
        this.Name=Name;
        this.Paterno=Paterno;
        this.Gender=Gender;
        this.CUI=CUI;
        this.Status=Status;
        this.Email=generarEmail();
    }

    public String getName(){
		return Name;
	}
    
    public String getStatuS(){
		return Status;
	}

    public String getGender(){
		return Gender;
	}

    public String getCUI(){
		return CUI;
	}
	public String getMaterno(){
		return Materno;
	}

	public String getPaterno(){
		return Paterno;
	}

    public String generarEmail(){
		return Name.charAt(0)+Paterno+Name.charAt(0)+"@unsa.edu.pe";
	}

    public String toString(){
        return Paterno+"\t"+Materno+"\t"+Name+"\t"+Gender+"\t"+CUI+"\t"+Status+"\t"+Email.toLowerCase();
    }
    
}
