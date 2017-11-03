package controller.taotao.pojo;

import java.util.Date;

public class TbItemParam {
    private String id;

    private String itemCatId;

    private Date created;

    private Date updated;

    private String paramData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(String itemCatId) {
        this.itemCatId = itemCatId == null ? null : itemCatId.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}