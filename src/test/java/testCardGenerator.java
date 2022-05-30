import model.CardGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testCardGenerator {
    CardGenerator cardGenerator;
    @BeforeEach
    public void init(){
        cardGenerator=new CardGenerator();
    }
    @Test
    public void testGenerateCardStack(){
        Assertions.assertEquals(33,cardGenerator.getAllCards().size());
    }
}
