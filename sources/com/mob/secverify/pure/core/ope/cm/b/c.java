package com.mob.secverify.pure.core.ope.cm.b;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.tencent.open.SocialConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c extends g {

    /* renamed from: a, reason: collision with root package name */
    public String f40962a;

    /* renamed from: b, reason: collision with root package name */
    public String f40963b;

    /* renamed from: c, reason: collision with root package name */
    public String f40964c;

    /* renamed from: d, reason: collision with root package name */
    public String f40965d;

    /* renamed from: e, reason: collision with root package name */
    public String f40966e;

    /* renamed from: f, reason: collision with root package name */
    public a f40967f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public String f40968a;

        /* renamed from: b, reason: collision with root package name */
        public String f40969b;

        /* renamed from: c, reason: collision with root package name */
        public String f40970c;

        /* renamed from: d, reason: collision with root package name */
        public String f40971d;

        /* renamed from: e, reason: collision with root package name */
        public String f40972e;

        /* renamed from: f, reason: collision with root package name */
        public String f40973f;

        /* renamed from: g, reason: collision with root package name */
        public String f40974g;

        /* renamed from: h, reason: collision with root package name */
        public String f40975h;

        /* renamed from: i, reason: collision with root package name */
        public String f40976i;

        /* renamed from: j, reason: collision with root package name */
        public String f40977j;

        public a() {
        }
    }

    @Override // com.mob.secverify.pure.core.ope.cm.b.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c b(String str) {
        try {
            super.b(str);
            this.f40962a = String.valueOf(this.f40990n.get("ver"));
            this.f40963b = String.valueOf(this.f40990n.get("resultdata"));
            this.f40964c = String.valueOf(this.f40990n.get("servertime"));
            this.f40965d = String.valueOf(this.f40990n.get("serviceid"));
            this.f40966e = String.valueOf(this.f40990n.get(SocialConstants.PARAM_APP_DESC));
            return this;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Entity analyse exception.");
            return this;
        }
    }

    public c a(com.mob.secverify.pure.core.ope.cm.a.d dVar) {
        try {
            if (!TextUtils.isEmpty(this.f40963b) && dVar != null && !TextUtils.isEmpty(dVar.f40930f)) {
                HashMap fromJson = g.f40988l.fromJson(com.mob.secverify.pure.core.ope.cm.d.a.b(dVar.f40930f, this.f40963b));
                if (fromJson != null && !fromJson.isEmpty()) {
                    a aVar = new a();
                    aVar.f40968a = String.valueOf(fromJson.get("phonescrip"));
                    aVar.f40969b = String.valueOf(fromJson.get("sourceid"));
                    aVar.f40970c = String.valueOf(fromJson.get("phonescripED"));
                    aVar.f40971d = String.valueOf(fromJson.get("eappid"));
                    aVar.f40972e = String.valueOf(fromJson.get("esign"));
                    aVar.f40973f = String.valueOf(fromJson.get("epackage"));
                    aVar.f40974g = String.valueOf(fromJson.get("securityphone"));
                    aVar.f40975h = String.valueOf(fromJson.get("capaids"));
                    aVar.f40976i = String.valueOf(fromJson.get(CommonConstant.KEY_OPEN_ID));
                    aVar.f40977j = String.valueOf(fromJson.get("pcid"));
                    this.f40967f = aVar;
                    return this;
                }
            }
            return this;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Entity analyse exception.");
            return this;
        }
    }

    public h a() {
        h hVar = new h();
        a aVar = this.f40967f;
        if (aVar != null) {
            hVar.b(aVar.f40968a);
            hVar.c(this.f40967f.f40974g);
        }
        return hVar;
    }
}
