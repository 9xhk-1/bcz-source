package com.zx.a.I8b7;

import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class p0 implements k0 {
    @Override // com.zx.a.I8b7.k0
    public void a(int i11, String str, String str2) {
        if (i11 == 1) {
            Log.v(str, str2);
            return;
        }
        if (i11 == 2) {
            Log.d(str, str2);
            return;
        }
        if (i11 == 3) {
            Log.i(str, str2);
        } else if (i11 == 4) {
            Log.w(str, str2);
        } else {
            if (i11 != 5) {
                return;
            }
            Log.e(str, str2);
        }
    }
}
