package com.igexin.c.a.b.a.a;

/* loaded from: classes7.dex */
public abstract class a extends com.igexin.c.a.b.f {

    /* renamed from: f, reason: collision with root package name */
    protected volatile boolean f37079f;

    /* renamed from: g, reason: collision with root package name */
    protected volatile int f37080g;

    /* renamed from: h, reason: collision with root package name */
    protected String f37081h;

    /* renamed from: i, reason: collision with root package name */
    protected volatile boolean f37082i;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.igexin.c.a.b.a.a.a$a, reason: collision with other inner class name */
    public static final class EnumC0460a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f37083a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f37084b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f37085c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ int[] f37086d = {1, 2, 3};

        private EnumC0460a(String str, int i11) {
        }

        private static int[] a() {
            return (int[]) f37086d.clone();
        }
    }

    public a(int i11, com.igexin.c.a.b.d dVar) {
        super(i11, null, dVar);
        this.f37080g = EnumC0460a.f37083a;
        this.f37082i = true;
    }

    public abstract void c_();

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void d() {
        super.d();
        this.f37226o = true;
    }

    @Override // com.igexin.c.a.d.f
    public final void e() {
        Thread thread = this.K;
        if (!thread.isAlive() || thread.isInterrupted()) {
            return;
        }
        thread.interrupt();
    }

    public final boolean g() {
        return this.f37080g == EnumC0460a.f37085c;
    }

    @Override // com.igexin.c.a.d.f
    public final void f() {
    }
}
