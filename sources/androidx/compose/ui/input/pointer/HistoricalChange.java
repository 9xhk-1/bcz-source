package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class HistoricalChange {
    public static final int $stable = 0;
    private long originalEventPosition;
    private final long position;
    private final long uptimeMillis;

    public /* synthetic */ HistoricalChange(long j11, long j12, long j13, v vVar) {
        this(j11, j12, j13);
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m3655getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m3656getPositionF1C5BW0() {
        return this.position;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @k
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m2276toStringimpl(this.position)) + ')';
    }

    public /* synthetic */ HistoricalChange(long j11, long j12, v vVar) {
        this(j11, j12);
    }

    private HistoricalChange(long j11, long j12) {
        this.uptimeMillis = j11;
        this.position = j12;
        this.originalEventPosition = Offset.Companion.m2284getZeroF1C5BW0();
    }

    private HistoricalChange(long j11, long j12, long j13) {
        this(j11, j12, (v) null);
        this.originalEventPosition = j13;
    }
}
