package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(33)
/* loaded from: classes2.dex */
final class BoringLayoutFactory33 {

    @m80.k
    public static final BoringLayoutFactory33 INSTANCE = new BoringLayoutFactory33();

    private BoringLayoutFactory33() {
    }

    @w00.o
    @m80.k
    public static final BoringLayout create(@m80.k CharSequence charSequence, @m80.k TextPaint textPaint, int i11, @m80.k Layout.Alignment alignment, float f11, float f12, @m80.k BoringLayout.Metrics metrics, boolean z11, boolean z12, @m80.l TextUtils.TruncateAt truncateAt, int i12) {
        return h.a(charSequence, textPaint, i11, alignment, f11, f12, metrics, z11, truncateAt, i12, z12);
    }

    @m80.l
    @w00.o
    public static final BoringLayout.Metrics isBoring(@m80.k CharSequence charSequence, @m80.k TextPaint textPaint, @m80.k TextDirectionHeuristic textDirectionHeuristic) {
        BoringLayout.Metrics isBoring;
        isBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
        return isBoring;
    }

    @w00.o
    public static final boolean isFallbackLineSpacingEnabled(@m80.k BoringLayout boringLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }
}
