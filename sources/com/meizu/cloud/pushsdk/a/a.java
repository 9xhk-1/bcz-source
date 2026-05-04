package com.meizu.cloud.pushsdk.a;

import android.content.Context;
import com.meizu.cloud.pushsdk.a.b;
import com.meizu.cloud.pushsdk.d.a.c;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import java.util.Map;

/* loaded from: classes7.dex */
public class a {
    public static c a(Context context) {
        c cVar = new c();
        b c11 = c(context);
        Map<String, String> a11 = c11.a();
        Map<String, Object> b11 = c11.b();
        Map<String, Object> c12 = c11.c();
        if (a11.size() > 0) {
            cVar.a(AppIconSetting.DEFAULT_LARGE_ICON, a11);
        }
        if (b11.size() > 0) {
            cVar.a("ai", b11);
        }
        if (c12.size() > 0) {
            cVar.a(AppIconSetting.LARGE_ICON_URL, c12);
        }
        return cVar;
    }

    public static void b(final Context context) {
        com.meizu.cloud.pushsdk.b.c.a.a().execute(new Runnable() { // from class: com.meizu.cloud.pushsdk.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                com.meizu.cloud.pushsdk.a.a.b.a(context).a("POST", null, a.a(context).toString());
            }
        });
    }

    private static b c(Context context) {
        return new b.a().a(context).a();
    }
}
