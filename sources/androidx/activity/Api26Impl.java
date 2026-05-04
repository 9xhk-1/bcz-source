package androidx.activity;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes.dex */
public final class Api26Impl {

    @m80.k
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    public final void setPipParamsSourceRectHint(@m80.k Activity activity, @m80.k Rect hint) {
        g0.p(activity, "activity");
        g0.p(hint, "hint");
        activity.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(hint).build());
    }
}
