package io.openinstall.sdk;

import android.net.Uri;
import android.text.TextUtils;
import io.openinstall.sdk.az;
import java.util.HashMap;
import tz.c0;
import tz.j0;
import tz.q0;

/* loaded from: classes8.dex */
public class n extends c0 {

    /* renamed from: j, reason: collision with root package name */
    public final Uri f62625j;

    public n(q0 q0Var, Uri uri) {
        super(q0Var);
        this.f62625j = uri;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f91247f.h()) {
            if (j0.f91313a) {
                j0.a("wakeupStatsEnabled is disable", new Object[0]);
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        Uri uri = this.f62625j;
        if (uri != null) {
            hashMap.put("ul", uri.toString());
        }
        az h11 = this.f91249h.h(hashMap);
        a(h11.k());
        if (h11.a() != az.a.SUCCESS) {
            if (j0.f91313a) {
                j0.c("statWakeup fail : %s", h11.g());
            }
        } else {
            if (j0.f91313a) {
                j0.a("statWakeup success", new Object[0]);
            }
            if (TextUtils.isEmpty(h11.g()) || !j0.f91313a) {
                return;
            }
            j0.b("statWakeup warning : %s", h11.g());
        }
    }
}
