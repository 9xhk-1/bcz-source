package m3;

import com.baicizhan.app.api.service.model.game.RewardType;
import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class v0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final RewardType f72092a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72093b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f72094c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<v0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72095a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72095a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.RewardModel", aVar, 3);
            l2Var.q("rewardType", false);
            l2Var.q("count", false);
            l2Var.q("extra", true);
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
            return new f50.i[]{com.baicizhan.app.api.service.model.game.a.f13475a, j50.z0.f63517a, g50.a.v(d3.f63348a)};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final v0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            RewardType rewardType;
            String str;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                RewardType rewardType2 = (RewardType) beginStructure.decodeSerializableElement(fVar, 0, com.baicizhan.app.api.service.model.game.a.f13475a, null);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                rewardType = rewardType2;
                str = (String) beginStructure.decodeNullableSerializableElement(fVar, 2, d3.f63348a, null);
                i11 = decodeIntElement;
                i12 = 7;
            } else {
                boolean z11 = true;
                int i13 = 0;
                RewardType rewardType3 = null;
                String str2 = null;
                int i14 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        rewardType3 = (RewardType) beginStructure.decodeSerializableElement(fVar, 0, com.baicizhan.app.api.service.model.game.a.f13475a, rewardType3);
                        i14 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i13 = beginStructure.decodeIntElement(fVar, 1);
                        i14 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str2 = (String) beginStructure.decodeNullableSerializableElement(fVar, 2, d3.f63348a, str2);
                        i14 |= 4;
                    }
                }
                i11 = i13;
                i12 = i14;
                rewardType = rewardType3;
                str = str2;
            }
            beginStructure.endStructure(fVar);
            return new v0(i12, rewardType, i11, str, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k v0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            v0.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<v0> serializer() {
            return a.f72095a;
        }

        public b() {
        }
    }

    public /* synthetic */ v0(int i11, RewardType rewardType, int i12, String str, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f72095a.a());
        }
        this.f72092a = rewardType;
        this.f72093b = i12;
        if ((i11 & 4) == 0) {
            this.f72094c = null;
        } else {
            this.f72094c = str;
        }
    }

    public static /* synthetic */ v0 e(v0 v0Var, RewardType rewardType, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            rewardType = v0Var.f72092a;
        }
        if ((i12 & 2) != 0) {
            i11 = v0Var.f72093b;
        }
        if ((i12 & 4) != 0) {
            str = v0Var.f72094c;
        }
        return v0Var.d(rewardType, i11, str);
    }

    @w00.o
    public static final /* synthetic */ void l(v0 v0Var, i50.e eVar, h50.f fVar) {
        eVar.encodeSerializableElement(fVar, 0, com.baicizhan.app.api.service.model.game.a.f13475a, v0Var.f72092a);
        eVar.encodeIntElement(fVar, 1, v0Var.f72093b);
        if (!eVar.shouldEncodeElementDefault(fVar, 2) && v0Var.f72094c == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 2, d3.f63348a, v0Var.f72094c);
    }

    @m80.k
    public final RewardType a() {
        return this.f72092a;
    }

    public final int b() {
        return this.f72093b;
    }

    @m80.l
    public final String c() {
        return this.f72094c;
    }

    @m80.k
    public final v0 d(@m80.k RewardType rewardType, int i11, @m80.l String str) {
        kotlin.jvm.internal.g0.p(rewardType, "rewardType");
        return new v0(rewardType, i11, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f72092a == v0Var.f72092a && this.f72093b == v0Var.f72093b && kotlin.jvm.internal.g0.g(this.f72094c, v0Var.f72094c);
    }

    public final int f() {
        return this.f72093b;
    }

    @m80.l
    public final String h() {
        return this.f72094c;
    }

    public int hashCode() {
        int hashCode = ((this.f72092a.hashCode() * 31) + Integer.hashCode(this.f72093b)) * 31;
        String str = this.f72094c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public final RewardType j() {
        return this.f72092a;
    }

    @m80.k
    public String toString() {
        return "RewardModel(rewardType=" + this.f72092a + ", count=" + this.f72093b + ", extra=" + this.f72094c + ')';
    }

    public v0(@m80.k RewardType rewardType, int i11, @m80.l String str) {
        kotlin.jvm.internal.g0.p(rewardType, "rewardType");
        this.f72092a = rewardType;
        this.f72093b = i11;
        this.f72094c = str;
    }

    public /* synthetic */ v0(RewardType rewardType, int i11, String str, int i12, kotlin.jvm.internal.v vVar) {
        this(rewardType, i11, (i12 & 4) != 0 ? null : str);
    }

    @f50.z("count")
    public static /* synthetic */ void g() {
    }

    @f50.z("extra")
    public static /* synthetic */ void i() {
    }

    @f50.z("rewardType")
    public static /* synthetic */ void k() {
    }
}
