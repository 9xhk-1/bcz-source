package ai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.framework.common.magicdialog.Action;
import com.jiongji.andriod.card.R;
import gi.v;
import i9.f;
import java.util.HashMap;
import kc.u;
import ma.l;
import ma.t;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2663a = "NotificationHelper";

    /* renamed from: b, reason: collision with root package name */
    public static final String f2664b = "key_show_notification_setting";

    public static /* synthetic */ g2 a(Context context, View view) {
        b(context);
        return null;
    }

    public static void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra(NotificationCompat.EXTRA_CHANNEL_ID, context.getApplicationInfo().uid);
            context.startActivity(intent);
        } catch (Exception e11) {
            qb.c.c(f2663a, "", e11);
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent2);
        }
    }

    public static boolean c(final Context context) {
        if (context == null || v.c(4096)) {
            return false;
        }
        int i11 = Build.VERSION.SDK_INT;
        return (i11 >= 33 || (DeviceUtil.isOppo() && i11 >= 26)) && !NotificationManagerCompat.from(context).areNotificationsEnabled();
    }

    public static void d(Context context) {
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        HashMap hashMap = new HashMap();
        hashMap.put("status", from.areNotificationsEnabled() ? "1" : "0");
        l.e(t.A, ma.a.f72758h3, hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [kc.d, kc.h] */
    public static void e(final Context context) {
        if (c(context)) {
            if (DeviceUtil.isOppo()) {
                mc.a.m((FragmentActivity) context, ((u.a) new u.a(context).L(R.string.dialog_notification_open_title).U(R.string.dialog_notification_open_content).E(R.string.dialog_notification_open_confirm, Action.RECOMMENDED, new x00.l() { // from class: ai.c
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        return d.a(context, (View) obj);
                    }
                })).d());
            } else {
                if (!(context instanceof Activity) || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                ActivityCompat.requestPermissions((Activity) context, new String[]{"android.permission.POST_NOTIFICATIONS"}, 123);
            }
        }
    }

    public static void f(Context context) {
        e(context);
    }

    public static void g(Context context) {
        if (!f.c(context, f2664b)) {
            e(context);
            f.j(context, f2664b, true);
        }
        d(context);
    }
}
