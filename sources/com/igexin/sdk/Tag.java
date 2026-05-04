package com.igexin.sdk;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class Tag implements Serializable {
    private static final long serialVersionUID = 7265815580156141684L;
    private String name;

    private boolean isValidTagName(String str) {
        boolean z11 = false;
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            z11 = (charAt >= 19968 && charAt <= 40869) || (charAt >= 'A' && charAt <= 'Z') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= '0' && charAt <= '9') || charAt == '+' || charAt == '-' || charAt == '*' || charAt == '_' || charAt == ' ' || charAt == ':'));
            if (!z11) {
                break;
            }
        }
        return z11;
    }

    public String getName() {
        return this.name;
    }

    public boolean isValidTagValue(String str) {
        return isValidTagName(str);
    }

    public Tag setName(String str) {
        this.name = str;
        return this;
    }
}
