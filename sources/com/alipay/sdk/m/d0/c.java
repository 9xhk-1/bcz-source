package com.alipay.sdk.m.d0;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.aa;
import com.alipay.android.phone.mrpc.core.h;
import com.alipay.android.phone.mrpc.core.w;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c implements a {

    /* renamed from: d, reason: collision with root package name */
    public static c f10517d;

    /* renamed from: e, reason: collision with root package name */
    public static DataReportResult f10518e;

    /* renamed from: a, reason: collision with root package name */
    public w f10519a;

    /* renamed from: b, reason: collision with root package name */
    public BugTrackMessageService f10520b;

    /* renamed from: c, reason: collision with root package name */
    public DataReportService f10521c;

    public c(Context context, String str) {
        this.f10519a = null;
        this.f10520b = null;
        this.f10521c = null;
        aa aaVar = new aa();
        aaVar.a(str);
        h hVar = new h(context);
        this.f10519a = hVar;
        this.f10520b = (BugTrackMessageService) hVar.a(BugTrackMessageService.class, aaVar);
        this.f10521c = (DataReportService) this.f10519a.a(DataReportService.class, aaVar);
    }

    public static synchronized c a(Context context, String str) {
        c cVar;
        synchronized (c.class) {
            try {
                if (f10517d == null) {
                    f10517d = new c(context, str);
                }
                cVar = f10517d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // com.alipay.sdk.m.d0.a
    public boolean logCollect(String str) {
        BugTrackMessageService bugTrackMessageService;
        String str2;
        if (com.alipay.sdk.m.z.a.a(str) || (bugTrackMessageService = this.f10520b) == null) {
            return false;
        }
        try {
            str2 = bugTrackMessageService.logCollect(com.alipay.sdk.m.z.a.f(str));
        } catch (Throwable unused) {
            str2 = null;
        }
        if (com.alipay.sdk.m.z.a.a(str2)) {
            return false;
        }
        return ((Boolean) new JSONObject(str2).get("success")).booleanValue();
    }

    @Override // com.alipay.sdk.m.d0.a
    public DataReportResult a(DataReportRequest dataReportRequest) {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.f10521c != null) {
            f10518e = null;
            new Thread(new b(this, dataReportRequest)).start();
            for (int i11 = 300000; f10518e == null && i11 >= 0; i11 -= 50) {
                Thread.sleep(50L);
            }
        }
        return f10518e;
    }
}
