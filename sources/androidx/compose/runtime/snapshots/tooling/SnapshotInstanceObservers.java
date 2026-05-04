package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalComposeRuntimeApi
/* loaded from: classes.dex */
public final class SnapshotInstanceObservers {
    public static final int $stable = 0;

    @l
    private final x00.l<Object, g2> readObserver;

    @l
    private final x00.l<Object, g2> writeObserver;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotInstanceObservers() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @l
    public final x00.l<Object, g2> getReadObserver() {
        return this.readObserver;
    }

    @l
    public final x00.l<Object, g2> getWriteObserver() {
        return this.writeObserver;
    }

    public SnapshotInstanceObservers(@l x00.l<Object, g2> lVar, @l x00.l<Object, g2> lVar2) {
        this.readObserver = lVar;
        this.writeObserver = lVar2;
    }

    public /* synthetic */ SnapshotInstanceObservers(x00.l lVar, x00.l lVar2, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : lVar, (i11 & 2) != 0 ? null : lVar2);
    }
}
