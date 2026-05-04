package b0;

import a00.h0;
import a00.r0;
import androidx.exifinterface.media.ExifInterface;
import f0.h;
import i0.i;
import i0.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import o0.j;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nComponentRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentRegistry.kt\ncoil/ComponentRegistry\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n12#2,2:178\n15#2:181\n12#2,4:182\n1#3:180\n*S KotlinDebug\n*F\n+ 1 ComponentRegistry.kt\ncoil/ComponentRegistry\n*L\n38#1:178,2\n38#1:181\n52#1:182,4\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<k0.b> f5577a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Pair<m0.d<? extends Object, ? extends Object>, Class<? extends Object>>> f5578b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Pair<l0.b<? extends Object>, Class<? extends Object>>> f5579c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> f5580d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<h.a> f5581e;

    public /* synthetic */ b(List list, List list2, List list3, List list4, List list5, v vVar) {
        this(list, list2, list3, list4, list5);
    }

    public static /* synthetic */ Pair k(b bVar, m mVar, j jVar, f fVar, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return bVar.j(mVar, jVar, fVar, i11);
    }

    public static /* synthetic */ Pair n(b bVar, Object obj, j jVar, f fVar, int i11, int i12, Object obj2) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return bVar.m(obj, jVar, fVar, i11);
    }

    @k
    public final List<h.a> a() {
        return this.f5581e;
    }

    @k
    public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> b() {
        return this.f5580d;
    }

    @k
    public final List<k0.b> c() {
        return this.f5577a;
    }

    @k
    public final List<Pair<l0.b<? extends Object>, Class<? extends Object>>> d() {
        return this.f5579c;
    }

    @k
    public final List<Pair<m0.d<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.f5578b;
    }

    @l
    public final String f(@k Object obj, @k j jVar) {
        List<Pair<l0.b<? extends Object>, Class<? extends Object>>> list = this.f5579c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Pair<l0.b<? extends Object>, Class<? extends Object>> pair = list.get(i11);
            l0.b<? extends Object> component1 = pair.component1();
            if (pair.component2().isAssignableFrom(obj.getClass())) {
                g0.n(component1, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String a11 = component1.a(obj, jVar);
                if (a11 != null) {
                    return a11;
                }
            }
        }
        return null;
    }

    @k
    public final Object g(@k Object obj, @k j jVar) {
        List<Pair<m0.d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f5578b;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Pair<m0.d<? extends Object, ? extends Object>, Class<? extends Object>> pair = list.get(i11);
            m0.d<? extends Object, ? extends Object> component1 = pair.component1();
            if (pair.component2().isAssignableFrom(obj.getClass())) {
                g0.n(component1, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object a11 = component1.a(obj, jVar);
                if (a11 != null) {
                    obj = a11;
                }
            }
        }
        return obj;
    }

    @k
    public final a h() {
        return new a(this);
    }

    @l
    @w00.k
    public final Pair<f0.h, Integer> i(@k m mVar, @k j jVar, @k f fVar) {
        return k(this, mVar, jVar, fVar, 0, 8, null);
    }

    @l
    @w00.k
    public final Pair<f0.h, Integer> j(@k m mVar, @k j jVar, @k f fVar, int i11) {
        int size = this.f5581e.size();
        while (i11 < size) {
            f0.h a11 = this.f5581e.get(i11).a(mVar, jVar, fVar);
            if (a11 != null) {
                return h1.a(a11, Integer.valueOf(i11));
            }
            i11++;
        }
        return null;
    }

    @l
    @w00.k
    public final Pair<i0.i, Integer> l(@k Object obj, @k j jVar, @k f fVar) {
        return n(this, obj, jVar, fVar, 0, 8, null);
    }

    @l
    @w00.k
    public final Pair<i0.i, Integer> m(@k Object obj, @k j jVar, @k f fVar, int i11) {
        int size = this.f5580d.size();
        while (i11 < size) {
            Pair<i.a<? extends Object>, Class<? extends Object>> pair = this.f5580d.get(i11);
            i.a<? extends Object> component1 = pair.component1();
            if (pair.component2().isAssignableFrom(obj.getClass())) {
                g0.n(component1, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                i0.i a11 = component1.a(obj, jVar, fVar);
                if (a11 != null) {
                    return h1.a(a11, Integer.valueOf(i11));
                }
            }
            i11++;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends k0.b> list, List<? extends Pair<? extends m0.d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends l0.b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends i.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends h.a> list5) {
        this.f5577a = list;
        this.f5578b = list2;
        this.f5579c = list3;
        this.f5580d = list4;
        this.f5581e = list5;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<k0.b> f5582a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Pair<m0.d<? extends Object, ?>, Class<? extends Object>>> f5583b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<Pair<l0.b<? extends Object>, Class<? extends Object>>> f5584c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> f5585d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<h.a> f5586e;

        public a() {
            this.f5582a = new ArrayList();
            this.f5583b = new ArrayList();
            this.f5584c = new ArrayList();
            this.f5585d = new ArrayList();
            this.f5586e = new ArrayList();
        }

        @k
        public final a a(@k h.a aVar) {
            this.f5586e.add(aVar);
            return this;
        }

        public final /* synthetic */ <T> a b(i.a<T> aVar) {
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return c(aVar, Object.class);
        }

        @k
        public final <T> a c(@k i.a<T> aVar, @k Class<T> cls) {
            this.f5585d.add(h1.a(aVar, cls));
            return this;
        }

        @k
        public final a d(@k k0.b bVar) {
            this.f5582a.add(bVar);
            return this;
        }

        public final /* synthetic */ <T> a e(l0.b<T> bVar) {
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return f(bVar, Object.class);
        }

        @k
        public final <T> a f(@k l0.b<T> bVar, @k Class<T> cls) {
            this.f5584c.add(h1.a(bVar, cls));
            return this;
        }

        public final /* synthetic */ <T> a g(m0.d<T, ?> dVar) {
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return h(dVar, Object.class);
        }

        @k
        public final <T> a h(@k m0.d<T, ?> dVar, @k Class<T> cls) {
            this.f5583b.add(h1.a(dVar, cls));
            return this;
        }

        @k
        public final b i() {
            return new b(u0.c.g(this.f5582a), u0.c.g(this.f5583b), u0.c.g(this.f5584c), u0.c.g(this.f5585d), u0.c.g(this.f5586e), null);
        }

        @k
        public final List<h.a> j() {
            return this.f5586e;
        }

        @k
        public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> k() {
            return this.f5585d;
        }

        @k
        public final List<k0.b> l() {
            return this.f5582a;
        }

        @k
        public final List<Pair<l0.b<? extends Object>, Class<? extends Object>>> m() {
            return this.f5584c;
        }

        @k
        public final List<Pair<m0.d<? extends Object, ?>, Class<? extends Object>>> n() {
            return this.f5583b;
        }

        public a(@k b bVar) {
            this.f5582a = r0.d6(bVar.c());
            this.f5583b = r0.d6(bVar.e());
            this.f5584c = r0.d6(bVar.d());
            this.f5585d = r0.d6(bVar.b());
            this.f5586e = r0.d6(bVar.a());
        }
    }

    public b() {
        this(h0.J(), h0.J(), h0.J(), h0.J(), h0.J());
    }
}
