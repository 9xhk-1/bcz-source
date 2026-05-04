package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nContextMenuState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,78:1\n85#2:79\n113#2,2:80\n*S KotlinDebug\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState\n*L\n33#1:79\n33#1:80,2\n*E\n"})
/* loaded from: classes.dex */
public final class ContextMenuState {
    public static final int $stable = 0;

    @k
    private final MutableState status$delegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static abstract class Status {
        public static final int $stable = 0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @StabilityInferred(parameters = 1)
        public static final class Closed extends Status {
            public static final int $stable = 0;

            @k
            public static final Closed INSTANCE = new Closed();

            private Closed() {
                super(null);
            }

            @k
            public String toString() {
                return "Closed";
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @StabilityInferred(parameters = 1)
        @u0({"SMAP\nContextMenuState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,78:1\n273#2:79\n50#3,5:80\n*S KotlinDebug\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open\n*L\n53#1:79\n53#1:80,5\n*E\n"})
        public static final class Open extends Status {
            public static final int $stable = 0;
            private final long offset;

            public /* synthetic */ Open(long j11, v vVar) {
                this(j11);
            }

            public boolean equals(@l Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Open) {
                    return Offset.m2265equalsimpl0(this.offset, ((Open) obj).offset);
                }
                return false;
            }

            /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
            public final long m360getOffsetF1C5BW0() {
                return this.offset;
            }

            public int hashCode() {
                return Offset.m2270hashCodeimpl(this.offset);
            }

            @k
            public String toString() {
                return "Open(offset=" + ((Object) Offset.m2276toStringimpl(this.offset)) + ')';
            }

            private Open(long j11) {
                super(null);
                this.offset = j11;
                if ((j11 & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    return;
                }
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }
        }

        public /* synthetic */ Status(v vVar) {
            this();
        }

        private Status() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextMenuState) {
            return g0.g(((ContextMenuState) obj).getStatus(), getStatus());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final Status getStatus() {
        return (Status) this.status$delegate.getValue();
    }

    public int hashCode() {
        return getStatus().hashCode();
    }

    public final void setStatus(@k Status status) {
        this.status$delegate.setValue(status);
    }

    @k
    public String toString() {
        return "ContextMenuState(status=" + getStatus() + ')';
    }

    public ContextMenuState(@k Status status) {
        this.status$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(status, null, 2, null);
    }

    public /* synthetic */ ContextMenuState(Status status, int i11, v vVar) {
        this((i11 & 1) != 0 ? Status.Closed.INSTANCE : status);
    }
}
