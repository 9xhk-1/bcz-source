package a90;

import java.util.Optional;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final /* synthetic */ class x1 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d2 f2463a;

    public /* synthetic */ x1(d2 d2Var) {
        this.f2463a = d2Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Optional n11;
        n11 = this.f2463a.n();
        return n11;
    }
}
