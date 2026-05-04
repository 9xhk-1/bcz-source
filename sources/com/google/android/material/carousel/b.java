package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f30925a;

    /* renamed from: b, reason: collision with root package name */
    public final List<c> f30926b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30927c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30928d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0368b {

        /* renamed from: j, reason: collision with root package name */
        public static final int f30929j = -1;

        /* renamed from: k, reason: collision with root package name */
        public static final float f30930k = Float.MIN_VALUE;

        /* renamed from: a, reason: collision with root package name */
        public final float f30931a;

        /* renamed from: b, reason: collision with root package name */
        public final float f30932b;

        /* renamed from: d, reason: collision with root package name */
        public c f30934d;

        /* renamed from: e, reason: collision with root package name */
        public c f30935e;

        /* renamed from: c, reason: collision with root package name */
        public final List<c> f30933c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public int f30936f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f30937g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f30938h = 0.0f;

        /* renamed from: i, reason: collision with root package name */
        public int f30939i = -1;

        public C0368b(float f11, float f12) {
            this.f30931a = f11;
            this.f30932b = f12;
        }

        public static float j(float f11, float f12, int i11, int i12) {
            return (f11 - (i11 * f12)) + (i12 * f12);
        }

        @NonNull
        @uo.a
        public C0368b a(float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, float f13) {
            return d(f11, f12, f13, false, true);
        }

        @NonNull
        @uo.a
        public C0368b b(float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, float f13) {
            return c(f11, f12, f13, false);
        }

        @NonNull
        @uo.a
        public C0368b c(float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, float f13, boolean z11) {
            return d(f11, f12, f13, z11, false);
        }

        @NonNull
        @uo.a
        public C0368b d(float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, float f13, boolean z11, boolean z12) {
            float f14;
            float f15 = f13 / 2.0f;
            float f16 = f11 - f15;
            float f17 = f15 + f11;
            float f18 = this.f30932b;
            if (f17 > f18) {
                f14 = Math.abs(f17 - Math.max(f17 - f13, f18));
            } else {
                f14 = 0.0f;
                if (f16 < 0.0f) {
                    f14 = Math.abs(f16 - Math.min(f16 + f13, 0.0f));
                }
            }
            return e(f11, f12, f13, z11, z12, f14);
        }

        @NonNull
        @uo.a
        public C0368b e(float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, float f13, boolean z11, boolean z12, float f14) {
            return f(f11, f12, f13, z11, z12, f14, 0.0f, 0.0f);
        }

        @NonNull
        @uo.a
        public C0368b f(float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, float f13, boolean z11, boolean z12, float f14, float f15, float f16) {
            if (f13 <= 0.0f) {
                return this;
            }
            if (z12) {
                if (z11) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i11 = this.f30939i;
                if (i11 != -1 && i11 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f30939i = this.f30933c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f11, f12, f13, z12, f14, f15, f16);
            if (z11) {
                if (this.f30934d == null) {
                    this.f30934d = cVar;
                    this.f30936f = this.f30933c.size();
                }
                if (this.f30937g != -1 && this.f30933c.size() - this.f30937g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f13 != this.f30934d.f30943d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f30935e = cVar;
                this.f30937g = this.f30933c.size();
            } else {
                if (this.f30934d == null && cVar.f30943d < this.f30938h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f30935e != null && cVar.f30943d > this.f30938h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f30938h = cVar.f30943d;
            this.f30933c.add(cVar);
            return this;
        }

        @NonNull
        @uo.a
        public C0368b g(float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, float f13, int i11) {
            return h(f11, f12, f13, i11, false);
        }

        @NonNull
        @uo.a
        public C0368b h(float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, float f13, int i11, boolean z11) {
            if (i11 > 0 && f13 > 0.0f) {
                for (int i12 = 0; i12 < i11; i12++) {
                    c((i12 * f13) + f11, f12, f13, z11);
                }
            }
            return this;
        }

        @NonNull
        public b i() {
            if (this.f30934d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f30933c.size(); i11++) {
                c cVar = this.f30933c.get(i11);
                arrayList.add(new c(j(this.f30934d.f30941b, this.f30931a, this.f30936f, i11), cVar.f30941b, cVar.f30942c, cVar.f30943d, cVar.f30944e, cVar.f30945f, cVar.f30946g, cVar.f30947h));
            }
            return new b(this.f30931a, arrayList, this.f30936f, this.f30937g);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final float f30940a;

        /* renamed from: b, reason: collision with root package name */
        public final float f30941b;

        /* renamed from: c, reason: collision with root package name */
        public final float f30942c;

        /* renamed from: d, reason: collision with root package name */
        public final float f30943d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f30944e;

        /* renamed from: f, reason: collision with root package name */
        public final float f30945f;

        /* renamed from: g, reason: collision with root package name */
        public final float f30946g;

        /* renamed from: h, reason: collision with root package name */
        public final float f30947h;

        public c(float f11, float f12, float f13, float f14) {
            this(f11, f12, f13, f14, false, 0.0f, 0.0f, 0.0f);
        }

        public static c a(c cVar, c cVar2, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
            return new c(vm.b.a(cVar.f30940a, cVar2.f30940a, f11), vm.b.a(cVar.f30941b, cVar2.f30941b, f11), vm.b.a(cVar.f30942c, cVar2.f30942c, f11), vm.b.a(cVar.f30943d, cVar2.f30943d, f11));
        }

        public c(float f11, float f12, float f13, float f14, boolean z11, float f15, float f16, float f17) {
            this.f30940a = f11;
            this.f30941b = f12;
            this.f30942c = f13;
            this.f30943d = f14;
            this.f30944e = z11;
            this.f30945f = f15;
            this.f30946g = f16;
            this.f30947h = f17;
        }
    }

    public static b m(b bVar, b bVar2, float f11) {
        if (bVar.f() != bVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<c> g11 = bVar.g();
        List<c> g12 = bVar2.g();
        if (g11.size() != g12.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < bVar.g().size(); i11++) {
            arrayList.add(c.a(g11.get(i11), g12.get(i11), f11));
        }
        return new b(bVar.f(), arrayList, vm.b.c(bVar.b(), bVar2.b(), f11), vm.b.c(bVar.i(), bVar2.i(), f11));
    }

    public static b n(b bVar, float f11) {
        C0368b c0368b = new C0368b(bVar.f(), f11);
        float f12 = (f11 - bVar.j().f30941b) - (bVar.j().f30943d / 2.0f);
        int size = bVar.g().size() - 1;
        while (size >= 0) {
            c cVar = bVar.g().get(size);
            c0368b.d((cVar.f30943d / 2.0f) + f12, cVar.f30942c, cVar.f30943d, size >= bVar.b() && size <= bVar.i(), cVar.f30944e);
            f12 += cVar.f30943d;
            size--;
        }
        return c0368b.i();
    }

    public c a() {
        return this.f30926b.get(this.f30927c);
    }

    public int b() {
        return this.f30927c;
    }

    public c c() {
        return this.f30926b.get(0);
    }

    @Nullable
    public c d() {
        for (int i11 = 0; i11 < this.f30926b.size(); i11++) {
            c cVar = this.f30926b.get(i11);
            if (!cVar.f30944e) {
                return cVar;
            }
        }
        return null;
    }

    public List<c> e() {
        return this.f30926b.subList(this.f30927c, this.f30928d + 1);
    }

    public float f() {
        return this.f30925a;
    }

    public List<c> g() {
        return this.f30926b;
    }

    public c h() {
        return this.f30926b.get(this.f30928d);
    }

    public int i() {
        return this.f30928d;
    }

    public c j() {
        return this.f30926b.get(r0.size() - 1);
    }

    @Nullable
    public c k() {
        for (int size = this.f30926b.size() - 1; size >= 0; size--) {
            c cVar = this.f30926b.get(size);
            if (!cVar.f30944e) {
                return cVar;
            }
        }
        return null;
    }

    public int l() {
        Iterator<c> it = this.f30926b.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().f30944e) {
                i11++;
            }
        }
        return this.f30926b.size() - i11;
    }

    public b(float f11, List<c> list, int i11, int i12) {
        this.f30925a = f11;
        this.f30926b = Collections.unmodifiableList(list);
        this.f30927c = i11;
        this.f30928d = i12;
    }
}
