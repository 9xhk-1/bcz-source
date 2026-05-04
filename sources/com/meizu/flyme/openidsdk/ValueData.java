package com.meizu.flyme.openidsdk;

/* loaded from: classes7.dex */
public class ValueData {
    public int code;
    public long expired = System.currentTimeMillis() + 86400000;
    public String value;

    public ValueData(String str, int i11) {
        this.value = str;
        this.code = i11;
    }

    public native String toString();
}
