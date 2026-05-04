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
public final class x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f72110e = {null, null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.w0
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = x0.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    public final int f72111a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f72112b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72113c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<Integer> f72114d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<x0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72115a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72115a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.RootItem", aVar, 4);
            l2Var.q("rootId", false);
            l2Var.q("rootEn", false);
            l2Var.q("rootType", false);
            l2Var.q("topicIds", false);
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
            yz.c0[] c0VarArr = x0.f72110e;
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{z0Var, d3.f63348a, z0Var, c0VarArr[3].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final x0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            String str;
            List list;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = x0.f72110e;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 2);
                list = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), null);
                i12 = decodeIntElement;
                i13 = 15;
                str = decodeStringElement;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i14 = 0;
                String str2 = null;
                List list2 = null;
                int i15 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i14 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str2 = beginStructure.decodeStringElement(fVar, 1);
                        i14 |= 2;
                    } else if (decodeElementIndex == 2) {
                        i15 = beginStructure.decodeIntElement(fVar, 2);
                        i14 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 3, (f50.e) c0VarArr[3].getValue(), list2);
                        i14 |= 8;
                    }
                }
                i12 = i15;
                i13 = i14;
                str = str2;
                list = list2;
            }
            int i16 = i11;
            beginStructure.endStructure(fVar);
            return new x0(i13, i16, str, i12, list, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k x0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            x0.r(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<x0> serializer() {
            return a.f72115a;
        }

        public b() {
        }
    }

    public /* synthetic */ x0(int i11, int i12, String str, int i13, List list, x2 x2Var) {
        if (15 != (i11 & 15)) {
            j50.h2.b(i11, 15, a.f72115a.a());
        }
        this.f72111a = i12;
        this.f72112b = str;
        this.f72113c = i13;
        this.f72114d = list;
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(j50.z0.f63517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x0 i(x0 x0Var, int i11, String str, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = x0Var.f72111a;
        }
        if ((i13 & 2) != 0) {
            str = x0Var.f72112b;
        }
        if ((i13 & 4) != 0) {
            i12 = x0Var.f72113c;
        }
        if ((i13 & 8) != 0) {
            list = x0Var.f72114d;
        }
        return x0Var.h(i11, str, i12, list);
    }

    @w00.o
    public static final /* synthetic */ void r(x0 x0Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f72110e;
        eVar.encodeIntElement(fVar, 0, x0Var.f72111a);
        eVar.encodeStringElement(fVar, 1, x0Var.f72112b);
        eVar.encodeIntElement(fVar, 2, x0Var.f72113c);
        eVar.encodeSerializableElement(fVar, 3, c0VarArr[3].getValue(), x0Var.f72114d);
    }

    public final int d() {
        return this.f72111a;
    }

    @m80.k
    public final String e() {
        return this.f72112b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f72111a == x0Var.f72111a && kotlin.jvm.internal.g0.g(this.f72112b, x0Var.f72112b) && this.f72113c == x0Var.f72113c && kotlin.jvm.internal.g0.g(this.f72114d, x0Var.f72114d);
    }

    public final int f() {
        return this.f72113c;
    }

    @m80.k
    public final List<Integer> g() {
        return this.f72114d;
    }

    @m80.k
    public final x0 h(int i11, @m80.k String rootEn, int i12, @m80.k List<Integer> topicIds) {
        kotlin.jvm.internal.g0.p(rootEn, "rootEn");
        kotlin.jvm.internal.g0.p(topicIds, "topicIds");
        return new x0(i11, rootEn, i12, topicIds);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f72111a) * 31) + this.f72112b.hashCode()) * 31) + Integer.hashCode(this.f72113c)) * 31) + this.f72114d.hashCode();
    }

    @m80.k
    public final String j() {
        return this.f72112b;
    }

    public final int l() {
        return this.f72111a;
    }

    public final int n() {
        return this.f72113c;
    }

    @m80.k
    public final List<Integer> p() {
        return this.f72114d;
    }

    @m80.k
    public String toString() {
        return "RootItem(rootId=" + this.f72111a + ", rootEn=" + this.f72112b + ", rootType=" + this.f72113c + ", topicIds=" + this.f72114d + ')';
    }

    public x0(int i11, @m80.k String rootEn, int i12, @m80.k List<Integer> topicIds) {
        kotlin.jvm.internal.g0.p(rootEn, "rootEn");
        kotlin.jvm.internal.g0.p(topicIds, "topicIds");
        this.f72111a = i11;
        this.f72112b = rootEn;
        this.f72113c = i12;
        this.f72114d = topicIds;
    }

    @f50.z("rootEn")
    public static /* synthetic */ void k() {
    }

    @f50.z("rootId")
    public static /* synthetic */ void m() {
    }

    @f50.z("rootType")
    public static /* synthetic */ void o() {
    }

    @f50.z("topicIds")
    public static /* synthetic */ void q() {
    }
}
