package a90;

import java.util.Optional;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final /* synthetic */ class y1 implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d2 f2467a;

    public /* synthetic */ y1(d2 d2Var) {
        this.f2467a = d2Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Optional s11;
        s11 = this.f2467a.s();
        return s11;
    }
}
