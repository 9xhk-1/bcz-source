package com.alipay.sdk.m.i0;

import android.content.BroadcastReceiver;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e extends BroadcastReceiver {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
    
        if (r0 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (android.text.TextUtils.equals(r6.getStringExtra("openIdPackage"), r5.getPackageName()) != false) goto L16;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L85
            if (r6 != 0) goto L6
            goto L85
        L6:
            java.lang.String r0 = "openIdNotifyFlag"
            r1 = 0
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "shouldUpdateId, notifyFlag : "
            java.lang.String r2 = r3.concat(r2)
            com.alipay.sdk.m.i0.f.a(r2)
            r2 = 1
            if (r0 != r2) goto L2e
            java.lang.String r0 = "openIdPackage"
            java.lang.String r0 = r6.getStringExtra(r0)
            java.lang.String r5 = r5.getPackageName()
            boolean r5 = android.text.TextUtils.equals(r0, r5)
            if (r5 == 0) goto L45
            goto L44
        L2e:
            r3 = 2
            if (r0 != r3) goto L42
            java.lang.String r0 = "openIdPackageList"
            java.util.ArrayList r0 = r6.getStringArrayListExtra(r0)
            if (r0 == 0) goto L45
            java.lang.String r5 = r5.getPackageName()
            boolean r1 = r0.contains(r5)
            goto L45
        L42:
            if (r0 != 0) goto L45
        L44:
            r1 = r2
        L45:
            if (r1 != 0) goto L48
            goto L85
        L48:
            java.lang.String r5 = "openIdType"
            java.lang.String r5 = r6.getStringExtra(r5)
            com.alipay.sdk.m.i0.f r6 = com.alipay.sdk.m.i0.f.a()
            java.lang.String r0 = "oaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L5d
            com.alipay.sdk.m.i0.a r5 = r6.f10597b
            goto L7f
        L5d:
            java.lang.String r0 = "vaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L68
            com.alipay.sdk.m.i0.a r5 = r6.f10599d
            goto L7f
        L68:
            java.lang.String r0 = "aaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L73
            com.alipay.sdk.m.i0.a r5 = r6.f10598c
            goto L7f
        L73:
            java.lang.String r0 = "udid"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L7e
            com.alipay.sdk.m.i0.a r5 = r6.f10596a
            goto L7f
        L7e:
            r5 = 0
        L7f:
            if (r5 != 0) goto L82
            goto L85
        L82:
            r5.b()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.i0.e.onReceive(android.content.Context, android.content.Intent):void");
    }
}
