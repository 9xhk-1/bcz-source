package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class Selection {
    public static final int $stable = 0;

    @k
    private final AnchorInfo end;
    private final boolean handlesCrossed;

    @k
    private final AnchorInfo start;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class AnchorInfo {
        public static final int $stable = 0;

        @k
        private final ResolvedTextDirection direction;
        private final int offset;
        private final long selectableId;

        public AnchorInfo(@k ResolvedTextDirection resolvedTextDirection, int i11, long j11) {
            this.direction = resolvedTextDirection;
            this.offset = i11;
            this.selectableId = j11;
        }

        public static /* synthetic */ AnchorInfo copy$default(AnchorInfo anchorInfo, ResolvedTextDirection resolvedTextDirection, int i11, long j11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                resolvedTextDirection = anchorInfo.direction;
            }
            if ((i12 & 2) != 0) {
                i11 = anchorInfo.offset;
            }
            if ((i12 & 4) != 0) {
                j11 = anchorInfo.selectableId;
            }
            return anchorInfo.copy(resolvedTextDirection, i11, j11);
        }

        @k
        public final ResolvedTextDirection component1() {
            return this.direction;
        }

        public final int component2() {
            return this.offset;
        }

        public final long component3() {
            return this.selectableId;
        }

        @k
        public final AnchorInfo copy(@k ResolvedTextDirection resolvedTextDirection, int i11, long j11) {
            return new AnchorInfo(resolvedTextDirection, i11, j11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            return this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId;
        }

        @k
        public final ResolvedTextDirection getDirection() {
            return this.direction;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final long getSelectableId() {
            return this.selectableId;
        }

        public int hashCode() {
            return (((this.direction.hashCode() * 31) + Integer.hashCode(this.offset)) * 31) + Long.hashCode(this.selectableId);
        }

        @k
        public String toString() {
            return "AnchorInfo(direction=" + this.direction + ", offset=" + this.offset + ", selectableId=" + this.selectableId + ')';
        }
    }

    public Selection(@k AnchorInfo anchorInfo, @k AnchorInfo anchorInfo2, boolean z11) {
        this.start = anchorInfo;
        this.end = anchorInfo2;
        this.handlesCrossed = z11;
    }

    public static /* synthetic */ Selection copy$default(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            anchorInfo = selection.start;
        }
        if ((i11 & 2) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i11 & 4) != 0) {
            z11 = selection.handlesCrossed;
        }
        return selection.copy(anchorInfo, anchorInfo2, z11);
    }

    @k
    public final AnchorInfo component1() {
        return this.start;
    }

    @k
    public final AnchorInfo component2() {
        return this.end;
    }

    public final boolean component3() {
        return this.handlesCrossed;
    }

    @k
    public final Selection copy(@k AnchorInfo anchorInfo, @k AnchorInfo anchorInfo2, boolean z11) {
        return new Selection(anchorInfo, anchorInfo2, z11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return g0.g(this.start, selection.start) && g0.g(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed;
    }

    @k
    public final AnchorInfo getEnd() {
        return this.end;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    @k
    public final AnchorInfo getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((this.start.hashCode() * 31) + this.end.hashCode()) * 31) + Boolean.hashCode(this.handlesCrossed);
    }

    @k
    public final Selection merge(@l Selection selection) {
        if (selection == null) {
            return this;
        }
        boolean z11 = this.handlesCrossed;
        if (z11 || selection.handlesCrossed) {
            return new Selection(selection.handlesCrossed ? selection.start : selection.end, z11 ? this.end : this.start, true);
        }
        return copy$default(this, null, selection.end, false, 5, null);
    }

    @k
    public String toString() {
        return "Selection(start=" + this.start + ", end=" + this.end + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    /* renamed from: toTextRange-d9O1mEE, reason: not valid java name */
    public final long m1441toTextRanged9O1mEE() {
        return TextRangeKt.TextRange(this.start.getOffset(), this.end.getOffset());
    }

    public /* synthetic */ Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z11, int i11, v vVar) {
        this(anchorInfo, anchorInfo2, (i11 & 4) != 0 ? false : z11);
    }
}
