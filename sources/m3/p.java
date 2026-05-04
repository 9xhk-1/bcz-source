package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;
import m3.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class p {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f72038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72039b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final q f72040c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72041a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72041a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.EnergySaleInfoVo", aVar, 3);
            l2Var.q("buyEnergy", false);
            l2Var.q("price", false);
            l2Var.q("energyGoodsInfo", true);
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

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            f50.i<?> v11 = g50.a.v(q.a.f72055a);
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{z0Var, z0Var, v11};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final p e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            q qVar;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                qVar = (q) beginStructure.decodeNullableSerializableElement(fVar, 2, q.a.f72055a, null);
                i12 = decodeIntElement;
                i13 = 7;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i14 = 0;
                q qVar2 = null;
                int i15 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i14 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i15 = beginStructure.decodeIntElement(fVar, 1);
                        i14 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        qVar2 = (q) beginStructure.decodeNullableSerializableElement(fVar, 2, q.a.f72055a, qVar2);
                        i14 |= 4;
                    }
                }
                i12 = i15;
                i13 = i14;
                qVar = qVar2;
            }
            int i16 = i11;
            beginStructure.endStructure(fVar);
            return new p(i13, i16, i12, qVar, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k p value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            p.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<p> serializer() {
            return a.f72041a;
        }

        public b() {
        }
    }

    public /* synthetic */ p(int i11, int i12, int i13, q qVar, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f72041a.a());
        }
        this.f72038a = i12;
        this.f72039b = i13;
        if ((i11 & 4) == 0) {
            this.f72040c = null;
        } else {
            this.f72040c = qVar;
        }
    }

    public static /* synthetic */ p e(p pVar, int i11, int i12, q qVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = pVar.f72038a;
        }
        if ((i13 & 2) != 0) {
            i12 = pVar.f72039b;
        }
        if ((i13 & 4) != 0) {
            qVar = pVar.f72040c;
        }
        return pVar.d(i11, i12, qVar);
    }

    @w00.o
    public static final /* synthetic */ void l(p pVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, pVar.f72038a);
        eVar.encodeIntElement(fVar, 1, pVar.f72039b);
        if (!eVar.shouldEncodeElementDefault(fVar, 2) && pVar.f72040c == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 2, q.a.f72055a, pVar.f72040c);
    }

    public final int a() {
        return this.f72038a;
    }

    public final int b() {
        return this.f72039b;
    }

    @m80.l
    public final q c() {
        return this.f72040c;
    }

    @m80.k
    public final p d(int i11, int i12, @m80.l q qVar) {
        return new p(i11, i12, qVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f72038a == pVar.f72038a && this.f72039b == pVar.f72039b && kotlin.jvm.internal.g0.g(this.f72040c, pVar.f72040c);
    }

    public final int f() {
        return this.f72038a;
    }

    @m80.l
    public final q h() {
        return this.f72040c;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f72038a) * 31) + Integer.hashCode(this.f72039b)) * 31;
        q qVar = this.f72040c;
        return hashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public final int j() {
        return this.f72039b;
    }

    @m80.k
    public String toString() {
        return "EnergySaleInfoVo(buyEnergy=" + this.f72038a + ", price=" + this.f72039b + ", energyGoodsInfo=" + this.f72040c + ')';
    }

    public p(int i11, int i12, @m80.l q qVar) {
        this.f72038a = i11;
        this.f72039b = i12;
        this.f72040c = qVar;
    }

    public /* synthetic */ p(int i11, int i12, q qVar, int i13, kotlin.jvm.internal.v vVar) {
        this(i11, i12, (i13 & 4) != 0 ? null : qVar);
    }

    @f50.z("buyEnergy")
    public static /* synthetic */ void g() {
    }

    @f50.z("energyGoodsInfo")
    public static /* synthetic */ void i() {
    }

    @f50.z("price")
    public static /* synthetic */ void k() {
    }
}
