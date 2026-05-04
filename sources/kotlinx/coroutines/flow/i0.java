package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.h0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i0 {
    @m80.k
    public static final h0 a(@m80.k h0.a aVar, long j11, long j12) {
        return new l0(kotlin.time.e.x(j11), kotlin.time.e.x(j12));
    }

    public static /* synthetic */ h0 b(h0.a aVar, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = kotlin.time.e.f67757b.T();
        }
        if ((i11 & 2) != 0) {
            j12 = kotlin.time.e.f67757b.n();
        }
        return a(aVar, j11, j12);
    }
}
