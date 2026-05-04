package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nBoringLayoutFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoringLayoutFactory.android.kt\nandroidx/compose/ui/text/android/BoringLayoutFactory\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,208:1\n114#2,8:209\n114#2,8:217\n*S KotlinDebug\n*F\n+ 1 BoringLayoutFactory.android.kt\nandroidx/compose/ui/text/android/BoringLayoutFactory\n*L\n78#1:209,8\n79#1:217,8\n*E\n"})
/* loaded from: classes2.dex */
public final class BoringLayoutFactory {
    public static final int $stable = 0;

    @m80.k
    public static final BoringLayoutFactory INSTANCE = new BoringLayoutFactory();

    private BoringLayoutFactory() {
    }

    @m80.k
    public final BoringLayout create(@m80.k CharSequence charSequence, @m80.k TextPaint textPaint, int i11, @m80.k BoringLayout.Metrics metrics, @m80.k Layout.Alignment alignment, boolean z11, boolean z12, @m80.l TextUtils.TruncateAt truncateAt, int i12) {
        if (!(i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative width");
        }
        if (!(i12 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative ellipsized width");
        }
        return Build.VERSION.SDK_INT >= 33 ? BoringLayoutFactory33.create(charSequence, textPaint, i11, alignment, 1.0f, 0.0f, metrics, z11, z12, truncateAt, i12) : BoringLayoutFactoryDefault.create(charSequence, textPaint, i11, alignment, 1.0f, 0.0f, metrics, z11, truncateAt, i12);
    }

    public final boolean isFallbackLineSpacingEnabled(@m80.k BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return BoringLayoutFactory33.isFallbackLineSpacingEnabled(boringLayout);
        }
        return false;
    }

    @m80.l
    public final BoringLayout.Metrics measure(@m80.k CharSequence charSequence, @m80.k TextPaint textPaint, @m80.k TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? BoringLayoutFactory33.isBoring(charSequence, textPaint, textDirectionHeuristic) : BoringLayoutFactoryDefault.isBoring(charSequence, textPaint, textDirectionHeuristic);
    }
}
