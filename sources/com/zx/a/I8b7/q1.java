package com.zx.a.I8b7;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class q1 {

    /* renamed from: a, reason: collision with root package name */
    public URL f46659a;

    /* renamed from: b, reason: collision with root package name */
    public String f46660b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, String> f46661c;

    /* renamed from: d, reason: collision with root package name */
    public s1 f46662d;

    /* renamed from: e, reason: collision with root package name */
    public String f46663e;

    public q1(a aVar) {
        this.f46659a = aVar.f46664a;
        this.f46660b = aVar.f46665b;
        HashMap hashMap = new HashMap();
        this.f46661c = hashMap;
        hashMap.putAll(aVar.f46666c);
        this.f46662d = aVar.f46667d;
        this.f46663e = aVar.f46668e;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public URL f46664a;

        /* renamed from: b, reason: collision with root package name */
        public String f46665b;

        /* renamed from: c, reason: collision with root package name */
        public Map<String, String> f46666c;

        /* renamed from: d, reason: collision with root package name */
        public s1 f46667d;

        /* renamed from: e, reason: collision with root package name */
        public String f46668e;

        public a() {
            this.f46665b = "GET";
            this.f46666c = new HashMap();
            this.f46668e = "";
        }

        public a a(String str) {
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            try {
                this.f46664a = new URL(str);
                return this;
            } catch (MalformedURLException e11) {
                throw new IllegalArgumentException(e11);
            }
        }

        public a(q1 q1Var) {
            this.f46664a = q1Var.f46659a;
            this.f46665b = q1Var.f46660b;
            this.f46667d = q1Var.f46662d;
            this.f46666c = q1Var.f46661c;
            this.f46668e = q1Var.f46663e;
        }
    }
}
