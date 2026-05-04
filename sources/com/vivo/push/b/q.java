package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class q extends v {

    /* renamed from: a, reason: collision with root package name */
    protected InsideNotificationItem f44917a;

    /* renamed from: b, reason: collision with root package name */
    private String f44918b;

    public q() {
        super(4);
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        String b11 = com.vivo.push.util.q.b(this.f44917a);
        this.f44918b = b11;
        aVar.a("notification_v1", b11);
    }

    public final InsideNotificationItem d() {
        return this.f44917a;
    }

    public final String e() {
        if (!TextUtils.isEmpty(this.f44918b)) {
            return this.f44918b;
        }
        InsideNotificationItem insideNotificationItem = this.f44917a;
        if (insideNotificationItem == null) {
            return null;
        }
        return com.vivo.push.util.q.b(insideNotificationItem);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnNotifyArrivedCommand";
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        String a11 = aVar.a("notification_v1");
        this.f44918b = a11;
        if (TextUtils.isEmpty(a11)) {
            return;
        }
        InsideNotificationItem a12 = com.vivo.push.util.q.a(this.f44918b);
        this.f44917a = a12;
        if (a12 != null) {
            a12.setMsgId(f());
        }
    }
}
