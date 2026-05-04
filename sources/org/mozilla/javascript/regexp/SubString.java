package org.mozilla.javascript.regexp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class SubString {
    public static final SubString emptySubString = new SubString();
    int index;
    int length;
    String str;

    public SubString() {
    }

    public String toString() {
        String str = this.str;
        if (str == null) {
            return "";
        }
        int i11 = this.index;
        return str.substring(i11, this.length + i11);
    }

    public SubString(String str) {
        this.str = str;
        this.index = 0;
        this.length = str.length();
    }

    public SubString(String str, int i11, int i12) {
        this.str = str;
        this.index = i11;
        this.length = i12;
    }
}
