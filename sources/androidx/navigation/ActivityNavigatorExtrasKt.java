package androidx.navigation;

import androidx.core.app.ActivityOptionsCompat;
import androidx.navigation.ActivityNavigator;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ActivityNavigatorExtrasKt {
    @k
    public static final ActivityNavigator.Extras ActivityNavigatorExtras(@l ActivityOptionsCompat activityOptionsCompat, int i11) {
        ActivityNavigator.Extras.Builder builder = new ActivityNavigator.Extras.Builder();
        if (activityOptionsCompat != null) {
            builder.setActivityOptions(activityOptionsCompat);
        }
        builder.addFlags(i11);
        return builder.build();
    }

    public static /* synthetic */ ActivityNavigator.Extras ActivityNavigatorExtras$default(ActivityOptionsCompat activityOptionsCompat, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            activityOptionsCompat = null;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return ActivityNavigatorExtras(activityOptionsCompat, i11);
    }
}
