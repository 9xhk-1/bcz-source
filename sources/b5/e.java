package b5;

import j50.l2;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class e implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f5823a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5824b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5825a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5825a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.impl.unity.command.ChangeUnitReq", aVar, 2);
            l2Var.q("skuId", false);
            l2Var.q("unitId", false);
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
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{z0Var, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final e e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                i12 = beginStructure.decodeIntElement(fVar, 1);
                i13 = 3;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i14 = 0;
                int i15 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i15 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i14 = beginStructure.decodeIntElement(fVar, 1);
                        i15 |= 2;
                    }
                }
                i12 = i14;
                i13 = i15;
            }
            beginStructure.endStructure(fVar);
            return new e(i13, i11, i12, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k e value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            e.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<e> serializer() {
            return a.f5825a;
        }

        public b() {
        }
    }

    public e(int i11, int i12) {
        this.f5823a = i11;
        this.f5824b = i12;
    }

    public static /* synthetic */ e d(e eVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = eVar.f5823a;
        }
        if ((i13 & 2) != 0) {
            i12 = eVar.f5824b;
        }
        return eVar.c(i11, i12);
    }

    @w00.o
    public static final /* synthetic */ void i(e eVar, i50.e eVar2, h50.f fVar) {
        eVar2.encodeIntElement(fVar, 0, eVar.f5823a);
        eVar2.encodeIntElement(fVar, 1, eVar.f5824b);
    }

    public final int a() {
        return this.f5823a;
    }

    public final int b() {
        return this.f5824b;
    }

    @m80.k
    public final e c(int i11, int i12) {
        return new e(i11, i12);
    }

    public final int e() {
        return this.f5823a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f5823a == eVar.f5823a && this.f5824b == eVar.f5824b;
    }

    public final int g() {
        return this.f5824b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f5823a) * 31) + Integer.hashCode(this.f5824b);
    }

    @m80.k
    public String toString() {
        return "ChangeUnitReq(skuId=" + this.f5823a + ", unitId=" + this.f5824b + ')';
    }

    public /* synthetic */ e(int i11, int i12, int i13, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f5825a.a());
        }
        this.f5823a = i12;
        this.f5824b = i13;
    }

    @f50.z("skuId")
    public static /* synthetic */ void f() {
    }

    @f50.z("unitId")
    public static /* synthetic */ void h() {
    }
}
