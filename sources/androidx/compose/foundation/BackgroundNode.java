package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
/* loaded from: classes.dex */
final class BackgroundNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode {
    private float alpha;

    @l
    private Brush brush;
    private long color;

    @l
    private LayoutDirection lastLayoutDirection;

    @l
    private Outline lastOutline;

    @l
    private Shape lastShape;
    private long lastSize;

    @m80.k
    private Shape shape;

    @l
    private Outline tmpOutline;

    public /* synthetic */ BackgroundNode(long j11, Brush brush, float f11, Shape shape, v vVar) {
        this(j11, brush, f11, shape);
    }

    private final void drawOutline(ContentDrawScope contentDrawScope) {
        ContentDrawScope contentDrawScope2;
        Outline outline = getOutline(contentDrawScope);
        if (Color.m2510equalsimpl0(this.color, Color.Companion.m2545getUnspecified0d7_KjU())) {
            contentDrawScope2 = contentDrawScope;
        } else {
            contentDrawScope2 = contentDrawScope;
            OutlineKt.m2768drawOutlinewDX37Ww$default(contentDrawScope2, outline, this.color, 0.0f, null, null, 0, 60, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            OutlineKt.m2766drawOutlinehn5TExg$default(contentDrawScope2, outline, brush, this.alpha, null, null, 0, 56, null);
        }
    }

    private final void drawRect(ContentDrawScope contentDrawScope) {
        if (!Color.m2510equalsimpl0(this.color, Color.Companion.m2545getUnspecified0d7_KjU())) {
            DrawScope.m3054drawRectnJ9OG0$default(contentDrawScope, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            DrawScope.m3053drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    private final Outline getOutline(final ContentDrawScope contentDrawScope) {
        Outline outline;
        if (Size.m2333equalsimpl0(contentDrawScope.mo3060getSizeNHjbRc(), this.lastSize) && contentDrawScope.getLayoutDirection() == this.lastLayoutDirection && g0.g(this.lastShape, this.shape)) {
            outline = this.lastOutline;
            g0.m(outline);
        } else {
            ObserverModifierNodeKt.observeReads(this, new x00.a<g2>() { // from class: androidx.compose.foundation.BackgroundNode$getOutline$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BackgroundNode backgroundNode = BackgroundNode.this;
                    backgroundNode.tmpOutline = backgroundNode.getShape().mo291createOutlinePq9zytI(contentDrawScope.mo3060getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
                }
            });
            outline = this.tmpOutline;
            this.tmpOutline = null;
        }
        this.lastOutline = outline;
        this.lastSize = contentDrawScope.mo3060getSizeNHjbRc();
        this.lastLayoutDirection = contentDrawScope.getLayoutDirection();
        this.lastShape = this.shape;
        g0.m(outline);
        return outline;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@m80.k ContentDrawScope contentDrawScope) {
        if (this.shape == RectangleShapeKt.getRectangleShape()) {
            drawRect(contentDrawScope);
        } else {
            drawOutline(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @l
    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m236getColor0d7_KjU() {
        return this.color;
    }

    @m80.k
    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        this.lastSize = Size.Companion.m2345getUnspecifiedNHjbRc();
        this.lastLayoutDirection = null;
        this.lastOutline = null;
        this.lastShape = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public final void setAlpha(float f11) {
        this.alpha = f11;
    }

    public final void setBrush(@l Brush brush) {
        this.brush = brush;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m237setColor8_81llA(long j11) {
        this.color = j11;
    }

    public final void setShape(@m80.k Shape shape) {
        this.shape = shape;
    }

    private BackgroundNode(long j11, Brush brush, float f11, Shape shape) {
        this.color = j11;
        this.brush = brush;
        this.alpha = f11;
        this.shape = shape;
        this.lastSize = Size.Companion.m2345getUnspecifiedNHjbRc();
    }
}
