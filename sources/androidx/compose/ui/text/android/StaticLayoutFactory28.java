package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes2.dex */
final class StaticLayoutFactory28 {

    @m80.k
    public static final StaticLayoutFactory28 INSTANCE = new StaticLayoutFactory28();

    private StaticLayoutFactory28() {
    }

    @w00.o
    public static final void setUseLineSpacingFromFallbacks(@m80.k StaticLayout.Builder builder, boolean z11) {
        builder.setUseLineSpacingFromFallbacks(z11);
    }
}
