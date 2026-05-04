package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.RequiresApi;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(31)
/* loaded from: classes.dex */
final class Api31Impl {

    @m80.k
    public static final Api31Impl INSTANCE = new Api31Impl();

    private Api31Impl() {
    }

    @m80.k
    public final EdgeEffect create(@m80.k Context context, @l AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float getDistance(@m80.k EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float onPullDistance(@m80.k EdgeEffect edgeEffect, float f11, float f12) {
        try {
            return edgeEffect.onPullDistance(f11, f12);
        } catch (Throwable unused) {
            edgeEffect.onPull(f11, f12);
            return 0.0f;
        }
    }
}
