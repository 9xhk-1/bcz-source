package m3;

import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.g2;
import m3.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class j2 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f71961c;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<x0> f71962a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<g2> f71963b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<j2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71964a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71964a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.WordRootRawRsp", aVar, 2);
            l2Var.q("roots", false);
            l2Var.q("wordPackList", false);
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
            yz.c0[] c0VarArr = j2.f71961c;
            return new f50.i[]{c0VarArr[0].getValue(), c0VarArr[1].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final j2 e(@m80.k i50.f decoder) {
            List list;
            List list2;
            int i11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = j2.f71961c;
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
            return new j2(i11, list2, list, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k j2 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            j2.n(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<j2> serializer() {
            return a.f71964a;
        }

        public b() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f71961c = new yz.c0[]{yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: m3.h2
            @Override // x00.a
            public final Object invoke() {
                f50.i c11;
                c11 = j2.c();
                return c11;
            }
        }), yz.e0.b(lazyThreadSafetyMode, new x00.a() { // from class: m3.i2
            @Override // x00.a
            public final Object invoke() {
                f50.i d11;
                d11 = j2.d();
                return d11;
            }
        })};
    }

    public /* synthetic */ j2(int i11, List list, List list2, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f71964a.a());
        }
        this.f71962a = list;
        this.f71963b = list2;
    }

    public static final /* synthetic */ f50.i c() {
        return new j50.f(x0.a.f72115a);
    }

    public static final /* synthetic */ f50.i d() {
        return new j50.f(g2.a.f71930a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j2 i(j2 j2Var, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = j2Var.f71962a;
        }
        if ((i11 & 2) != 0) {
            list2 = j2Var.f71963b;
        }
        return j2Var.h(list, list2);
    }

    @w00.o
    public static final /* synthetic */ void n(j2 j2Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f71961c;
        eVar.encodeSerializableElement(fVar, 0, c0VarArr[0].getValue(), j2Var.f71962a);
        eVar.encodeSerializableElement(fVar, 1, c0VarArr[1].getValue(), j2Var.f71963b);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return kotlin.jvm.internal.g0.g(this.f71962a, j2Var.f71962a) && kotlin.jvm.internal.g0.g(this.f71963b, j2Var.f71963b);
    }

    @m80.k
    public final List<x0> f() {
        return this.f71962a;
    }

    @m80.k
    public final List<g2> g() {
        return this.f71963b;
    }

    @m80.k
    public final j2 h(@m80.k List<x0> roots, @m80.k List<g2> wordPackList) {
        kotlin.jvm.internal.g0.p(roots, "roots");
        kotlin.jvm.internal.g0.p(wordPackList, "wordPackList");
        return new j2(roots, wordPackList);
    }

    public int hashCode() {
        return (this.f71962a.hashCode() * 31) + this.f71963b.hashCode();
    }

    @m80.k
    public final List<x0> j() {
        return this.f71962a;
    }

    @m80.k
    public final List<g2> l() {
        return this.f71963b;
    }

    @m80.k
    public String toString() {
        return "WordRootRawRsp(roots=" + this.f71962a + ", wordPackList=" + this.f71963b + ')';
    }

    public j2(@m80.k List<x0> roots, @m80.k List<g2> wordPackList) {
        kotlin.jvm.internal.g0.p(roots, "roots");
        kotlin.jvm.internal.g0.p(wordPackList, "wordPackList");
        this.f71962a = roots;
        this.f71963b = wordPackList;
    }

    @f50.z("roots")
    public static /* synthetic */ void k() {
    }

    @f50.z("wordPackList")
    public static /* synthetic */ void m() {
    }
}
