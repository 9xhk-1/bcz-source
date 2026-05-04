package com.huawei.hms.hatool;

import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f35867a = false;

    /* renamed from: b, reason: collision with root package name */
    private int f35868b = 4;

    private static String a() {
        return "FormalHASDK_2.2.0.314" + p.a();
    }

    public void b(int i11, String str, String str2) {
        a(i11, "FormalHASDK", str + "=> " + str2);
    }

    public void a(int i11) {
        Log.i("FormalHASDK", System.lineSeparator() + "======================================= " + System.lineSeparator() + a() + "" + System.lineSeparator() + "=======================================");
        this.f35868b = i11;
        this.f35867a = true;
    }

    public boolean b(int i11) {
        return this.f35867a && i11 >= this.f35868b;
    }

    public void a(int i11, String str, String str2) {
        if (i11 == 3) {
            Log.d(str, str2);
            return;
        }
        if (i11 == 5) {
            Log.w(str, str2);
        } else if (i11 != 6) {
            Log.i(str, str2);
        } else {
            Log.e(str, str2);
        }
    }
}
