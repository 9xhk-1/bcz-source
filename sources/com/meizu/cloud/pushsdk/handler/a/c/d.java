package com.meizu.cloud.pushsdk.handler.a.c;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f39857a;

    /* renamed from: b, reason: collision with root package name */
    private String f39858b;

    /* renamed from: c, reason: collision with root package name */
    private String f39859c;

    /* renamed from: d, reason: collision with root package name */
    private String f39860d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f39861a;

        /* renamed from: b, reason: collision with root package name */
        private String f39862b;

        /* renamed from: c, reason: collision with root package name */
        private String f39863c;

        /* renamed from: d, reason: collision with root package name */
        private String f39864d;

        public a a(String str) {
            this.f39861a = str;
            return this;
        }

        public a b(String str) {
            this.f39862b = str;
            return this;
        }

        public a c(String str) {
            this.f39863c = str;
            return this;
        }

        public a d(String str) {
            this.f39864d = str;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    public d() {
    }

    public static a a() {
        return new a();
    }

    public String b() {
        com.meizu.cloud.pushsdk.d.a.c cVar = new com.meizu.cloud.pushsdk.d.a.c();
        cVar.a("task_id", this.f39857a);
        cVar.a(PushConstants.SEQ_ID, this.f39858b);
        cVar.a(PushConstants.PUSH_TIMESTAMP, this.f39859c);
        cVar.a("device_id", this.f39860d);
        return cVar.toString();
    }

    public String c() {
        return this.f39857a;
    }

    public String d() {
        return this.f39858b;
    }

    public String e() {
        return this.f39859c;
    }

    public String f() {
        return this.f39860d;
    }

    public d(a aVar) {
        this.f39857a = !TextUtils.isEmpty(aVar.f39861a) ? aVar.f39861a : "";
        this.f39858b = !TextUtils.isEmpty(aVar.f39862b) ? aVar.f39862b : "";
        this.f39859c = !TextUtils.isEmpty(aVar.f39863c) ? aVar.f39863c : "";
        this.f39860d = TextUtils.isEmpty(aVar.f39864d) ? "" : aVar.f39864d;
    }
}
