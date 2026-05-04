package h5;

import h5.v0;
import h5.x;
import j50.h2;
import j50.l2;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class g {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f58344a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x f58345b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final v0 f58346c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<g> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f58347a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f58347a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.model.EnergyModel", aVar, 3);
            l2Var.q("energyType", false);
            l2Var.q("limitedEnergy", false);
            l2Var.q("unlimitedEnergy", false);
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
            return new f50.i[]{j50.z0.f63517a, x.a.f58477a, v0.a.f58464a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final g e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            x xVar;
            v0 v0Var;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                x xVar2 = (x) beginStructure.decodeSerializableElement(fVar, 1, x.a.f58477a, null);
                v0Var = (v0) beginStructure.decodeSerializableElement(fVar, 2, v0.a.f58464a, null);
                xVar = xVar2;
                i12 = 7;
            } else {
                boolean z11 = true;
                i11 = 0;
                x xVar3 = null;
                v0 v0Var2 = null;
                int i13 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        xVar3 = (x) beginStructure.decodeSerializableElement(fVar, 1, x.a.f58477a, xVar3);
                        i13 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        v0Var2 = (v0) beginStructure.decodeSerializableElement(fVar, 2, v0.a.f58464a, v0Var2);
                        i13 |= 4;
                    }
                }
                i12 = i13;
                xVar = xVar3;
                v0Var = v0Var2;
            }
            int i14 = i11;
            beginStructure.endStructure(fVar);
            return new g(i12, i14, xVar, v0Var, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k g value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            g.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<g> serializer() {
            return a.f58347a;
        }

        public b() {
        }
    }

    public /* synthetic */ g(int i11, int i12, x xVar, v0 v0Var, x2 x2Var) {
        if (7 != (i11 & 7)) {
            h2.b(i11, 7, a.f58347a.a());
        }
        this.f58344a = i12;
        this.f58345b = xVar;
        this.f58346c = v0Var;
    }

    public static /* synthetic */ g e(g gVar, int i11, x xVar, v0 v0Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = gVar.f58344a;
        }
        if ((i12 & 2) != 0) {
            xVar = gVar.f58345b;
        }
        if ((i12 & 4) != 0) {
            v0Var = gVar.f58346c;
        }
        return gVar.d(i11, xVar, v0Var);
    }

    @w00.o
    public static final /* synthetic */ void l(g gVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, gVar.f58344a);
        eVar.encodeSerializableElement(fVar, 1, x.a.f58477a, gVar.f58345b);
        eVar.encodeSerializableElement(fVar, 2, v0.a.f58464a, gVar.f58346c);
    }

    public final int a() {
        return this.f58344a;
    }

    @m80.k
    public final x b() {
        return this.f58345b;
    }

    @m80.k
    public final v0 c() {
        return this.f58346c;
    }

    @m80.k
    public final g d(int i11, @m80.k x limitedEnergy, @m80.k v0 unlimitedEnergy) {
        kotlin.jvm.internal.g0.p(limitedEnergy, "limitedEnergy");
        kotlin.jvm.internal.g0.p(unlimitedEnergy, "unlimitedEnergy");
        return new g(i11, limitedEnergy, unlimitedEnergy);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f58344a == gVar.f58344a && kotlin.jvm.internal.g0.g(this.f58345b, gVar.f58345b) && kotlin.jvm.internal.g0.g(this.f58346c, gVar.f58346c);
    }

    public final int f() {
        return this.f58344a;
    }

    @m80.k
    public final x h() {
        return this.f58345b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f58344a) * 31) + this.f58345b.hashCode()) * 31) + this.f58346c.hashCode();
    }

    @m80.k
    public final v0 j() {
        return this.f58346c;
    }

    @m80.k
    public String toString() {
        return "EnergyModel(energyType=" + this.f58344a + ", limitedEnergy=" + this.f58345b + ", unlimitedEnergy=" + this.f58346c + ')';
    }

    public g(int i11, @m80.k x limitedEnergy, @m80.k v0 unlimitedEnergy) {
        kotlin.jvm.internal.g0.p(limitedEnergy, "limitedEnergy");
        kotlin.jvm.internal.g0.p(unlimitedEnergy, "unlimitedEnergy");
        this.f58344a = i11;
        this.f58345b = limitedEnergy;
        this.f58346c = unlimitedEnergy;
    }

    @f50.z("energyType")
    public static /* synthetic */ void g() {
    }

    @f50.z("limitedEnergy")
    public static /* synthetic */ void i() {
    }

    @f50.z("unlimitedEnergy")
    public static /* synthetic */ void k() {
    }
}
