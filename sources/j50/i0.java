package j50;

import h50.m;
import h50.n;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@kotlin.jvm.internal.u0({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n16#2:149\n160#3:150\n1803#4,3:151\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumDescriptor\n*L\n28#1:149\n46#1:150\n46#1:151,3\n*E\n"})
/* loaded from: classes8.dex */
public final class i0 extends l2 {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final h50.m f63380m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final yz.c0 f63381n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(@m80.k final String name, final int i11) {
        super(name, null, i11, 2, null);
        kotlin.jvm.internal.g0.p(name, "name");
        this.f63380m = m.b.f58540a;
        this.f63381n = yz.e0.c(new x00.a() { // from class: j50.h0
            @Override // x00.a
            public final Object invoke() {
                h50.f[] B;
                B = i0.B(i11, name, this);
                return B;
            }
        });
    }

    public static final h50.f[] B(int i11, String str, i0 i0Var) {
        h50.f[] fVarArr = new h50.f[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fVarArr[i12] = h50.l.i(str + '.' + i0Var.i(i12), n.d.f58544a, new h50.f[0], null, 8, null);
        }
        return fVarArr;
    }

    public final h50.f[] C() {
        return (h50.f[]) this.f63381n.getValue();
    }

    @Override // j50.l2, h50.f
    @m80.k
    public h50.f e(int i11) {
        return C()[i11];
    }

    @Override // j50.l2
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h50.f)) {
            return false;
        }
        h50.f fVar = (h50.f) obj;
        return fVar.getKind() == m.b.f58540a && kotlin.jvm.internal.g0.g(k(), fVar.k()) && kotlin.jvm.internal.g0.g(g2.a(this), g2.a(fVar));
    }

    @Override // j50.l2, h50.f
    @m80.k
    public h50.m getKind() {
        return this.f63380m;
    }

    @Override // j50.l2
    public int hashCode() {
        int hashCode = k().hashCode();
        Iterator<String> it = h50.i.b(this).iterator();
        int i11 = 1;
        while (it.hasNext()) {
            int i12 = i11 * 31;
            String next = it.next();
            i11 = i12 + (next != null ? next.hashCode() : 0);
        }
        return (hashCode * 31) + i11;
    }

    @Override // j50.l2
    @m80.k
    public String toString() {
        return a00.r0.r3(h50.i.b(this), org.junit.jupiter.api.j2.O, k() + '(', pn.j.f81007d, 0, null, null, 56, null);
    }
}
