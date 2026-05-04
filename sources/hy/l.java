package hy;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.attribute.FileTime;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import kotlin.LazyThreadSafetyMode;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJarFileContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JarFileContent.kt\nio/ktor/server/http/content/JarFileContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
/* loaded from: classes8.dex */
public final class l extends v.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final File f59972b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f59973c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ix.k f59974d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f59975e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final yz.c0 f59976f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final yz.c0 f59977g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final yz.c0 f59978h;

    public l(@m80.k File jarFile, @m80.k String resourcePath, @m80.k ix.k contentType) {
        FileTime lastModifiedTime;
        kotlin.jvm.internal.g0.p(jarFile, "jarFile");
        kotlin.jvm.internal.g0.p(resourcePath, "resourcePath");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        this.f59972b = jarFile;
        this.f59973c = resourcePath;
        this.f59974d = contentType;
        String file = r00.o.i0(new File(resourcePath)).toString();
        kotlin.jvm.internal.g0.o(file, "toString(...)");
        String y22 = u30.f0.y2(file, File.separatorChar, '/', false, 4, null);
        this.f59975e = y22;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f59976f = yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: hy.i
            @Override // x00.a
            public final Object invoke() {
                JarEntry z11;
                z11 = l.z(l.this);
                return z11;
            }
        });
        this.f59977g = yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: hy.j
            @Override // x00.a
            public final Object invoke() {
                JarFile A;
                A = l.A(l.this);
                return A;
            }
        });
        this.f59978h = yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: hy.k
            @Override // x00.a
            public final Object invoke() {
                boolean y11;
                y11 = l.y(l.this);
                return Boolean.valueOf(y11);
            }
        });
        if (u30.f0.J2(y22, zr.m.f102856e, false, 2, null)) {
            throw new IllegalArgumentException(("Bad resource relative path " + resourcePath).toString());
        }
        JarEntry t11 = t();
        if (t11 != null) {
            List<mx.e0> c11 = mx.g0.c(this);
            lastModifiedTime = t11.getLastModifiedTime();
            kotlin.jvm.internal.g0.o(lastModifiedTime, "getLastModifiedTime(...)");
            mx.g0.d(this, a00.r0.J4(c11, m.b(lastModifiedTime)));
        }
    }

    public static final JarFile A(l lVar) {
        return new JarFile(lVar.f59972b);
    }

    public static final boolean y(l lVar) {
        JarEntry t11 = lVar.t();
        return (t11 == null || t11.isDirectory()) ? false : true;
    }

    public static final JarEntry z(l lVar) {
        return lVar.s().getJarEntry(lVar.f59973c);
    }

    @Override // mx.v
    @m80.l
    public Long a() {
        JarEntry t11 = t();
        if (t11 != null) {
            return Long.valueOf(t11.getSize());
        }
        return null;
    }

    @Override // mx.v
    @m80.k
    public ix.k b() {
        return this.f59974d;
    }

    @Override // mx.v.e
    @m80.k
    public io.ktor.utils.io.g m() {
        JarEntry t11 = t();
        if (t11 != null) {
            InputStream inputStream = s().getInputStream(t11);
            kotlin.jvm.internal.g0.o(inputStream, "getInputStream(...)");
            return mz.c.b(inputStream, null, yy.a.a(), 1, null);
        }
        throw new IOException("Resource " + this.f59975e + " not found");
    }

    public final JarFile s() {
        return (JarFile) this.f59977g.getValue();
    }

    public final JarEntry t() {
        return (JarEntry) this.f59976f.getValue();
    }

    @m80.k
    public final File u() {
        return this.f59972b;
    }

    @m80.k
    public final String v() {
        return this.f59973c;
    }

    public final boolean x() {
        return ((Boolean) this.f59978h.getValue()).booleanValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(@m80.k java.nio.file.Path r2, @m80.k java.lang.String r3, @m80.k ix.k r4) {
        /*
            r1 = this;
            java.lang.String r0 = "zipFilePath"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "resourcePath"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "contentType"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.io.File r2 = po.u0.a(r2)
            java.lang.String r0 = "toFile(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hy.l.<init>(java.nio.file.Path, java.lang.String, ix.k):void");
    }
}
