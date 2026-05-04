package ra0;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final x00.l<T, g2> f83893a;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d c(d dVar, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = dVar.f83893a;
        }
        return dVar.b(lVar);
    }

    @l
    public final x00.l<T, g2> a() {
        return this.f83893a;
    }

    @k
    public final d<T> b(@l x00.l<? super T, g2> lVar) {
        return new d<>(lVar);
    }

    @l
    public final x00.l<T, g2> d() {
        return this.f83893a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && g0.g(this.f83893a, ((d) obj).f83893a);
    }

    public int hashCode() {
        x00.l<T, g2> lVar = this.f83893a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @k
    public String toString() {
        return "Callbacks(onClose=" + this.f83893a + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@l x00.l<? super T, g2> lVar) {
        this.f83893a = lVar;
    }

    public /* synthetic */ d(x00.l lVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : lVar);
    }
}
