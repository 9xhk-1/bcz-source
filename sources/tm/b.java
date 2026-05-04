package tm;

import com.google.accompanist.flowlayout.LayoutOrientation;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f90824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90826c;

    /* renamed from: d, reason: collision with root package name */
    public final int f90827d;

    public /* synthetic */ b(long j11, LayoutOrientation layoutOrientation, v vVar) {
        this(j11, layoutOrientation);
    }

    public static /* synthetic */ b f(b bVar, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = bVar.f90824a;
        }
        if ((i15 & 2) != 0) {
            i12 = bVar.f90825b;
        }
        if ((i15 & 4) != 0) {
            i13 = bVar.f90826c;
        }
        if ((i15 & 8) != 0) {
            i14 = bVar.f90827d;
        }
        return bVar.e(i11, i12, i13, i14);
    }

    public final int a() {
        return this.f90824a;
    }

    public final int b() {
        return this.f90825b;
    }

    public final int c() {
        return this.f90826c;
    }

    public final int d() {
        return this.f90827d;
    }

    @k
    public final b e(int i11, int i12, int i13, int i14) {
        return new b(i11, i12, i13, i14);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f90824a == bVar.f90824a && this.f90825b == bVar.f90825b && this.f90826c == bVar.f90826c && this.f90827d == bVar.f90827d;
    }

    public final int g() {
        return this.f90827d;
    }

    public final int h() {
        return this.f90826c;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f90824a) * 31) + Integer.hashCode(this.f90825b)) * 31) + Integer.hashCode(this.f90826c)) * 31) + Integer.hashCode(this.f90827d);
    }

    public final int i() {
        return this.f90825b;
    }

    public final int j() {
        return this.f90824a;
    }

    @k
    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.f90824a + ", mainAxisMax=" + this.f90825b + ", crossAxisMin=" + this.f90826c + ", crossAxisMax=" + this.f90827d + ')';
    }

    public b(int i11, int i12, int i13, int i14) {
        this.f90824a = i11;
        this.f90825b = i12;
        this.f90826c = i13;
        this.f90827d = i14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(long r5, com.google.accompanist.flowlayout.LayoutOrientation r7) {
        /*
            r4 = this;
            com.google.accompanist.flowlayout.LayoutOrientation r0 = com.google.accompanist.flowlayout.LayoutOrientation.Horizontal
            if (r7 != r0) goto L9
            int r1 = androidx.compose.ui.unit.Constraints.m5070getMinWidthimpl(r5)
            goto Ld
        L9:
            int r1 = androidx.compose.ui.unit.Constraints.m5069getMinHeightimpl(r5)
        Ld:
            if (r7 != r0) goto L14
            int r2 = androidx.compose.ui.unit.Constraints.m5068getMaxWidthimpl(r5)
            goto L18
        L14:
            int r2 = androidx.compose.ui.unit.Constraints.m5067getMaxHeightimpl(r5)
        L18:
            if (r7 != r0) goto L1f
            int r3 = androidx.compose.ui.unit.Constraints.m5069getMinHeightimpl(r5)
            goto L23
        L1f:
            int r3 = androidx.compose.ui.unit.Constraints.m5070getMinWidthimpl(r5)
        L23:
            if (r7 != r0) goto L2a
            int r5 = androidx.compose.ui.unit.Constraints.m5067getMaxHeightimpl(r5)
            goto L2e
        L2a:
            int r5 = androidx.compose.ui.unit.Constraints.m5068getMaxWidthimpl(r5)
        L2e:
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.b.<init>(long, com.google.accompanist.flowlayout.LayoutOrientation):void");
    }
}
