package h90;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f59077a;

    /* renamed from: b, reason: collision with root package name */
    public final String f59078b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59079c;

    /* renamed from: d, reason: collision with root package name */
    public final Class<?> f59080d;

    /* renamed from: e, reason: collision with root package name */
    public final Class<?> f59081e;

    /* renamed from: f, reason: collision with root package name */
    public final String f59082f;

    public d(String str, Class<?> cls, Class<?> cls2) {
        this.f59077a = str;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            this.f59078b = str;
            this.f59079c = "";
        } else {
            this.f59078b = str.substring(lastIndexOf + 1);
            this.f59079c = str.substring(0, lastIndexOf);
        }
        this.f59080d = cls;
        this.f59081e = cls2;
        this.f59082f = a();
    }

    public static d g(String str, Class<?> cls) {
        return new d(str, null, cls);
    }

    public static d h(String str, Method method) {
        return new d(str, method.getName(), null, method.getReturnType());
    }

    public static d i(String str, Class<?> cls) {
        return new d(str, cls, null);
    }

    public static d j(String str, Method method) {
        return new d(str, method.getName(), method.getParameterTypes()[0], null);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder("method ");
        Class<?> cls = this.f59081e;
        if (cls != null) {
            sb2.append(cls.getName());
            sb2.append(' ');
        }
        if (this.f59079c.isEmpty()) {
            sb2.append(this.f59078b);
        } else {
            sb2.append(this.f59079c);
            sb2.append('.');
            sb2.append(this.f59078b);
        }
        if (this.f59080d != null) {
            sb2.append('(');
            sb2.append(this.f59080d.getName());
            sb2.append(')');
        } else {
            sb2.append("()");
        }
        return sb2.toString();
    }

    public String b() {
        return this.f59078b;
    }

    public Class<?> c() {
        return this.f59080d;
    }

    public String d() {
        return this.f59079c;
    }

    public String e() {
        return this.f59077a;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != d.class) {
            return false;
        }
        return this.f59082f.equals(obj.toString());
    }

    public Class<?> f() {
        return this.f59081e;
    }

    public int hashCode() {
        return this.f59082f.hashCode();
    }

    public String toString() {
        return this.f59082f;
    }

    public d(String str, String str2, Class<?> cls, Class<?> cls2) {
        this.f59077a = str + '.' + str2;
        this.f59078b = str2;
        this.f59079c = str;
        this.f59080d = cls;
        this.f59081e = cls2;
        this.f59082f = a();
    }
}
