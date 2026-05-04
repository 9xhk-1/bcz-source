package com.badlogic.gdx.math;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float[] f12741a;

    /* renamed from: c, reason: collision with root package name */
    public int f12743c;

    /* renamed from: b, reason: collision with root package name */
    public int f12742b = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f12744d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12745e = true;

    public u(int i11) {
        this.f12741a = new float[i11];
    }

    public void a(float f11) {
        int i11 = this.f12742b;
        float[] fArr = this.f12741a;
        if (i11 < fArr.length) {
            this.f12742b = i11 + 1;
        }
        int i12 = this.f12743c;
        int i13 = i12 + 1;
        this.f12743c = i13;
        fArr[i12] = f11;
        if (i13 > fArr.length - 1) {
            this.f12743c = 0;
        }
        this.f12745e = true;
    }

    public void b() {
        int i11 = 0;
        this.f12742b = 0;
        this.f12743c = 0;
        while (true) {
            float[] fArr = this.f12741a;
            if (i11 >= fArr.length) {
                this.f12745e = true;
                return;
            } else {
                fArr[i11] = 0.0f;
                i11++;
            }
        }
    }

    public float c() {
        float f11 = Float.MIN_NORMAL;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f12741a;
            if (i11 >= fArr.length) {
                return f11;
            }
            f11 = Math.max(f11, fArr[i11]);
            i11++;
        }
    }

    public float d() {
        float[] fArr = this.f12741a;
        int i11 = this.f12743c;
        if (i11 - 1 == -1) {
            i11 = fArr.length;
        }
        return fArr[i11 - 1];
    }

    public float e() {
        float f11 = Float.MAX_VALUE;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f12741a;
            if (i11 >= fArr.length) {
                return f11;
            }
            f11 = Math.min(f11, fArr[i11]);
            i11++;
        }
    }

    public float f() {
        float[] fArr;
        float f11 = 0.0f;
        if (!k()) {
            return 0.0f;
        }
        if (this.f12745e) {
            int i11 = 0;
            while (true) {
                fArr = this.f12741a;
                if (i11 >= fArr.length) {
                    break;
                }
                f11 += fArr[i11];
                i11++;
            }
            this.f12744d = f11 / fArr.length;
            this.f12745e = false;
        }
        return this.f12744d;
    }

    public float g() {
        int i11 = this.f12742b;
        float[] fArr = this.f12741a;
        return i11 < fArr.length ? fArr[0] : fArr[this.f12743c];
    }

    public int h() {
        return this.f12742b;
    }

    public int i() {
        return this.f12741a.length;
    }

    public float[] j() {
        int i11 = this.f12742b;
        float[] fArr = new float[i11];
        if (!k()) {
            System.arraycopy(this.f12741a, 0, fArr, 0, this.f12742b);
            return fArr;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            float[] fArr2 = this.f12741a;
            fArr[i12] = fArr2[(this.f12743c + i12) % fArr2.length];
        }
        return fArr;
    }

    public boolean k() {
        return this.f12742b >= this.f12741a.length;
    }

    public float l() {
        float f11 = 0.0f;
        if (!k()) {
            return 0.0f;
        }
        float f12 = f();
        int i11 = 0;
        while (true) {
            float[] fArr = this.f12741a;
            if (i11 >= fArr.length) {
                return (float) Math.sqrt(f11 / fArr.length);
            }
            float f13 = fArr[i11];
            f11 += (f13 - f12) * (f13 - f12);
            i11++;
        }
    }
}
