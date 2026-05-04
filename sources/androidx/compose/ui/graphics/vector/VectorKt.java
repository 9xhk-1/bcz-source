package androidx.compose.ui.graphics.vector;

import a00.h0;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class VectorKt {

    @k
    public static final String DefaultGroupName = "";

    @k
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;

    @k
    private static final List<PathNode> EmptyPath = h0.J();
    private static final int DefaultStrokeLineCap = StrokeCap.Companion.m2862getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.Companion.m2873getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.Companion.m2449getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.Companion.m2544getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.Companion.m2792getNonZeroRgk1Os();

    @k
    public static final List<PathNode> PathData(@k l<? super PathBuilder, g2> lVar) {
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    @k
    public static final List<PathNode> addPathNodes(@m80.l String str) {
        return str == null ? EmptyPath : new PathParser().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    @k
    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    /* renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m3211rgbEqualOWjLjI(long j11, long j12) {
        return Color.m2515getRedimpl(j11) == Color.m2515getRedimpl(j12) && Color.m2514getGreenimpl(j11) == Color.m2514getGreenimpl(j12) && Color.m2512getBlueimpl(j11) == Color.m2512getBlueimpl(j12);
    }

    public static final boolean tintableWithAlphaMask(@m80.l ColorFilter colorFilter) {
        if (!(colorFilter instanceof BlendModeColorFilter)) {
            return colorFilter == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
        int m2453getBlendMode0nO6VwU = blendModeColorFilter.m2453getBlendMode0nO6VwU();
        BlendMode.Companion companion = BlendMode.Companion;
        return BlendMode.m2420equalsimpl0(m2453getBlendMode0nO6VwU, companion.m2449getSrcIn0nO6VwU()) || BlendMode.m2420equalsimpl0(blendModeColorFilter.m2453getBlendMode0nO6VwU(), companion.m2451getSrcOver0nO6VwU());
    }
}
