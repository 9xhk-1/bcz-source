package rc;

import android.app.Activity;
import android.content.Context;
import com.baicizhan.framework.push.meizu.MeizuReceiver;
import com.meizu.cloud.pushsdk.PushManager;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import oc.d;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f83948a = "meizu_push";

    @Override // oc.d
    public void a(Activity activity, oc.a appParam) {
        MeizuReceiver.d(appParam.a());
        MeizuReceiver.e(appParam.b());
        PushManager.register(activity.getApplication(), appParam.a(), appParam.b());
    }

    @Override // oc.d
    public void b(Context context) {
        MeizuReceiver.h(context);
        PushManager.unRegister(context.getApplicationContext(), MeizuReceiver.a(), MeizuReceiver.b());
    }

    @Override // oc.d
    public boolean c(Context context) {
        boolean isBrandMeizu = MzSystemUtils.isBrandMeizu(context);
        c.i("meizu_push", "support = %b", Boolean.valueOf(isBrandMeizu));
        return isBrandMeizu;
    }
}
