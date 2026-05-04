package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.bs;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class b implements IPerfProcessor {

    /* renamed from: a, reason: collision with root package name */
    protected Context f45159a;

    /* renamed from: a, reason: collision with other field name */
    private HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> f61a;

    public b(Context context) {
        this.f45159a = context;
    }

    public static String a(com.xiaomi.clientreport.data.a aVar) {
        return String.valueOf(aVar.production) + "#" + aVar.clientInterfaceId;
    }

    private String b(com.xiaomi.clientreport.data.a aVar) {
        String str;
        int i11 = aVar.production;
        String str2 = aVar.clientInterfaceId;
        if (i11 <= 0 || TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = String.valueOf(i11) + "#" + str2;
        }
        File externalFilesDir = this.f45159a.getExternalFilesDir("perf");
        if (externalFilesDir == null) {
            com.xiaomi.channel.commonutils.logger.b.d("cannot get folder when to write perf");
            return null;
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        return new File(externalFilesDir, str).getAbsolutePath();
    }

    private String c(com.xiaomi.clientreport.data.a aVar) {
        String b11 = b(aVar);
        if (TextUtils.isEmpty(b11)) {
            return null;
        }
        for (int i11 = 0; i11 < 20; i11++) {
            String str = b11 + i11;
            if (bs.m5761a(this.f45159a, str)) {
                return str;
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.IPerfProcessor
    public void setPerfMap(HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> hashMap) {
        this.f61a = hashMap;
    }

    @Override // com.xiaomi.clientreport.processor.c
    public void a() {
        bs.a(this.f45159a, "perf", "perfUploading");
        File[] m5762a = bs.m5762a(this.f45159a, "perfUploading");
        if (m5762a == null || m5762a.length <= 0) {
            return;
        }
        for (File file : m5762a) {
            if (file != null) {
                List<String> a11 = e.a(this.f45159a, file.getAbsolutePath());
                file.delete();
                a(a11);
            }
        }
    }

    @Override // com.xiaomi.clientreport.processor.d
    public void b() {
        HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> hashMap = this.f61a;
        if (hashMap == null) {
            return;
        }
        if (hashMap.size() > 0) {
            Iterator<String> it = this.f61a.keySet().iterator();
            while (it.hasNext()) {
                HashMap<String, com.xiaomi.clientreport.data.a> hashMap2 = this.f61a.get(it.next());
                if (hashMap2 != null && hashMap2.size() > 0) {
                    com.xiaomi.clientreport.data.a[] aVarArr = new com.xiaomi.clientreport.data.a[hashMap2.size()];
                    hashMap2.values().toArray(aVarArr);
                    a(aVarArr);
                }
            }
        }
        this.f61a.clear();
    }

    @Override // com.xiaomi.clientreport.processor.d
    /* renamed from: a */
    public void mo5647a(com.xiaomi.clientreport.data.a aVar) {
        if ((aVar instanceof PerfClientReport) && this.f61a != null) {
            PerfClientReport perfClientReport = (PerfClientReport) aVar;
            String a11 = a((com.xiaomi.clientreport.data.a) perfClientReport);
            String a12 = e.a(perfClientReport);
            HashMap<String, com.xiaomi.clientreport.data.a> hashMap = this.f61a.get(a11);
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            PerfClientReport perfClientReport2 = (PerfClientReport) hashMap.get(a12);
            if (perfClientReport2 != null) {
                perfClientReport.perfCounts += perfClientReport2.perfCounts;
                perfClientReport.perfLatencies += perfClientReport2.perfLatencies;
            }
            hashMap.put(a12, perfClientReport);
            this.f61a.put(a11, hashMap);
        }
    }

    public void a(List<String> list) {
        bs.a(this.f45159a, list);
    }

    public void a(com.xiaomi.clientreport.data.a[] aVarArr) {
        String c11 = c(aVarArr[0]);
        if (TextUtils.isEmpty(c11)) {
            return;
        }
        e.a(c11, aVarArr);
    }
}
