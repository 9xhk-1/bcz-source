package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class WrapContentElement extends ModifierNodeElement<WrapContentNode> {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private final Object align;

    @m80.k
    private final p<IntSize, LayoutDirection, IntOffset> alignmentCallback;

    @m80.k
    private final Direction direction;

    @m80.k
    private final String inspectorName;
    private final boolean unbounded;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @Stable
        @m80.k
        public final WrapContentElement height(@m80.k final Alignment.Vertical vertical, boolean z11) {
            return new WrapContentElement(Direction.Vertical, z11, new p<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$height$1
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                    return IntOffset.m5234boximpl(m827invoke5SAbXVA(intSize.m5290unboximpl(), layoutDirection));
                }

                /* renamed from: invoke-5SAbXVA, reason: not valid java name */
                public final long m827invoke5SAbXVA(long j11, LayoutDirection layoutDirection) {
                    return IntOffset.m5237constructorimpl((0 << 32) | (4294967295L & Alignment.Vertical.this.align(0, (int) (j11 & 4294967295L))));
                }
            }, vertical, "wrapContentHeight");
        }

        @Stable
        @m80.k
        public final WrapContentElement size(@m80.k final Alignment alignment, boolean z11) {
            return new WrapContentElement(Direction.Both, z11, new p<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$size$1
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                    return IntOffset.m5234boximpl(m828invoke5SAbXVA(intSize.m5290unboximpl(), layoutDirection));
                }

                /* renamed from: invoke-5SAbXVA, reason: not valid java name */
                public final long m828invoke5SAbXVA(long j11, LayoutDirection layoutDirection) {
                    return Alignment.this.mo2085alignKFBX0sM(IntSize.Companion.m5291getZeroYbymL2g(), j11, layoutDirection);
                }
            }, alignment, "wrapContentSize");
        }

        @Stable
        @m80.k
        public final WrapContentElement width(@m80.k final Alignment.Horizontal horizontal, boolean z11) {
            return new WrapContentElement(Direction.Horizontal, z11, new p<IntSize, LayoutDirection, IntOffset>() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$width$1
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
                    return IntOffset.m5234boximpl(m829invoke5SAbXVA(intSize.m5290unboximpl(), layoutDirection));
                }

                /* renamed from: invoke-5SAbXVA, reason: not valid java name */
                public final long m829invoke5SAbXVA(long j11, LayoutDirection layoutDirection) {
                    return IntOffset.m5237constructorimpl((0 & 4294967295L) | (Alignment.Horizontal.this.align(0, (int) (j11 >> 32), layoutDirection) << 32));
                }
            }, horizontal, "wrapContentWidth");
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(@m80.k Direction direction, boolean z11, @m80.k p<? super IntSize, ? super LayoutDirection, IntOffset> pVar, @m80.k Object obj, @m80.k String str) {
        this.direction = direction;
        this.unbounded = z11;
        this.alignmentCallback = pVar;
        this.align = obj;
        this.inspectorName = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && g0.g(this.align, wrapContentElement.align);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("align", this.align);
        inspectorInfo.getProperties().set("unbounded", Boolean.valueOf(this.unbounded));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public WrapContentNode create() {
        return new WrapContentNode(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k WrapContentNode wrapContentNode) {
        wrapContentNode.setDirection(this.direction);
        wrapContentNode.setUnbounded(this.unbounded);
        wrapContentNode.setAlignmentCallback(this.alignmentCallback);
    }
}
