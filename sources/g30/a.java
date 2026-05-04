package g30;

import e30.d2;
import e30.f2;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import s10.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends k {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(@m80.k n20.f r14) {
        /*
            r13 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r14, r0)
            g30.i r0 = g30.i.f52687a
            p10.a0 r2 = r0.i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r5 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
            java.util.List r1 = a00.h0.J()
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6
            p10.x0 r7 = p10.x0.f78622a
            r8 = 0
            d30.n r9 = d30.f.f47125e
            r1 = r13
            r3 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            q10.g$a r14 = q10.g.A0
            q10.g r14 = r14.b()
            r2 = 1
            s10.i r14 = s10.i.i1(r13, r14, r2, r7)
            java.util.List r2 = a00.h0.J()
            p10.p r3 = p10.o.f78589d
            r14.l1(r2, r3)
            java.lang.String r2 = "apply(...)"
            kotlin.jvm.internal.g0.o(r14, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r2 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ERROR_CLASS
            n20.f r3 = r14.getName()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = ""
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            g30.f r6 = g30.i.b(r2, r3)
            g30.g r4 = new g30.g
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r7 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_CLASS
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            g30.h r5 = r0.e(r7, r3)
            java.lang.String[] r10 = new java.lang.String[r2]
            r11 = 24
            r12 = 0
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r14.b1(r4)
            java.util.Set r0 = a00.v1.f(r14)
            r13.F0(r6, r0, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g30.a.<init>(n20.f):void");
    }

    @Override // s10.a, s10.z
    @m80.k
    public x20.k C(@m80.k d2 typeSubstitution, @m80.k f30.g kotlinTypeRefiner) {
        g0.p(typeSubstitution, "typeSubstitution");
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return i.b(ErrorScopeKind.SCOPE_FOR_ERROR_CLASS, getName().toString(), typeSubstitution.toString());
    }

    @Override // s10.a, p10.z0
    @m80.k
    /* renamed from: E0 */
    public p10.b c(@m80.k f2 substitutor) {
        g0.p(substitutor, "substitutor");
        return this;
    }

    @Override // s10.k
    @m80.k
    public String toString() {
        String b11 = getName().b();
        g0.o(b11, "asString(...)");
        return b11;
    }
}
