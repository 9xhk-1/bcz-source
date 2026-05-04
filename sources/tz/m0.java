package tz;

import android.content.ClipData;
import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public class m0 {

    /* renamed from: i, reason: collision with root package name */
    public static final m0 f91325i = new m0();

    /* renamed from: a, reason: collision with root package name */
    public Context f91326a;

    /* renamed from: b, reason: collision with root package name */
    public String f91327b;

    /* renamed from: c, reason: collision with root package name */
    public rl.b f91328c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f91329d;

    /* renamed from: e, reason: collision with root package name */
    public ClipData f91330e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f91331f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f91332g;

    /* renamed from: h, reason: collision with root package name */
    public Runnable f91333h;

    public static m0 a() {
        return f91325i;
    }

    public void b(ClipData clipData) {
        this.f91330e = clipData;
    }

    public void c(Context context) {
        this.f91326a = context;
    }

    public void d(Boolean bool) {
        this.f91329d = bool;
    }

    public void e(Runnable runnable) {
        this.f91333h = runnable;
    }

    public void f(String str) {
        this.f91327b = str;
    }

    public void g(rl.b bVar) {
        this.f91328c = bVar;
    }

    public Context h() {
        return this.f91326a;
    }

    public void i(Boolean bool) {
        this.f91331f = bool;
    }

    public String j() {
        return this.f91327b;
    }

    public void k(Boolean bool) {
        this.f91332g = bool;
    }

    @NonNull
    public rl.b l() {
        if (this.f91328c == null) {
            this.f91328c = rl.b.a();
        }
        return this.f91328c;
    }

    @NonNull
    public Boolean m() {
        if (this.f91329d == null) {
            this.f91329d = Boolean.valueOf(k0.d(this.f91326a));
        }
        return this.f91329d;
    }

    public ClipData n() {
        return this.f91330e;
    }

    @NonNull
    public Boolean o() {
        if (this.f91331f == null) {
            this.f91331f = Boolean.TRUE;
        }
        return this.f91331f;
    }

    public Boolean p() {
        if (this.f91332g == null) {
            this.f91332g = Boolean.valueOf(k0.c(this.f91326a));
        }
        return this.f91332g;
    }

    public Runnable q() {
        return this.f91333h;
    }
}
