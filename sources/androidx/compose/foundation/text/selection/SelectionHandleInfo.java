package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SelectionHandleInfo {
    public static final int $stable = 0;

    @k
    private final SelectionHandleAnchor anchor;

    @k
    private final Handle handle;
    private final long position;
    private final boolean visible;

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j11, SelectionHandleAnchor selectionHandleAnchor, boolean z11, v vVar) {
        this(handle, j11, selectionHandleAnchor, z11);
    }

    /* renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m1445copyubNVwUQ$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j11, SelectionHandleAnchor selectionHandleAnchor, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i11 & 2) != 0) {
            j11 = selectionHandleInfo.position;
        }
        if ((i11 & 4) != 0) {
            selectionHandleAnchor = selectionHandleInfo.anchor;
        }
        if ((i11 & 8) != 0) {
            z11 = selectionHandleInfo.visible;
        }
        return selectionHandleInfo.m1447copyubNVwUQ(handle, j11, selectionHandleAnchor, z11);
    }

    @k
    public final Handle component1() {
        return this.handle;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m1446component2F1C5BW0() {
        return this.position;
    }

    @k
    public final SelectionHandleAnchor component3() {
        return this.anchor;
    }

    public final boolean component4() {
        return this.visible;
    }

    @k
    /* renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final SelectionHandleInfo m1447copyubNVwUQ(@k Handle handle, long j11, @k SelectionHandleAnchor selectionHandleAnchor, boolean z11) {
        return new SelectionHandleInfo(handle, j11, selectionHandleAnchor, z11, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.handle == selectionHandleInfo.handle && Offset.m2265equalsimpl0(this.position, selectionHandleInfo.position) && this.anchor == selectionHandleInfo.anchor && this.visible == selectionHandleInfo.visible;
    }

    @k
    public final SelectionHandleAnchor getAnchor() {
        return this.anchor;
    }

    @k
    public final Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1448getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return (((((this.handle.hashCode() * 31) + Offset.m2270hashCodeimpl(this.position)) * 31) + this.anchor.hashCode()) * 31) + Boolean.hashCode(this.visible);
    }

    @k
    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m2276toStringimpl(this.position)) + ", anchor=" + this.anchor + ", visible=" + this.visible + ')';
    }

    private SelectionHandleInfo(Handle handle, long j11, SelectionHandleAnchor selectionHandleAnchor, boolean z11) {
        this.handle = handle;
        this.position = j11;
        this.anchor = selectionHandleAnchor;
        this.visible = z11;
    }
}
