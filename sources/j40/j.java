package j40;

import c40.g2;
import c40.m0;
import h40.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j extends m0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final j f63203a = new j();

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        b.f63185g.E(runnable, true, false);
    }

    @Override // c40.m0
    @g2
    public void dispatchYield(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        b.f63185g.E(runnable, true, true);
    }

    @Override // c40.m0
    @m80.k
    public m0 limitedParallelism(int i11, @m80.l String str) {
        y.a(i11);
        return i11 >= i.f63198d ? y.b(this, str) : super.limitedParallelism(i11, str);
    }

    @Override // c40.m0
    @m80.k
    public String toString() {
        return "Dispatchers.IO";
    }
}
