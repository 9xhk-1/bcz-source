package gi;

import android.content.Context;
import com.baicizhan.client.business.util.AuthCallback;
import com.baicizhan.client.business.util.TempStatus;
import com.baicizhan.online.notify.NotifyService;
import com.baicizhan.online.notify.UserRemindInfo;
import com.baicizhan.online.user_study_api.UserLimitInfoV2;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.google.android.material.timepicker.TimeModel;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f53725a = "NoticeManager";

    /* renamed from: b, reason: collision with root package name */
    public static volatile a0 f53726b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f53727a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f53728b;

        public a(final Context val$context, final long val$notifySettingTimeMillis) {
            this.f53727a = val$context;
            this.f53728b = val$notifySettingTimeMillis;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.c(this.f53727a, this.f53728b);
        }
    }

    public static void d(Context context) {
        qb.c.b(f53725a, "cancelAlarm ...", new Object[0]);
    }

    public static a0 g() {
        if (f53726b == null) {
            synchronized (a0.class) {
                try {
                    if (f53726b == null) {
                        f53726b = new a0();
                    }
                } finally {
                }
            }
        }
        return f53726b;
    }

    public static void h(boolean marked) {
        ia.a.l(ia.a.f60472w, marked ? System.currentTimeMillis() : 0L);
    }

    public static void j(Context context, long milliseconds) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliseconds);
        i(context, calendar.get(11), calendar.get(12));
    }

    public static long m(int hour, int minute) {
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(11, hour);
        calendar.set(12, minute);
        calendar.set(13, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        return timeInMillis2 < timeInMillis ? timeInMillis2 + 86400000 : timeInMillis2;
    }

    public final void b(final Context context, final long notifySettingTimeMillis) {
        AuthCallback.post(new a(context, notifySettingTimeMillis));
    }

    public final void c(Context context, long notifySettingTimeMillis) {
        qb.c.b(f53725a, "applyInMainThread " + notifySettingTimeMillis, new Object[0]);
        if (notifySettingTimeMillis > 0) {
            ia.a.l(ia.a.f60455f, notifySettingTimeMillis);
            j(context, notifySettingTimeMillis);
        } else {
            ia.a.l(ia.a.f60455f, 0L);
            d(context);
        }
    }

    public boolean e() {
        return ia.a.a(ia.a.f60456g, false) && f() != 0;
    }

    public long f() {
        return ia.a.d(ia.a.f60455f);
    }

    public void k(final Context context, boolean enable) {
        ia.a.i(ia.a.f60456g, enable);
        if (enable) {
            ia.a.i(ia.a.f60471v, false);
        }
    }

    public void l(final Context context, final long notifySettingTimeMillis) {
        qb.c.i("GAO", TimeModel.f32588i, Long.valueOf(notifySettingTimeMillis));
        ia.a.l(ia.a.f60455f, notifySettingTimeMillis);
        b(context, notifySettingTimeMillis);
    }

    public void n(Context context) {
        UserRemindInfo userRemindInfo;
        try {
            UserStudyApiService.Client client = (UserStudyApiService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/user_study");
            NotifyService.Client client2 = (NotifyService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/notify");
            UserLimitInfoV2 G = q9.x.r().G();
            if (G == null) {
                G = client.user_limit_info_v2();
            }
            if (G == null || (userRemindInfo = client2.get_remind_info()) == null) {
                return;
            }
            k(context, userRemindInfo.isEnable());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            l(context, timeUnit.convert(m(userRemindInfo.getHour(), userRemindInfo.getMinute()), timeUnit));
            TempStatus.sSysRemindStudyOpened = userRemindInfo.isEnable();
            TempStatus.sWXRemindStudyOpened = userRemindInfo.wx_enable;
        } catch (Exception unused) {
            b(context, f());
        }
    }

    public static void i(Context context, int hour, int minute) {
    }
}
