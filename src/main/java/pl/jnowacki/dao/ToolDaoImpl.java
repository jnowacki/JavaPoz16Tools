package pl.jnowacki.dao;

import pl.jnowacki.model.Tool;
import pl.jnowacki.model.ToolType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToolDaoImpl implements ToolDao {

    private List<Tool> tools;

    public ToolDaoImpl() {
        tools = Arrays.asList(
                new Tool(1L, "Czerwony mlotek", ToolType.HAMMER),
                new Tool(2L, "Stara pila", ToolType.SAW),
                new Tool(3L, "Srubokret", ToolType.SONIC_SCREWDRIVER),
                new Tool(4L, "Mlot na niewiernych", ToolType.HAMMER),
                new Tool(18L, "Pila tango", ToolType.SAW)
        );
    }

    @Override
    public List<Tool> getAll() {
        return tools;
    }
}
