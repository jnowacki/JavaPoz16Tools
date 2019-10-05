package pl.jnowacki.model;

import java.io.Serializable;

public class Tool implements Serializable {

    private Long id;
    private String name;
    private ToolType type;
    private boolean isAvailable;

    public Tool() {
    }

    public Tool(Long id, String name, ToolType type, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToolType getType() {
        return type;
    }

    public void setType(ToolType type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
