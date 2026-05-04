package androidx.navigation;

import android.app.Activity;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ActivityKt {
    @k
    public static final NavController findNavController(@k Activity activity, @IdRes int i11) {
        g0.p(activity, "<this>");
        return Navigation.findNavController(activity, i11);
    }
}
