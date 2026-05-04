package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(23)
/* loaded from: classes2.dex */
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @m80.k
    public StaticLayout create(@m80.k StaticLayoutParams staticLayoutParams) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(staticLayoutParams.getText(), staticLayoutParams.getStart(), staticLayoutParams.getEnd(), staticLayoutParams.getPaint(), staticLayoutParams.getWidth());
        obtain.setTextDirection(staticLayoutParams.getTextDir());
        obtain.setAlignment(staticLayoutParams.getAlignment());
        obtain.setMaxLines(staticLayoutParams.getMaxLines());
        obtain.setEllipsize(staticLayoutParams.getEllipsize());
        obtain.setEllipsizedWidth(staticLayoutParams.getEllipsizedWidth());
        obtain.setLineSpacing(staticLayoutParams.getLineSpacingExtra(), staticLayoutParams.getLineSpacingMultiplier());
        obtain.setIncludePad(staticLayoutParams.getIncludePadding());
        obtain.setBreakStrategy(staticLayoutParams.getBreakStrategy());
        obtain.setHyphenationFrequency(staticLayoutParams.getHyphenationFrequency());
        obtain.setIndents(staticLayoutParams.getLeftIndents(), staticLayoutParams.getRightIndents());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            StaticLayoutFactory26.setJustificationMode(obtain, staticLayoutParams.getJustificationMode());
        }
        if (i11 >= 28) {
            StaticLayoutFactory28.setUseLineSpacingFromFallbacks(obtain, staticLayoutParams.getUseFallbackLineSpacing());
        }
        if (i11 >= 33) {
            StaticLayoutFactory33.setLineBreakConfig(obtain, staticLayoutParams.getLineBreakStyle(), staticLayoutParams.getLineBreakWordStyle());
        }
        if (i11 >= 35) {
            StaticLayoutFactory35.disableUseBoundsForWidth(obtain);
        }
        return obtain.build();
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean isFallbackLineSpacingEnabled(@m80.k StaticLayout staticLayout, boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            return StaticLayoutFactory33.isFallbackLineSpacingEnabled(staticLayout);
        }
        if (i11 >= 28) {
            return z11;
        }
        return false;
    }
}
