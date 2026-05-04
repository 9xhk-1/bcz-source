package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.gg;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.XMPushService.b;
import com.xiaomi.push.service.bg;
import java.util.Collection;

/* loaded from: classes8.dex */
public class w extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    private XMPushService f46409a;

    /* renamed from: a, reason: collision with other field name */
    private String f1039a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f1040a;

    /* renamed from: b, reason: collision with root package name */
    private String f46410b;

    /* renamed from: c, reason: collision with root package name */
    private String f46411c;

    public w(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f46409a = xMPushService;
        this.f1039a = str;
        this.f1040a = bArr;
        this.f46410b = str2;
        this.f46411c = str3;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "register app";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        bg.b next;
        t m6297a = u.m6297a((Context) this.f46409a);
        if (m6297a == null) {
            try {
                m6297a = u.a(this.f46409a, this.f1039a, this.f46410b, this.f46411c);
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to register push account. " + e11);
            }
        }
        if (m6297a == null) {
            com.xiaomi.channel.commonutils.logger.b.d("no account for registration.");
            x.a(this.f46409a, ErrorCode.ERROR_AUTHERICATION_ERROR, "no account.");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("do registration now.");
        Collection<bg.b> m6254a = bg.a().m6254a("5");
        if (m6254a.isEmpty()) {
            next = m6297a.a(this.f46409a);
            ah.a(this.f46409a, next);
            bg.a().a(next);
        } else {
            next = m6254a.iterator().next();
        }
        if (!this.f46409a.m6214c()) {
            x.a(this.f1039a, this.f1040a);
            this.f46409a.a(true);
            return;
        }
        try {
            bg.c cVar = next.f963a;
            if (cVar == bg.c.binded) {
                ah.a(this.f46409a, this.f1039a, this.f1040a);
            } else if (cVar == bg.c.unbind) {
                x.a(this.f1039a, this.f1040a);
                XMPushService xMPushService = this.f46409a;
                xMPushService.getClass();
                xMPushService.a(xMPushService.new b(next));
            }
        } catch (gg e12) {
            com.xiaomi.channel.commonutils.logger.b.d("meet error, disconnect connection. " + e12);
            this.f46409a.a(10, e12);
        }
    }
}
