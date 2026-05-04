package org.json.alipay;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class JSONException extends Exception {
    public Throwable cause;

    public JSONException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public JSONException(Throwable th2) {
        super(th2.getMessage());
        this.cause = th2;
    }
}
