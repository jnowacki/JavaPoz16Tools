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
    public void setAvailability(Long id, boolean isAvailable) {

        toolDao.getAll().stream()
                .filter(tool -> id.equals(tool.getId()))
                .findAny()
                .ifPresent(tool -> tool.setAvailable(isAvailable));
    }
}
