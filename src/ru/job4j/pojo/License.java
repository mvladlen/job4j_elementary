package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

public class License {
    private String owner;
    private String model;
    private String code;
    private Date created;

    public String getOwner() {
        return owner;
    }

    public String getModel() {
        return model;
    }

    public String getCode() {
        return code;
    }

    public Date getCreated() {
        return created;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @SuppressWarnings({"checkstyle:NeedBraces", "checkstyle:OperatorWrap"})
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        License license = (License) o;
        return Objects.equals(owner, license.owner) &&
                Objects.equals(model, license.model) &&
                Objects.equals(code, license.code) &&
                Objects.equals(created, license.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }
}
