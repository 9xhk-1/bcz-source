package m3;

import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class l {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f71973a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f71974b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71975a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71975a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.ComboInfoVo", aVar, 2);
            l2Var.q("currentCombo", false);
            l2Var.q("starAwarded", false);
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
            return new f50.i[]{j50.z0.f63517a, j50.i.f63378a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final l e(@m80.k i50.f decoder) {
            int i11;
            boolean z11;
            int i12;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                z11 = beginStructure.decodeBooleanElement(fVar, 1);
                i12 = 3;
            } else {
                boolean z12 = true;
                i11 = 0;
                boolean z13 = false;
                int i13 = 0;
                while (z12) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z12 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        z13 = beginStructure.decodeBooleanElement(fVar, 1);
                        i13 |= 2;
                    }
                }
                z11 = z13;
                i12 = i13;
            }
            beginStructure.endStructure(fVar);
            return new l(i12, i11, z11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k l value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            l.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<l> serializer() {
            return a.f71975a;
        }

        public b() {
        }
    }

    public /* synthetic */ l(int i11, int i12, boolean z11, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f71975a.a());
        }
        this.f71973a = i12;
        this.f71974b = z11;
    }

    public static /* synthetic */ l d(l lVar, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = lVar.f71973a;
        }
        if ((i12 & 2) != 0) {
            z11 = lVar.f71974b;
        }
        return lVar.c(i11, z11);
    }

    @w00.o
    public static final /* synthetic */ void i(l lVar, i50.e eVar, h50.f fVar) {
        eVar.encodeIntElement(fVar, 0, lVar.f71973a);
        eVar.encodeBooleanElement(fVar, 1, lVar.f71974b);
    }

    public final int a() {
        return this.f71973a;
    }

    public final boolean b() {
        return this.f71974b;
    }

    @m80.k
    public final l c(int i11, boolean z11) {
        return new l(i11, z11);
    }

    public final int e() {
        return this.f71973a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f71973a == lVar.f71973a && this.f71974b == lVar.f71974b;
    }

    public final boolean g() {
        return this.f71974b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f71973a) * 31) + Boolean.hashCode(this.f71974b);
    }

    @m80.k
    public String toString() {
        return "ComboInfoVo(currentCombo=" + this.f71973a + ", starAwarded=" + this.f71974b + ')';
    }

    public l(int i11, boolean z11) {
        this.f71973a = i11;
        this.f71974b = z11;
    }

    @f50.z("currentCombo")
    public static /* synthetic */ void f() {
    }

    @f50.z("starAwarded")
    public static /* synthetic */ void h() {
    }
}
