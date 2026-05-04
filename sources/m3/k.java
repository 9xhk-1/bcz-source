package m3;

import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class k {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f71965c = {null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.j
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = k.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    public final int f71966a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<v0> f71967b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71968a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71968a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.ComboAward", aVar, 2);
            l2Var.q("comboTotal", false);
            l2Var.q("awards", false);
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
            return new f50.i[]{j50.z0.f63517a, k.f71965c[1].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final k e(@m80.k i50.f decoder) {
            List list;
            int i11;
            int i12;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = k.f71965c;
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                list = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), null);
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
                        i13 = beginStructure.decodeIntElement(fVar, 0);
                        i14 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), list2);
                        i14 |= 2;
                    }
                }
                list = list2;
                i11 = i13;
                i12 = i14;
            }
            beginStructure.endStructure(fVar);
            return new k(i12, i11, list, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k k value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            k.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<k> serializer() {
            return a.f71968a;
        }

        public b() {
        }
    }

    public /* synthetic */ k(int i11, int i12, List list, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f71968a.a());
        }
        this.f71966a = i12;
        this.f71967b = list;
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(v0.a.f72095a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k g(k kVar, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = kVar.f71966a;
        }
        if ((i12 & 2) != 0) {
            list = kVar.f71967b;
        }
        return kVar.f(i11, list);
    }

    @w00.o
    public static final /* synthetic */ void l(k kVar, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f71965c;
        eVar.encodeIntElement(fVar, 0, kVar.f71966a);
        eVar.encodeSerializableElement(fVar, 1, c0VarArr[1].getValue(), kVar.f71967b);
    }

    public final int d() {
        return this.f71966a;
    }

    @m80.k
    public final List<v0> e() {
        return this.f71967b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f71966a == kVar.f71966a && kotlin.jvm.internal.g0.g(this.f71967b, kVar.f71967b);
    }

    @m80.k
    public final k f(int i11, @m80.k List<v0> awards) {
        kotlin.jvm.internal.g0.p(awards, "awards");
        return new k(i11, awards);
    }

    @m80.k
    public final List<v0> h() {
        return this.f71967b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f71966a) * 31) + this.f71967b.hashCode();
    }

    public final int j() {
        return this.f71966a;
    }

    @m80.k
    public String toString() {
        return "ComboAward(comboTotal=" + this.f71966a + ", awards=" + this.f71967b + ')';
    }

    public k(int i11, @m80.k List<v0> awards) {
        kotlin.jvm.internal.g0.p(awards, "awards");
        this.f71966a = i11;
        this.f71967b = awards;
    }

    @f50.z("awards")
    public static /* synthetic */ void i() {
    }

    @f50.z("comboTotal")
    public static /* synthetic */ void k() {
    }
}
