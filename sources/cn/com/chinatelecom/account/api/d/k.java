package cn.com.chinatelecom.account.api.d;

import android.content.Context;
import cn.com.chinatelecom.account.api.Helper;

/* loaded from: classes3.dex */
public class k implements i {
    @Override // cn.com.chinatelecom.account.api.d.i
    public String a(Context context, String str, String str2, String str3, long j11, boolean z11, String str4) {
        return Helper.dnepah(context, str, str2, str3, j11, false, z11, str4);
    }

    @Override // cn.com.chinatelecom.account.api.d.i
    public String a(String str, String str2) {
        try {
            return new String(Helper.dnepmret(cn.com.chinatelecom.account.api.a.c.a(str), str2));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    @Override // cn.com.chinatelecom.account.api.d.i
    public String a(boolean z11) {
        return Helper.cepahsul(z11);
    }
}
