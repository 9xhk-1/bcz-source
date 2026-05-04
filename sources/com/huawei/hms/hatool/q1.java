package com.huawei.hms.hatool;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class q1 {

    /* renamed from: c, reason: collision with root package name */
    private static q1 f35892c = new q1();

    /* renamed from: a, reason: collision with root package name */
    private boolean f35893a = false;

    /* renamed from: b, reason: collision with root package name */
    private Context f35894b = q0.i();

    private q1() {
    }

    public static q1 b() {
        return f35892c;
    }

    @TargetApi(24)
    public boolean a() {
        if (!this.f35893a) {
            Context context = this.f35894b;
            if (context == null) {
                return false;
            }
            UserManager userManager = (UserManager) context.getSystemService("user");
            if (userManager != null) {
                this.f35893a = userManager.isUserUnlocked();
            } else {
                this.f35893a = false;
            }
        }
        return this.f35893a;
    }
}
