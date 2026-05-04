package vw;

import ix.l2;
import ix.n;
import ix.t2;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import u30.f0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {
    @l
    public static final Object a(@k f fVar, @k String str, @k n nVar, @k j00.c<? super g2> cVar) {
        Object U2 = fVar.U2(l2.f(str), nVar, cVar);
        return U2 == kotlin.coroutines.intrinsics.b.l() ? U2 : g2.f100423a;
    }

    @k
    public static final n b(@k n nVar, @k t2 requestUrl) {
        g0.p(nVar, "<this>");
        g0.p(requestUrl, "requestUrl");
        String u11 = nVar.u();
        n m11 = (u11 == null || !f0.J2(u11, "/", false, 2, null)) ? n.m(nVar, null, null, null, null, null, null, requestUrl.p(), false, false, null, 959, null) : nVar;
        String n11 = m11.n();
        return (n11 == null || k0.O3(n11)) ? n.m(m11, null, null, null, null, null, requestUrl.u(), null, false, false, null, 991, null) : m11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (u30.f0.b2(r8, '.' + r0, false, 2, null) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(@m80.k ix.n r11, @m80.k ix.t2 r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "requestUrl"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = r11.n()
            if (r0 == 0) goto Lbf
            java.lang.String r0 = xy.e2.e(r0)
            if (r0 == 0) goto Lbf
            r1 = 1
            char[] r2 = new char[r1]
            r3 = 0
            r4 = 46
            r2[r3] = r4
            java.lang.String r0 = u30.k0.s6(r0, r2)
            if (r0 == 0) goto Lbf
            r11.u()
            java.lang.String r2 = r11.u()
            if (r2 == 0) goto Lb7
            r5 = 47
            r6 = 2
            r7 = 0
            boolean r8 = u30.k0.s3(r2, r5, r3, r6, r7)
            if (r8 == 0) goto L38
            goto L4b
        L38:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = r11.u()
            r2.append(r8)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
        L4b:
            java.lang.String r8 = r12.u()
            java.lang.String r8 = xy.e2.e(r8)
            java.lang.String r9 = r12.p()
            boolean r10 = u30.k0.s3(r9, r5, r3, r6, r7)
            if (r10 == 0) goto L5e
            goto L6d
        L5e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r5)
            java.lang.String r9 = r10.toString()
        L6d:
            boolean r5 = kotlin.jvm.internal.g0.g(r8, r0)
            if (r5 != 0) goto L8f
            boolean r5 = ix.k1.a(r8)
            if (r5 != 0) goto L8e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            boolean r0 = u30.f0.b2(r8, r0, r3, r6, r7)
            if (r0 != 0) goto L8f
        L8e:
            return r3
        L8f:
            java.lang.String r0 = "/"
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 != 0) goto La4
            boolean r0 = kotlin.jvm.internal.g0.g(r9, r2)
            if (r0 != 0) goto La4
            boolean r0 = u30.f0.J2(r9, r2, r3, r6, r7)
            if (r0 != 0) goto La4
            return r3
        La4:
            boolean r11 = r11.v()
            if (r11 == 0) goto Lb6
            ix.h2 r11 = r12.A()
            boolean r11 = ix.i2.a(r11)
            if (r11 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r3
        Lb6:
            return r1
        Lb7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Path field should have the default value"
            r11.<init>(r12)
            throw r11
        Lbf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Domain field should have the default value"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.g.c(ix.n, ix.t2):boolean");
    }
}
