package org.apache.http.message;

import java.io.Serializable;
import l70.j;
import org.apache.http.ParseException;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.e;
import org.apache.http.f;
import t60.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class BasicHeader implements e, Cloneable, Serializable {
    private static final f[] EMPTY_HEADER_ELEMENTS = new f[0];
    private static final long serialVersionUID = -5427236326487562174L;
    private final String name;
    private final String value;

    public BasicHeader(String str, String str2) {
        this.name = (String) e80.a.j(str, "Name");
        this.value = str2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.e
    public f[] getElements() throws ParseException {
        return getValue() != null ? l70.f.g(getValue(), null) : EMPTY_HEADER_ELEMENTS;
    }

    @Override // org.apache.http.v
    public String getName() {
        return this.name;
    }

    @Override // org.apache.http.v
    public String getValue() {
        return this.value;
    }

    public String toString() {
        return j.f70706b.c(null, this).toString();
    }
}
