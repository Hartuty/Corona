package com.abachapp.corona.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tests {
    @SerializedName("total")
    @Expose
    private Object total;

    public Object getTotal() {
        return total;
    }

    public void setTotal(Object total) {
        this.total = total;
    }
}
