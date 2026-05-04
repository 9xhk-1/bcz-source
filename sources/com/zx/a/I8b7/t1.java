package com.zx.a.I8b7;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t1 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f46690a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46691b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46692c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f46693d;

    /* renamed from: e, reason: collision with root package name */
    public final u1 f46694e;

    public t1(a aVar) {
        this.f46690a = aVar.f46695a;
        this.f46691b = aVar.f46696b;
        this.f46692c = aVar.f46697c;
        this.f46693d = new HashMap(aVar.f46698d);
        this.f46694e = aVar.f46699e;
    }

    public String a(String str) {
        List<String> list = this.f46693d.get(str);
        if (list == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append("; ");
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        u1 u1Var = this.f46694e;
        if (u1Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        u1Var.close();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public q1 f46695a;

        /* renamed from: b, reason: collision with root package name */
        public int f46696b;

        /* renamed from: c, reason: collision with root package name */
        public String f46697c;

        /* renamed from: d, reason: collision with root package name */
        public Map<String, List<String>> f46698d;

        /* renamed from: e, reason: collision with root package name */
        public u1 f46699e;

        public a() {
            this.f46696b = -1;
            this.f46698d = new HashMap();
        }

        public t1 a() {
            if (this.f46695a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f46696b >= 0) {
                if (this.f46697c != null) {
                    return new t1(this);
                }
                throw new IllegalStateException("message == null");
            }
            StringBuilder a11 = f3.a("code < 0: ");
            a11.append(this.f46696b);
            throw new IllegalStateException(a11.toString());
        }

        public a(t1 t1Var) {
            this.f46696b = -1;
            this.f46695a = t1Var.f46690a;
            this.f46696b = t1Var.f46691b;
            this.f46697c = t1Var.f46692c;
            this.f46698d = new HashMap(t1Var.f46693d);
            this.f46699e = t1Var.f46694e;
        }
    }
}
