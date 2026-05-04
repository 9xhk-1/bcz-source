package androidx.activity.result;

import android.content.Intent;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ActivityResultKt {
    public static final int component1(@k ActivityResult activityResult) {
        g0.p(activityResult, "<this>");
        return activityResult.getResultCode();
    }

    @l
    public static final Intent component2(@k ActivityResult activityResult) {
        g0.p(activityResult, "<this>");
        return activityResult.getData();
    }
}
