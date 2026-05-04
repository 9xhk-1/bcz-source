package lb0;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.f;
import okhttp3.h;
import okhttp3.i;
import okhttp3.k;
import okhttp3.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class w {

    /* renamed from: m, reason: collision with root package name */
    public static final String f70970m = " \"<>^`{}|\\?#";

    /* renamed from: a, reason: collision with root package name */
    public final String f70972a;

    /* renamed from: b, reason: collision with root package name */
    public final okhttp3.i f70973b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public String f70974c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public i.a f70975d;

    /* renamed from: e, reason: collision with root package name */
    public final l.a f70976e = new l.a();

    /* renamed from: f, reason: collision with root package name */
    public final h.a f70977f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public okhttp3.j f70978g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f70979h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public k.a f70980i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public f.a f70981j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public okhttp3.m f70982k;

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f70969l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f70971n = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends okhttp3.m {

        /* renamed from: b, reason: collision with root package name */
        public final okhttp3.m f70983b;

        /* renamed from: c, reason: collision with root package name */
        public final okhttp3.j f70984c;

        public a(okhttp3.m mVar, okhttp3.j jVar) {
            this.f70983b = mVar;
            this.f70984c = jVar;
        }

        @Override // okhttp3.m
        public long a() throws IOException {
            return this.f70983b.a();
        }

        @Override // okhttp3.m
        public okhttp3.j b() {
            return this.f70984c;
        }

        @Override // okhttp3.m
        public void r(l60.l lVar) throws IOException {
            this.f70983b.r(lVar);
        }
    }

    public w(String str, okhttp3.i iVar, @Nullable String str2, @Nullable okhttp3.h hVar, @Nullable okhttp3.j jVar, boolean z11, boolean z12, boolean z13) {
        this.f70972a = str;
        this.f70973b = iVar;
        this.f70974c = str2;
        this.f70978g = jVar;
        this.f70979h = z11;
        if (hVar != null) {
            this.f70977f = hVar.k();
        } else {
            this.f70977f = new h.a();
        }
        if (z12) {
            this.f70981j = new f.a();
        } else if (z13) {
            k.a aVar = new k.a();
            this.f70980i = aVar;
            aVar.g(okhttp3.k.f77461l);
        }
    }

    public static String i(String str, boolean z11) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int codePointAt = str.codePointAt(i11);
            if (codePointAt < 32 || codePointAt >= 127 || f70970m.indexOf(codePointAt) != -1 || (!z11 && (codePointAt == 47 || codePointAt == 37))) {
                l60.k kVar = new l60.k();
                kVar.M0(str, 0, i11);
                j(kVar, str, i11, length, z11);
                return kVar.R3();
            }
            i11 += Character.charCount(codePointAt);
        }
        return str;
    }

    public static void j(l60.k kVar, String str, int i11, int i12, boolean z11) {
        l60.k kVar2 = null;
        while (i11 < i12) {
            int codePointAt = str.codePointAt(i11);
            if (!z11 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || f70970m.indexOf(codePointAt) != -1 || (!z11 && (codePointAt == 47 || codePointAt == 37))) {
                    if (kVar2 == null) {
                        kVar2 = new l60.k();
                    }
                    kVar2.x4(codePointAt);
                    while (!kVar2.J()) {
                        byte readByte = kVar2.readByte();
                        kVar.writeByte(37);
                        char[] cArr = f70969l;
                        kVar.writeByte(cArr[((readByte & 255) >> 4) & 15]);
                        kVar.writeByte(cArr[readByte & 15]);
                    }
                } else {
                    kVar.x4(codePointAt);
                }
            }
            i11 += Character.charCount(codePointAt);
        }
    }

    public void a(String str, String str2, boolean z11) {
        if (z11) {
            this.f70981j.b(str, str2);
        } else {
            this.f70981j.a(str, str2);
        }
    }

    public void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f70977f.b(str, str2);
            return;
        }
        try {
            this.f70978g = okhttp3.j.h(str2);
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e11);
        }
    }

    public void c(okhttp3.h hVar) {
        this.f70977f.e(hVar);
    }

    public void d(okhttp3.h hVar, okhttp3.m mVar) {
        this.f70980i.c(hVar, mVar);
    }

    public void e(k.c cVar) {
        this.f70980i.d(cVar);
    }

    public void f(String str, String str2, boolean z11) {
        if (this.f70974c == null) {
            throw new AssertionError();
        }
        String i11 = i(str2, z11);
        String replace = this.f70974c.replace("{" + str + com.alipay.sdk.m.u.i.f11099d, i11);
        if (!f70971n.matcher(replace).matches()) {
            this.f70974c = replace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    public void g(String str, @Nullable String str2, boolean z11) {
        String str3 = this.f70974c;
        if (str3 != null) {
            i.a I = this.f70973b.I(str3);
            this.f70975d = I;
            if (I == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f70973b + ", Relative: " + this.f70974c);
            }
            this.f70974c = null;
        }
        if (z11) {
            this.f70975d.c(str, str2);
        } else {
            this.f70975d.g(str, str2);
        }
    }

    public <T> void h(Class<T> cls, @Nullable T t11) {
        this.f70976e.z(cls, t11);
    }

    public l.a k() {
        okhttp3.i W;
        i.a aVar = this.f70975d;
        if (aVar != null) {
            W = aVar.h();
        } else {
            W = this.f70973b.W(this.f70974c);
            if (W == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f70973b + ", Relative: " + this.f70974c);
            }
        }
        okhttp3.m mVar = this.f70982k;
        if (mVar == null) {
            f.a aVar2 = this.f70981j;
            if (aVar2 != null) {
                mVar = aVar2.c();
            } else {
                k.a aVar3 = this.f70980i;
                if (aVar3 != null) {
                    mVar = aVar3.f();
                } else if (this.f70979h) {
                    mVar = okhttp3.m.h(null, new byte[0]);
                }
            }
        }
        okhttp3.j jVar = this.f70978g;
        if (jVar != null) {
            if (mVar != null) {
                mVar = new a(mVar, jVar);
            } else {
                this.f70977f.b("Content-Type", jVar.toString());
            }
        }
        return this.f70976e.D(W).o(this.f70977f.i()).p(this.f70972a, mVar);
    }

    public void l(okhttp3.m mVar) {
        this.f70982k = mVar;
    }

    public void m(Object obj) {
        this.f70974c = obj.toString();
    }
}
