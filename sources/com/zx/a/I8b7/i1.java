package com.zx.a.I8b7;

import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    public q1 f46545a;

    /* renamed from: b, reason: collision with root package name */
    public o2 f46546b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46547c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a implements Runnable {
        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                r0 = 0
                throw r0     // Catch: java.lang.Throwable -> L2
            L2:
                r1 = move-exception
                java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> L11
                java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L11
                java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L11
                r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L11
                throw r0     // Catch: java.lang.Throwable -> L11
            L11:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zx.a.I8b7.i1.a.run():void");
        }
    }

    public i1(o2 o2Var, q1 q1Var) {
        this.f46546b = o2Var;
        this.f46545a = q1Var;
    }

    public t1 a() throws Exception {
        synchronized (this) {
            if (this.f46547c) {
                throw new IllegalStateException("Already Executed");
            }
            this.f46547c = true;
        }
        try {
            x xVar = this.f46546b.f46632a;
            synchronized (xVar) {
                xVar.f46739d.add(this);
            }
            return b();
        } finally {
            x xVar2 = this.f46546b.f46632a;
            xVar2.a(xVar2.f46739d, this, false);
        }
    }

    public t1 b() throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f46546b.f46633b);
        this.f46545a.getClass();
        arrayList.add(new e());
        arrayList.add(new o(this.f46546b));
        arrayList.add(new j());
        q1 q1Var = this.f46545a;
        if (arrayList.size() <= 0) {
            throw new AssertionError();
        }
        j1 j1Var = new j1(arrayList, null, 1, q1Var);
        n0 n0Var = (n0) arrayList.get(0);
        t1 a11 = n0Var.a(j1Var);
        if (a11 == null) {
            throw new NullPointerException("interceptor " + n0Var + " returned null");
        }
        if (a11.f46694e != null) {
            return a11;
        }
        throw new IllegalStateException("interceptor " + n0Var + " returned a response with no body");
    }
}
