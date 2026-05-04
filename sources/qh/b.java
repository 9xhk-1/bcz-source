package qh;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.n;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.debug.DebugConfig;
import com.baicizhan.framework.push.meizu.MeizuReceiver;
import com.igexin.sdk.IUserLoggerInterface;
import com.igexin.sdk.PushManager;
import com.jiongji.andriod.card.R;
import oc.g;
import q9.x;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82182a = "PushIniter";

    /* renamed from: b, reason: collision with root package name */
    public static final String f82183b = "1008323";

    /* renamed from: c, reason: collision with root package name */
    public static final String f82184c = "180100853323";

    /* renamed from: d, reason: collision with root package name */
    public static final String f82185d = "111608";

    /* renamed from: e, reason: collision with root package name */
    public static final String f82186e = "1ec45ab76c2e4073a47f2a2f0261af75";

    /* renamed from: f, reason: collision with root package name */
    public static final String f82187f = "EP6tnoRicnk80w4ksgWO08o4w";

    /* renamed from: g, reason: collision with root package name */
    public static final String f82188g = "071a3287d98A61A0F91eAb1323B9E3ce";

    /* renamed from: h, reason: collision with root package name */
    public static final String f82189h = "bcz_study_remainder_01";

    /* renamed from: i, reason: collision with root package name */
    public static final String f82190i = "bcz_study_reminder";

    public static void b(Context context, int userId) {
        if (g.e()) {
            g.b(context, userId);
        }
    }

    public static void c(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                d(context, context.getString(R.string.push_channel_name_remainder), context.getString(R.string.push_channel_des_remainder), f82190i);
                d(context, context.getString(R.string.push_channel_name_ad), context.getString(R.string.push_channel_name_remainder), f82189h);
            }
        } catch (Exception e11) {
            c.c(f82182a, "", e11);
        }
    }

    @RequiresApi(api = 26)
    public static void d(Context context, String name, String description, String channelId) {
        NotificationChannel a11 = n.a(channelId, name, 3);
        a11.setDescription(description);
        a11.enableLights(true);
        a11.setLockscreenVisibility(1);
        a11.setShowBadge(true);
        a11.setBypassDnd(true);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(a11);
    }

    public static void e(Activity context) {
        c.i(f82182a, "init", new Object[0]);
        c(context);
        g.a(com.baicizhan.main.push.message.a.f());
        UserRecord p11 = x.r().p();
        if (p11 == null) {
            c.d(f82182a, "error user == null", new Object[0]);
            return;
        }
        oc.a aVar = new oc.a();
        aVar.k(f82183b);
        aVar.l(f82184c);
        aVar.g(f82185d);
        aVar.h(f82186e);
        aVar.i(f82187f);
        aVar.j(f82188g);
        MeizuReceiver.f(R.drawable.business_baicizhan);
        g.d(context, aVar);
        if (DebugConfig.getsIntance().enable) {
            PushManager.getInstance().setDebugLogger(context.getApplicationContext(), new IUserLoggerInterface() { // from class: qh.a
                @Override // com.igexin.sdk.IUserLoggerInterface
                public final void log(String str) {
                    c.b(b.f82182a, str, new Object[0]);
                }
            });
        }
        g.b(context, p11.getUniqueId());
    }

    public static void f() {
        c.i(f82182a, "onProcessBoot", new Object[0]);
        g.a(com.baicizhan.main.push.message.a.f());
    }

    public static void g(Context context) {
        g.g(context);
    }

    public static void h(Context context) {
        c.i(f82182a, "unInit", new Object[0]);
        g.h(context);
    }
}
