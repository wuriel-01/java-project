//CONSTRUCTOR: es un metodo para inicializar un objeto, la palabra NEW se utiliza para
//instanciar objetos.

//La clase debe llamarse Igual que el archivo
// debemos definir getters y setters para acceder a los atributos de la clase de manera segura
public class Curso {
  private String nombre;
  private String lenguaje;
  private String mensaje;

 //contructor vacio, inicializa las variables del objeto en "" o 0
//  curso(){
//
//  }

  //constructor lleno, inicializa al objeto con las variables recibidas por parametro

    Curso( String nombre, String lenguaje, String mensaje){
      this.nombre=nombre;
      this.mensaje=mensaje;
      this.lenguaje=lenguaje;
    }

  public void enseniar(String name){
      System.out.println("le estoy enseniando a : "+ name);
  }
  public String getNombre(){
     return this.nombre;
  }

  public String getMensaje(){
      return this.mensaje;
  }

  public void setMensaje(String descripcion){
      this.mensaje=descripcion;
  }
}