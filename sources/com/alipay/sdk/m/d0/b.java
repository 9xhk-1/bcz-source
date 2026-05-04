package com.alipay.sdk.m.d0;

import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataReportRequest f10515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f10516b;

    public b(c cVar, DataReportRequest dataReportRequest) {
        this.f10516b = cVar;
        this.f10515a = dataReportRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        DataReportResult dataReportResult;
        DataReportResult dataReportResult2;
        DataReportService dataReportService;
        try {
            dataReportService = this.f10516b.f10521c;
            DataReportResult unused = c.f10518e = dataReportService.reportData(this.f10515a);
        } catch (Throwable th2) {
            DataReportResult unused2 = c.f10518e = new DataReportResult();
            dataReportResult = c.f10518e;
            dataReportResult.success = false;
            dataReportResult2 = c.f10518e;
            dataReportResult2.resultCode = "static data rpc upload error, " + com.alipay.sdk.m.z.a.a(th2);
            com.alipay.sdk.m.z.a.a(th2);
        }
    }
}
