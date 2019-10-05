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

//        for(Tool tool: toolDao.getAll()) {
//            if (tool.getId().equals(id)) {
//                tool.setAvailable(!tool.isAvailable());
//
//                return;
//            }
//        }

        toolDao.getAll().stream()
                .filter(tool -> id.equals(tool.getId()))
                .findAny()
                .ifPresent(tool -> tool.setAvailable(!tool.isAvailable()));
    }
}
