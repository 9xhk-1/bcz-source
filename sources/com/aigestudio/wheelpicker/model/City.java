package com.aigestudio.wheelpicker.model;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class City implements Serializable {
    public List<String> area;
    public String name;

    public List<String> getArea() {
        return this.area;
    }

    public String getName() {
        return this.name;
    }

    public void setArea(List<String> area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }
}
