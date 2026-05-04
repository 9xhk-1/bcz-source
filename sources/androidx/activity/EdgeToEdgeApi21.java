package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.media3.common.C;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes.dex */
final class EdgeToEdgeApi21 extends EdgeToEdgeBase {
    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(@m80.k SystemBarStyle statusBarStyle, @m80.k SystemBarStyle navigationBarStyle, @m80.k Window window, @m80.k View view, boolean z11, boolean z12) {
        g0.p(statusBarStyle, "statusBarStyle");
        g0.p(navigationBarStyle, "navigationBarStyle");
        g0.p(window, "window");
        g0.p(view, "view");
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.addFlags(67108864);
        window.addFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
    }
}
