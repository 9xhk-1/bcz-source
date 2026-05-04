package com.mob.secverify.pure.core.ope.cm.b;

import com.tencent.open.SocialConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public String f40953a;

    /* renamed from: b, reason: collision with root package name */
    public a f40954b;

    /* renamed from: c, reason: collision with root package name */
    public String f40955c;

    /* renamed from: d, reason: collision with root package name */
    public String f40956d;

    @Override // com.mob.secverify.pure.core.ope.cm.b.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b b(String str) {
        try {
            super.b(str);
            this.f40953a = String.valueOf(this.f40990n.get("client_valid"));
            this.f40954b = new a().b(g.f40988l.fromHashMap((HashMap) this.f40990n.get("Configlist")));
            this.f40955c = String.valueOf(this.f40990n.get(SocialConstants.PARAM_APP_DESC));
            return this;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Entity analyse exception.");
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public String f40957a;

        /* renamed from: b, reason: collision with root package name */
        public String f40958b;

        /* renamed from: c, reason: collision with root package name */
        public String f40959c;

        /* renamed from: d, reason: collision with root package name */
        public String f40960d;

        public a() {
        }

        @Override // com.mob.secverify.pure.core.ope.cm.b.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            try {
                super.b(str);
                this.f40957a = String.valueOf(this.f40990n.get("HOST_CERT_INFO"));
                this.f40958b = String.valueOf(this.f40990n.get("CLOSE_CERT_VERIFY"));
                this.f40959c = String.valueOf(this.f40990n.get("LOGS_CONTROL"));
                this.f40960d = String.valueOf(this.f40990n.get("CHANGE_HOST"));
                return this;
            } catch (Throwable th2) {
                com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Entity analyse exception.");
                return this;
            }
        }

        public String a() {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("HOST_CERT_INFO", this.f40957a);
                hashMap.put("CLOSE_CERT_VERIFY", this.f40958b);
                hashMap.put("LOGS_CONTROL", this.f40959c);
                hashMap.put("CHANGE_HOST", this.f40960d);
                return g.f40988l.fromHashMap(hashMap);
            } catch (Throwable th2) {
                com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Error parse entity to json");
                return "";
            }
        }
    }

    public String a() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("client_valid", this.f40953a);
            hashMap.put("Configlist", g.f40988l.fromJson(this.f40954b.a()));
            hashMap.put(SocialConstants.PARAM_APP_DESC, this.f40955c);
            return g.f40988l.fromHashMap(hashMap);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Error parse entity to json");
            return "";
        }
    }
}
