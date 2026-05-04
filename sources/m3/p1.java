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
public final class p1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f72045f = {null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.o1
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = p1.b();
            return b11;
        }
    }), null, null};

    /* renamed from: a, reason: collision with root package name */
    public final int f72046a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72047b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<v0> f72048c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72049d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72050e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<p1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72051a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72051a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.SubmitSentenceGameModel", aVar, 5);
            l2Var.q("skuId", false);
            l2Var.q("success", false);
            l2Var.q("rewards", false);
            l2Var.q("coinBalance", false);
            l2Var.q("hammerBalance", false);
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
            yz.c0[] c0VarArr = p1.f72045f;
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{z0Var, j50.i.f63378a, c0VarArr[2].getValue(), z0Var, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final p1 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            int i14;
            boolean z11;
            List list;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = p1.f72045f;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(fVar, 1);
                list = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                i12 = beginStructure.decodeIntElement(fVar, 3);
                i13 = beginStructure.decodeIntElement(fVar, 4);
                i14 = 31;
                z11 = decodeBooleanElement;
            } else {
                boolean z12 = true;
                i11 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z13 = false;
                List list2 = null;
                int i17 = 0;
                while (z12) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z12 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i16 |= 1;
                    } else if (decodeElementIndex == 1) {
                        z13 = beginStructure.decodeBooleanElement(fVar, 1);
                        i16 |= 2;
                    } else if (decodeElementIndex == 2) {
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list2);
                        i16 |= 4;
                    } else if (decodeElementIndex == 3) {
                        i17 = beginStructure.decodeIntElement(fVar, 3);
                        i16 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i15 = beginStructure.decodeIntElement(fVar, 4);
                        i16 |= 16;
                    }
                }
                i12 = i17;
                i13 = i15;
                i14 = i16;
                z11 = z13;
                list = list2;
            }
            int i18 = i11;
            beginStructure.endStructure(fVar);
            return new p1(i14, i18, z11, list, i12, i13, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k p1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            p1.u(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<p1> serializer() {
            return a.f72051a;
        }

        public b() {
        }
    }

    public /* synthetic */ p1(int i11, int i12, boolean z11, List list, int i13, int i14, x2 x2Var) {
        if (31 != (i11 & 31)) {
            j50.h2.b(i11, 31, a.f72051a.a());
        }
        this.f72046a = i12;
        this.f72047b = z11;
        this.f72048c = list;
        this.f72049d = i13;
        this.f72050e = i14;
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(v0.a.f72095a);
    }

    public static /* synthetic */ p1 j(p1 p1Var, int i11, boolean z11, List list, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = p1Var.f72046a;
        }
        if ((i14 & 2) != 0) {
            z11 = p1Var.f72047b;
        }
        if ((i14 & 4) != 0) {
            list = p1Var.f72048c;
        }
        if ((i14 & 8) != 0) {
            i12 = p1Var.f72049d;
        }
        if ((i14 & 16) != 0) {
            i13 = p1Var.f72050e;
        }
        int i15 = i13;
        List list2 = list;
        return p1Var.i(i11, z11, list2, i12, i15);
    }

    @w00.o
    public static final /* synthetic */ void u(p1 p1Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f72045f;
        eVar.encodeIntElement(fVar, 0, p1Var.f72046a);
        eVar.encodeBooleanElement(fVar, 1, p1Var.f72047b);
        eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), p1Var.f72048c);
        eVar.encodeIntElement(fVar, 3, p1Var.f72049d);
        eVar.encodeIntElement(fVar, 4, p1Var.f72050e);
    }

    public final int d() {
        return this.f72046a;
    }

    public final boolean e() {
        return this.f72047b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f72046a == p1Var.f72046a && this.f72047b == p1Var.f72047b && kotlin.jvm.internal.g0.g(this.f72048c, p1Var.f72048c) && this.f72049d == p1Var.f72049d && this.f72050e == p1Var.f72050e;
    }

    @m80.k
    public final List<v0> f() {
        return this.f72048c;
    }

    public final int g() {
        return this.f72049d;
    }

    public final int h() {
        return this.f72050e;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f72046a) * 31) + Boolean.hashCode(this.f72047b)) * 31) + this.f72048c.hashCode()) * 31) + Integer.hashCode(this.f72049d)) * 31) + Integer.hashCode(this.f72050e);
    }

    @m80.k
    public final p1 i(int i11, boolean z11, @m80.k List<v0> rewards, int i12, int i13) {
        kotlin.jvm.internal.g0.p(rewards, "rewards");
        return new p1(i11, z11, rewards, i12, i13);
    }

    public final int k() {
        return this.f72049d;
    }

    public final int m() {
        return this.f72050e;
    }

    @m80.k
    public final List<v0> o() {
        return this.f72048c;
    }

    public final int q() {
        return this.f72046a;
    }

    public final boolean s() {
        return this.f72047b;
    }

    @m80.k
    public String toString() {
        return "SubmitSentenceGameModel(skuId=" + this.f72046a + ", success=" + this.f72047b + ", rewards=" + this.f72048c + ", coinBalance=" + this.f72049d + ", hammerBalance=" + this.f72050e + ')';
    }

    public p1(int i11, boolean z11, @m80.k List<v0> rewards, int i12, int i13) {
        kotlin.jvm.internal.g0.p(rewards, "rewards");
        this.f72046a = i11;
        this.f72047b = z11;
        this.f72048c = rewards;
        this.f72049d = i12;
        this.f72050e = i13;
    }

    @f50.z("coinBalance")
    public static /* synthetic */ void l() {
    }

    @f50.z("hammerBalance")
    public static /* synthetic */ void n() {
    }

    @f50.z("rewards")
    public static /* synthetic */ void p() {
    }

    @f50.z("skuId")
    public static /* synthetic */ void r() {
    }

    @f50.z("success")
    public static /* synthetic */ void t() {
    }
}
