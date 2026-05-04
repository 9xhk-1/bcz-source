package e30;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class b extends o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@m80.k d30.n nVar) {
        super(nVar);
        if (nVar == null) {
            I(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void I(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e30.b.I(int):void");
    }

    @Override // e30.u, e30.u1
    @m80.k
    /* renamed from: J */
    public abstract p10.b r();

    @Override // e30.u
    public boolean g(@m80.k p10.d dVar) {
        if (dVar == null) {
            I(2);
        }
        return (dVar instanceof p10.b) && e(r(), dVar);
    }

    @Override // e30.u1
    @m80.k
    public n10.j q() {
        n10.j m11 = u20.e.m(r());
        if (m11 == null) {
            I(1);
        }
        return m11;
    }

    @Override // e30.o
    @m80.l
    public r0 t() {
        if (n10.j.u0(r())) {
            return null;
        }
        return q().i();
    }

    @Override // e30.o
    @m80.k
    public Collection<r0> u(boolean z11) {
        p10.h b11 = r().b();
        if (!(b11 instanceof p10.b)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                I(3);
            }
            return list;
        }
        o30.k kVar = new o30.k();
        p10.b bVar = (p10.b) b11;
        kVar.add(bVar.s());
        p10.b s02 = bVar.s0();
        if (z11 && s02 != null) {
            kVar.add(s02.s());
        }
        return kVar;
    }
}
