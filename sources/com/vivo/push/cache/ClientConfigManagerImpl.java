package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.p;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class ClientConfigManagerImpl implements d {
    private static final String TAG = "ClientConfigManager";
    private static volatile ClientConfigManagerImpl sClientConfigManagerImpl;
    private a mAppConfigSettings;
    private Context mContext;
    private e mPushConfigSettings;

    private ClientConfigManagerImpl(Context context) {
        this.mContext = ContextDelegate.getContext(context);
        this.mAppConfigSettings = new a(this.mContext);
        this.mPushConfigSettings = new e(this.mContext);
    }

    public static synchronized ClientConfigManagerImpl getInstance(Context context) {
        ClientConfigManagerImpl clientConfigManagerImpl;
        synchronized (ClientConfigManagerImpl.class) {
            try {
                if (sClientConfigManagerImpl == null) {
                    sClientConfigManagerImpl = new ClientConfigManagerImpl(context);
                }
                clientConfigManagerImpl = sClientConfigManagerImpl;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return clientConfigManagerImpl;
    }

    private void prepareAppConfig() {
        a aVar = this.mAppConfigSettings;
        if (aVar == null) {
            this.mAppConfigSettings = new a(this.mContext);
        } else {
            aVar.c();
        }
    }

    private e preparePushConfigSettings() {
        e eVar = this.mPushConfigSettings;
        if (eVar == null) {
            this.mPushConfigSettings = new e(this.mContext);
        } else {
            eVar.c();
        }
        return this.mPushConfigSettings;
    }

    public void clearPush() {
        this.mAppConfigSettings.d();
    }

    public Set<String> getBlackEventList() {
        return null;
    }

    public String getSuitTag() {
        return preparePushConfigSettings().c("CSPT");
    }

    public String getValueByKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mPushConfigSettings.c();
        return this.mPushConfigSettings.c(str);
    }

    public Set<Long> getWhiteLogList() {
        HashSet hashSet = new HashSet();
        String valueByKey = getValueByKey("WLL");
        if (!TextUtils.isEmpty(valueByKey)) {
            for (String str : valueByKey.split(",")) {
                try {
                    hashSet.add(Long.valueOf(Long.parseLong(str)));
                } catch (Exception unused) {
                }
            }
        }
        p.d(TAG, " initWhiteLogList ".concat(String.valueOf(hashSet)));
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isCancleBroadcastReceiver() {
        /*
            r3 = this;
            com.vivo.push.cache.e r0 = r3.preparePushConfigSettings()
            java.lang.String r1 = "PSM"
            java.lang.String r0 = r0.c(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L1a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L16
            goto L1b
        L16:
            r0 = move-exception
            r0.printStackTrace()
        L1a:
            r0 = r2
        L1b:
            r0 = r0 & 4
            if (r0 == 0) goto L21
            r0 = 1
            return r0
        L21:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.cache.ClientConfigManagerImpl.isCancleBroadcastReceiver():boolean");
    }

    public boolean isDebug() {
        this.mAppConfigSettings.c();
        return a.a(this.mAppConfigSettings.b());
    }

    public boolean isEnablePush() {
        prepareAppConfig();
        com.vivo.push.model.a c11 = this.mAppConfigSettings.c(this.mContext.getPackageName());
        if (c11 != null) {
            return "1".equals(c11.b());
        }
        return true;
    }

    @Override // com.vivo.push.cache.d
    public boolean isInBlackList(long j11) {
        String c11 = preparePushConfigSettings().c("BL");
        if (!TextUtils.isEmpty(c11)) {
            for (String str : c11.split(",")) {
                try {
                    if (!TextUtils.isEmpty(str) && Long.parseLong(str) == j11) {
                        return true;
                    }
                } catch (NumberFormatException e11) {
                    e11.printStackTrace();
                }
            }
        }
        return false;
    }

    public boolean isDebug(int i11) {
        return a.a(i11);
    }
}
