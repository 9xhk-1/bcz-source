package bq;

import com.google.zxing.NotFoundException;
import com.google.zxing.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final kp.b f7160a;

    /* renamed from: b, reason: collision with root package name */
    public final l f7161b;

    /* renamed from: c, reason: collision with root package name */
    public final l f7162c;

    /* renamed from: d, reason: collision with root package name */
    public final l f7163d;

    /* renamed from: e, reason: collision with root package name */
    public final l f7164e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7165f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7166g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7167h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7168i;

    public c(kp.b bVar, l lVar, l lVar2, l lVar3, l lVar4) throws NotFoundException {
        boolean z11 = lVar == null || lVar2 == null;
        boolean z12 = lVar3 == null || lVar4 == null;
        if (z11 && z12) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z11) {
            lVar = new l(0.0f, lVar3.d());
            lVar2 = new l(0.0f, lVar4.d());
        } else if (z12) {
            lVar3 = new l(bVar.m() - 1, lVar.d());
            lVar4 = new l(bVar.m() - 1, lVar2.d());
        }
        this.f7160a = bVar;
        this.f7161b = lVar;
        this.f7162c = lVar2;
        this.f7163d = lVar3;
        this.f7164e = lVar4;
        this.f7165f = (int) Math.min(lVar.c(), lVar2.c());
        this.f7166g = (int) Math.max(lVar3.c(), lVar4.c());
        this.f7167h = (int) Math.min(lVar.d(), lVar3.d());
        this.f7168i = (int) Math.max(lVar2.d(), lVar4.d());
    }

    public static c j(c cVar, c cVar2) throws NotFoundException {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f7160a, cVar.f7161b, cVar.f7162c, cVar2.f7163d, cVar2.f7164e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bq.c a(int r13, int r14, boolean r15) throws com.google.zxing.NotFoundException {
        /*
            r12 = this;
            com.google.zxing.l r0 = r12.f7161b
            com.google.zxing.l r1 = r12.f7162c
            com.google.zxing.l r2 = r12.f7163d
            com.google.zxing.l r3 = r12.f7164e
            if (r13 <= 0) goto L2a
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            com.google.zxing.l r13 = new com.google.zxing.l
            float r4 = r4.c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L27
            r8 = r13
        L25:
            r10 = r2
            goto L2c
        L27:
            r10 = r13
            r8 = r0
            goto L2c
        L2a:
            r8 = r0
            goto L25
        L2c:
            if (r14 <= 0) goto L5d
            if (r15 == 0) goto L33
            com.google.zxing.l r13 = r12.f7162c
            goto L35
        L33:
            com.google.zxing.l r13 = r12.f7164e
        L35:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            kp.b r14 = r12.f7160a
            int r14 = r14.h()
            if (r0 < r14) goto L4b
            kp.b r14 = r12.f7160a
            int r14 = r14.h()
            int r0 = r14 + (-1)
        L4b:
            com.google.zxing.l r14 = new com.google.zxing.l
            float r13 = r13.c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L5a
            r9 = r14
        L58:
            r11 = r3
            goto L5f
        L5a:
            r11 = r14
            r9 = r1
            goto L5f
        L5d:
            r9 = r1
            goto L58
        L5f:
            bq.c r6 = new bq.c
            kp.b r7 = r12.f7160a
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.c.a(int, int, boolean):bq.c");
    }

    public l b() {
        return this.f7162c;
    }

    public l c() {
        return this.f7164e;
    }

    public int d() {
        return this.f7166g;
    }

    public int e() {
        return this.f7168i;
    }

    public int f() {
        return this.f7165f;
    }

    public int g() {
        return this.f7167h;
    }

    public l h() {
        return this.f7161b;
    }

    public l i() {
        return this.f7163d;
    }

    public c(c cVar) {
        this.f7160a = cVar.f7160a;
        this.f7161b = cVar.h();
        this.f7162c = cVar.b();
        this.f7163d = cVar.i();
        this.f7164e = cVar.c();
        this.f7165f = cVar.f();
        this.f7166g = cVar.d();
        this.f7167h = cVar.g();
        this.f7168i = cVar.e();
    }
}
