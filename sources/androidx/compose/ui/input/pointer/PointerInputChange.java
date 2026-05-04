package androidx.compose.ui.input.pointer;

import a00.h0;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class PointerInputChange {
    public static final int $stable = 0;

    @l
    private ConsumedData _consumed;

    @l
    private List<HistoricalChange> _historical;

    @l
    private PointerInputChange consumedDelegate;
    private boolean downChange;

    /* renamed from: id, reason: collision with root package name */
    private final long f4207id;
    private long originalEventPosition;
    private final long position;
    private boolean positionChange;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    public /* synthetic */ PointerInputChange(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, long j16, v vVar) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, i11, j16);
    }

    /* renamed from: copy-0GkPj7c$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m3718copy0GkPj7c$default(PointerInputChange pointerInputChange, long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, ConsumedData consumedData, int i11, long j16, int i12, Object obj) {
        long j17;
        long j18 = (i12 & 1) != 0 ? pointerInputChange.f4207id : j11;
        long j19 = (i12 & 2) != 0 ? pointerInputChange.uptimeMillis : j12;
        long j21 = (i12 & 4) != 0 ? pointerInputChange.position : j13;
        boolean z13 = (i12 & 8) != 0 ? pointerInputChange.pressed : z11;
        long j22 = (i12 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j14;
        long j23 = (i12 & 32) != 0 ? pointerInputChange.previousPosition : j15;
        boolean z14 = (i12 & 64) != 0 ? pointerInputChange.previousPressed : z12;
        int i13 = (i12 & 256) != 0 ? pointerInputChange.type : i11;
        if ((i12 & 512) != 0) {
            j17 = pointerInputChange.scrollDelta;
            j18 = j18;
        } else {
            j17 = j16;
        }
        return pointerInputChange.m3724copy0GkPj7c(j18, j19, j21, z13, j22, j23, z14, consumedData, i13, j17);
    }

    /* renamed from: copy-JKmWfYY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m3720copyJKmWfYY$default(PointerInputChange pointerInputChange, long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, int i11, long j16, int i12, Object obj) {
        long j17;
        long j18;
        long j19 = (i12 & 1) != 0 ? pointerInputChange.f4207id : j11;
        long j21 = (i12 & 2) != 0 ? pointerInputChange.uptimeMillis : j12;
        long j22 = (i12 & 4) != 0 ? pointerInputChange.position : j13;
        boolean z13 = (i12 & 8) != 0 ? pointerInputChange.pressed : z11;
        long j23 = (i12 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j14;
        long j24 = (i12 & 32) != 0 ? pointerInputChange.previousPosition : j15;
        boolean z14 = (i12 & 64) != 0 ? pointerInputChange.previousPressed : z12;
        int i13 = (i12 & 128) != 0 ? pointerInputChange.type : i11;
        if ((i12 & 256) != 0) {
            j17 = pointerInputChange.scrollDelta;
            j18 = j19;
        } else {
            j17 = j16;
            j18 = j19;
        }
        return pointerInputChange.m3726copyJKmWfYY(j18, j21, j22, z13, j23, j24, z14, i13, j17);
    }

    /* renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m3721copyOHpmEuE$default(PointerInputChange pointerInputChange, long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, int i11, List list, long j16, int i12, Object obj) {
        long j17;
        long j18 = (i12 & 1) != 0 ? pointerInputChange.f4207id : j11;
        long j19 = (i12 & 2) != 0 ? pointerInputChange.uptimeMillis : j12;
        long j21 = (i12 & 4) != 0 ? pointerInputChange.position : j13;
        boolean z13 = (i12 & 8) != 0 ? pointerInputChange.pressed : z11;
        long j22 = (i12 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j14;
        long j23 = (i12 & 32) != 0 ? pointerInputChange.previousPosition : j15;
        boolean z14 = (i12 & 64) != 0 ? pointerInputChange.previousPressed : z12;
        int i13 = (i12 & 128) != 0 ? pointerInputChange.type : i11;
        if ((i12 & 512) != 0) {
            j17 = pointerInputChange.scrollDelta;
            j18 = j18;
        } else {
            j17 = j16;
        }
        return pointerInputChange.m3727copyOHpmEuE(j18, j19, j21, z13, j22, j23, z14, i13, list, j17);
    }

    /* renamed from: copy-Tn9QgHE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m3722copyTn9QgHE$default(PointerInputChange pointerInputChange, long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, int i11, long j16, int i12, Object obj) {
        long j17;
        long j18;
        long j19 = (i12 & 1) != 0 ? pointerInputChange.f4207id : j11;
        long j21 = (i12 & 2) != 0 ? pointerInputChange.uptimeMillis : j12;
        long j22 = (i12 & 4) != 0 ? pointerInputChange.position : j13;
        boolean z13 = (i12 & 8) != 0 ? pointerInputChange.pressed : z11;
        float f12 = (i12 & 16) != 0 ? pointerInputChange.pressure : f11;
        long j23 = (i12 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j14;
        long j24 = (i12 & 64) != 0 ? pointerInputChange.previousPosition : j15;
        boolean z14 = (i12 & 128) != 0 ? pointerInputChange.previousPressed : z12;
        int i13 = (i12 & 256) != 0 ? pointerInputChange.type : i11;
        if ((i12 & 512) != 0) {
            j17 = pointerInputChange.scrollDelta;
            j18 = j19;
        } else {
            j17 = j16;
            j18 = j19;
        }
        return pointerInputChange.m3728copyTn9QgHE(j18, j21, j22, z13, f12, j23, j24, z14, i13, j17);
    }

    /* renamed from: copy-wbzehF4$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m3723copywbzehF4$default(PointerInputChange pointerInputChange, long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, int i11, List list, long j16, int i12, Object obj) {
        long j17;
        List list2;
        long j18 = (i12 & 1) != 0 ? pointerInputChange.f4207id : j11;
        long j19 = (i12 & 2) != 0 ? pointerInputChange.uptimeMillis : j12;
        long j21 = (i12 & 4) != 0 ? pointerInputChange.position : j13;
        boolean z13 = (i12 & 8) != 0 ? pointerInputChange.pressed : z11;
        float f12 = (i12 & 16) != 0 ? pointerInputChange.pressure : f11;
        long j22 = (i12 & 32) != 0 ? pointerInputChange.previousUptimeMillis : j14;
        long j23 = (i12 & 64) != 0 ? pointerInputChange.previousPosition : j15;
        boolean z14 = (i12 & 128) != 0 ? pointerInputChange.previousPressed : z12;
        int i13 = (i12 & 256) != 0 ? pointerInputChange.type : i11;
        long j24 = j18;
        List historical = (i12 & 512) != 0 ? pointerInputChange.getHistorical() : list;
        if ((i12 & 1024) != 0) {
            list2 = historical;
            j17 = pointerInputChange.scrollDelta;
        } else {
            j17 = j16;
            list2 = historical;
        }
        return pointerInputChange.m3729copywbzehF4(j24, j19, j21, z13, f12, j22, j23, z14, i13, list2, j17);
    }

    public final void consume() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            this.downChange = true;
            this.positionChange = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.consume();
        }
    }

    @n(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @w0(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    @k
    /* renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m3724copy0GkPj7c(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, @k ConsumedData consumedData, int i11, long j16) {
        PointerInputChange pointerInputChange = new PointerInputChange(j11, j12, j13, z11, this.pressure, j14, j15, z12, consumedData.getDownChange() || consumedData.getPositionChange(), i11, getHistorical(), j16, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @w0(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    /* renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m3725copyEzrO64(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, ConsumedData consumedData, int i11) {
        PointerInputChange pointerInputChange = new PointerInputChange(j11, j12, j13, z11, this.pressure, j14, j15, z12, consumedData.getDownChange() || consumedData.getPositionChange(), i11, getHistorical(), this.scrollDelta, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    @k
    /* renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m3726copyJKmWfYY(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, int i11, long j16) {
        PointerInputChange m3729copywbzehF4 = m3729copywbzehF4(j11, j12, j13, z11, this.pressure, j14, j15, z12, i11, getHistorical(), j16);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        m3729copywbzehF4.consumedDelegate = pointerInputChange;
        return m3729copywbzehF4;
    }

    @ExperimentalComposeUiApi
    @k
    /* renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m3727copyOHpmEuE(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, int i11, @k List<HistoricalChange> list, long j16) {
        PointerInputChange m3729copywbzehF4 = m3729copywbzehF4(j11, j12, j13, z11, this.pressure, j14, j15, z12, i11, list, j16);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        m3729copywbzehF4.consumedDelegate = pointerInputChange;
        return m3729copywbzehF4;
    }

    @k
    /* renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final PointerInputChange m3728copyTn9QgHE(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, int i11, long j16) {
        PointerInputChange pointerInputChange = new PointerInputChange(j11, j12, j13, z11, f11, j14, j15, z12, false, i11, getHistorical(), j16, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    @k
    /* renamed from: copy-wbzehF4, reason: not valid java name */
    public final PointerInputChange m3729copywbzehF4(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, int i11, @k List<HistoricalChange> list, long j16) {
        PointerInputChange pointerInputChange = new PointerInputChange(j11, j12, j13, z11, f11, j14, j15, z12, false, i11, list, j16, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    @k
    public final ConsumedData getConsumed() {
        if (this._consumed == null) {
            this._consumed = new ConsumedData(this);
        }
        ConsumedData consumedData = this._consumed;
        g0.m(consumedData);
        return consumedData;
    }

    @l
    public final PointerInputChange getConsumedDelegate$ui_release() {
        return this.consumedDelegate;
    }

    public final boolean getDownChange$ui_release() {
        return this.downChange;
    }

    @k
    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        return list == null ? h0.J() : list;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m3730getIdJ3iCeTQ() {
        return this.f4207id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m3731getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m3732getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPositionChange$ui_release() {
        return this.positionChange;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m3733getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m3734getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m3735getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        return pointerInputChange != null ? pointerInputChange.isConsumed() : this.downChange || this.positionChange;
    }

    public final void setConsumedDelegate$ui_release(@l PointerInputChange pointerInputChange) {
        this.consumedDelegate = pointerInputChange;
    }

    public final void setDownChange$ui_release(boolean z11) {
        this.downChange = z11;
    }

    /* renamed from: setOriginalEventPosition-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m3736setOriginalEventPositionk4lQ0M$ui_release(long j11) {
        this.originalEventPosition = j11;
    }

    public final void setPositionChange$ui_release(boolean z11) {
        this.positionChange = z11;
    }

    @k
    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m3716toStringimpl(this.f4207id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m2276toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m2276toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m3805toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m2276toStringimpl(this.scrollDelta)) + ')';
    }

    public /* synthetic */ PointerInputChange(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, List list, long j16, long j17, v vVar) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, i11, (List<HistoricalChange>) list, j16, j17);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @w0(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ PointerInputChange(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, ConsumedData consumedData, int i11, v vVar) {
        this(j11, j12, j13, z11, j14, j15, z12, consumedData, i11);
    }

    public /* synthetic */ PointerInputChange(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, boolean z13, int i11, long j16, v vVar) {
        this(j11, j12, j13, z11, j14, j15, z12, z13, i11, j16);
    }

    private PointerInputChange(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, long j16) {
        this.f4207id = j11;
        this.uptimeMillis = j12;
        this.position = j13;
        this.pressed = z11;
        this.pressure = f11;
        this.previousUptimeMillis = j14;
        this.previousPosition = j15;
        this.previousPressed = z12;
        this.type = i11;
        this.scrollDelta = j16;
        this.originalEventPosition = Offset.Companion.m2284getZeroF1C5BW0();
        this.downChange = z13;
        this.positionChange = z13;
    }

    @n(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void getConsumed$annotations() {
    }

    public static /* synthetic */ void getHistorical$annotations() {
    }

    private static /* synthetic */ void get_consumed$annotations() {
    }

    public /* synthetic */ PointerInputChange(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, long j16, int i12, v vVar) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, (i12 & 512) != 0 ? PointerType.Companion.m3810getTouchT8wyACA() : i11, (i12 & 1024) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j16, (v) null);
    }

    public /* synthetic */ PointerInputChange(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, boolean z13, int i11, long j16, int i12, v vVar) {
        this(j11, j12, j13, z11, j14, j15, z12, z13, (i12 & 256) != 0 ? PointerType.Companion.m3810getTouchT8wyACA() : i11, (i12 & 512) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j16, (v) null);
    }

    private PointerInputChange(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, boolean z13, int i11, long j16) {
        this(j11, j12, j13, z11, 1.0f, j14, j15, z12, z13, i11, j16, (v) null);
    }

    public /* synthetic */ PointerInputChange(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, ConsumedData consumedData, int i11, int i12, v vVar) {
        this(j11, j12, j13, z11, j14, j15, z12, consumedData, (i12 & 256) != 0 ? PointerType.Companion.m3810getTouchT8wyACA() : i11, (v) null);
    }

    private PointerInputChange(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, ConsumedData consumedData, int i11) {
        this(j11, j12, j13, z11, 1.0f, j14, j15, z12, consumedData.getDownChange() || consumedData.getPositionChange(), i11, Offset.Companion.m2284getZeroF1C5BW0(), (v) null);
    }

    private PointerInputChange(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, List<HistoricalChange> list, long j16, long j17) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, i11, j16, (v) null);
        this._historical = list;
        this.originalEventPosition = j17;
    }
}
