package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.model.UnvarnishedMessage;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class o extends v {

    /* renamed from: a, reason: collision with root package name */
    protected UnvarnishedMessage f44911a;

    public o() {
        super(3);
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("msg_v1", this.f44911a.unpackToJson());
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        String a11 = aVar.a("msg_v1");
        if (TextUtils.isEmpty(a11)) {
            return;
        }
        UnvarnishedMessage unvarnishedMessage = new UnvarnishedMessage(a11);
        this.f44911a = unvarnishedMessage;
        unvarnishedMessage.setMsgId(f());
    }

    public final UnvarnishedMessage e() {
        return this.f44911a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnMessageCommand";
    }

    public final String d() {
        UnvarnishedMessage unvarnishedMessage = this.f44911a;
        if (unvarnishedMessage == null) {
            return null;
        }
        return unvarnishedMessage.unpackToJson();
    }
}
