public class Client {

    private String name;
    private String email;
    private String phone;
    private String lastName;

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {  //public void setName(String value){      name= value;    }
        this.name = name;               //name= value;
        //el name de la clase es igual al name que le ingreso por medio del metodo

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullname(){
        return name+"  "+lastName;
    }
/*  public void setName(String value){
        name= value;
    }
    public void setEmail(String value){
        email= value;
    }
    public void setLastName(String value){
        lastName= value;
    }
    public void setPhone(String value){
        phone= value;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhone(){
        return phone;
    }

*/

}
