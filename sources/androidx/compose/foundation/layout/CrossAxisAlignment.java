package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public abstract class CrossAxisAlignment {
    public static final int $stable = 0;

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final CrossAxisAlignment Center = CenterCrossAxisAlignment.INSTANCE;

    @m80.k
    private static final CrossAxisAlignment Start = StartCrossAxisAlignment.INSTANCE;

    @m80.k
    private static final CrossAxisAlignment End = EndCrossAxisAlignment.INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AlignmentLineCrossAxisAlignment extends CrossAxisAlignment {

        @m80.k
        private final AlignmentLineProvider alignmentLineProvider;

        public AlignmentLineCrossAxisAlignment(@m80.k AlignmentLineProvider alignmentLineProvider) {
            super(null);
            this.alignmentLineProvider = alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i11, @m80.k LayoutDirection layoutDirection, @m80.k Placeable placeable, int i12) {
            int calculateAlignmentLinePosition = this.alignmentLineProvider.calculateAlignmentLinePosition(placeable);
            if (calculateAlignmentLinePosition == Integer.MIN_VALUE) {
                return 0;
            }
            int i13 = i12 - calculateAlignmentLinePosition;
            return layoutDirection == LayoutDirection.Rtl ? i11 - i13 : i13;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        @m80.k
        public Integer calculateAlignmentLinePosition$foundation_layout_release(@m80.k Placeable placeable) {
            return Integer.valueOf(this.alignmentLineProvider.calculateAlignmentLinePosition(placeable));
        }

        @m80.k
        public final AlignmentLineProvider getAlignmentLineProvider() {
            return this.alignmentLineProvider;
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public boolean isRelative$foundation_layout_release() {
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CenterCrossAxisAlignment extends CrossAxisAlignment {

        @m80.k
        public static final CenterCrossAxisAlignment INSTANCE = new CenterCrossAxisAlignment();

        private CenterCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i11, @m80.k LayoutDirection layoutDirection, @m80.k Placeable placeable, int i12) {
            return i11 / 2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @m80.k
        public final CrossAxisAlignment AlignmentLine(@m80.k AlignmentLine alignmentLine) {
            return new AlignmentLineCrossAxisAlignment(new AlignmentLineProvider.Value(alignmentLine));
        }

        @m80.k
        public final CrossAxisAlignment Relative$foundation_layout_release(@m80.k AlignmentLineProvider alignmentLineProvider) {
            return new AlignmentLineCrossAxisAlignment(alignmentLineProvider);
        }

        @m80.k
        public final CrossAxisAlignment getCenter() {
            return CrossAxisAlignment.Center;
        }

        @m80.k
        public final CrossAxisAlignment getEnd() {
            return CrossAxisAlignment.End;
        }

        @m80.k
        public final CrossAxisAlignment getStart() {
            return CrossAxisAlignment.Start;
        }

        @m80.k
        public final CrossAxisAlignment horizontal$foundation_layout_release(@m80.k Alignment.Horizontal horizontal) {
            return new HorizontalCrossAxisAlignment(horizontal);
        }

        @m80.k
        public final CrossAxisAlignment vertical$foundation_layout_release(@m80.k Alignment.Vertical vertical) {
            return new VerticalCrossAxisAlignment(vertical);
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getStart$annotations() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EndCrossAxisAlignment extends CrossAxisAlignment {

        @m80.k
        public static final EndCrossAxisAlignment INSTANCE = new EndCrossAxisAlignment();

        private EndCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i11, @m80.k LayoutDirection layoutDirection, @m80.k Placeable placeable, int i12) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return i11;
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HorizontalCrossAxisAlignment extends CrossAxisAlignment {

        @m80.k
        private final Alignment.Horizontal horizontal;

        public HorizontalCrossAxisAlignment(@m80.k Alignment.Horizontal horizontal) {
            super(null);
            this.horizontal = horizontal;
        }

        public static /* synthetic */ HorizontalCrossAxisAlignment copy$default(HorizontalCrossAxisAlignment horizontalCrossAxisAlignment, Alignment.Horizontal horizontal, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                horizontal = horizontalCrossAxisAlignment.horizontal;
            }
            return horizontalCrossAxisAlignment.copy(horizontal);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i11, @m80.k LayoutDirection layoutDirection, @m80.k Placeable placeable, int i12) {
            return this.horizontal.align(0, i11, layoutDirection);
        }

        @m80.k
        public final Alignment.Horizontal component1() {
            return this.horizontal;
        }

        @m80.k
        public final HorizontalCrossAxisAlignment copy(@m80.k Alignment.Horizontal horizontal) {
            return new HorizontalCrossAxisAlignment(horizontal);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalCrossAxisAlignment) && g0.g(this.horizontal, ((HorizontalCrossAxisAlignment) obj).horizontal);
        }

        @m80.k
        public final Alignment.Horizontal getHorizontal() {
            return this.horizontal;
        }

        public int hashCode() {
            return this.horizontal.hashCode();
        }

        @m80.k
        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class StartCrossAxisAlignment extends CrossAxisAlignment {

        @m80.k
        public static final StartCrossAxisAlignment INSTANCE = new StartCrossAxisAlignment();

        private StartCrossAxisAlignment() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i11, @m80.k LayoutDirection layoutDirection, @m80.k Placeable placeable, int i12) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class VerticalCrossAxisAlignment extends CrossAxisAlignment {

        @m80.k
        private final Alignment.Vertical vertical;

        public VerticalCrossAxisAlignment(@m80.k Alignment.Vertical vertical) {
            super(null);
            this.vertical = vertical;
        }

        public static /* synthetic */ VerticalCrossAxisAlignment copy$default(VerticalCrossAxisAlignment verticalCrossAxisAlignment, Alignment.Vertical vertical, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                vertical = verticalCrossAxisAlignment.vertical;
            }
            return verticalCrossAxisAlignment.copy(vertical);
        }

        @Override // androidx.compose.foundation.layout.CrossAxisAlignment
        public int align$foundation_layout_release(int i11, @m80.k LayoutDirection layoutDirection, @m80.k Placeable placeable, int i12) {
            return this.vertical.align(0, i11);
        }

        @m80.k
        public final Alignment.Vertical component1() {
            return this.vertical;
        }

        @m80.k
        public final VerticalCrossAxisAlignment copy(@m80.k Alignment.Vertical vertical) {
            return new VerticalCrossAxisAlignment(vertical);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalCrossAxisAlignment) && g0.g(this.vertical, ((VerticalCrossAxisAlignment) obj).vertical);
        }

        @m80.k
        public final Alignment.Vertical getVertical() {
            return this.vertical;
        }

        public int hashCode() {
            return this.vertical.hashCode();
        }

        @m80.k
        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.vertical + ')';
        }
    }

    public /* synthetic */ CrossAxisAlignment(v vVar) {
        this();
    }

    public abstract int align$foundation_layout_release(int i11, @m80.k LayoutDirection layoutDirection, @m80.k Placeable placeable, int i12);

    @l
    public Integer calculateAlignmentLinePosition$foundation_layout_release(@m80.k Placeable placeable) {
        return null;
    }

    public boolean isRelative$foundation_layout_release() {
        return false;
    }

    private CrossAxisAlignment() {
    }
}
