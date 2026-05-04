package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* loaded from: classes2.dex */
public final class StaticLayoutFactory {

    @m80.k
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();

    @m80.k
    private static final StaticLayoutFactoryImpl delegate = new StaticLayoutFactory23();
    public static final int $stable = 8;

    private StaticLayoutFactory() {
    }

    public static /* synthetic */ StaticLayout create$default(StaticLayoutFactory staticLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i11, int i12, int i13, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i14, TextUtils.TruncateAt truncateAt, int i15, float f11, float f12, int i16, boolean z11, boolean z12, int i17, int i18, int i19, int i21, int[] iArr, int[] iArr2, int i22, Object obj) {
        int[] iArr3;
        StaticLayoutFactory staticLayoutFactory2;
        CharSequence charSequence2;
        TextPaint textPaint2;
        int i23;
        int i24 = (i22 & 8) != 0 ? 0 : i12;
        int length = (i22 & 16) != 0 ? charSequence.length() : i13;
        TextDirectionHeuristic dEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release = (i22 & 32) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() : textDirectionHeuristic;
        Layout.Alignment dEFAULT_LAYOUT_ALIGNMENT$ui_text_release = (i22 & 64) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() : alignment;
        int i25 = (i22 & 128) != 0 ? Integer.MAX_VALUE : i14;
        TextUtils.TruncateAt truncateAt2 = (i22 & 256) != 0 ? null : truncateAt;
        int i26 = (i22 & 512) != 0 ? i11 : i15;
        float f13 = (i22 & 1024) != 0 ? 1.0f : f11;
        float f14 = (i22 & 2048) != 0 ? 0.0f : f12;
        int i27 = (i22 & 4096) != 0 ? 0 : i16;
        boolean z13 = (i22 & 8192) != 0 ? false : z11;
        boolean z14 = (i22 & 16384) != 0 ? true : z12;
        int i28 = (32768 & i22) != 0 ? 0 : i17;
        int i29 = (65536 & i22) != 0 ? 0 : i18;
        int i31 = (131072 & i22) != 0 ? 0 : i19;
        int i32 = (262144 & i22) != 0 ? 0 : i21;
        int[] iArr4 = (524288 & i22) != 0 ? null : iArr;
        if ((i22 & 1048576) != 0) {
            iArr3 = null;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i23 = i11;
            staticLayoutFactory2 = staticLayoutFactory;
        } else {
            iArr3 = iArr2;
            staticLayoutFactory2 = staticLayoutFactory;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i23 = i11;
        }
        return staticLayoutFactory2.create(charSequence2, textPaint2, i23, i24, length, dEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release, dEFAULT_LAYOUT_ALIGNMENT$ui_text_release, i25, truncateAt2, i26, f13, f14, i27, z13, z14, i28, i29, i31, i32, iArr4, iArr3);
    }

    @m80.k
    public final StaticLayout create(@m80.k CharSequence charSequence, @m80.k TextPaint textPaint, int i11, int i12, int i13, @m80.k TextDirectionHeuristic textDirectionHeuristic, @m80.k Layout.Alignment alignment, @IntRange(from = 0) int i14, @m80.l TextUtils.TruncateAt truncateAt, @IntRange(from = 0) int i15, @FloatRange(from = 0.0d) float f11, float f12, int i16, boolean z11, boolean z12, int i17, int i18, int i19, int i21, @m80.l int[] iArr, @m80.l int[] iArr2) {
        return delegate.create(new StaticLayoutParams(charSequence, i12, i13, textPaint, i11, textDirectionHeuristic, alignment, i14, truncateAt, i15, f11, f12, i16, z11, z12, i17, i18, i19, i21, iArr, iArr2));
    }

    public final boolean isFallbackLineSpacingEnabled(@m80.k StaticLayout staticLayout, boolean z11) {
        return delegate.isFallbackLineSpacingEnabled(staticLayout, z11);
    }
}
