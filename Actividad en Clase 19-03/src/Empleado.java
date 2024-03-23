public abstract class Empleado {

    //Atributos
    protected String name;
    protected String lastName;
    protected int id;
    protected Operario operario;
    protected Directivo directivo;


    //Constructor Vacio
    public Empleado() {
    }


    //Constructor Sobrecargado
    public Empleado(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }


    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDni() {
        return id;
    }

    public void setDni(int dni) {
        this.id = dni;
    }

    public Operario getOperario() {
        return operario;
    }

    public void setOperario(Operario operario) {
        this.operario = operario;
    }

    public Directivo getDirectivo() {
        return directivo;
    }

    public void setDirectivo(Directivo directivo) {
        this.directivo = directivo;
    }

    //Métodos
    @Override
    public String toString() {
        return "Nombre: " + name + ", Apellido: " + lastName + ", DNI: " + id;
    }
}