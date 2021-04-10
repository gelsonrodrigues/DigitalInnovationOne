package com.teste;

import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest {

    @Test (expected = IndexOutOfBoundsException.class)
    public void empty() {
          new ArrayList<Object>().get(0);

//        List<String> lista = new ArrayList<String>();
//        lista.add("Gelson");
//        lista.get(0);
    }

    @Test
    public void testExceptionMessage() {
        try {
            new ArrayList<Object>().get(0);
            fail("Esperado que IndexOutOfBoundsException seja lançada");
        } catch (IndexOutOfBoundsException ex) {
            assertThat(ex.getMessage(),is("Index 0 out of bounds for length 0"));
        }

    }
}
