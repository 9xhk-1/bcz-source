package com.igexin.c.a.b;

/* loaded from: classes7.dex */
public abstract class f extends com.igexin.c.a.d.f {

    /* renamed from: e, reason: collision with root package name */
    protected static final int f37161e = -2048;

    /* renamed from: b, reason: collision with root package name */
    public String f37162b;

    /* renamed from: c, reason: collision with root package name */
    public d f37163c;

    /* renamed from: d, reason: collision with root package name */
    public Object f37164d;

    private f(int i11, d dVar) {
        this(i11, null, dVar);
    }

    private static String a(String str) {
        String[] a11 = g.a(str);
        StringBuilder sb2 = new StringBuilder();
        if (!a11[0].equals("")) {
            sb2.append(a11[0]);
            sb2.append("://");
        }
        if (!a11[1].equals("")) {
            sb2.append(a11[1]);
        }
        if (!a11[2].equals("")) {
            sb2.append(':');
            sb2.append(a11[2]);
        }
        if (!a11[3].equals("")) {
            sb2.append(a11[3]);
            if (!a11[3].equals("/")) {
                sb2.append('/');
            }
        }
        if (!a11[4].equals("")) {
            sb2.append(a11[4]);
        }
        if (!a11[5].equals("")) {
            sb2.append(s60.d.f88057a);
            sb2.append(a11[5]);
        }
        return sb2.toString();
    }

    public f(int i11, String str, d dVar) {
        super(i11);
        if (str != null) {
            String[] a11 = g.a(str);
            StringBuilder sb2 = new StringBuilder();
            if (!a11[0].equals("")) {
                sb2.append(a11[0]);
                sb2.append("://");
            }
            if (!a11[1].equals("")) {
                sb2.append(a11[1]);
            }
            if (!a11[2].equals("")) {
                sb2.append(':');
                sb2.append(a11[2]);
            }
            if (!a11[3].equals("")) {
                sb2.append(a11[3]);
                if (!a11[3].equals("/")) {
                    sb2.append('/');
                }
            }
            if (!a11[4].equals("")) {
                sb2.append(a11[4]);
            }
            if (!a11[5].equals("")) {
                sb2.append(s60.d.f88057a);
                sb2.append(a11[5]);
            }
            this.f37162b = sb2.toString();
        }
        this.f37163c = dVar;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.a
    public void a() {
        d dVar = this.f37163c;
        if (dVar != null) {
            dVar.b();
        }
        super.a();
    }

    public f(String str, d dVar) {
        this(0, str, dVar);
    }

    private void a(f fVar) {
        super.a((com.igexin.c.a.d.f) fVar);
        this.f37162b = fVar.f37162b;
        this.f37163c = fVar.f37163c;
    }
}
