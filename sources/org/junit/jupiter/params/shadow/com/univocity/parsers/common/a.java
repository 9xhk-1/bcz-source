package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.Arrays;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a extends RuntimeException {
    private static final long serialVersionUID = -2993096896413328423L;
    protected int errorContentLength;

    public a(String str, Throwable th2) {
        super(str, th2);
        this.errorContentLength = -1;
    }

    public static String printIfNotEmpty(String str, String str2, Object obj) {
        if (obj == null || obj.toString().isEmpty() || ((obj instanceof Number) && ((Number) obj).intValue() < 0)) {
            return str;
        }
        String str3 = str2 + '=' + (obj.getClass().isArray() ? Arrays.toString((Object[]) obj) : String.valueOf(obj));
        if (str.isEmpty()) {
            return str3;
        }
        return str + j2.O + str3;
    }

    public static Object[] restrictContent(int i11, Object[] objArr) {
        if (objArr == null || i11 == 0) {
            return null;
        }
        return objArr;
    }

    public abstract String getDetails();

    public abstract String getErrorDescription();

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = getErrorDescription() + ": ";
        }
        String details = getDetails();
        if (details != null && !details.isEmpty()) {
            message = message + "\nInternal state when error was thrown: " + details;
        }
        return updateMessage(message);
    }

    public void setErrorContentLength(int i11) {
        this.errorContentLength = i11;
        Throwable cause = getCause();
        if (cause == null || !(cause instanceof a)) {
            return;
        }
        a aVar = (a) cause;
        if (aVar.errorContentLength != i11) {
            aVar.setErrorContentLength(i11);
        }
    }

    public static String restrictContent(int i11, CharSequence charSequence) {
        return d.y(i11, charSequence);
    }

    public String restrictContent(CharSequence charSequence) {
        return restrictContent(this.errorContentLength, charSequence);
    }

    public String restrictContent(Object obj) {
        return d.z(this.errorContentLength, obj);
    }

    public Object[] restrictContent(Object[] objArr) {
        return restrictContent(this.errorContentLength, objArr);
    }

    public String updateMessage(String str) {
        return str;
    }
}
