package com.alipay.sdk.m.f0;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {
    public static c a(DataReportResult dataReportResult) {
        c cVar = new c();
        if (dataReportResult == null) {
            return null;
        }
        cVar.f10526a = dataReportResult.success;
        cVar.f10527b = dataReportResult.resultCode;
        Map<String, String> map = dataReportResult.resultData;
        if (map != null) {
            cVar.f10533c = map.get("apdid");
            cVar.f10534d = map.get("apdidToken");
            cVar.f10537g = map.get("dynamicKey");
            cVar.f10538h = map.get("timeInterval");
            cVar.f10539i = map.get("webrtcUrl");
            cVar.f10540j = "";
            String str = map.get("drmSwitch");
            if (com.alipay.sdk.m.z.a.b(str)) {
                if (str.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.charAt(0));
                    cVar.f10535e = sb2.toString();
                }
                if (str.length() >= 3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str.charAt(2));
                    cVar.f10536f = sb3.toString();
                }
            }
            if (map.containsKey("apse_degrade")) {
                cVar.f10541k = map.get("apse_degrade");
            }
        }
        return cVar;
    }

    public static DataReportRequest a(d dVar) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (dVar == null) {
            return null;
        }
        dataReportRequest.f11231os = dVar.f10542a;
        dataReportRequest.rpcVersion = dVar.f10551j;
        dataReportRequest.bizType = "1";
        HashMap hashMap = new HashMap();
        dataReportRequest.bizData = hashMap;
        hashMap.put("apdid", dVar.f10543b);
        dataReportRequest.bizData.put("apdidToken", dVar.f10544c);
        dataReportRequest.bizData.put("umidToken", dVar.f10545d);
        dataReportRequest.bizData.put("dynamicKey", dVar.f10546e);
        dataReportRequest.deviceData = dVar.f10547f;
        return dataReportRequest;
    }
}
