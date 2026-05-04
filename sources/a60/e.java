package a60;

import com.badlogic.gdx.Net;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import okio.ByteString;
import u30.f0;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "HttpHeaders")
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final ByteString f2005a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final ByteString f2006b;

    static {
        ByteString.a aVar = ByteString.Companion;
        f2005a = aVar.l(l70.e.f70686d);
        f2006b = aVar.l("\t ,=");
    }

    @n(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @w0(expression = "response.promisesBody()", imports = {}))
    public static final boolean a(@m80.k okhttp3.n response) {
        g0.p(response, "response");
        return c(response);
    }

    @m80.k
    public static final List<t50.e> b(@m80.k okhttp3.h hVar, @m80.k String headerName) {
        g0.p(hVar, "<this>");
        g0.p(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = hVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (f0.c2(headerName, hVar.h(i11), true)) {
                try {
                    d(new l60.k().n5(hVar.o(i11)), arrayList);
                } catch (EOFException e11) {
                    e60.j.f49490a.g().m("Unable to parse challenge", 5, e11);
                }
            }
        }
        return arrayList;
    }

    public static final boolean c(@m80.k okhttp3.n nVar) {
        g0.p(nVar, "<this>");
        if (g0.g(nVar.A0().m(), Net.a.f11462a)) {
            return false;
        }
        int Z = nVar.Z();
        return (((Z >= 100 && Z < 200) || Z == 204 || Z == 304) && u50.f.A(nVar) == -1 && !f0.c2(c80.f.f8329r, okhttp3.n.h0(nVar, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(l60.k r7, java.util.List<t50.e> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            h(r7)
            java.lang.String r1 = f(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = h(r7)
            java.lang.String r3 = f(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.J()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            t50.e r7 = new t50.e
            java.util.Map r0 = a00.l1.z()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = u50.f.W(r7, r4)
            boolean r6 = h(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.J()
            if (r2 == 0) goto L69
        L42:
            t50.e r2 = new t50.e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = u30.f0.v2(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.g0.o(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L69:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = u50.f.W(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = f(r7)
            boolean r5 = h(r7)
            if (r5 != 0) goto Lbc
            int r5 = u50.f.W(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = h(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = i(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = e(r7)
            goto La1
        L9d:
            java.lang.String r6 = f(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = h(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.J()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            t50.e r4 = new t50.e
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: a60.e.d(l60.k, java.util.List):void");
    }

    public static final String e(l60.k kVar) throws EOFException {
        if (kVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        l60.k kVar2 = new l60.k();
        while (true) {
            long p02 = kVar.p0(f2005a);
            if (p02 == -1) {
                return null;
            }
            if (kVar.x0(p02) == 34) {
                kVar2.y8(kVar, p02);
                kVar.readByte();
                return kVar2.R3();
            }
            if (kVar.size() == p02 + 1) {
                return null;
            }
            kVar2.y8(kVar, p02);
            kVar.readByte();
            kVar2.y8(kVar, 1L);
        }
    }

    public static final String f(l60.k kVar) {
        long p02 = kVar.p0(f2006b);
        if (p02 == -1) {
            p02 = kVar.size();
        }
        if (p02 != 0) {
            return kVar.b2(p02);
        }
        return null;
    }

    public static final void g(@m80.k t50.i iVar, @m80.k okhttp3.i url, @m80.k okhttp3.h headers) {
        g0.p(iVar, "<this>");
        g0.p(url, "url");
        g0.p(headers, "headers");
        if (iVar == t50.i.f89616b) {
            return;
        }
        List<t50.h> g11 = t50.h.f89592j.g(url, headers);
        if (g11.isEmpty()) {
            return;
        }
        iVar.b(url, g11);
    }

    public static final boolean h(l60.k kVar) {
        boolean z11 = false;
        while (!kVar.J()) {
            byte x02 = kVar.x0(0L);
            if (x02 == 44) {
                kVar.readByte();
                z11 = true;
            } else {
                if (x02 != 32 && x02 != 9) {
                    break;
                }
                kVar.readByte();
            }
        }
        return z11;
    }

    public static final boolean i(l60.k kVar, byte b11) {
        return !kVar.J() && kVar.x0(0L) == b11;
    }
}
