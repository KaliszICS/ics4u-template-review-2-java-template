import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   @Test
   public void testQ1_1()
   {
      String data = "Hello";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("In: Hello\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ1_2()
   {
      String data = "Bye";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("In: Bye\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ2_1()
   {
      String data = "9\n5";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("In: 1\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ2_2()
   {
      String data = "9\n3";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("In: 3\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ3_1()
   {
      String data = "Hello";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("In: Hello was the text you wrote\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ3_2()
   {
      String data = "Bye";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("In: Bye was the text you wrote\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }@Test
   public void testQ4_1()
   {
      String data = "5";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("In: 25\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ4_2()
   {
      String data = "0";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("In: 0\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ5_1()
   {
      String data = "false";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("In: false is a boolean\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ5_2()
   {
      String data = "true";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("In: true is a boolean\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }@Test
   public void testQ6_1()
   {
      String data = "3.5";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("In: 0.3\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ6_2()
   {
      String data = "9.0";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("In: 5.8\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }
}
