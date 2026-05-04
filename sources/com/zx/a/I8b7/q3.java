package com.zx.a.I8b7;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.zx.a.I8b7.e1;
import com.zx.a.I8b7.l2;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class q3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t3 f46670a;

    public q3(t3 t3Var) {
        this.f46670a = t3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        e1 e1Var = e1.a.f46499a;
        try {
            e1Var.f46496a = System.currentTimeMillis();
            e1Var.f46497b = UUID.randomUUID().toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            l2 l2Var = l2.a.f46573a;
            String a11 = l2Var.f46572a.a(24);
            if (!TextUtils.isEmpty(a11)) {
                e1Var.f46498c = Integer.parseInt(a11);
            }
            e1Var.f46498c++;
            u3 u3Var = l2Var.f46572a;
            String str = e1Var.f46498c + "";
            u3Var.getClass();
            l2Var.f46572a.a(24, str, true);
            r2.a("process start pts:" + e1Var.f46496a + ", pid:" + e1Var.f46497b + ", rc:" + e1Var.f46498c);
        } catch (Throwable th2) {
            r2.a(th2);
        }
        if (!this.f46670a.f46703b.get()) {
            throw new IllegalStateException("ZXSdkImpl not init, should init firstly");
        }
        try {
            t3.a(this.f46670a);
        } catch (Throwable th3) {
            this.f46670a.f46704c.onMessage("MESSAGE_ON_ZXID_RECEIVED", e2.a(10000, th3.getMessage()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ZXCore start failed: ");
            g3.a(th3, sb2);
        }
    }
}
