package com.baicizhan.client.business.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class DeviceHelper {
    public static final int $stable = 0;

    @m80.k
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final float getScreenPPI(@m80.k Context context) {
            Display defaultDisplay;
            g0.p(context, "context");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = context.getSystemService("window");
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            float f11 = displayMetrics.xdpi;
            float f12 = displayMetrics.ydpi;
            return f11 == f12 ? f11 : (f11 + f12) / 2;
        }

        public final boolean isAppInstalled(@m80.k Context context, @m80.k String packageName) {
            g0.p(context, "context");
            g0.p(packageName, "packageName");
            try {
                context.getPackageManager().getApplicationInfo(packageName, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        private Companion() {
        }
    }
}
