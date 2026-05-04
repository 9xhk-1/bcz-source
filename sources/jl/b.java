package jl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f64303a;

    /* renamed from: b, reason: collision with root package name */
    public int f64304b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f64305c;

    public b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f64303a = str;
    }

    public String a() {
        return this.f64303a;
    }

    public int b() {
        return this.f64304b;
    }

    public boolean c() {
        return this.f64305c;
    }

    public void d(int i11) {
        this.f64304b = i11;
    }

    public void e(boolean z11) {
        this.f64305c = z11;
    }

    public String toString() {
        return this.f64303a;
    }
}
