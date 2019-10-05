package pl.jnowacki.service;

import pl.jnowacki.dao.ToolDao;
import pl.jnowacki.dao.ToolDaoImpl;
import pl.jnowacki.model.Tool;

import java.util.List;

public class ToolServiceImpl implements ToolService {

    private ToolDao toolDao = new ToolDaoImpl();

    @Override
    public List<Tool> getAll() {
        return toolDao.getAll();
    }

    @Override
    public void toggleAvailability(Long id) {

    }
}
