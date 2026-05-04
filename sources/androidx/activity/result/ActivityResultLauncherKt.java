package androidx.activity.result;

import androidx.core.app.ActivityOptionsCompat;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.j;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ActivityResultLauncherKt {
    public static final void launch(@k ActivityResultLauncher<Void> activityResultLauncher, @l ActivityOptionsCompat activityOptionsCompat) {
        g0.p(activityResultLauncher, "<this>");
        activityResultLauncher.launch(null, activityOptionsCompat);
    }

    public static /* synthetic */ void launch$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            activityOptionsCompat = null;
        }
        launch(activityResultLauncher, activityOptionsCompat);
    }

    @j(name = "launchUnit")
    public static final void launchUnit(@k ActivityResultLauncher<g2> activityResultLauncher, @l ActivityOptionsCompat activityOptionsCompat) {
        g0.p(activityResultLauncher, "<this>");
        activityResultLauncher.launch(g2.f100423a, activityOptionsCompat);
    }

    public static /* synthetic */ void launchUnit$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            activityOptionsCompat = null;
        }
        launchUnit(activityResultLauncher, activityOptionsCompat);
    }
}
