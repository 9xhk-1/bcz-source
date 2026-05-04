package tc;

import android.app.Activity;
import android.content.Context;
import com.baicizhan.framework.push.mipush.MiReceiver;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Logger;
import com.xiaomi.mipush.sdk.MiPushClient;
import oc.d;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90431a = "xiaomi_push";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: tc.a$a, reason: collision with other inner class name */
    public class C1198a implements LoggerInterface {
        public C1198a() {
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String content, Throwable t11) {
            c.a("mipush", content, t11);
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String content) {
            c.b("mipush", content, new Object[0]);
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void setTag(String tag) {
        }
    }

    public static void d(Context context, int uid, oc.a appParam) {
        MiReceiver.f17812l = uid;
    }

    @Override // oc.d
    public void a(Activity activity, oc.a appParam) {
        MiPushClient.registerPush(activity.getApplicationContext(), appParam.e(), appParam.f());
        Logger.setLogger(activity.getApplicationContext(), new C1198a());
        c.i("xiaomi_push", "", new Object[0]);
    }

    @Override // oc.d
    public void b(Context activity) {
        MiPushClient.unregisterPush(activity);
        c.i("xiaomi_push", "", new Object[0]);
    }

    @Override // oc.d
    public boolean c(Context context) {
        boolean shouldUseMIUIPush = MiPushClient.shouldUseMIUIPush(context);
        c.i("xiaomi_push", "%b", Boolean.valueOf(shouldUseMIUIPush));
        return shouldUseMIUIPush;
    }
}
