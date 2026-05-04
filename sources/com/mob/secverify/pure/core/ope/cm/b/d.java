package com.mob.secverify.pure.core.ope.cm.b;

import com.huawei.hms.support.feature.result.CommonConstant;
import com.mob.secverify.pure.core.ope.cm.d.i;
import com.mob.secverify.pure.entity.VerifyResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d extends g {

    /* renamed from: a, reason: collision with root package name */
    public String f40979a;

    /* renamed from: b, reason: collision with root package name */
    public String f40980b;

    /* renamed from: c, reason: collision with root package name */
    public String f40981c;

    /* renamed from: d, reason: collision with root package name */
    public String f40982d;

    /* renamed from: e, reason: collision with root package name */
    public String f40983e;

    /* renamed from: f, reason: collision with root package name */
    public String f40984f;

    @Override // com.mob.secverify.pure.core.ope.cm.b.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d b(String str) {
        try {
            super.b(str);
            this.f40979a = String.valueOf(this.f40990n.get("phonescrip"));
            this.f40980b = String.valueOf(this.f40990n.get("phonescripED"));
            this.f40981c = String.valueOf(this.f40990n.get("inresponseto"));
            this.f40982d = String.valueOf(this.f40990n.get(CommonConstant.KEY_OPEN_ID));
            this.f40983e = String.valueOf(this.f40990n.get("version"));
            this.f40984f = String.valueOf(this.f40990n.get("token"));
            return this;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Entity analyse exception.");
            return this;
        }
    }

    public VerifyResult a() {
        String str;
        h a11 = new h().a(i.h());
        if (a11 != null) {
            str = a11.b();
        } else {
            str = "";
        }
        return new VerifyResult(str, this.f40984f, "CMCC");
    }
}
