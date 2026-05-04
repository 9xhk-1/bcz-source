package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n1#2:643\n*E\n"})
/* loaded from: classes.dex */
public final class PathComponent extends VNode {
    public static final int $stable = 8;

    @l
    private Brush fill;
    private float fillAlpha;
    private boolean isPathDirty;
    private boolean isStrokeDirty;
    private boolean isTrimPathDirty;

    @k
    private String name;

    @k
    private final Path path;

    @k
    private List<? extends PathNode> pathData;
    private int pathFillType;

    @k
    private final c0 pathMeasure$delegate;

    @k
    private Path renderPath;

    @l
    private Brush stroke;
    private float strokeAlpha;
    private int strokeLineCap;
    private int strokeLineJoin;
    private float strokeLineMiter;
    private float strokeLineWidth;

    @l
    private Stroke strokeStyle;
    private float trimPathEnd;
    private float trimPathOffset;
    private float trimPathStart;

    public PathComponent() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = VectorKt.getEmptyPath();
        this.pathFillType = VectorKt.getDefaultFillType();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = VectorKt.getDefaultStrokeLineCap();
        this.strokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        Path Path = AndroidPath_androidKt.Path();
        this.path = Path;
        this.renderPath = Path;
        this.pathMeasure$delegate = e0.b(LazyThreadSafetyMode.NONE, new a<PathMeasure>() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final PathMeasure invoke() {
                return AndroidPathMeasure_androidKt.PathMeasure();
            }
        });
    }

    private final PathMeasure getPathMeasure() {
        return (PathMeasure) this.pathMeasure$delegate.getValue();
    }

    private final void updatePath() {
        PathParserKt.toPath(this.pathData, this.path);
        updateRenderPath();
    }

    private final void updateRenderPath() {
        if (this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f) {
            this.renderPath = this.path;
            return;
        }
        if (g0.g(this.renderPath, this.path)) {
            this.renderPath = AndroidPath_androidKt.Path();
        } else {
            int mo2400getFillTypeRgk1Os = this.renderPath.mo2400getFillTypeRgk1Os();
            this.renderPath.rewind();
            this.renderPath.mo2402setFillTypeoQ8Xj4U(mo2400getFillTypeRgk1Os);
        }
        getPathMeasure().setPath(this.path, false);
        float length = getPathMeasure().getLength();
        float f11 = this.trimPathStart;
        float f12 = this.trimPathOffset;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.trimPathEnd + f12) % 1.0f) * length;
        if (f13 <= f14) {
            getPathMeasure().getSegment(f13, f14, this.renderPath, true);
        } else {
            getPathMeasure().getSegment(f13, length, this.renderPath, true);
            getPathMeasure().getSegment(0.0f, f14, this.renderPath, true);
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(@k DrawScope drawScope) {
        Stroke stroke;
        if (this.isPathDirty) {
            updatePath();
        } else if (this.isTrimPathDirty) {
            updateRenderPath();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        Brush brush = this.fill;
        if (brush != null) {
            DrawScope.m3049drawPathGBMwjPU$default(drawScope, this.renderPath, brush, this.fillAlpha, null, null, 0, 56, null);
        }
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            Stroke stroke2 = this.strokeStyle;
            if (this.isStrokeDirty || stroke2 == null) {
                Stroke stroke3 = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke3;
                this.isStrokeDirty = false;
                stroke = stroke3;
            } else {
                stroke = stroke2;
            }
            DrawScope.m3049drawPathGBMwjPU$default(drawScope, this.renderPath, brush2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    @l
    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m3198getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    @l
    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m3199getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m3200getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final void setFill(@l Brush brush) {
        this.fill = brush;
        invalidate();
    }

    public final void setFillAlpha(float f11) {
        this.fillAlpha = f11;
        invalidate();
    }

    public final void setName(@k String str) {
        this.name = str;
        invalidate();
    }

    public final void setPathData(@k List<? extends PathNode> list) {
        this.pathData = list;
        this.isPathDirty = true;
        invalidate();
    }

    /* renamed from: setPathFillType-oQ8Xj4U, reason: not valid java name */
    public final void m3201setPathFillTypeoQ8Xj4U(int i11) {
        this.pathFillType = i11;
        this.renderPath.mo2402setFillTypeoQ8Xj4U(i11);
        invalidate();
    }

    public final void setStroke(@l Brush brush) {
        this.stroke = brush;
        invalidate();
    }

    public final void setStrokeAlpha(float f11) {
        this.strokeAlpha = f11;
        invalidate();
    }

    /* renamed from: setStrokeLineCap-BeK7IIE, reason: not valid java name */
    public final void m3202setStrokeLineCapBeK7IIE(int i11) {
        this.strokeLineCap = i11;
        this.isStrokeDirty = true;
        invalidate();
    }

    /* renamed from: setStrokeLineJoin-Ww9F2mQ, reason: not valid java name */
    public final void m3203setStrokeLineJoinWw9F2mQ(int i11) {
        this.strokeLineJoin = i11;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f11) {
        this.strokeLineMiter = f11;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineWidth(float f11) {
        this.strokeLineWidth = f11;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setTrimPathEnd(float f11) {
        this.trimPathEnd = f11;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathOffset(float f11) {
        this.trimPathOffset = f11;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathStart(float f11) {
        this.trimPathStart = f11;
        this.isTrimPathDirty = true;
        invalidate();
    }

    @k
    public String toString() {
        return this.path.toString();
    }
}
