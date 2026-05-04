package com.vivo.push.b;

import android.text.TextUtils;
import com.heytap.mcssdk.constant.IntentConstant;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class x extends com.vivo.push.o {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, String> f44928a;

    /* renamed from: b, reason: collision with root package name */
    private long f44929b;

    public x() {
        super(2012);
    }

    public final void a(HashMap<String, String> hashMap) {
        this.f44928a = hashMap;
    }

    @Override // com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        aVar.a("ReporterCommand.EXTRA_PARAMS", this.f44928a);
        aVar.a("ReporterCommand.EXTRA_REPORTER_TYPE", this.f44929b);
    }

    @Override // com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        this.f44928a = (HashMap) aVar.d("ReporterCommand.EXTRA_PARAMS");
        this.f44929b = aVar.b("ReporterCommand.EXTRA_REPORTER_TYPE", this.f44929b);
    }

    @Override // com.vivo.push.o
    public final String toString() {
        return "ReporterCommand（" + this.f44929b + pn.j.f81007d;
    }

    public x(long j11) {
        this();
        this.f44929b = j11;
    }

    public final void d() {
        if (this.f44928a == null) {
            com.vivo.push.util.p.d("ReporterCommand", "reportParams is empty");
            return;
        }
        StringBuilder sb2 = new StringBuilder("report message reportType:");
        sb2.append(this.f44929b);
        sb2.append(",msgId:");
        String str = this.f44928a.get(IntentConstant.MESSAGE_ID);
        if (TextUtils.isEmpty(str)) {
            str = this.f44928a.get("message_id");
        }
        sb2.append(str);
        com.vivo.push.util.p.d("ReporterCommand", sb2.toString());
    }
}
