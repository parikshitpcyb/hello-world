import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    
    @Test
    public void testPersonDetails() {
        Person p = new Person("John Doe", 30);
        assertEquals("John Doe", p.getName());
        assertEquals(30, p.getAge());
        
        p.setName("Jane Smith");
        p.setAge(40);
        assertEquals("Jane Smith", p.getName());
        assertEquals(40, p.getAge());
    }
    
}
