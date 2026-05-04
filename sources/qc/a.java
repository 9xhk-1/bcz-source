package qc;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.push.HmsMessaging;
import oc.d;
import oc.i;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82039a = "huawei_push";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: qc.a$a, reason: collision with other inner class name */
    public class C1015a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f82040a;

        public C1015a(final Activity val$activity) {
            this.f82040a = val$activity;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                String token = HmsInstanceId.getInstance(this.f82040a).getToken(oq.a.b(this.f82040a).getString("client/app_id"), HmsMessaging.DEFAULT_TOKEN_SCOPE);
                c.i("huawei_push", "get token:" + token, new Object[0]);
                if (TextUtils.isEmpty(token)) {
                    return;
                }
                i.f().a("huawei", token);
            } catch (ApiException e11) {
                c.d("huawei_push", "get token failed, " + e11, new Object[0]);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f82042a;

        public b(final Context val$context) {
            this.f82042a = val$context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                HmsInstanceId.getInstance(this.f82042a).deleteToken(oq.a.b(this.f82042a).getString("client/app_id"), HmsMessaging.DEFAULT_TOKEN_SCOPE);
                c.i("huawei_push", "delete token", new Object[0]);
            } catch (ApiException e11) {
                c.c("huawei_push", "delete token ", e11);
            }
        }
    }

    public static int d() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod(ct.d.f46852f, String.class).invoke(cls, "ro.build.hw_emui_api_level");
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            return Integer.parseInt(str);
        } catch (Exception e11) {
            c.c("huawei_push", "", e11);
            return 0;
        }
    }

    @Override // oc.d
    public void a(Activity activity, oc.a appParam) {
        new C1015a(activity).start();
    }

    @Override // oc.d
    public void b(Context context) {
        new b(context).start();
    }

    @Override // oc.d
    public boolean c(Context context) {
        int d11 = d();
        c.i("huawei_push", "code %d, support %b", Integer.valueOf(d11), Boolean.valueOf(d11 > 0));
        return d11 > 0;
    }
}
