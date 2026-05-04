package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ShaderKt {
    @m80.k
    /* renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m2822ImageShaderF49vj9s(@m80.k ImageBitmap imageBitmap, int i11, int i12) {
        return AndroidShader_androidKt.m2409ActualImageShaderF49vj9s(imageBitmap, i11, i12);
    }

    /* renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m2823ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = TileMode.Companion.m2882getClamp3opZhB0();
        }
        if ((i13 & 4) != 0) {
            i12 = TileMode.Companion.m2882getClamp3opZhB0();
        }
        return m2822ImageShaderF49vj9s(imageBitmap, i11, i12);
    }

    @m80.k
    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m2824LinearGradientShaderVjE6UOU(long j11, long j12, @m80.k List<Color> list, @m80.l List<Float> list2, int i11) {
        return AndroidShader_androidKt.m2410ActualLinearGradientShaderVjE6UOU(j11, j12, list, list2, i11);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m2825LinearGradientShaderVjE6UOU$default(long j11, long j12, List list, List list2, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i12 & 16) != 0) {
            i11 = TileMode.Companion.m2882getClamp3opZhB0();
        }
        return m2824LinearGradientShaderVjE6UOU(j11, j12, list, list3, i11);
    }

    @m80.k
    /* renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m2826RadialGradientShader8uybcMk(long j11, float f11, @m80.k List<Color> list, @m80.l List<Float> list2, int i11) {
        return AndroidShader_androidKt.m2411ActualRadialGradientShader8uybcMk(j11, f11, list, list2, i11);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m2827RadialGradientShader8uybcMk$default(long j11, float f11, List list, List list2, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i12 & 16) != 0) {
            i11 = TileMode.Companion.m2882getClamp3opZhB0();
        }
        return m2826RadialGradientShader8uybcMk(j11, f11, list, list3, i11);
    }

    @m80.k
    /* renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m2828SweepGradientShader9KIMszo(long j11, @m80.k List<Color> list, @m80.l List<Float> list2) {
        return AndroidShader_androidKt.m2412ActualSweepGradientShader9KIMszo(j11, list, list2);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m2829SweepGradientShader9KIMszo$default(long j11, List list, List list2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list2 = null;
        }
        return m2828SweepGradientShader9KIMszo(j11, list, list2);
    }
}
