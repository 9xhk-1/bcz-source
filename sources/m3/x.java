package m3;

import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class x {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f72106c;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<Long> f72107a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<w1> f72108b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72109a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72109a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.GetWordCollectionStatusRspVo", aVar, 2);
            l2Var.q("collectedBooks", false);
            l2Var.q("allBooks", false);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @m80.k
        public final h50.f a() {
            return descriptor;
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            yz.c0[] c0VarArr = x.f72106c;
            return new f50.i[]{c0VarArr[0].getValue(), c0VarArr[1].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final x e(@m80.k i50.f decoder) {
            List list;
            List list2;
            int i11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = x.f72106c;
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                list2 = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), null);
                list = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                List list3 = null;
                List list4 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        list4 = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), list4);
                        i12 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list3 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), list3);
                        i12 |= 2;
                    }
                }
                list = list3;
                list2 = list4;
                i11 = i12;
            }
            beginStructure.endStructure(fVar);
            return new x(i11, list2, list, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k x value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            x.n(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<x> serializer() {
            return a.f72109a;
        }

        public b() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f72106c = new yz.c0[]{yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: m3.v
            @Override // x00.a
            public final Object invoke() {
                f50.i c11;
                c11 = x.c();
                return c11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: m3.w
            @Override // x00.a
            public final Object invoke() {
                f50.i d11;
                d11 = x.d();
                return d11;
            }
        })};
    }

    public /* synthetic */ x(int i11, List list, List list2, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f72109a.a());
        }
        this.f72107a = list;
        this.f72108b = list2;
    }

    public static final /* synthetic */ f50.i c() {
        return new j50.f(j50.l1.f63406a);
    }

    public static final /* synthetic */ f50.i d() {
        return new j50.f(w1.a.f72105a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x i(x xVar, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = xVar.f72107a;
        }
        if ((i11 & 2) != 0) {
            list2 = xVar.f72108b;
        }
        return xVar.h(list, list2);
    }

    @w00.o
    public static final /* synthetic */ void n(x xVar, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f72106c;
        eVar.encodeSerializableElement(fVar, 0, c0VarArr[0].getValue(), xVar.f72107a);
        eVar.encodeSerializableElement(fVar, 1, c0VarArr[1].getValue(), xVar.f72108b);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.g0.g(this.f72107a, xVar.f72107a) && kotlin.jvm.internal.g0.g(this.f72108b, xVar.f72108b);
    }

    @m80.k
    public final List<Long> f() {
        return this.f72107a;
    }

    @m80.k
    public final List<w1> g() {
        return this.f72108b;
    }

    @m80.k
    public final x h(@m80.k List<Long> collectedBooks, @m80.k List<w1> allBooks) {
        kotlin.jvm.internal.g0.p(collectedBooks, "collectedBooks");
        kotlin.jvm.internal.g0.p(allBooks, "allBooks");
        return new x(collectedBooks, allBooks);
    }

    public int hashCode() {
        return (this.f72107a.hashCode() * 31) + this.f72108b.hashCode();
    }

    @m80.k
    public final List<w1> j() {
        return this.f72108b;
    }

    @m80.k
    public final List<Long> l() {
        return this.f72107a;
    }

    @m80.k
    public String toString() {
        return "GetWordCollectionStatusRspVo(collectedBooks=" + this.f72107a + ", allBooks=" + this.f72108b + ')';
    }

    public x(@m80.k List<Long> collectedBooks, @m80.k List<w1> allBooks) {
        kotlin.jvm.internal.g0.p(collectedBooks, "collectedBooks");
        kotlin.jvm.internal.g0.p(allBooks, "allBooks");
        this.f72107a = collectedBooks;
        this.f72108b = allBooks;
    }

    @f50.z("allBooks")
    public static /* synthetic */ void k() {
    }

    @f50.z("collectedBooks")
    public static /* synthetic */ void m() {
    }
}
