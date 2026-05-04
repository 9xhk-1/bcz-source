package uc;

import android.app.Activity;
import android.content.Context;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.callback.ICallBackResultService;
import oc.d;
import oc.i;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f92118a = "oppo_push";

    /* renamed from: b, reason: collision with root package name */
    public static ICallBackResultService f92119b = new C1234a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: uc.a$a, reason: collision with other inner class name */
    public class C1234a implements ICallBackResultService {
        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onError(int i11, String s11) {
            c.d("oppo_push", "error %d, %s", Integer.valueOf(i11), s11);
        }

        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onGetNotificationStatus(final int code, final int status) {
            if (code == 0 && status == 0) {
                c.i("oppo_push", "通知状态正常,code=" + code + ",status=" + status, new Object[0]);
                return;
            }
            c.i("oppo_push", "通知状态错误,code=" + code + ",status=" + status, new Object[0]);
        }

        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onGetPushStatus(final int code, int status) {
            if (code == 0 && status == 0) {
                c.i("oppo_push", "Push状态正常,code=" + code + ",status=" + status, new Object[0]);
                return;
            }
            c.i("oppo_push", "Push状态错误,code=" + code + ",status=" + status, new Object[0]);
        }

        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onRegister(int code, String s11) {
            if (code == 0) {
                c.i("oppo_push", "注册成功,registerId:" + s11, new Object[0]);
                i.f().a("oppo", s11);
                return;
            }
            c.i("oppo_push", "注册失败,code=" + code + ",msg=" + s11, new Object[0]);
        }

        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onSetPushTime(final int code, final String s11) {
            c.i("oppo_push", "SetPushTime,code=" + code + ",result:" + s11, new Object[0]);
        }

        @Override // com.heytap.msp.push.callback.ICallBackResultService
        public void onUnRegister(int code) {
            if (code == 0) {
                c.i("oppo_push", "注销成功,code=" + code, new Object[0]);
                return;
            }
            c.i("oppo_push", "注销失败,code=" + code, new Object[0]);
        }
    }

    @Override // oc.d
    public void a(Activity activity, oc.a appParam) {
        try {
            HeytapPushManager.register(activity.getApplicationContext(), appParam.c(), appParam.d(), f92119b);
        } catch (Exception e11) {
            c.c("oppo_push", "", e11);
        }
        c.i("oppo_push", "", new Object[0]);
    }

    @Override // oc.d
    public void b(Context activity) {
        if (HeytapPushManager.isSupportPush(activity.getApplicationContext())) {
            HeytapPushManager.unRegister();
        }
        c.i("oppo_push", "", new Object[0]);
    }

    @Override // oc.d
    public boolean c(Context context) {
        boolean isSupportPush = HeytapPushManager.isSupportPush(context);
        c.i("oppo_push", "Support = %b", Boolean.valueOf(isSupportPush));
        return isSupportPush;
    }
}
