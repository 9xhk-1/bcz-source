package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class k2 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71969a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71970b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71971c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<k2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71972a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71972a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.WordToLearn", aVar, 3);
            l2Var.q("topicId", false);
            l2Var.q("halfDay", false);
            l2Var.q("halfDayUpdated", false);
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
            return new f50.i[]{z0Var, z0Var, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final k2 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            int i14;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                i12 = beginStructure.decodeIntElement(fVar, 2);
                i13 = decodeIntElement;
                i14 = 7;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i17 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i16 = beginStructure.decodeIntElement(fVar, 1);
                        i17 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i15 = beginStructure.decodeIntElement(fVar, 2);
                        i17 |= 4;
                    }
                }
                i12 = i15;
                i13 = i16;
                i14 = i17;
            }
            int i18 = i11;
            beginStructure.endStructure(fVar);
            return new k2(i14, i18, i13, i12, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k k2 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            k2.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<k2> serializer() {
            return a.f71972a;
        }

        public b() {
        }
    }

    public k2(int i11, int i12, int i13) {
        this.f71969a = i11;
        this.f71970b = i12;
        this.f71971c = i13;
    }

    public static /* synthetic */ k2 e(k2 k2Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = k2Var.f71969a;
        }
        if ((i14 & 2) != 0) {
            i12 = k2Var.f71970b;
        }
        if ((i14 & 4) != 0) {
            i13 = k2Var.f71971c;
        }
        return k2Var.d(i11, i12, i13);
    }

    @w00.o
    public static final /* synthetic */ void l(k2 k2Var, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, k2Var.f71969a);
        eVar.encodeIntElement(fVar, 1, k2Var.f71970b);
        eVar.encodeIntElement(fVar, 2, k2Var.f71971c);
    }

    public final int a() {
        return this.f71969a;
    }

    public final int b() {
        return this.f71970b;
    }

    public final int c() {
        return this.f71971c;
    }

    @m80.k
    public final k2 d(int i11, int i12, int i13) {
        return new k2(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.f71969a == k2Var.f71969a && this.f71970b == k2Var.f71970b && this.f71971c == k2Var.f71971c;
    }

    public final int f() {
        return this.f71970b;
    }

    public final int h() {
        return this.f71971c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f71969a) * 31) + Integer.hashCode(this.f71970b)) * 31) + Integer.hashCode(this.f71971c);
    }

    public final int j() {
        return this.f71969a;
    }

    @m80.k
    public String toString() {
        return "WordToLearn(topicId=" + this.f71969a + ", halfDay=" + this.f71970b + ", halfDayUpdated=" + this.f71971c + ')';
    }

    public /* synthetic */ k2(int i11, int i12, int i13, int i14, x2 x2Var) {
        if (7 != (i11 & 7)) {
            j50.h2.b(i11, 7, a.f71972a.a());
        }
        this.f71969a = i12;
        this.f71970b = i13;
        this.f71971c = i14;
    }

    @f50.z("halfDay")
    public static /* synthetic */ void g() {
    }

    @f50.z("halfDayUpdated")
    public static /* synthetic */ void i() {
    }

    @f50.z("topicId")
    public static /* synthetic */ void k() {
    }
}
