package gi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f53834a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f53835b = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final float a(@m80.k Context context) {
            Display defaultDisplay;
            kotlin.jvm.internal.g0.p(context, "context");
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

        public final boolean b(@m80.k Context context, @m80.k String packageName) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(packageName, "packageName");
            try {
                context.getPackageManager().getApplicationInfo(packageName, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        public a() {
        }
    }
}
