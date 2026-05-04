package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes2.dex */
final class StaticLayoutFactory26 {

    @m80.k
    public static final StaticLayoutFactory26 INSTANCE = new StaticLayoutFactory26();

    private StaticLayoutFactory26() {
    }

    @w00.o
    public static final void setJustificationMode(@m80.k StaticLayout.Builder builder, int i11) {
        builder.setJustificationMode(i11);
    }
}
