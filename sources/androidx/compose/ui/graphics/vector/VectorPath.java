package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class VectorPath extends VectorNode {
    public static final int $stable = 0;

    @l
    private final Brush fill;
    private final float fillAlpha;

    @k
    private final String name;

    @k
    private final List<PathNode> pathData;
    private final int pathFillType;

    @l
    private final Brush stroke;
    private final float strokeAlpha;
    private final int strokeLineCap;
    private final int strokeLineJoin;
    private final float strokeLineMiter;
    private final float strokeLineWidth;
    private final float trimPathEnd;
    private final float trimPathOffset;
    private final float trimPathStart;

    public /* synthetic */ VectorPath(String str, List list, int i11, Brush brush, float f11, Brush brush2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17, v vVar) {
        this(str, list, i11, brush, f11, brush2, f12, f13, i12, i13, f14, f15, f16, f17);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VectorPath.class == obj.getClass()) {
            VectorPath vectorPath = (VectorPath) obj;
            return g0.g(this.name, vectorPath.name) && g0.g(this.fill, vectorPath.fill) && this.fillAlpha == vectorPath.fillAlpha && g0.g(this.stroke, vectorPath.stroke) && this.strokeAlpha == vectorPath.strokeAlpha && this.strokeLineWidth == vectorPath.strokeLineWidth && StrokeCap.m2858equalsimpl0(this.strokeLineCap, vectorPath.strokeLineCap) && StrokeJoin.m2868equalsimpl0(this.strokeLineJoin, vectorPath.strokeLineJoin) && this.strokeLineMiter == vectorPath.strokeLineMiter && this.trimPathStart == vectorPath.trimPathStart && this.trimPathEnd == vectorPath.trimPathEnd && this.trimPathOffset == vectorPath.trimPathOffset && PathFillType.m2787equalsimpl0(this.pathFillType, vectorPath.pathFillType) && g0.g(this.pathData, vectorPath.pathData);
        }
        return false;
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
    public final int m3224getPathFillTypeRgk1Os() {
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
    public final int m3225getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m3226getStrokeLineJoinLxFBmk8() {
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

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.pathData.hashCode()) * 31;
        Brush brush = this.fill;
        int hashCode2 = (((hashCode + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.fillAlpha)) * 31;
        Brush brush2 = this.stroke;
        return ((((((((((((((((((hashCode2 + (brush2 != null ? brush2.hashCode() : 0)) * 31) + Float.hashCode(this.strokeAlpha)) * 31) + Float.hashCode(this.strokeLineWidth)) * 31) + StrokeCap.m2859hashCodeimpl(this.strokeLineCap)) * 31) + StrokeJoin.m2869hashCodeimpl(this.strokeLineJoin)) * 31) + Float.hashCode(this.strokeLineMiter)) * 31) + Float.hashCode(this.trimPathStart)) * 31) + Float.hashCode(this.trimPathEnd)) * 31) + Float.hashCode(this.trimPathOffset)) * 31) + PathFillType.m2788hashCodeimpl(this.pathFillType);
    }

    public /* synthetic */ VectorPath(String str, List list, int i11, Brush brush, float f11, Brush brush2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17, int i14, v vVar) {
        this((i14 & 1) != 0 ? "" : str, list, i11, (i14 & 8) != 0 ? null : brush, (i14 & 16) != 0 ? 1.0f : f11, (i14 & 32) != 0 ? null : brush2, (i14 & 64) != 0 ? 1.0f : f12, (i14 & 128) != 0 ? 0.0f : f13, (i14 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i12, (i14 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i13, (i14 & 1024) != 0 ? 4.0f : f14, (i14 & 2048) != 0 ? 0.0f : f15, (i14 & 4096) != 0 ? 1.0f : f16, (i14 & 8192) != 0 ? 0.0f : f17, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VectorPath(String str, List<? extends PathNode> list, int i11, Brush brush, float f11, Brush brush2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i11;
        this.fill = brush;
        this.fillAlpha = f11;
        this.stroke = brush2;
        this.strokeAlpha = f12;
        this.strokeLineWidth = f13;
        this.strokeLineCap = i12;
        this.strokeLineJoin = i13;
        this.strokeLineMiter = f14;
        this.trimPathStart = f15;
        this.trimPathEnd = f16;
        this.trimPathOffset = f17;
    }
}
