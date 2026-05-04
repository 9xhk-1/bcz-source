package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(35)
/* loaded from: classes2.dex */
final class StaticLayoutFactory35 {

    @m80.k
    public static final StaticLayoutFactory35 INSTANCE = new StaticLayoutFactory35();

    private StaticLayoutFactory35() {
    }

    @w00.o
    public static final void disableUseBoundsForWidth(@m80.k StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }
}
