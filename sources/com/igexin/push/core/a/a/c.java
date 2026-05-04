package com.igexin.push.core.a.a;

import android.os.Message;
import android.text.TextUtils;
import com.igexin.push.core.d;
import com.igexin.push.core.e.f.AnonymousClass1;
import com.igexin.push.core.e.f.AnonymousClass17;
import com.igexin.push.core.k;
import com.igexin.push.core.l;
import com.igexin.push.d.c;
import com.igexin.push.f.b.d;
import com.igexin.push.g.j;
import com.igexin.sdk.main.FeedbackImpl;
import com.igexin.sdk.router.GTBoater;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class c extends com.igexin.push.core.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f37649b = "LoginResult";

    /* renamed from: com.igexin.push.core.a.a.c$1, reason: invalid class name */
    public class AnonymousClass1 extends com.igexin.push.f.d {
        public AnonymousClass1() {
        }

        @Override // com.igexin.push.f.d
        public final void b() {
            try {
                com.igexin.push.core.e.d a11 = com.igexin.push.core.e.d.a(com.igexin.push.core.e.f38035l);
                JSONObject a12 = a11.a();
                if (a12 == null) {
                    return;
                }
                Iterator<String> keys = a12.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject = a12.getJSONObject(next);
                    com.igexin.c.a.c.a.a("LoginResult|send unFeedback taskid = ".concat(String.valueOf(next)), new Object[0]);
                    jSONObject.put("appid", com.igexin.push.core.e.f37998a);
                    FeedbackImpl.getInstance().feedbackMultiBrandMessageAction(jSONObject, jSONObject.getString("multaid"));
                    keys.remove();
                }
                a11.b();
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.b(c.f37649b, "feedbackMultiBrandPushMessage exception :" + th2.toString());
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }

    private void d() {
        com.igexin.c.a.c.a.d.a().a("[LoginResult] Login successed with cid = " + com.igexin.push.core.e.A);
        com.igexin.push.d.c cVar = c.b.f38428a;
        cVar.f38398c = System.currentTimeMillis();
        if (cVar.f38397b) {
            com.igexin.c.a.c.a.a(com.igexin.push.d.c.f38394a, "loginRsp| enter polling");
            cVar.f38400e = new com.igexin.push.d.e();
            d.a.f38568a.g();
            cVar.f38399d = 0;
        } else {
            cVar.b();
        }
        String str = com.igexin.push.core.e.A;
        boolean z11 = com.igexin.push.core.e.f38045v;
        com.igexin.c.a.c.a.a("loginRsp|" + com.igexin.push.core.e.A + "|success", new Object[0]);
        StringBuilder sb2 = new StringBuilder("isCidBroadcasted|");
        sb2.append(com.igexin.push.core.e.f38045v);
        com.igexin.c.a.c.a.a(sb2.toString(), new Object[0]);
        if (!com.igexin.push.core.e.f38045v) {
            l.a().c();
            com.igexin.push.core.e.f38045v = true;
        }
        com.igexin.push.core.e.f38044u = true;
        j.g();
        l.a().b();
        com.igexin.push.core.a.b.d();
        com.igexin.push.core.a.b.g();
        if (TextUtils.isEmpty(com.igexin.push.core.e.H)) {
            com.igexin.c.a.c.a.a("LoginResult device id is empty, get device id from server +++++", new Object[0]);
            com.igexin.push.core.a.b.d();
            com.igexin.push.core.a.b.h();
        }
        com.igexin.push.core.c.a.a().a(true);
        long currentTimeMillis = System.currentTimeMillis() - com.igexin.push.core.e.Q;
        com.igexin.c.a.c.a.a("LoginResult|lastAddphoneinfoTime: " + com.igexin.push.core.e.Q, new Object[0]);
        boolean z12 = currentTimeMillis - 86400000 > 0;
        boolean a11 = com.igexin.c.b.a.a(com.igexin.push.core.e.K, com.igexin.push.core.e.I);
        boolean z13 = !a11;
        boolean equals = com.igexin.push.core.e.A.equals(com.igexin.push.core.e.B);
        boolean z14 = !equals;
        boolean b11 = com.igexin.push.g.c.b(com.igexin.push.core.e.f38035l);
        boolean z15 = com.igexin.push.core.e.J != b11;
        if (z15) {
            com.igexin.push.core.e.f a12 = com.igexin.push.core.e.f.a();
            if (com.igexin.push.core.e.J != b11) {
                com.igexin.push.core.e.J = b11 ? 1 : 0;
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a12.new AnonymousClass17(), false, true);
            }
        }
        boolean z16 = com.igexin.push.core.e.aM;
        com.igexin.c.a.c.a.a("LoginResult|PHONE_INFO_DATA_CHANGE= " + com.igexin.push.core.e.aM + ", isOverOneDay = " + z12 + ", isDeviceTokenDiff = " + z13 + ", isCidDiff = " + z14 + ", isNotificationEnableDiff= " + z15, new Object[0]);
        if (com.igexin.push.core.e.aM || z12 || !a11 || !equals || z15) {
            com.igexin.push.core.a.b.d().i();
        }
        com.igexin.push.core.c.a.a();
        com.igexin.push.core.c.a.b();
        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.core.e.f.a().new AnonymousClass1(), false, true);
        if (!com.igexin.push.core.e.A.equals(com.igexin.push.core.e.B)) {
            com.igexin.push.core.e.B = com.igexin.push.core.e.A;
        }
        Message obtain = Message.obtain();
        obtain.what = com.igexin.push.core.b.W;
        obtain.obj = new Object();
        d.a.f37956a.a(obtain);
        GTBoater.getInstance().initialize();
        if (com.igexin.assist.sdk.a.a().c()) {
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass1(), false, true);
        }
    }

    private static void e() {
        long currentTimeMillis = System.currentTimeMillis() - com.igexin.push.core.e.Q;
        com.igexin.c.a.c.a.a("LoginResult|lastAddphoneinfoTime: " + com.igexin.push.core.e.Q, new Object[0]);
        boolean z11 = currentTimeMillis - 86400000 > 0;
        boolean a11 = com.igexin.c.b.a.a(com.igexin.push.core.e.K, com.igexin.push.core.e.I);
        boolean z12 = !a11;
        boolean equals = com.igexin.push.core.e.A.equals(com.igexin.push.core.e.B);
        boolean z13 = !equals;
        boolean b11 = com.igexin.push.g.c.b(com.igexin.push.core.e.f38035l);
        boolean z14 = com.igexin.push.core.e.J != b11;
        if (z14) {
            com.igexin.push.core.e.f a12 = com.igexin.push.core.e.f.a();
            if (com.igexin.push.core.e.J != b11) {
                com.igexin.push.core.e.J = b11 ? 1 : 0;
                com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a12.new AnonymousClass17(), false, true);
            }
        }
        boolean z15 = com.igexin.push.core.e.aM;
        com.igexin.c.a.c.a.a("LoginResult|PHONE_INFO_DATA_CHANGE= " + com.igexin.push.core.e.aM + ", isOverOneDay = " + z11 + ", isDeviceTokenDiff = " + z12 + ", isCidDiff = " + z13 + ", isNotificationEnableDiff= " + z14, new Object[0]);
        if (com.igexin.push.core.e.aM || z11 || !a11 || !equals || z14) {
            com.igexin.push.core.a.b.d().i();
        }
    }

    private static void f() {
        com.igexin.c.a.c.a.d.a().a("[LoginResult] Login " + com.igexin.push.core.e.A + " failed");
        com.igexin.c.a.c.a.a(f37649b, "login failed, clear session or cid");
        com.igexin.c.a.c.a.a("LoginResult login failed, clear session or cid", new Object[0]);
        com.igexin.push.core.e.f.a().b();
        k.a();
        k.c();
    }

    private static void g() {
        if (com.igexin.push.core.e.A.equals(com.igexin.push.core.e.B)) {
            return;
        }
        com.igexin.push.core.e.B = com.igexin.push.core.e.A;
    }

    private void h() {
        if (com.igexin.assist.sdk.a.a().c()) {
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass1(), false, true);
        }
    }

    @Override // com.igexin.push.core.a.a
    public final void a() {
    }

    @Override // com.igexin.push.core.a.a
    public final boolean c() {
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public final boolean a(Object obj) {
        if (obj instanceof com.igexin.push.d.c.k) {
            com.igexin.push.core.e.b(0L);
            if (!com.igexin.push.core.e.f38044u) {
                com.igexin.push.c.c.a().d().e();
                if (((com.igexin.push.d.c.k) obj).f38482b) {
                    com.igexin.c.a.c.a.d.a().a("[LoginResult] Login successed with cid = " + com.igexin.push.core.e.A);
                    com.igexin.push.d.c cVar = c.b.f38428a;
                    cVar.f38398c = System.currentTimeMillis();
                    if (cVar.f38397b) {
                        com.igexin.c.a.c.a.a(com.igexin.push.d.c.f38394a, "loginRsp| enter polling");
                        cVar.f38400e = new com.igexin.push.d.e();
                        d.a.f38568a.g();
                        cVar.f38399d = 0;
                    } else {
                        cVar.b();
                    }
                    String str = com.igexin.push.core.e.A;
                    boolean z11 = com.igexin.push.core.e.f38045v;
                    com.igexin.c.a.c.a.a("loginRsp|" + com.igexin.push.core.e.A + "|success", new Object[0]);
                    StringBuilder sb2 = new StringBuilder("isCidBroadcasted|");
                    sb2.append(com.igexin.push.core.e.f38045v);
                    com.igexin.c.a.c.a.a(sb2.toString(), new Object[0]);
                    if (!com.igexin.push.core.e.f38045v) {
                        l.a().c();
                        com.igexin.push.core.e.f38045v = true;
                    }
                    com.igexin.push.core.e.f38044u = true;
                    j.g();
                    l.a().b();
                    com.igexin.push.core.a.b.d();
                    com.igexin.push.core.a.b.g();
                    if (TextUtils.isEmpty(com.igexin.push.core.e.H)) {
                        com.igexin.c.a.c.a.a("LoginResult device id is empty, get device id from server +++++", new Object[0]);
                        com.igexin.push.core.a.b.d();
                        com.igexin.push.core.a.b.h();
                    }
                    com.igexin.push.core.c.a.a().a(true);
                    long currentTimeMillis = System.currentTimeMillis() - com.igexin.push.core.e.Q;
                    com.igexin.c.a.c.a.a("LoginResult|lastAddphoneinfoTime: " + com.igexin.push.core.e.Q, new Object[0]);
                    boolean z12 = currentTimeMillis - 86400000 > 0;
                    boolean a11 = com.igexin.c.b.a.a(com.igexin.push.core.e.K, com.igexin.push.core.e.I);
                    boolean z13 = !a11;
                    boolean equals = com.igexin.push.core.e.A.equals(com.igexin.push.core.e.B);
                    boolean z14 = !equals;
                    boolean b11 = com.igexin.push.g.c.b(com.igexin.push.core.e.f38035l);
                    boolean z15 = com.igexin.push.core.e.J != b11;
                    if (z15) {
                        com.igexin.push.core.e.f a12 = com.igexin.push.core.e.f.a();
                        if (com.igexin.push.core.e.J != b11) {
                            com.igexin.push.core.e.J = b11 ? 1 : 0;
                            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) a12.new AnonymousClass17(), false, true);
                        }
                    }
                    boolean z16 = com.igexin.push.core.e.aM;
                    com.igexin.c.a.c.a.a("LoginResult|PHONE_INFO_DATA_CHANGE= " + com.igexin.push.core.e.aM + ", isOverOneDay = " + z12 + ", isDeviceTokenDiff = " + z13 + ", isCidDiff = " + z14 + ", isNotificationEnableDiff= " + z15, new Object[0]);
                    if (com.igexin.push.core.e.aM || z12 || !a11 || !equals || z15) {
                        com.igexin.push.core.a.b.d().i();
                    }
                    com.igexin.push.core.c.a.a();
                    com.igexin.push.core.c.a.b();
                    com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.core.e.f.a().new AnonymousClass1(), false, true);
                    if (!com.igexin.push.core.e.A.equals(com.igexin.push.core.e.B)) {
                        com.igexin.push.core.e.B = com.igexin.push.core.e.A;
                    }
                    Message obtain = Message.obtain();
                    obtain.what = com.igexin.push.core.b.W;
                    obtain.obj = new Object();
                    d.a.f37956a.a(obtain);
                    GTBoater.getInstance().initialize();
                    if (com.igexin.assist.sdk.a.a().c()) {
                        com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) new AnonymousClass1(), false, true);
                    }
                } else {
                    com.igexin.c.a.c.a.d.a().a("[LoginResult] Login " + com.igexin.push.core.e.A + " failed");
                    com.igexin.c.a.c.a.a(f37649b, "login failed, clear session or cid");
                    com.igexin.c.a.c.a.a("LoginResult login failed, clear session or cid", new Object[0]);
                    com.igexin.push.core.e.f.a().b();
                    k.a();
                    k.c();
                }
            }
        }
        return true;
    }

    @Override // com.igexin.push.core.a.a
    public final void b() {
    }
}
