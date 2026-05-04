package com.meizu.cloud.pushsdk.d.c;

import com.meizu.cloud.pushsdk.d.a.c;
import com.meizu.cloud.pushsdk.d.c.a;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;

/* loaded from: classes7.dex */
public class b extends com.meizu.cloud.pushsdk.d.c.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f39749a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39750b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39751c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39752d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39753e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39754f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39755g;

    /* renamed from: h, reason: collision with root package name */
    private final String f39756h;

    /* renamed from: i, reason: collision with root package name */
    private final int f39757i;

    public static abstract class a<T extends a<T>> extends a.AbstractC0477a<T> {

        /* renamed from: a, reason: collision with root package name */
        private String f39758a;

        /* renamed from: b, reason: collision with root package name */
        private String f39759b;

        /* renamed from: c, reason: collision with root package name */
        private String f39760c;

        /* renamed from: d, reason: collision with root package name */
        private String f39761d;

        /* renamed from: e, reason: collision with root package name */
        private String f39762e;

        /* renamed from: f, reason: collision with root package name */
        private String f39763f;

        /* renamed from: g, reason: collision with root package name */
        private String f39764g;

        /* renamed from: h, reason: collision with root package name */
        private String f39765h;

        /* renamed from: i, reason: collision with root package name */
        private int f39766i = 0;

        public T a(int i11) {
            this.f39766i = i11;
            return (T) a();
        }

        public T b(String str) {
            this.f39759b = str;
            return (T) a();
        }

        public T c(String str) {
            this.f39760c = str;
            return (T) a();
        }

        public T d(String str) {
            this.f39761d = str;
            return (T) a();
        }

        public T e(String str) {
            this.f39762e = str;
            return (T) a();
        }

        public T f(String str) {
            this.f39763f = str;
            return (T) a();
        }

        public T g(String str) {
            this.f39764g = str;
            return (T) a();
        }

        public T h(String str) {
            this.f39765h = str;
            return (T) a();
        }

        public T a(String str) {
            this.f39758a = str;
            return (T) a();
        }

        public b b() {
            return new b(this);
        }
    }

    public b(a<?> aVar) {
        super(aVar);
        this.f39750b = ((a) aVar).f39759b;
        this.f39751c = ((a) aVar).f39760c;
        this.f39749a = ((a) aVar).f39758a;
        this.f39752d = ((a) aVar).f39761d;
        this.f39753e = ((a) aVar).f39762e;
        this.f39754f = ((a) aVar).f39763f;
        this.f39755g = ((a) aVar).f39764g;
        this.f39756h = ((a) aVar).f39765h;
        this.f39757i = ((a) aVar).f39766i;
    }

    public static a<?> d() {
        return new C0478b();
    }

    public c e() {
        c cVar = new c();
        cVar.a("en", this.f39749a);
        cVar.a("ti", this.f39750b);
        cVar.a(AppIconSetting.DEFAULT_LARGE_ICON, this.f39751c);
        cVar.a("pv", this.f39752d);
        cVar.a("pn", this.f39753e);
        cVar.a("si", this.f39754f);
        cVar.a("ms", this.f39755g);
        cVar.a("ect", this.f39756h);
        cVar.a("br", Integer.valueOf(this.f39757i));
        return a(cVar);
    }

    /* renamed from: com.meizu.cloud.pushsdk.d.c.b$b, reason: collision with other inner class name */
    public static class C0478b extends a<C0478b> {
        private C0478b() {
        }

        @Override // com.meizu.cloud.pushsdk.d.c.a.AbstractC0477a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0478b a() {
            return this;
        }
    }
}
