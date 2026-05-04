package com.zx.a.I8b7;

import com.zx.a.I8b7.v3;
import java.util.TimerTask;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class g1 extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f46514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f46515b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g1 g1Var = g1.this;
                h1.a(g1Var.f46515b, g1Var.f46514a);
                h1.a(g1.this.f46515b);
            } catch (Throwable th2) {
                r2.a(th2);
            }
        }
    }

    public g1(h1 h1Var, long j11) {
        this.f46515b = h1Var;
        this.f46514a = j11;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            v3.f.f46726a.f46725e.execute(new a());
        } catch (Throwable th2) {
            r2.a(th2);
        }
    }
}
