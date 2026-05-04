package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class p extends com.vivo.push.o {

    /* renamed from: a, reason: collision with root package name */
    private String f44912a;

    /* renamed from: b, reason: collision with root package name */
    private String f44913b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f44914c;

    /* renamed from: d, reason: collision with root package name */
    private long f44915d;

    /* renamed from: e, reason: collision with root package name */
    private InsideNotificationItem f44916e;

    public p(String str, long j11, InsideNotificationItem insideNotificationItem) {
        super(5);
        this.f44912a = str;
        this.f44915d = j11;
        this.f44916e = insideNotificationItem;
    }

    @Override // com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        aVar.a("package_name", this.f44912a);
        aVar.a("notify_id", this.f44915d);
        aVar.a("notification_v1", com.vivo.push.util.q.b(this.f44916e));
        aVar.a("open_pkg_name", this.f44913b);
        aVar.a("open_pkg_name_encode", this.f44914c);
    }

    public final String d() {
        return this.f44912a;
    }

    public final long e() {
        return this.f44915d;
    }

    public final InsideNotificationItem f() {
        return this.f44916e;
    }

    @Override // com.vivo.push.o
    public final String toString() {
        return "OnNotificationClickCommand";
    }

    @Override // com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        this.f44912a = aVar.a("package_name");
        this.f44915d = aVar.b("notify_id", -1L);
        this.f44913b = aVar.a("open_pkg_name");
        this.f44914c = aVar.b("open_pkg_name_encode");
        String a11 = aVar.a("notification_v1");
        if (!TextUtils.isEmpty(a11)) {
            this.f44916e = com.vivo.push.util.q.a(a11);
        }
        InsideNotificationItem insideNotificationItem = this.f44916e;
        if (insideNotificationItem != null) {
            insideNotificationItem.setMsgId(this.f44915d);
        }
    }

    public p() {
        super(5);
    }
}
