package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class l0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f71976d = {null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.k0
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = l0.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f71977a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71978b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Integer> f71979c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<l0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71980a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71980a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.PreloadResourceReqVo", aVar, 3);
            l2Var.q("gameId", false);
            l2Var.q("mode", false);
            l2Var.q("topicIds", true);
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
            return new f50.i[]{d3.f63348a, j50.z0.f63517a, l0.f71976d[2].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final l0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            String str;
            List list;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = l0.f71976d;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                list = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                str = decodeStringElement;
                i11 = 7;
                i12 = decodeIntElement;
            } else {
                boolean z11 = true;
                int i13 = 0;
                String str2 = null;
                List list2 = null;
                int i14 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        str2 = beginStructure.decodeStringElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i14 = beginStructure.decodeIntElement(fVar, 1);
                        i13 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list2);
                        i13 |= 4;
                    }
                }
                i11 = i13;
                i12 = i14;
                str = str2;
                list = list2;
            }
            beginStructure.endStructure(fVar);
            return new l0(i11, str, i12, list, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k l0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            l0.o(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<l0> serializer() {
            return a.f71980a;
        }

        public b() {
        }
    }

    public /* synthetic */ l0(int i11, String str, int i12, List list, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f71980a.a());
        }
        this.f71977a = str;
        this.f71978b = i12;
        if ((i11 & 4) == 0) {
            this.f71979c = a00.h0.J();
        } else {
            this.f71979c = list;
        }
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(j50.z0.f63517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l0 h(l0 l0Var, String str, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = l0Var.f71977a;
        }
        if ((i12 & 2) != 0) {
            i11 = l0Var.f71978b;
        }
        if ((i12 & 4) != 0) {
            list = l0Var.f71979c;
        }
        return l0Var.g(str, i11, list);
    }

    @w00.o
    public static final /* synthetic */ void o(l0 l0Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f71976d;
        eVar.encodeStringElement(fVar, 0, l0Var.f71977a);
        eVar.encodeIntElement(fVar, 1, l0Var.f71978b);
        if (!eVar.shouldEncodeElementDefault(fVar, 2) && kotlin.jvm.internal.g0.g(l0Var.f71979c, a00.h0.J())) {
            return;
        }
        eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), l0Var.f71979c);
    }

    @m80.k
    public final String d() {
        return this.f71977a;
    }

    public final int e() {
        return this.f71978b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return kotlin.jvm.internal.g0.g(this.f71977a, l0Var.f71977a) && this.f71978b == l0Var.f71978b && kotlin.jvm.internal.g0.g(this.f71979c, l0Var.f71979c);
    }

    @m80.k
    public final List<Integer> f() {
        return this.f71979c;
    }

    @m80.k
    public final l0 g(@m80.k String gameId, int i11, @m80.k List<Integer> topicIds) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(topicIds, "topicIds");
        return new l0(gameId, i11, topicIds);
    }

    public int hashCode() {
        return (((this.f71977a.hashCode() * 31) + Integer.hashCode(this.f71978b)) * 31) + this.f71979c.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f71977a;
    }

    public final int k() {
        return this.f71978b;
    }

    @m80.k
    public final List<Integer> m() {
        return this.f71979c;
    }

    @m80.k
    public String toString() {
        return "PreloadResourceReqVo(gameId=" + this.f71977a + ", mode=" + this.f71978b + ", topicIds=" + this.f71979c + ')';
    }

    public l0(@m80.k String gameId, int i11, @m80.k List<Integer> topicIds) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(topicIds, "topicIds");
        this.f71977a = gameId;
        this.f71978b = i11;
        this.f71979c = topicIds;
    }

    public /* synthetic */ l0(String str, int i11, List list, int i12, kotlin.jvm.internal.v vVar) {
        this(str, i11, (i12 & 4) != 0 ? a00.h0.J() : list);
    }

    @f50.z("gameId")
    public static /* synthetic */ void j() {
    }

    @f50.z("mode")
    public static /* synthetic */ void l() {
    }

    @f50.z("topicIds")
    public static /* synthetic */ void n() {
    }
}
