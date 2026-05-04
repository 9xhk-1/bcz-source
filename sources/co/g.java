package co;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final f f9387a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final f f9388b = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements f {
        @Override // co.f
        public h a(float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            float n11 = w.n(f14, f16, f12, f13, f11, true);
            float f18 = n11 / f14;
            float f19 = n11 / f16;
            return new h(f18, f19, n11, f15 * f18, n11, f17 * f19);
        }

        @Override // co.f
        public boolean b(h hVar) {
            return hVar.f9392d > hVar.f9394f;
        }

        @Override // co.f
        public void c(RectF rectF, float f11, h hVar) {
            rectF.bottom -= Math.abs(hVar.f9394f - hVar.f9392d) * f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements f {
        @Override // co.f
        public h a(float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            float n11 = w.n(f15, f17, f12, f13, f11, true);
            float f18 = n11 / f15;
            float f19 = n11 / f17;
            return new h(f18, f19, f14 * f18, n11, f16 * f19, n11);
        }

        @Override // co.f
        public boolean b(h hVar) {
            return hVar.f9391c > hVar.f9393e;
        }

        @Override // co.f
        public void c(RectF rectF, float f11, h hVar) {
            float abs = (Math.abs(hVar.f9393e - hVar.f9391c) / 2.0f) * f11;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    public static f a(int i11, boolean z11, RectF rectF, RectF rectF2) {
        if (i11 == 0) {
            return b(z11, rectF, rectF2) ? f9387a : f9388b;
        }
        if (i11 == 1) {
            return f9387a;
        }
        if (i11 == 2) {
            return f9388b;
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
