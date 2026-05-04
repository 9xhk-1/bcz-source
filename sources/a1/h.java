package a1;

import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1312a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends h {

        /* renamed from: f, reason: collision with root package name */
        public static final int f1313f = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final Integer f1314b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final Integer f1315c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f1316d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public final Integer f1317e;

        public a() {
            this(null, null, false, 7, null);
        }

        public static /* synthetic */ a g(a aVar, Integer num, Integer num2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = aVar.f1314b;
            }
            if ((i11 & 2) != 0) {
                num2 = aVar.f1315c;
            }
            if ((i11 & 4) != 0) {
                z11 = aVar.f1316d;
            }
            return aVar.f(num, num2, z11);
        }

        @Override // a1.h
        public float a(@m80.k com.airbnb.lottie.k composition) {
            g0.p(composition, "composition");
            if (this.f1317e == null) {
                return 1.0f;
            }
            return u.H(r0.intValue() / composition.f(), 0.0f, 1.0f);
        }

        @Override // a1.h
        public float b(@m80.k com.airbnb.lottie.k composition) {
            g0.p(composition, "composition");
            if (this.f1314b == null) {
                return 0.0f;
            }
            return u.H(r0.intValue() / composition.f(), 0.0f, 1.0f);
        }

        @m80.l
        public final Integer c() {
            return this.f1314b;
        }

        @m80.l
        public final Integer d() {
            return this.f1315c;
        }

        public final boolean e() {
            return this.f1316d;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return g0.g(this.f1314b, aVar.f1314b) && g0.g(this.f1315c, aVar.f1315c) && this.f1316d == aVar.f1316d;
        }

        @m80.k
        public final a f(@m80.l Integer num, @m80.l Integer num2, boolean z11) {
            return new a(num, num2, z11);
        }

        @m80.l
        public final Integer h() {
            return this.f1315c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Integer num = this.f1314b;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f1315c;
            int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
            boolean z11 = this.f1316d;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode2 + i11;
        }

        public final boolean i() {
            return this.f1316d;
        }

        @m80.l
        public final Integer j() {
            return this.f1314b;
        }

        @m80.k
        public String toString() {
            return "Frame(min=" + this.f1314b + ", max=" + this.f1315c + ", maxInclusive=" + this.f1316d + ')';
        }

        public /* synthetic */ a(Integer num, Integer num2, boolean z11, int i11, v vVar) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? true : z11);
        }

        public a(@m80.l Integer num, @m80.l Integer num2, boolean z11) {
            super(null);
            this.f1314b = num;
            this.f1315c = num2;
            this.f1316d = z11;
            if (num2 == null) {
                num2 = null;
            } else if (!z11) {
                num2 = Integer.valueOf(num2.intValue() - 1);
            }
            this.f1317e = num2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b extends h {

        /* renamed from: c, reason: collision with root package name */
        public static final int f1318c = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f1319b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k String marker) {
            super(null);
            g0.p(marker, "marker");
            this.f1319b = marker;
        }

        public static /* synthetic */ b e(b bVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f1319b;
            }
            return bVar.d(str);
        }

        @Override // a1.h
        public float a(@m80.k com.airbnb.lottie.k composition) {
            g0.p(composition, "composition");
            c1.g l11 = composition.l(this.f1319b);
            if (l11 == null) {
                return 1.0f;
            }
            return u.H((l11.f7469b + l11.f7470c) / composition.f(), 0.0f, 1.0f);
        }

        @Override // a1.h
        public float b(@m80.k com.airbnb.lottie.k composition) {
            g0.p(composition, "composition");
            c1.g l11 = composition.l(this.f1319b);
            return u.H((l11 == null ? 0.0f : l11.f7469b) / composition.f(), 0.0f, 1.0f);
        }

        @m80.k
        public final String c() {
            return this.f1319b;
        }

        @m80.k
        public final b d(@m80.k String marker) {
            g0.p(marker, "marker");
            return new b(marker);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && g0.g(this.f1319b, ((b) obj).f1319b);
        }

        @m80.k
        public final String f() {
            return this.f1319b;
        }

        public int hashCode() {
            return this.f1319b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Marker(marker=" + this.f1319b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class c extends h {

        /* renamed from: e, reason: collision with root package name */
        public static final int f1320e = 0;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final String f1321b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final String f1322c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f1323d;

        public c() {
            this(null, null, false, 7, null);
        }

        public static /* synthetic */ c g(c cVar, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cVar.f1321b;
            }
            if ((i11 & 2) != 0) {
                str2 = cVar.f1322c;
            }
            if ((i11 & 4) != 0) {
                z11 = cVar.f1323d;
            }
            return cVar.f(str, str2, z11);
        }

        @Override // a1.h
        public float a(@m80.k com.airbnb.lottie.k composition) {
            g0.p(composition, "composition");
            String str = this.f1322c;
            if (str == null) {
                return 1.0f;
            }
            int i11 = this.f1323d ? 0 : -1;
            c1.g l11 = composition.l(str);
            return u.H((l11 == null ? 0.0f : l11.f7469b + i11) / composition.f(), 0.0f, 1.0f);
        }

        @Override // a1.h
        public float b(@m80.k com.airbnb.lottie.k composition) {
            g0.p(composition, "composition");
            String str = this.f1321b;
            if (str == null) {
                return 0.0f;
            }
            c1.g l11 = composition.l(str);
            return u.H((l11 == null ? 0.0f : l11.f7469b) / composition.f(), 0.0f, 1.0f);
        }

        @m80.l
        public final String c() {
            return this.f1321b;
        }

        @m80.l
        public final String d() {
            return this.f1322c;
        }

        public final boolean e() {
            return this.f1323d;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return g0.g(this.f1321b, cVar.f1321b) && g0.g(this.f1322c, cVar.f1322c) && this.f1323d == cVar.f1323d;
        }

        @m80.k
        public final c f(@m80.l String str, @m80.l String str2, boolean z11) {
            return new c(str, str2, z11);
        }

        @m80.l
        public final String h() {
            return this.f1322c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.f1321b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f1322c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z11 = this.f1323d;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode2 + i11;
        }

        public final boolean i() {
            return this.f1323d;
        }

        @m80.l
        public final String j() {
            return this.f1321b;
        }

        @m80.k
        public String toString() {
            return "Markers(min=" + ((Object) this.f1321b) + ", max=" + ((Object) this.f1322c) + ", maxInclusive=" + this.f1323d + ')';
        }

        public /* synthetic */ c(String str, String str2, boolean z11, int i11, v vVar) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? true : z11);
        }

        public c(@m80.l String str, @m80.l String str2, boolean z11) {
            super(null);
            this.f1321b = str;
            this.f1322c = str2;
            this.f1323d = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class d extends h {

        /* renamed from: d, reason: collision with root package name */
        public static final int f1324d = 0;

        /* renamed from: b, reason: collision with root package name */
        public final float f1325b;

        /* renamed from: c, reason: collision with root package name */
        public final float f1326c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.h.d.<init>():void");
        }

        public static /* synthetic */ d f(d dVar, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = dVar.f1325b;
            }
            if ((i11 & 2) != 0) {
                f12 = dVar.f1326c;
            }
            return dVar.e(f11, f12);
        }

        @Override // a1.h
        public float a(@m80.k com.airbnb.lottie.k composition) {
            g0.p(composition, "composition");
            return this.f1326c;
        }

        @Override // a1.h
        public float b(@m80.k com.airbnb.lottie.k composition) {
            g0.p(composition, "composition");
            return this.f1325b;
        }

        public final float c() {
            return this.f1325b;
        }

        public final float d() {
            return this.f1326c;
        }

        @m80.k
        public final d e(float f11, float f12) {
            return new d(f11, f12);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return g0.g(Float.valueOf(this.f1325b), Float.valueOf(dVar.f1325b)) && g0.g(Float.valueOf(this.f1326c), Float.valueOf(dVar.f1326c));
        }

        public final float g() {
            return this.f1326c;
        }

        public final float h() {
            return this.f1325b;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1325b) * 31) + Float.hashCode(this.f1326c);
        }

        @m80.k
        public String toString() {
            return "Progress(min=" + this.f1325b + ", max=" + this.f1326c + ')';
        }

        public /* synthetic */ d(float f11, float f12, int i11, v vVar) {
            this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 1.0f : f12);
        }

        public d(float f11, float f12) {
            super(null);
            this.f1325b = f11;
            this.f1326c = f12;
        }
    }

    public /* synthetic */ h(v vVar) {
        this();
    }

    public abstract float a(@m80.k com.airbnb.lottie.k kVar);

    public abstract float b(@m80.k com.airbnb.lottie.k kVar);

    public h() {
    }
}
