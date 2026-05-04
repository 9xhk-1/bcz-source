package com.malmstein.fenster.view;

import android.view.SurfaceHolder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public int f39309b;

    /* renamed from: c, reason: collision with root package name */
    public int f39310c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39311d = false;

    /* renamed from: a, reason: collision with root package name */
    public C0471a f39308a = new C0471a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.malmstein.fenster.view.a$a, reason: collision with other inner class name */
    public static class C0471a {

        /* renamed from: a, reason: collision with root package name */
        public int f39312a;

        /* renamed from: b, reason: collision with root package name */
        public int f39313b;

        public int a() {
            return this.f39313b;
        }

        public int b() {
            return this.f39312a;
        }
    }

    public boolean a(int w11, int h11) {
        return this.f39309b == w11 && this.f39310c == h11;
    }

    public boolean b() {
        return this.f39309b > 0 && this.f39310c > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r1 > r6) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.malmstein.fenster.view.a.C0471a c(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f39309b
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.f39310c
            int r1 = android.view.View.getDefaultSize(r1, r7)
            boolean r2 = r5.b()
            if (r2 == 0) goto L94
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            boolean r2 = r5.f39311d
            if (r2 == 0) goto L40
            int r0 = r5.f39309b
            int r1 = r0 * r7
            int r2 = r5.f39310c
            int r3 = r6 * r2
            if (r1 >= r3) goto L36
            int r2 = r2 * r6
            int r1 = r2 / r0
        L33:
            r0 = r6
            goto L94
        L36:
            int r1 = r0 * r7
            int r3 = r6 * r2
            if (r1 <= r3) goto L7a
            int r0 = r0 * r7
            int r0 = r0 / r2
        L3e:
            r1 = r7
            goto L94
        L40:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L5d
            if (r1 != r2) goto L5d
            int r0 = r5.f39309b
            int r1 = r0 * r7
            int r2 = r5.f39310c
            int r3 = r6 * r2
            if (r1 >= r3) goto L53
            int r0 = r0 * r7
            int r0 = r0 / r2
            goto L3e
        L53:
            int r1 = r0 * r7
            int r3 = r6 * r2
            if (r1 <= r3) goto L7a
            int r2 = r2 * r6
            int r1 = r2 / r0
            goto L33
        L5d:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L6e
            int r0 = r5.f39310c
            int r0 = r0 * r6
            int r2 = r5.f39309b
            int r0 = r0 / r2
            if (r1 != r3) goto L6c
            if (r0 <= r7) goto L6c
            goto L7a
        L6c:
            r1 = r0
            goto L33
        L6e:
            if (r1 != r2) goto L7e
            int r1 = r5.f39309b
            int r1 = r1 * r7
            int r2 = r5.f39310c
            int r1 = r1 / r2
            if (r0 != r3) goto L7c
            if (r1 <= r6) goto L7c
        L7a:
            r0 = r6
            goto L3e
        L7c:
            r0 = r1
            goto L3e
        L7e:
            int r2 = r5.f39309b
            int r4 = r5.f39310c
            if (r1 != r3) goto L8a
            if (r4 <= r7) goto L8a
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L8c
        L8a:
            r1 = r2
            r7 = r4
        L8c:
            if (r0 != r3) goto L7c
            if (r1 <= r6) goto L7c
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L33
        L94:
            com.malmstein.fenster.view.a$a r6 = r5.f39308a
            r6.f39312a = r0
            r6.f39313b = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.malmstein.fenster.view.a.c(int, int):com.malmstein.fenster.view.a$a");
    }

    public void d(boolean stretch) {
        this.f39311d = stretch;
    }

    public void e(int mVideoWidth, int mVideoHeight) {
        this.f39309b = mVideoWidth;
        this.f39310c = mVideoHeight;
    }

    public void f(SurfaceHolder holder) {
        holder.setFixedSize(this.f39309b, this.f39310c);
    }
}
