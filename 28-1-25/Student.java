
class Student {
    private String name;
    private int prn;

    public Student(String name, int prn) {
        setName(name);
        setPRN(prn);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPRN() {
        return prn;
    }

    public void setPRN(int prn){
		this.prn = prn;
	}

    public void display() {
        System.out.println("Name: " + getName() + " PRN:" + getPRN());
    }
}