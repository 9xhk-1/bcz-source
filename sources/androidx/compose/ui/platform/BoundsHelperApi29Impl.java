package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes2.dex */
final class BoundsHelperApi29Impl implements BoundsHelper {

    @m80.k
    public static final BoundsHelperApi29Impl INSTANCE = new BoundsHelperApi29Impl();

    private BoundsHelperApi29Impl() {
    }

    @Override // androidx.compose.ui.platform.BoundsHelper
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @m80.k
    public Rect currentWindowBounds(@m80.k Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (Exception e11) {
            if (e11 instanceof NoSuchFieldException ? true : e11 instanceof NoSuchMethodException ? true : e11 instanceof IllegalAccessException ? true : e11 instanceof InvocationTargetException) {
                return BoundsHelperApi28Impl.INSTANCE.currentWindowBounds(activity);
            }
            throw e11;
        }
    }
}
