package org.junit.jupiter.api;

import ba0.e4;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.opentest4j.AssertionFailedError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.9", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f77960a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f77961b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f77962c;

    /* renamed from: d, reason: collision with root package name */
    public Object f77963d;

    /* renamed from: e, reason: collision with root package name */
    public Object f77964e;

    /* renamed from: f, reason: collision with root package name */
    public String f77965f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f77966g = true;

    public static j0 b() {
        return new j0();
    }

    public static String e(String message) {
        if (!e4.h(message)) {
            return "";
        }
        return message + " ==> ";
    }

    public static String h(Object value, String valueString) {
        StringBuilder sb2;
        if (value == null) {
            return "<null>";
        }
        String str = j(value) + o(value);
        if (value instanceof Class) {
            sb2 = new StringBuilder();
            sb2.append("<");
            sb2.append(str);
        } else {
            sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("<");
            sb2.append(valueString);
        }
        sb2.append(">");
        return sb2.toString();
    }

    public static String i(Object expected, Object actual) {
        String p11 = p(expected);
        String p12 = p(actual);
        return p11.equals(p12) ? String.format("expected: %s but was: %s", h(expected, p11), h(actual, p12)) : String.format("expected: <%s> but was: <%s>", p11, p12);
    }

    public static String j(Object obj) {
        return obj == null ? "null" : obj instanceof Class ? l0.n((Class) obj) : obj.getClass().getName();
    }

    public static String m(Object messageOrSupplier) {
        if (messageOrSupplier == null) {
            return null;
        }
        return messageOrSupplier instanceof Supplier ? e4.i(((Supplier) messageOrSupplier).get()) : e4.i(messageOrSupplier);
    }

    public static String o(Object obj) {
        if (obj == null) {
            return "";
        }
        return EmailAutoCompleteEditText.f17091d + Integer.toHexString(System.identityHashCode(obj));
    }

    public static String p(Object obj) {
        return obj instanceof Class ? l0.n((Class) obj) : e4.i(obj);
    }

    public j0 a(Object actual) {
        this.f77962c = true;
        this.f77964e = actual;
        return this;
    }

    public AssertionFailedError c() {
        String str;
        String m11 = m(this.f77965f);
        if (this.f77962c && this.f77966g) {
            StringBuilder sb2 = new StringBuilder();
            if (m11 == null) {
                str = "";
            } else {
                str = m11 + j2.O;
            }
            sb2.append(str);
            sb2.append(i(this.f77963d, this.f77964e));
            m11 = sb2.toString();
        }
        String m12 = m(this.f77960a);
        if (m11 != null) {
            m12 = e(m12) + m11;
        }
        return this.f77962c ? new AssertionFailedError(m12, this.f77963d, this.f77964e, this.f77961b) : new AssertionFailedError(m12, this.f77961b);
    }

    public void d() throws AssertionFailedError {
        throw c();
    }

    public j0 f(Throwable cause) {
        this.f77961b = cause;
        return this;
    }

    public j0 g(Object expected) {
        this.f77962c = true;
        this.f77963d = expected;
        return this;
    }

    public j0 k(boolean includeValuesInMessage) {
        this.f77966g = includeValuesInMessage;
        return this;
    }

    public j0 l(Object message) {
        this.f77960a = message;
        return this;
    }

    public j0 n(String reason) {
        this.f77965f = reason;
        return this;
    }
}
