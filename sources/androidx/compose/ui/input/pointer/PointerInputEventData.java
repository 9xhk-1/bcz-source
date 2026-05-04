package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PointerInputEventData {
    public static final int $stable = 8;
    private final boolean activeHover;
    private final boolean down;

    @k
    private final List<HistoricalChange> historical;

    /* renamed from: id, reason: collision with root package name */
    private final long f4208id;
    private final long originalEventPosition;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    public /* synthetic */ PointerInputEventData(long j11, long j12, long j13, long j14, boolean z11, float f11, int i11, boolean z12, List list, long j15, long j16, v vVar) {
        this(j11, j12, j13, j14, z11, f11, i11, z12, list, j15, j16);
    }

    /* renamed from: copy-rc8HELY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputEventData m3738copyrc8HELY$default(PointerInputEventData pointerInputEventData, long j11, long j12, long j13, long j14, boolean z11, float f11, int i11, boolean z12, List list, long j15, long j16, int i12, Object obj) {
        long j17;
        long j18;
        long j19;
        long j21;
        long j22 = (i12 & 1) != 0 ? pointerInputEventData.f4208id : j11;
        long j23 = (i12 & 2) != 0 ? pointerInputEventData.uptime : j12;
        long j24 = (i12 & 4) != 0 ? pointerInputEventData.positionOnScreen : j13;
        long j25 = (i12 & 8) != 0 ? pointerInputEventData.position : j14;
        boolean z13 = (i12 & 16) != 0 ? pointerInputEventData.down : z11;
        float f12 = (i12 & 32) != 0 ? pointerInputEventData.pressure : f11;
        int i13 = (i12 & 64) != 0 ? pointerInputEventData.type : i11;
        boolean z14 = (i12 & 128) != 0 ? pointerInputEventData.activeHover : z12;
        List list2 = (i12 & 256) != 0 ? pointerInputEventData.historical : list;
        if ((i12 & 512) != 0) {
            j17 = j22;
            j18 = pointerInputEventData.scrollDelta;
        } else {
            j17 = j22;
            j18 = j15;
        }
        if ((i12 & 1024) != 0) {
            j21 = j18;
            j19 = pointerInputEventData.originalEventPosition;
        } else {
            j19 = j16;
            j21 = j18;
        }
        return pointerInputEventData.m3745copyrc8HELY(j17, j23, j24, j25, z13, f12, i13, z14, list2, j21, j19);
    }

    /* renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m3739component1J3iCeTQ() {
        return this.f4208id;
    }

    /* renamed from: component10-F1C5BW0, reason: not valid java name */
    public final long m3740component10F1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: component11-F1C5BW0, reason: not valid java name */
    public final long m3741component11F1C5BW0() {
        return this.originalEventPosition;
    }

    public final long component2() {
        return this.uptime;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m3742component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m3743component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final float component6() {
        return this.pressure;
    }

    /* renamed from: component7-T8wyACA, reason: not valid java name */
    public final int m3744component7T8wyACA() {
        return this.type;
    }

    public final boolean component8() {
        return this.activeHover;
    }

    @k
    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    @k
    /* renamed from: copy-rc8HELY, reason: not valid java name */
    public final PointerInputEventData m3745copyrc8HELY(long j11, long j12, long j13, long j14, boolean z11, float f11, int i11, boolean z12, @k List<HistoricalChange> list, long j15, long j16) {
        return new PointerInputEventData(j11, j12, j13, j14, z11, f11, i11, z12, list, j15, j16, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.m3714equalsimpl0(this.f4208id, pointerInputEventData.f4208id) && this.uptime == pointerInputEventData.uptime && Offset.m2265equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m2265equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m3803equalsimpl0(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && g0.g(this.historical, pointerInputEventData.historical) && Offset.m2265equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Offset.m2265equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public final boolean getActiveHover() {
        return this.activeHover;
    }

    public final boolean getDown() {
        return this.down;
    }

    @k
    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m3746getIdJ3iCeTQ() {
        return this.f4208id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m3747getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m3748getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m3749getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m3750getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m3751getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        return (((((((((((((((((((PointerId.m3715hashCodeimpl(this.f4208id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m2270hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m2270hashCodeimpl(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + PointerType.m3804hashCodeimpl(this.type)) * 31) + Boolean.hashCode(this.activeHover)) * 31) + this.historical.hashCode()) * 31) + Offset.m2270hashCodeimpl(this.scrollDelta)) * 31) + Offset.m2270hashCodeimpl(this.originalEventPosition);
    }

    @k
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m3716toStringimpl(this.f4208id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m2276toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m2276toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m3805toStringimpl(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m2276toStringimpl(this.scrollDelta)) + ", originalEventPosition=" + ((Object) Offset.m2276toStringimpl(this.originalEventPosition)) + ')';
    }

    private PointerInputEventData(long j11, long j12, long j13, long j14, boolean z11, float f11, int i11, boolean z12, List<HistoricalChange> list, long j15, long j16) {
        this.f4208id = j11;
        this.uptime = j12;
        this.positionOnScreen = j13;
        this.position = j14;
        this.down = z11;
        this.pressure = f11;
        this.type = i11;
        this.activeHover = z12;
        this.historical = list;
        this.scrollDelta = j15;
        this.originalEventPosition = j16;
    }

    public /* synthetic */ PointerInputEventData(long j11, long j12, long j13, long j14, boolean z11, float f11, int i11, boolean z12, List list, long j15, long j16, int i12, v vVar) {
        this(j11, j12, j13, j14, z11, f11, i11, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? new ArrayList() : list, (i12 & 512) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j15, (i12 & 1024) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j16, null);
    }
}
