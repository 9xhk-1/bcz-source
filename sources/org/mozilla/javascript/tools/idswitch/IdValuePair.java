package org.mozilla.javascript.tools.idswitch;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class IdValuePair {

    /* renamed from: id, reason: collision with root package name */
    public final String f78410id;
    public final int idLength;
    private int lineNumber;
    public final String value;

    public IdValuePair(String str, String str2) {
        this.idLength = str.length();
        this.f78410id = str;
        this.value = str2;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public void setLineNumber(int i11) {
        this.lineNumber = i11;
    }
}
