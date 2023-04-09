import javax.ejb.LocalBean;
import javax.ejb.Stateless;

class MySessionBean {
    public String sayHello() {
        return "Hello from MySessionBean";
    }
}
