package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.g1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class i1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f71946f = {null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.h1
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = i1.b();
            return b11;
        }
    }), null, null};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f71947a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71948b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<g1> f71949c;

    /* renamed from: d, reason: collision with root package name */
    public final long f71950d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71951e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<i1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71952a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71952a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.SubmitGameModel", aVar, 5);
            l2Var.q("gameId", false);
            l2Var.q("submitGameState", false);
            l2Var.q("learnedWords", false);
            l2Var.q("enterDay", false);
            l2Var.q("starCount", true);
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
            yz.c0[] c0VarArr = i1.f71946f;
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{d3.f63348a, z0Var, c0VarArr[2].getValue(), j50.l1.f63406a, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final i1 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            long j11;
            String str;
            List list;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = i1.f71946f;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                List list2 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                long decodeLongElement = beginStructure.decodeLongElement(fVar, 3);
                list = list2;
                str = decodeStringElement;
                i11 = beginStructure.decodeIntElement(fVar, 4);
                i12 = 31;
                i13 = decodeIntElement;
                j11 = decodeLongElement;
            } else {
                boolean z11 = true;
                int i14 = 0;
                String str2 = null;
                List list3 = null;
                long j12 = 0;
                int i15 = 0;
                int i16 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        str2 = beginStructure.decodeStringElement(fVar, 0);
                        i15 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i16 = beginStructure.decodeIntElement(fVar, 1);
                        i15 |= 2;
                    } else if (decodeElementIndex == 2) {
                        list3 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list3);
                        i15 |= 4;
                    } else if (decodeElementIndex == 3) {
                        j12 = beginStructure.decodeLongElement(fVar, 3);
                        i15 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i14 = beginStructure.decodeIntElement(fVar, 4);
                        i15 |= 16;
                    }
                }
                i11 = i14;
                i12 = i15;
                i13 = i16;
                j11 = j12;
                str = str2;
                list = list3;
            }
            beginStructure.endStructure(fVar);
            return new i1(i12, str, i13, list, j11, i11, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k i1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            i1.u(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<i1> serializer() {
            return a.f71952a;
        }

        public b() {
        }
    }

    public /* synthetic */ i1(int i11, String str, int i12, List list, long j11, int i13, x2 x2Var) {
        if (15 != (i11 & 15)) {
            j50.h2.b(i11, 15, a.f71952a.a());
        }
        this.f71947a = str;
        this.f71948b = i12;
        this.f71949c = list;
        this.f71950d = j11;
        if ((i11 & 16) == 0) {
            this.f71951e = 0;
        } else {
            this.f71951e = i13;
        }
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(g1.a.f71927a);
    }

    public static /* synthetic */ i1 j(i1 i1Var, String str, int i11, List list, long j11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = i1Var.f71947a;
        }
        if ((i13 & 2) != 0) {
            i11 = i1Var.f71948b;
        }
        if ((i13 & 4) != 0) {
            list = i1Var.f71949c;
        }
        if ((i13 & 8) != 0) {
            j11 = i1Var.f71950d;
        }
        if ((i13 & 16) != 0) {
            i12 = i1Var.f71951e;
        }
        int i14 = i12;
        List list2 = list;
        return i1Var.i(str, i11, list2, j11, i14);
    }

    @w00.o
    public static final /* synthetic */ void u(i1 i1Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f71946f;
        eVar.encodeStringElement(fVar, 0, i1Var.f71947a);
        eVar.encodeIntElement(fVar, 1, i1Var.f71948b);
        eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), i1Var.f71949c);
        eVar.encodeLongElement(fVar, 3, i1Var.f71950d);
        if (!eVar.shouldEncodeElementDefault(fVar, 4) && i1Var.f71951e == 0) {
            return;
        }
        eVar.encodeIntElement(fVar, 4, i1Var.f71951e);
    }

    @m80.k
    public final String d() {
        return this.f71947a;
    }

    public final int e() {
        return this.f71948b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return kotlin.jvm.internal.g0.g(this.f71947a, i1Var.f71947a) && this.f71948b == i1Var.f71948b && kotlin.jvm.internal.g0.g(this.f71949c, i1Var.f71949c) && this.f71950d == i1Var.f71950d && this.f71951e == i1Var.f71951e;
    }

    @m80.k
    public final List<g1> f() {
        return this.f71949c;
    }

    public final long g() {
        return this.f71950d;
    }

    public final int h() {
        return this.f71951e;
    }

    public int hashCode() {
        return (((((((this.f71947a.hashCode() * 31) + Integer.hashCode(this.f71948b)) * 31) + this.f71949c.hashCode()) * 31) + Long.hashCode(this.f71950d)) * 31) + Integer.hashCode(this.f71951e);
    }

    @m80.k
    public final i1 i(@m80.k String gameId, int i11, @m80.k List<g1> learnedWords, long j11, int i12) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(learnedWords, "learnedWords");
        return new i1(gameId, i11, learnedWords, j11, i12);
    }

    public final long k() {
        return this.f71950d;
    }

    @m80.k
    public final String m() {
        return this.f71947a;
    }

    @m80.k
    public final List<g1> o() {
        return this.f71949c;
    }

    public final int q() {
        return this.f71951e;
    }

    public final int s() {
        return this.f71948b;
    }

    @m80.k
    public String toString() {
        return "SubmitGameModel(gameId=" + this.f71947a + ", submitGameState=" + this.f71948b + ", learnedWords=" + this.f71949c + ", enterDay=" + this.f71950d + ", starCount=" + this.f71951e + ')';
    }

    public i1(@m80.k String gameId, int i11, @m80.k List<g1> learnedWords, long j11, int i12) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(learnedWords, "learnedWords");
        this.f71947a = gameId;
        this.f71948b = i11;
        this.f71949c = learnedWords;
        this.f71950d = j11;
        this.f71951e = i12;
    }

    public /* synthetic */ i1(String str, int i11, List list, long j11, int i12, int i13, kotlin.jvm.internal.v vVar) {
        this(str, i11, list, j11, (i13 & 16) != 0 ? 0 : i12);
    }

    @f50.z("enterDay")
    public static /* synthetic */ void l() {
    }

    @f50.z("gameId")
    public static /* synthetic */ void n() {
    }

    @f50.z("learnedWords")
    public static /* synthetic */ void p() {
    }

    @f50.z("starCount")
    public static /* synthetic */ void r() {
    }

    @f50.z("submitGameState")
    public static /* synthetic */ void t() {
    }
}
