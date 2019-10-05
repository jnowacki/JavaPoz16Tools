package pl.jnowacki.dao;

import org.junit.Test;
import pl.jnowacki.model.Tool;

import java.util.List;

import static org.junit.Assert.*;

public class ToolDaoImplTest {

    @Test
    public void shouldReturnListOf5Tools() {
        //given
        ToolDaoImpl toolDao = new ToolDaoImpl();

        //when
        List<Tool> tools = toolDao.getAll();

        //then
        assertEquals(5, tools.size());
    }

    @Test
    public void shouldReturnSameList() {
        //given
        ToolDaoImpl toolDao = new ToolDaoImpl();

        //when
        List<Tool> tools1 = toolDao.getAll();
        List<Tool> tools2 = toolDao.getAll();

        //then
        assertSame(tools1, tools2);
    }

    @Test
    public void trenary() {
        boolean valueTrue = true;
        boolean valueFalse = false;

        int valueInt = 5;

        String result = valueInt > 5 ? "wieksze" : "mniejsze lub rowne";

        //to samo, co:

        if (valueInt > 5) {
            result = "wieksze";
        } else {
            result = "mniejsze lub rowne";
        }
    }
}