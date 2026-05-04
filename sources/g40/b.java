package g40;

import c40.l2;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b<T> extends c40.a<T> implements BiFunction<T, Throwable, g2> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CompletableFuture<T> f52695d;

    public b(@k kotlin.coroutines.d dVar, @k CompletableFuture<T> completableFuture) {
        super(dVar, true, true);
        this.f52695d = completableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ g2 apply(Object obj, Throwable th2) {
        e2(obj, th2);
        return g2.f100423a;
    }

    @Override // c40.a
    public void b2(@k Throwable th2, boolean z11) {
        this.f52695d.completeExceptionally(th2);
    }

    @Override // c40.a
    public void c2(T t11) {
        this.f52695d.complete(t11);
    }

    public void e2(@l T t11, @l Throwable th2) {
        l2.a.b(this, null, 1, null);
    }
}
