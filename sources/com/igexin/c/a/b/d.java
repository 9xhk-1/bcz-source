package com.igexin.c.a.b;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: c, reason: collision with root package name */
    protected String f37146c;

    /* renamed from: d, reason: collision with root package name */
    protected d f37147d;

    /* renamed from: e, reason: collision with root package name */
    protected d f37148e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f37149f;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f37150a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f37151b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f37152c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ int[] f37153d = {1, 2, 3};

        private a(String str, int i11) {
        }

        private static int[] a() {
            return (int[]) f37153d.clone();
        }
    }

    private d(String str) {
        this.f37146c = str;
    }

    private static int a() {
        return a.f37152c;
    }

    private static int c() {
        return a.f37152c;
    }

    private String d() {
        return this.f37146c;
    }

    public abstract Object a(Object obj) throws Exception;

    public final com.igexin.c.a.d.a.e b(f fVar, Object obj) throws Exception {
        Object b11 = b(obj);
        d dVar = this.f37147d;
        if (dVar != null && b11 != null) {
            b11 = dVar.b(fVar, b11);
        }
        return (com.igexin.c.a.d.a.e) b11;
    }

    public abstract Object b(Object obj) throws Exception;

    public d(String str, byte b11) {
        this.f37146c = str;
        this.f37149f = true;
    }

    public final Object a(f fVar, Object obj) throws Exception {
        if (obj == null) {
            throw new NullPointerException("Nothing to encode!");
        }
        d dVar = this.f37147d;
        if (dVar != null) {
            obj = dVar.a(fVar, obj);
        }
        return a(obj);
    }

    public final void b() {
        if (this.f37149f) {
            return;
        }
        while (true) {
            d dVar = this.f37147d;
            if (dVar == null) {
                return;
            }
            d dVar2 = dVar.f37147d;
            dVar.f37147d = null;
            this.f37147d = dVar2;
        }
    }

    private static void b(d dVar, String str, String str2, d dVar2) {
        if (str2 == null) {
            throw new NullPointerException("filter name can't be NULL");
        }
        if (dVar != null) {
            d dVar3 = dVar.f37147d;
            if (dVar.f37146c.equals(str)) {
                dVar.f37147d = dVar2;
                dVar2.f37148e = dVar;
                dVar2.f37147d = dVar3;
                dVar3.f37148e = dVar2;
            } else {
                while (dVar3.f37147d != null && !dVar3.f37146c.equals(str)) {
                    dVar3 = dVar3.f37147d;
                }
                d dVar4 = dVar3.f37147d;
                if (dVar4 == null) {
                    dVar3.f37147d = dVar2;
                    dVar2.f37148e = dVar3;
                } else {
                    dVar4.f37148e = dVar2;
                    dVar2.f37147d = dVar4;
                    dVar2.f37148e = dVar3;
                    dVar3.f37147d = dVar2;
                }
            }
        }
        dVar2.f37146c = str2;
    }

    public final void a(d dVar) {
        if (dVar == null) {
            return;
        }
        d dVar2 = dVar.f37147d;
        dVar.f37147d = this;
        this.f37148e = dVar;
        this.f37147d = dVar2;
    }

    private static void a(d dVar, String str, String str2, d dVar2) {
        if (str2 == null) {
            throw new NullPointerException("filter name can't be NULL");
        }
        if (dVar != null) {
            d dVar3 = dVar.f37148e;
            if (dVar.f37146c.equals(str)) {
                dVar2.f37147d = dVar;
                dVar.f37148e = dVar2;
                dVar2.f37148e = dVar3;
                if (dVar3 != null) {
                    dVar3.f37147d = dVar2;
                }
            } else {
                while (dVar3.f37148e != null && !dVar3.f37146c.equals(str)) {
                    dVar3 = dVar3.f37148e;
                }
                d dVar4 = dVar3.f37148e;
                if (dVar4 == null) {
                    dVar3.f37148e = dVar2;
                    dVar2.f37147d = dVar3;
                } else {
                    dVar2.f37148e = dVar4;
                    dVar3.f37148e.f37147d = dVar2;
                    dVar2.f37147d = dVar3;
                    dVar3.f37148e = dVar2;
                }
            }
        }
        dVar2.f37146c = str2;
    }
}
