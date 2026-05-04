package yg;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.p2;
import java.io.Closeable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a0 implements Closeable, c40.r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f99941b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f99942a;

    public a0(@m80.k kotlin.coroutines.d context) {
        kotlin.jvm.internal.g0.p(context, "context");
        this.f99942a = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p2.j(getCoroutineContext(), null, 1, null);
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f99942a;
    }
}
