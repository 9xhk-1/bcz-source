package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.unit.IntSize;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import zb.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidWindowInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidWindowInfo.android.kt\nandroidx/compose/ui/platform/AndroidWindowInfo_androidKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,392:1\n30#2:393\n30#2:397\n80#3:394\n80#3:398\n26#4:395\n26#4:396\n*S KotlinDebug\n*F\n+ 1 AndroidWindowInfo.android.kt\nandroidx/compose/ui/platform/AndroidWindowInfo_androidKt\n*L\n88#1:393\n95#1:397\n88#1:394\n95#1:398\n93#1:395\n94#1:396\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidWindowInfo_androidKt {
    public static final long calculateWindowSize(@m80.k AndroidComposeView androidComposeView) {
        Context context = androidComposeView.getContext();
        Activity findActivity = findActivity(context);
        if (findActivity != null) {
            Rect currentWindowBounds = BoundsHelper.Companion.getInstance().currentWindowBounds(findActivity);
            return IntSize.m5281constructorimpl((currentWindowBounds.height() & 4294967295L) | (currentWindowBounds.width() << 32));
        }
        Configuration configuration = context.getResources().getConfiguration();
        return IntSize.m5281constructorimpl((Math.round(configuration.screenHeightDp * r7) & 4294967295L) | (Math.round(configuration.screenWidthDp * context.getResources().getDisplayMetrics().density) << 32));
    }

    private static final Activity findActivity(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(28)
    @SuppressLint({"BanUncheckedReflection"})
    public static final DisplayCutout getCutoutForDisplay(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (u.a(obj)) {
                return v.a(obj);
            }
        } catch (Exception e11) {
            if (!(e11 instanceof ClassNotFoundException ? true : e11 instanceof NoSuchMethodException ? true : e11 instanceof NoSuchFieldException ? true : e11 instanceof IllegalAccessException ? true : e11 instanceof InvocationTargetException ? true : e11 instanceof InstantiationException)) {
                throw e11;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(b.C1392b.f102488k, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRectSizeFromDisplay(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
