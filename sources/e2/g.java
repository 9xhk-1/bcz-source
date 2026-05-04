package e2;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.a;
import e2.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Vector3 f48407b = new Vector3();

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.graphics.a f48408a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends g {

        /* renamed from: c, reason: collision with root package name */
        public float[] f48409c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f48410d;

        /* renamed from: e, reason: collision with root package name */
        public int[] f48411e;

        /* renamed from: f, reason: collision with root package name */
        public int f48412f = 0;

        @Override // e2.g
        public void a(int i11) {
            if (this.f48412f < i11) {
                this.f48409c = new float[i11];
                this.f48410d = new int[i11];
                this.f48411e = new int[i11];
                this.f48412f = i11;
            }
        }

        @Override // e2.g
        public <T extends i2.f> int[] c(com.badlogic.gdx.utils.a<T> aVar) {
            float[] fArr = this.f48408a.f11512e.val;
            float f11 = fArr[2];
            float f12 = fArr[6];
            float f13 = fArr[10];
            a.b<T> it = aVar.iterator();
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                T next = it.next();
                int i13 = next.f60126a.f48380e.f48329c + i12;
                int i14 = 0;
                while (i12 < i13) {
                    float[] fArr2 = this.f48409c;
                    a.d dVar = next.f60127b;
                    float[] fArr3 = dVar.f48337e;
                    fArr2[i12] = (fArr3[i14] * f11) + (fArr3[i14 + 1] * f12) + (fArr3[i14 + 2] * f13);
                    this.f48410d[i12] = i12;
                    i12++;
                    i14 += dVar.f48332c;
                }
                i11 += next.f60126a.f48380e.f48329c;
            }
            d(0, i11 - 1);
            for (int i15 = 0; i15 < i11; i15++) {
                this.f48411e[this.f48410d[i15]] = i15;
            }
            return this.f48411e;
        }

        public void d(int i11, int i12) {
            if (i11 < i12) {
                if (i12 - i11 <= 8) {
                    for (int i13 = i11; i13 <= i12; i13++) {
                        for (int i14 = i13; i14 > i11; i14--) {
                            float[] fArr = this.f48409c;
                            int i15 = i14 - 1;
                            float f11 = fArr[i15];
                            float f12 = fArr[i14];
                            if (f11 > f12) {
                                fArr[i14] = f11;
                                fArr[i15] = f12;
                                int[] iArr = this.f48410d;
                                int i16 = iArr[i14];
                                iArr[i14] = iArr[i15];
                                iArr[i15] = i16;
                            }
                        }
                    }
                    return;
                }
                float f13 = this.f48409c[i11];
                int i17 = i11 + 1;
                int i18 = this.f48410d[i11];
                int i19 = i17;
                while (i17 <= i12) {
                    float[] fArr2 = this.f48409c;
                    float f14 = fArr2[i17];
                    if (f13 > f14) {
                        if (i17 > i19) {
                            fArr2[i17] = fArr2[i19];
                            fArr2[i19] = f14;
                            int[] iArr2 = this.f48410d;
                            int i21 = iArr2[i17];
                            iArr2[i17] = iArr2[i19];
                            iArr2[i19] = i21;
                        }
                        i19++;
                    }
                    i17++;
                }
                float[] fArr3 = this.f48409c;
                int i22 = i19 - 1;
                fArr3[i11] = fArr3[i22];
                fArr3[i22] = f13;
                int[] iArr3 = this.f48410d;
                iArr3[i11] = iArr3[i22];
                iArr3[i22] = i18;
                d(i11, i19 - 2);
                d(i19, i12);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends g {

        /* renamed from: c, reason: collision with root package name */
        public int f48413c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int[] f48414d;

        @Override // e2.g
        public void a(int i11) {
            if (this.f48413c < i11) {
                this.f48414d = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    this.f48414d[i12] = i12;
                }
                this.f48413c = i11;
            }
        }

        @Override // e2.g
        public <T extends i2.f> int[] c(com.badlogic.gdx.utils.a<T> aVar) {
            return this.f48414d;
        }
    }

    public void b(com.badlogic.gdx.graphics.a aVar) {
        this.f48408a = aVar;
    }

    public abstract <T extends i2.f> int[] c(com.badlogic.gdx.utils.a<T> aVar);

    public void a(int i11) {
    }
}
