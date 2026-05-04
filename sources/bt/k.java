package bt;

import android.view.animation.Interpolator;
import bt.j;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public int f7285a;

    /* renamed from: b, reason: collision with root package name */
    public j f7286b;

    /* renamed from: c, reason: collision with root package name */
    public j f7287c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f7288d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<j> f7289e;

    /* renamed from: f, reason: collision with root package name */
    public p f7290f;

    public k(j... jVarArr) {
        this.f7285a = jVarArr.length;
        ArrayList<j> arrayList = new ArrayList<>();
        this.f7289e = arrayList;
        arrayList.addAll(Arrays.asList(jVarArr));
        this.f7286b = this.f7289e.get(0);
        j jVar = this.f7289e.get(this.f7285a - 1);
        this.f7287c = jVar;
        this.f7288d = jVar.c();
    }

    public static k c(float... fArr) {
        int length = fArr.length;
        j.a[] aVarArr = new j.a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (j.a) j.g(0.0f);
            aVarArr[1] = (j.a) j.h(1.0f, fArr[0]);
        } else {
            aVarArr[0] = (j.a) j.h(0.0f, fArr[0]);
            for (int i11 = 1; i11 < length; i11++) {
                aVarArr[i11] = (j.a) j.h(i11 / (length - 1), fArr[i11]);
            }
        }
        return new g(aVarArr);
    }

    public static k d(int... iArr) {
        int length = iArr.length;
        j.b[] bVarArr = new j.b[Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = (j.b) j.i(0.0f);
            bVarArr[1] = (j.b) j.j(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (j.b) j.j(0.0f, iArr[0]);
            for (int i11 = 1; i11 < length; i11++) {
                bVarArr[i11] = (j.b) j.j(i11 / (length - 1), iArr[i11]);
            }
        }
        return new i(bVarArr);
    }

    public static k e(j... jVarArr) {
        int length = jVarArr.length;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (j jVar : jVarArr) {
            if (jVar instanceof j.a) {
                z11 = true;
            } else if (jVar instanceof j.b) {
                z12 = true;
            } else {
                z13 = true;
            }
        }
        if (z11 && !z12 && !z13) {
            j.a[] aVarArr = new j.a[length];
            while (i11 < length) {
                aVarArr[i11] = (j.a) jVarArr[i11];
                i11++;
            }
            return new g(aVarArr);
        }
        if (!z12 || z11 || z13) {
            return new k(jVarArr);
        }
        j.b[] bVarArr = new j.b[length];
        while (i11 < length) {
            bVarArr[i11] = (j.b) jVarArr[i11];
            i11++;
        }
        return new i(bVarArr);
    }

    public static k f(Object... objArr) {
        int length = objArr.length;
        j.c[] cVarArr = new j.c[Math.max(length, 2)];
        if (length == 1) {
            cVarArr[0] = (j.c) j.l(0.0f);
            cVarArr[1] = (j.c) j.m(1.0f, objArr[0]);
        } else {
            cVarArr[0] = (j.c) j.m(0.0f, objArr[0]);
            for (int i11 = 1; i11 < length; i11++) {
                cVarArr[i11] = (j.c) j.m(i11 / (length - 1), objArr[i11]);
            }
        }
        return new k(cVarArr);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public k clone() {
        ArrayList<j> arrayList = this.f7289e;
        int size = arrayList.size();
        j[] jVarArr = new j[size];
        for (int i11 = 0; i11 < size; i11++) {
            jVarArr[i11] = arrayList.get(i11).clone();
        }
        return new k(jVarArr);
    }

    public Object b(float f11) {
        int i11 = this.f7285a;
        if (i11 == 2) {
            Interpolator interpolator = this.f7288d;
            if (interpolator != null) {
                f11 = interpolator.getInterpolation(f11);
            }
            return this.f7290f.evaluate(f11, this.f7286b.e(), this.f7287c.e());
        }
        int i12 = 1;
        if (f11 <= 0.0f) {
            j jVar = this.f7289e.get(1);
            Interpolator c11 = jVar.c();
            if (c11 != null) {
                f11 = c11.getInterpolation(f11);
            }
            float b11 = this.f7286b.b();
            return this.f7290f.evaluate((f11 - b11) / (jVar.b() - b11), this.f7286b.e(), jVar.e());
        }
        if (f11 >= 1.0f) {
            j jVar2 = this.f7289e.get(i11 - 2);
            Interpolator c12 = this.f7287c.c();
            if (c12 != null) {
                f11 = c12.getInterpolation(f11);
            }
            float b12 = jVar2.b();
            return this.f7290f.evaluate((f11 - b12) / (this.f7287c.b() - b12), jVar2.e(), this.f7287c.e());
        }
        j jVar3 = this.f7286b;
        while (i12 < this.f7285a) {
            j jVar4 = this.f7289e.get(i12);
            if (f11 < jVar4.b()) {
                Interpolator c13 = jVar4.c();
                if (c13 != null) {
                    f11 = c13.getInterpolation(f11);
                }
                float b13 = jVar3.b();
                return this.f7290f.evaluate((f11 - b13) / (jVar4.b() - b13), jVar3.e(), jVar4.e());
            }
            i12++;
            jVar3 = jVar4;
        }
        return this.f7287c.e();
    }

    public void g(p pVar) {
        this.f7290f = pVar;
    }

    public String toString() {
        String str = " ";
        for (int i11 = 0; i11 < this.f7285a; i11++) {
            str = String.valueOf(str) + this.f7289e.get(i11).e() + GlideException.a.f28776d;
        }
        return str;
    }
}
