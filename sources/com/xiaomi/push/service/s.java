package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.hh;
import com.xiaomi.push.hu;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import com.xiaomi.push.ir;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
class s extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f46397a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f1033a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ List f1034a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f46398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, int i11, String str, List list, String str2) {
        super(i11);
        this.f46397a = rVar;
        this.f1033a = str;
        this.f1034a = list;
        this.f46398b = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "Send tiny data.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        String a11;
        XMPushService xMPushService;
        a11 = this.f46397a.a(this.f1033a);
        ArrayList<ig> a12 = bz.a(this.f1034a, this.f1033a, a11, 32768);
        if (a12 == null) {
            com.xiaomi.channel.commonutils.logger.b.d("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
            return;
        }
        Iterator<ig> it = a12.iterator();
        while (it.hasNext()) {
            ig next = it.next();
            next.a("uploadWay", "longXMPushService");
            id a13 = ah.a(this.f1033a, a11, next, hh.Notification);
            if (!TextUtils.isEmpty(this.f46398b) && !TextUtils.equals(this.f1033a, this.f46398b)) {
                if (a13.m6085a() == null) {
                    hu huVar = new hu();
                    huVar.a("-1");
                    a13.a(huVar);
                }
                a13.m6085a().b("ext_traffic_source_pkg", this.f46398b);
            }
            byte[] a14 = ir.a(a13);
            xMPushService = this.f46397a.f46393a;
            xMPushService.a(this.f1033a, a14, true);
        }
    }
}
