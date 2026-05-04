package androidx.navigation;

import android.view.View;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ViewKt {
    @k
    public static final NavController findNavController(@k View view) {
        g0.p(view, "<this>");
        return Navigation.findNavController(view);
    }
}
