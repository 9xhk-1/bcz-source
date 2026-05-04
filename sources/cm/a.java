package cm;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import androidx.annotation.RequiresApi;
import cm.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f8788a;

    /* renamed from: b, reason: collision with root package name */
    public float f8789b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f8790c = 1.0f;

    public a() {
    }

    @RequiresApi(11)
    public void a(int i11) {
        b(i11, b.f8792b);
    }

    @RequiresApi(11)
    public void b(int i11, b.c0 c0Var) {
        ObjectAnimator l11 = l(i11, c0Var);
        l11.addUpdateListener(this.f8788a);
        l11.start();
    }

    @RequiresApi(11)
    public void c(int i11, int i12) {
        b.c0 c0Var = b.f8792b;
        e(i11, i12, c0Var, c0Var);
    }

    @RequiresApi(11)
    public void d(int i11, int i12, b.c0 c0Var) {
        ObjectAnimator l11 = l(i11, c0Var);
        ObjectAnimator m11 = m(i12, c0Var);
        if (i11 > i12) {
            l11.addUpdateListener(this.f8788a);
        } else {
            m11.addUpdateListener(this.f8788a);
        }
        l11.start();
        m11.start();
    }

    @RequiresApi(11)
    public void e(int i11, int i12, b.c0 c0Var, b.c0 c0Var2) {
        ObjectAnimator l11 = l(i11, c0Var);
        ObjectAnimator m11 = m(i12, c0Var2);
        if (i11 > i12) {
            l11.addUpdateListener(this.f8788a);
        } else {
            m11.addUpdateListener(this.f8788a);
        }
        l11.start();
        m11.start();
    }

    @RequiresApi(11)
    public void f(int i11) {
        g(i11, b.f8792b);
    }

    @RequiresApi(11)
    public void g(int i11, b.c0 c0Var) {
        ObjectAnimator m11 = m(i11, c0Var);
        m11.addUpdateListener(this.f8788a);
        m11.start();
    }

    public float h() {
        return this.f8790c;
    }

    public float i() {
        return this.f8789b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.f8790c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.a.j(float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.f8789b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.a.k(float):void");
    }

    @RequiresApi(11)
    public final ObjectAnimator l(int i11, b.c0 c0Var) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        ofFloat.setInterpolator(c0Var);
        ofFloat.setDuration(i11);
        return ofFloat;
    }

    @RequiresApi(11)
    public final ObjectAnimator m(int i11, b.c0 c0Var) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        ofFloat.setInterpolator(c0Var);
        ofFloat.setDuration(i11);
        return ofFloat;
    }

    @RequiresApi(11)
    public a(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f8788a = animatorUpdateListener;
    }
}
