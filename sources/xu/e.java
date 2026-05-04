package xu;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    public static Object a(Context context) {
        ComponentCallbacks2 a11 = tu.a.a(context.getApplicationContext());
        gv.f.a(a11 instanceof gv.c, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", a11.getClass());
        return ((gv.c) a11).generatedComponent();
    }
}
