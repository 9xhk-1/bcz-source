package androidx.compose.ui.tooling;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPreviewUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewUtils.android.kt\nandroidx/compose/ui/tooling/ThreadSafeException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
/* loaded from: classes2.dex */
public final class ThreadSafeException {
    public static final int $stable = 8;

    @l
    private Throwable exception;

    @k
    private final Object lock = new Object();

    public final void set(@k Throwable th2) {
        synchronized (this.lock) {
            this.exception = th2;
            g2 g2Var = g2.f100423a;
        }
    }

    public final void throwIfPresent() {
        synchronized (this.lock) {
            Throwable th2 = this.exception;
            if (th2 != null) {
                this.exception = null;
                throw th2;
            }
        }
    }
}
