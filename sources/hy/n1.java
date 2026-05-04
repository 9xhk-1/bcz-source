package hy;

import io.ktor.server.plugins.BadRequestException;
import java.io.File;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import mx.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStaticContentResolution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticContentResolution.kt\nio/ktor/server/http/content/StaticContentResolutionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
/* loaded from: classes8.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f59985a = yz.e0.c(new x00.a() { // from class: hy.m1
        @Override // x00.a
        public final Object invoke() {
            ConcurrentHashMap p11;
            p11 = n1.p();
            return p11;
        }
    });

    @m80.k
    public static final String e(@m80.k String str) {
        int intValue;
        kotlin.jvm.internal.g0.p(str, "<this>");
        Integer valueOf = Integer.valueOf(u30.k0.X3(str, '/', 0, false, 6, null));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            intValue = valueOf.intValue();
        } else {
            Integer valueOf2 = Integer.valueOf(u30.k0.X3(str, '\\', 0, false, 6, null));
            Integer num = valueOf2.intValue() != -1 ? valueOf2 : null;
            intValue = num != null ? num.intValue() : 0;
        }
        int I3 = u30.k0.I3(str, '.', intValue, false, 4, null);
        if (I3 < 0) {
            return "";
        }
        String substring = str.substring(I3);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    @m80.k
    public static final File f(@m80.k String url) {
        kotlin.jvm.internal.g0.p(url, "url");
        if (!u30.f0.J2(url, "jar:file:", false, 2, null)) {
            throw new IllegalArgumentException("Only local jars are supported (jar:file:)");
        }
        int J3 = u30.k0.J3(url, "!", 9, false, 4, null);
        if (J3 != -1) {
            String substring = url.substring(9, J3);
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            return new File(ix.f.i(substring, 0, 0, null, 7, null));
        }
        throw new IllegalArgumentException(("Jar path requires !/ separator but it is: " + url).toString());
    }

    public static final ConcurrentHashMap<String, URL> g() {
        return (ConcurrentHashMap) f59985a.getValue();
    }

    public static final String h(String str, String str2) {
        List n52 = u30.k0.n5(str2, new char[]{'/', '\\'}, false, 0, 6, null);
        if (!n52.contains(zr.m.f102856e)) {
            if (str == null) {
                str = "";
            }
            return a00.r0.r3(ty.h.c(a00.r0.I4(u30.k0.n5(str, new char[]{'.', '/', '\\'}, false, 0, 6, null), n52)), "/", null, null, 0, null, null, 62, null);
        }
        throw new BadRequestException("Relative path should not contain path traversing characters: " + str2, null, 2, null);
    }

    @m80.l
    public static final Pair<URL, v.e> i(@m80.k zx.a aVar, @m80.k String path, @m80.l String str, @m80.k ClassLoader classLoader, @m80.k final x00.l<? super URL, ix.k> mimeResolve) {
        Object obj;
        Pair<URL, v.e> pair;
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(classLoader, "classLoader");
        kotlin.jvm.internal.g0.p(mimeResolve, "mimeResolve");
        if (!u30.f0.b2(path, "/", false, 2, null) && !u30.f0.b2(path, "\\", false, 2, null)) {
            final String h11 = h(str, path);
            String str2 = classLoader.hashCode() + '/' + h11;
            x00.l lVar = new x00.l() { // from class: hy.k1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    Pair o11;
                    o11 = n1.o(h11, mimeResolve, (URL) obj2);
                    return o11;
                }
            };
            URL url = g().get(str2);
            if (url != null && (pair = (Pair) lVar.invoke(url)) != null) {
                return pair;
            }
            Enumeration<URL> resources = classLoader.getResources(h11);
            kotlin.jvm.internal.g0.o(resources, "getResources(...)");
            Iterator it = q30.x.j(a00.j0.h0(resources)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = lVar.invoke(it.next());
                if (obj != null) {
                    break;
                }
            }
            Pair<URL, v.e> pair2 = (Pair) obj;
            if (pair2 != null) {
                g().put(str2, pair2.component1());
                return pair2;
            }
        }
        return null;
    }

    @m80.l
    public static final v.e j(@m80.k zx.b bVar, @m80.k String path, @m80.l String str, @m80.k ClassLoader classLoader, @m80.k final x00.l<? super String, ix.k> mimeResolve) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(classLoader, "classLoader");
        kotlin.jvm.internal.g0.p(mimeResolve, "mimeResolve");
        if (!u30.f0.b2(path, "/", false, 2, null) && !u30.f0.b2(path, "\\", false, 2, null)) {
            String h11 = h(str, path);
            Enumeration<URL> resources = classLoader.getResources(h11);
            kotlin.jvm.internal.g0.o(resources, "getResources(...)");
            for (URL url : q30.x.j(a00.j0.h0(resources))) {
                kotlin.jvm.internal.g0.m(url);
                v.e q11 = q(url, h11, new x00.l() { // from class: hy.l1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        ix.k n11;
                        n11 = n1.n(x00.l.this, (URL) obj);
                        return n11;
                    }
                });
                if (q11 != null) {
                    return q11;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ Pair k(zx.a aVar, String str, String str2, ClassLoader classLoader, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            classLoader = aVar.a().b();
        }
        return i(aVar, str, str2, classLoader, lVar);
    }

    public static /* synthetic */ v.e l(zx.b bVar, String str, String str2, ClassLoader classLoader, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            classLoader = bVar.w0().a().b();
        }
        if ((i11 & 8) != 0) {
            lVar = new x00.l() { // from class: hy.j1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    ix.k m11;
                    m11 = n1.m((String) obj2);
                    return m11;
                }
            };
        }
        return j(bVar, str, str2, classLoader, lVar);
    }

    public static final ix.k m(String it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return ix.l0.e(ix.k.f62843f, it);
    }

    public static final ix.k n(x00.l lVar, URL it) {
        kotlin.jvm.internal.g0.p(it, "it");
        String path = it.getPath();
        kotlin.jvm.internal.g0.o(path, "getPath(...)");
        return (ix.k) lVar.invoke(e(path));
    }

    public static final Pair o(String str, x00.l lVar, URL url) {
        kotlin.jvm.internal.g0.p(url, "url");
        v.e q11 = q(url, str, lVar);
        if (q11 != null) {
            return yz.h1.a(url, q11);
        }
        return null;
    }

    public static final ConcurrentHashMap p() {
        return new ConcurrentHashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r0.equals("jrt") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a4, code lost:
    
        return new mx.d0(r8, r10.invoke(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r0.equals("resource") == false) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @m80.l
    @io.ktor.utils.io.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final mx.v.e q(@m80.k java.net.URL r8, @m80.k java.lang.String r9, @m80.k x00.l<? super java.net.URL, ix.k> r10) {
        /*
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "mimeResolve"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = r8.getProtocol()
            r1 = 0
            if (r0 == 0) goto La5
            int r2 = r0.hashCode()
            switch(r2) {
                case -341064690: goto L90;
                case 104987: goto L5c;
                case 105516: goto L53;
                case 3143036: goto L1f;
                default: goto L1d;
            }
        L1d:
            goto La5
        L1f:
            java.lang.String r9 = "file"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L29
            goto La5
        L29:
            java.io.File r9 = new java.io.File
            java.lang.String r2 = r8.getPath()
            java.lang.String r0 = "getPath(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r0 = ix.f.i(r2, r3, r4, r5, r6, r7)
            r9.<init>(r0)
            boolean r0 = r9.isFile()
            if (r0 == 0) goto L52
            hy.n r0 = new hy.n
            java.lang.Object r8 = r10.invoke(r8)
            ix.k r8 = (ix.k) r8
            r0.<init>(r9, r8)
            return r0
        L52:
            return r1
        L53:
            java.lang.String r9 = "jrt"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L99
            goto La5
        L5c:
            java.lang.String r2 = "jar"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L65
            goto La5
        L65:
            r0 = 0
            r2 = 2
            java.lang.String r3 = "/"
            boolean r0 = u30.f0.b2(r9, r3, r0, r2, r1)
            if (r0 == 0) goto L70
            return r1
        L70:
            java.lang.String r0 = r8.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            java.io.File r0 = f(r0)
            hy.l r2 = new hy.l
            java.lang.Object r8 = r10.invoke(r8)
            ix.k r8 = (ix.k) r8
            r2.<init>(r0, r9, r8)
            boolean r8 = r2.x()
            if (r8 == 0) goto L8f
            return r2
        L8f:
            return r1
        L90:
            java.lang.String r9 = "resource"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L99
            goto La5
        L99:
            mx.d0 r9 = new mx.d0
            java.lang.Object r10 = r10.invoke(r8)
            ix.k r10 = (ix.k) r10
            r9.<init>(r8, r10)
            return r9
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hy.n1.q(java.net.URL, java.lang.String, x00.l):mx.v$e");
    }
}
