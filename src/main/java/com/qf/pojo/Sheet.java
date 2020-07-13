package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sheet {
    private Integer id;
    private String sheetName;

    public Integer getId() {
        return this.id;
    }

    public String getSheetName() {
        return this.sheetName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Sheet)) return false;
        final Sheet other = (Sheet) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$sheetName = this.getSheetName();
        final Object other$sheetName = other.getSheetName();
        if (this$sheetName == null ? other$sheetName != null : !this$sheetName.equals(other$sheetName)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Sheet;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $sheetName = this.getSheetName();
        result = result * PRIME + ($sheetName == null ? 43 : $sheetName.hashCode());
        return result;
    }

    public String toString() {
        return "Sheet(id=" + this.getId() + ", sheetName=" + this.getSheetName() + ")";
    }
}
