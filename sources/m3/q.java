package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class q {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f72052a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72053b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f72054c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<q> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72055a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72055a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.EntitlementMallGoodsInfoVo", aVar, 3);
            l2Var.q("itemId", false);
            l2Var.q("subItemId", false);
            l2Var.q("appStoreId", false);
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
            return new f50.i[]{z0Var, z0Var, d3.f63348a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q e(@m80.k i50.f decoder) {
            int i11;
            String str;
            int i12;
            int i13;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                str = beginStructure.decodeStringElement(fVar, 2);
                i12 = decodeIntElement;
                i13 = 7;
            } else {
                String str2 = null;
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
                    } else if (decodeElementIndex == 1) {
                        i14 = beginStructure.decodeIntElement(fVar, 1);
                        i15 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str2 = beginStructure.decodeStringElement(fVar, 2);
                        i15 |= 4;
                    }
                }
                str = str2;
                i12 = i14;
                i13 = i15;
            }
            int i16 = i11;
            beginStructure.endStructure(fVar);
            return new q(i13, i16, i12, str, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k q value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            q.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<q> serializer() {
            return a.f72055a;
        }

        public b() {
        }
    }

    public /* synthetic */ q(int i11, int i12, int i13, String str, x2 x2Var) {
        if (7 != (i11 & 7)) {
            j50.h2.b(i11, 7, a.f72055a.a());
        }
        this.f72052a = i12;
        this.f72053b = i13;
        this.f72054c = str;
    }

    public static /* synthetic */ q e(q qVar, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = qVar.f72052a;
        }
        if ((i13 & 2) != 0) {
            i12 = qVar.f72053b;
        }
        if ((i13 & 4) != 0) {
            str = qVar.f72054c;
        }
        return qVar.d(i11, i12, str);
    }

    @w00.o
    public static final /* synthetic */ void l(q qVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, qVar.f72052a);
        eVar.encodeIntElement(fVar, 1, qVar.f72053b);
        eVar.encodeStringElement(fVar, 2, qVar.f72054c);
    }

    public final int a() {
        return this.f72052a;
    }

    public final int b() {
        return this.f72053b;
    }

    @m80.k
    public final String c() {
        return this.f72054c;
    }

    @m80.k
    public final q d(int i11, int i12, @m80.k String appStoreId) {
        kotlin.jvm.internal.g0.p(appStoreId, "appStoreId");
        return new q(i11, i12, appStoreId);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f72052a == qVar.f72052a && this.f72053b == qVar.f72053b && kotlin.jvm.internal.g0.g(this.f72054c, qVar.f72054c);
    }

    @m80.k
    public final String f() {
        return this.f72054c;
    }

    public final int h() {
        return this.f72052a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f72052a) * 31) + Integer.hashCode(this.f72053b)) * 31) + this.f72054c.hashCode();
    }

    public final int j() {
        return this.f72053b;
    }

    @m80.k
    public String toString() {
        return "EntitlementMallGoodsInfoVo(itemId=" + this.f72052a + ", subItemId=" + this.f72053b + ", appStoreId=" + this.f72054c + ')';
    }

    public q(int i11, int i12, @m80.k String appStoreId) {
        kotlin.jvm.internal.g0.p(appStoreId, "appStoreId");
        this.f72052a = i11;
        this.f72053b = i12;
        this.f72054c = appStoreId;
    }

    @f50.z("appStoreId")
    public static /* synthetic */ void g() {
    }

    @f50.z("itemId")
    public static /* synthetic */ void i() {
    }

    @f50.z("subItemId")
    public static /* synthetic */ void k() {
    }
}
