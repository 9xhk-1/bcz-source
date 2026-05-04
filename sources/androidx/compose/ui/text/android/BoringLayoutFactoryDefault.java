package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class BoringLayoutFactoryDefault {

    @m80.k
    public static final BoringLayoutFactoryDefault INSTANCE = new BoringLayoutFactoryDefault();

    private BoringLayoutFactoryDefault() {
    }

    @w00.o
    @m80.k
    public static final BoringLayout create(@m80.k CharSequence charSequence, @m80.k TextPaint textPaint, int i11, @m80.k Layout.Alignment alignment, float f11, float f12, @m80.k BoringLayout.Metrics metrics, boolean z11, @m80.l TextUtils.TruncateAt truncateAt, int i12) {
        return new BoringLayout(charSequence, textPaint, i11, alignment, f11, f12, metrics, z11, truncateAt, i12);
    }

    @m80.l
    @w00.o
    public static final BoringLayout.Metrics isBoring(@m80.k CharSequence charSequence, @m80.k TextPaint textPaint, @m80.k TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
