package bo;

import android.graphics.RectF;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final f f7026a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final f f7027b = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements f {
        @Override // bo.f
        public h a(float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            float n11 = v.n(f14, f16, f12, f13, f11, true);
            float f18 = n11 / f14;
            float f19 = n11 / f16;
            return new h(f18, f19, n11, f15 * f18, n11, f17 * f19);
        }

        @Override // bo.f
        public void b(RectF rectF, float f11, h hVar) {
            rectF.bottom -= Math.abs(hVar.f7033f - hVar.f7031d) * f11;
        }

        @Override // bo.f
        public boolean c(h hVar) {
            return hVar.f7031d > hVar.f7033f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements f {
        @Override // bo.f
        public h a(float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            float n11 = v.n(f15, f17, f12, f13, f11, true);
            float f18 = n11 / f15;
            float f19 = n11 / f17;
            return new h(f18, f19, f14 * f18, n11, f16 * f19, n11);
        }

        @Override // bo.f
        public void b(RectF rectF, float f11, h hVar) {
            float abs = (Math.abs(hVar.f7032e - hVar.f7030c) / 2.0f) * f11;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // bo.f
        public boolean c(h hVar) {
            return hVar.f7030c > hVar.f7032e;
        }
    }

    public static f a(int i11, boolean z11, RectF rectF, RectF rectF2) {
        if (i11 == 0) {
            return b(z11, rectF, rectF2) ? f7026a : f7027b;
        }
        if (i11 == 1) {
            return f7026a;
        }
        if (i11 == 2) {
            return f7027b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i11);
    }

    public static boolean b(boolean z11, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        return z11 ? (height2 * width) / width2 >= height : (width2 * height) / width >= height2;
    }
}
