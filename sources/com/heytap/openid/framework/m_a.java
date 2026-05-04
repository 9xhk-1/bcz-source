package com.heytap.openid.framework;

import android.app.OplusNotificationManager;
import android.os.Build;
import com.android.id.impl.IdProviderImpl;
import com.heytap.openid.sdk.m_h;

/* loaded from: classes7.dex */
public class m_a {
    public IdProviderImpl m_a;
    public OplusNotificationManager m_b = null;

    /* renamed from: com.heytap.openid.framework.m_a$m_a, reason: collision with other inner class name */
    public static class C0437m_a {
        public static final m_a m_a = new m_a();
    }

    public m_a() {
        this.m_a = null;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 31 || i11 == 32) {
            m_a();
            return;
        }
        try {
            this.m_a = new IdProviderImpl();
        } catch (Error | Exception e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("1084: ");
            sb2.append(e11.getMessage() != null ? e11.getMessage() : e11.getLocalizedMessage());
            m_h.m_b(sb2.toString());
            m_a();
        }
    }

    public final native void m_a();
}
