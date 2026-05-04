package vc;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.material.timepicker.TimeModel;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;
import oc.d;
import oc.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f93826a = "vivo_push";

    public static /* synthetic */ void d(PushClient pushClient, int i11) {
        if (i11 == 0) {
            String regId = pushClient.getRegId();
            if (!TextUtils.isEmpty(regId)) {
                i.f().a("vivo", regId);
                qb.c.i("vivo_push", "regId get %s", regId);
            }
        }
        qb.c.i("vivo_push", TimeModel.f32588i, Integer.valueOf(i11));
    }

    @Override // oc.d
    public void a(Activity activity, oc.a appParam) {
        final PushClient pushClient = PushClient.getInstance(activity.getApplicationContext());
        try {
            pushClient.initialize();
            pushClient.turnOnPush(new IPushActionListener() { // from class: vc.b
                @Override // com.vivo.push.IPushActionListener
                public final void onStateChanged(int i11) {
                    c.d(PushClient.this, i11);
                }
            });
        } catch (Exception e11) {
            qb.c.c("vivo_push", "", e11);
        }
    }

    @Override // oc.d
    public void b(Context context) {
        PushClient.getInstance(context.getApplicationContext()).turnOffPush(new IPushActionListener() { // from class: vc.a
            @Override // com.vivo.push.IPushActionListener
            public final void onStateChanged(int i11) {
                qb.c.i("vivo_push", TimeModel.f32588i, Integer.valueOf(i11));
            }
        });
    }

    @Override // oc.d
    public boolean c(Context context) {
        boolean isSupport = PushClient.getInstance(context.getApplicationContext()).isSupport();
        qb.c.i("vivo_push", "%b", Boolean.valueOf(isSupport));
        return isSupport;
    }
}
