package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(33)
/* loaded from: classes2.dex */
final class StaticLayoutFactory33 {

    @m80.k
    public static final StaticLayoutFactory33 INSTANCE = new StaticLayoutFactory33();

    private StaticLayoutFactory33() {
    }

    @w00.o
    public static final boolean isFallbackLineSpacingEnabled(@m80.k StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    @w00.o
    public static final void setLineBreakConfig(@m80.k StaticLayout.Builder builder, int i11, int i12) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        lineBreakStyle = i0.a().setLineBreakStyle(i11);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i12);
        build = lineBreakWordStyle.build();
        builder.setLineBreakConfig(build);
    }
}
