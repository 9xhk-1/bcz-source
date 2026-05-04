package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.hm;
import com.xiaomi.push.service.ba;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class f implements AbstractPushManager {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f45218a;

    /* renamed from: a, reason: collision with other field name */
    private Context f110a;

    /* renamed from: a, reason: collision with other field name */
    private PushConfiguration f111a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f113a = false;

    /* renamed from: a, reason: collision with other field name */
    private Map<e, AbstractPushManager> f112a = new HashMap();

    private f(Context context) {
        this.f110a = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r3 != 4) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(com.xiaomi.mipush.sdk.e r3) {
        /*
            r2 = this;
            int[] r0 = com.xiaomi.mipush.sdk.h.f45220a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L31
            r0 = 2
            if (r3 == r0) goto L28
            r0 = 3
            if (r3 == r0) goto L16
            r0 = 4
            if (r3 == r0) goto L1e
            goto L3a
        L16:
            com.xiaomi.mipush.sdk.PushConfiguration r3 = r2.f111a
            if (r3 == 0) goto L1e
            boolean r1 = r3.getOpenCOSPush()
        L1e:
            com.xiaomi.mipush.sdk.PushConfiguration r3 = r2.f111a
            if (r3 == 0) goto L27
            boolean r3 = r3.getOpenFTOSPush()
            return r3
        L27:
            return r1
        L28:
            com.xiaomi.mipush.sdk.PushConfiguration r3 = r2.f111a
            if (r3 == 0) goto L3a
            boolean r3 = r3.getOpenFCMPush()
            return r3
        L31:
            com.xiaomi.mipush.sdk.PushConfiguration r3 = r2.f111a
            if (r3 == 0) goto L3a
            boolean r3 = r3.getOpenHmsPush()
            return r3
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.f.b(com.xiaomi.mipush.sdk.e):boolean");
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void register() {
        com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : assemble push register");
        if (this.f112a.size() <= 0) {
            a();
        }
        if (this.f112a.size() > 0) {
            for (AbstractPushManager abstractPushManager : this.f112a.values()) {
                if (abstractPushManager != null) {
                    abstractPushManager.register();
                }
            }
            i.m5703a(this.f110a);
        }
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void unregister() {
        com.xiaomi.channel.commonutils.logger.b.m5639a("ASSEMBLE_PUSH : assemble push unregister");
        for (AbstractPushManager abstractPushManager : this.f112a.values()) {
            if (abstractPushManager != null) {
                abstractPushManager.unregister();
            }
        }
        this.f112a.clear();
    }

    public AbstractPushManager a(e eVar) {
        return this.f112a.get(eVar);
    }

    public static f a(Context context) {
        if (f45218a == null) {
            synchronized (f.class) {
                try {
                    if (f45218a == null) {
                        f45218a = new f(context);
                    }
                } finally {
                }
            }
        }
        return f45218a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.f.a():void");
    }

    public void a(PushConfiguration pushConfiguration) {
        this.f111a = pushConfiguration;
        this.f113a = ba.a(this.f110a).a(hm.AggregatePushSwitch.a(), true);
        if (this.f111a.getOpenHmsPush() || this.f111a.getOpenFCMPush() || this.f111a.getOpenCOSPush() || this.f111a.getOpenFTOSPush()) {
            ba.a(this.f110a).a(new g(this, 101, "assemblePush"));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5700a(e eVar) {
        this.f112a.remove(eVar);
    }

    public void a(e eVar, AbstractPushManager abstractPushManager) {
        if (abstractPushManager != null) {
            if (this.f112a.containsKey(eVar)) {
                this.f112a.remove(eVar);
            }
            this.f112a.put(eVar, abstractPushManager);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5701a(e eVar) {
        return this.f112a.containsKey(eVar);
    }
}
