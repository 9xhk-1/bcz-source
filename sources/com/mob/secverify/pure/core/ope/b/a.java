package com.mob.secverify.pure.core.ope.b;

import com.mob.MobSDK;
import com.mob.secverify.b.b;
import com.mob.secverify.common.callback.InternalCallback;
import com.mob.secverify.pure.b.d;
import com.mob.secverify.pure.core.ope.b.c.j;
import com.mob.secverify.pure.entity.PreVerifyResult;
import com.mob.secverify.pure.entity.VerifyResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a extends com.mob.secverify.pure.core.ope.a {

    /* renamed from: g, reason: collision with root package name */
    private b f40858g;

    /* renamed from: h, reason: collision with root package name */
    private String f40859h;

    /* renamed from: i, reason: collision with root package name */
    private String f40860i;

    public a(String str, String str2, String str3, b bVar) {
        super(str, str2, str3);
        this.f40859h = str;
        this.f40860i = str2;
        this.f40858g = bVar;
    }

    @Override // com.mob.secverify.pure.core.ope.a
    public void a(InternalCallback<PreVerifyResult> internalCallback) {
        com.mob.secverify.a.a a11 = com.mob.secverify.pure.core.ope.b.c.b.a(this.f40860i);
        if (a11 != null) {
            internalCallback.onSuccess(new PreVerifyResult(a11.e(), "CUCC"));
        } else {
            com.mob.secverify.pure.core.ope.b.a.a.a(MobSDK.getContext()).a(d.PRELOGIN, internalCallback, this.f40858g, this.f40859h, this.f40860i);
        }
    }

    @Override // com.mob.secverify.pure.core.ope.a
    public void b(InternalCallback<VerifyResult> internalCallback) {
        com.mob.secverify.a.a a11 = com.mob.secverify.pure.core.ope.b.c.b.a(this.f40860i);
        if (a11 == null) {
            com.mob.secverify.pure.core.ope.b.a.a.a(MobSDK.getContext()).a(d.LOGIN, internalCallback, this.f40858g, this.f40859h, this.f40860i);
            return;
        }
        VerifyResult verifyResult = new VerifyResult(a11.e(), a11.c(), "CUCC");
        j.b(null);
        internalCallback.onSuccess(verifyResult);
    }
}
