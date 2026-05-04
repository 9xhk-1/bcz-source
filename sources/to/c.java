package to;

import ko.h;
import ko.i;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a
@go.b
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char f90844a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final char f90845b = 31;

    /* renamed from: c, reason: collision with root package name */
    public static final h f90846c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f90847d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f90848e;

    static {
        i.b a11 = i.a();
        a11.d((char) 0, (char) 65533);
        a11.e("�");
        for (char c11 = 0; c11 <= 31; c11 = (char) (c11 + 1)) {
            if (c11 != '\t' && c11 != '\n' && c11 != '\r') {
                a11.b(c11, "�");
            }
        }
        a11.b(u0.f91708d, "&amp;");
        a11.b(u0.f91709e, "&lt;");
        a11.b(u0.f91710f, "&gt;");
        f90847d = a11.c();
        a11.b('\'', "&apos;");
        a11.b('\"', "&quot;");
        f90846c = a11.c();
        a11.b('\t', "&#x9;");
        a11.b('\n', "&#xA;");
        a11.b('\r', "&#xD;");
        f90848e = a11.c();
    }

    public static h a() {
        return f90848e;
    }

    public static h b() {
        return f90847d;
    }
}
