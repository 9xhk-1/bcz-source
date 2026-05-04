package pc;

import android.app.Activity;
import android.content.Context;
import com.igexin.sdk.IUserLoggerInterface;
import com.igexin.sdk.PushManager;
import oc.d;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f80332a = "getui_push";

    @Override // oc.d
    public void a(Activity activity, oc.a appParam) {
        PushManager.getInstance().setDebugLogger(activity.getApplicationContext(), new IUserLoggerInterface() { // from class: pc.a
            @Override // com.igexin.sdk.IUserLoggerInterface
            public final void log(String str) {
                c.i("getui_push", str, new Object[0]);
            }
        });
        PushManager.getInstance().initialize(activity.getApplicationContext());
        c.i("getui_push", "getui", new Object[0]);
    }

    @Override // oc.d
    public boolean c(Context context) {
        return true;
    }

    @Override // oc.d
    public void b(Context context) {
    }
}
