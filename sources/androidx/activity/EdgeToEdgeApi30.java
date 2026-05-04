package androidx.activity;

import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
/* loaded from: classes.dex */
final class EdgeToEdgeApi30 extends EdgeToEdgeApi29 {
    @Override // androidx.activity.EdgeToEdgeApi28, androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void adjustLayoutInDisplayCutoutMode(@m80.k Window window) {
        g0.p(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
