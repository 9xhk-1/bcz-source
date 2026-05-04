package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class GlobalSnapshotManager {

    @m80.k
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();

    @m80.k
    private static final AtomicBoolean started = new AtomicBoolean(false);

    @m80.k
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int $stable = 8;

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final e40.o d11 = e40.r.d(1, null, null, 6, null);
            c40.k.f(c40.s0.a(AndroidUiDispatcher.Companion.getMain()), null, null, new GlobalSnapshotManager$ensureStarted$1(d11, null), 3, null);
            Snapshot.Companion.registerGlobalWriteObserver(new x00.l<Object, g2>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                    invoke2(obj);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object obj) {
                    AtomicBoolean atomicBoolean;
                    atomicBoolean = GlobalSnapshotManager.sent;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        d11.m(g2.f100423a);
                    }
                }
            });
        }
    }
}
