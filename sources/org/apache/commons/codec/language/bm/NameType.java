package org.apache.commons.codec.language.bm;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public enum NameType {
    ASHKENAZI("ash"),
    GENERIC("gen"),
    SEPHARDIC("sep");

    private final String name;

    NameType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
