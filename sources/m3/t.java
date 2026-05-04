package m3;

import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class t {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f72075c = {yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.s
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = t.b();
            return b11;
        }
    }), null};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<Long> f72076a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72077b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<t> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72078a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72078a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.GetTopicResourceReqVo", aVar, 2);
            l2Var.q("topicIds", false);
            l2Var.q("bookId", false);
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
            return new f50.i[]{t.f72075c[0].getValue(), j50.z0.f63517a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t e(@m80.k i50.f decoder) {
            List list;
            int i11;
            int i12;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = t.f72075c;
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                list = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), null);
                i11 = beginStructure.decodeIntElement(fVar, 1);
                i12 = 3;
            } else {
                boolean z11 = true;
                int i13 = 0;
                int i14 = 0;
                List list2 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), list2);
                        i14 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i13 = beginStructure.decodeIntElement(fVar, 1);
                        i14 |= 2;
                    }
                }
                list = list2;
                i11 = i13;
                i12 = i14;
            }
            beginStructure.endStructure(fVar);
            return new t(i12, list, i11, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k t value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            t.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<t> serializer() {
            return a.f72078a;
        }

        public b() {
        }
    }

    public /* synthetic */ t(int i11, List list, int i12, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f72078a.a());
        }
        this.f72076a = list;
        this.f72077b = i12;
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(j50.l1.f63406a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t g(t tVar, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = tVar.f72076a;
        }
        if ((i12 & 2) != 0) {
            i11 = tVar.f72077b;
        }
        return tVar.f(list, i11);
    }

    @w00.o
    public static final /* synthetic */ void l(t tVar, i50.e eVar, h50.f fVar) {
        eVar.encodeSerializableElement(fVar, 0, f72075c[0].getValue(), tVar.f72076a);
        eVar.encodeIntElement(fVar, 1, tVar.f72077b);
    }

    @m80.k
    public final List<Long> d() {
        return this.f72076a;
    }

    public final int e() {
        return this.f72077b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.g0.g(this.f72076a, tVar.f72076a) && this.f72077b == tVar.f72077b;
    }

    @m80.k
    public final t f(@m80.k List<Long> topicIds, int i11) {
        kotlin.jvm.internal.g0.p(topicIds, "topicIds");
        return new t(topicIds, i11);
    }

    public final int h() {
        return this.f72077b;
    }

    public int hashCode() {
        return (this.f72076a.hashCode() * 31) + Integer.hashCode(this.f72077b);
    }

    @m80.k
    public final List<Long> j() {
        return this.f72076a;
    }

    @m80.k
    public String toString() {
        return "GetTopicResourceReqVo(topicIds=" + this.f72076a + ", bookId=" + this.f72077b + ')';
    }

    public t(@m80.k List<Long> topicIds, int i11) {
        kotlin.jvm.internal.g0.p(topicIds, "topicIds");
        this.f72076a = topicIds;
        this.f72077b = i11;
    }

    @f50.z("bookId")
    public static /* synthetic */ void i() {
    }

    @f50.z("topicIds")
    public static /* synthetic */ void k() {
    }
}
