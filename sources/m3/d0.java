package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class d0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f71886a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<d0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71887a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71887a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.LookupReqVo", aVar, 1);
            l2Var.q("word", false);
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
            return new f50.i[]{d3.f63348a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final d0 e(@m80.k i50.f decoder) {
            String str;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            int i11 = 1;
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(fVar, 0);
            } else {
                boolean z11 = true;
                int i12 = 0;
                str = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else {
                        if (decodeElementIndex != 0) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        str = beginStructure.decodeStringElement(fVar, 0);
                        i12 = 1;
                    }
                }
                i11 = i12;
            }
            beginStructure.endStructure(fVar);
            return new d0(i11, str, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k d0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            d0.f(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<d0> serializer() {
            return a.f71887a;
        }

        public b() {
        }
    }

    public /* synthetic */ d0(int i11, String str, x2 x2Var) {
        if (1 != (i11 & 1)) {
            j50.h2.b(i11, 1, a.f71887a.a());
        }
        this.f71886a = str;
    }

    public static /* synthetic */ d0 c(d0 d0Var, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = d0Var.f71886a;
        }
        return d0Var.b(str);
    }

    @w00.o
    public static final /* synthetic */ void f(d0 d0Var, i50.e eVar, h50.f fVar) {
        eVar.encodeStringElement(fVar, 0, d0Var.f71886a);
    }

    @m80.k
    public final String a() {
        return this.f71886a;
    }

    @m80.k
    public final d0 b(@m80.k String word) {
        kotlin.jvm.internal.g0.p(word, "word");
        return new d0(word);
    }

    @m80.k
    public final String d() {
        return this.f71886a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && kotlin.jvm.internal.g0.g(this.f71886a, ((d0) obj).f71886a);
    }

    public int hashCode() {
        return this.f71886a.hashCode();
    }

    @m80.k
    public String toString() {
        return "LookupReqVo(word=" + this.f71886a + ')';
    }

    public d0(@m80.k String word) {
        kotlin.jvm.internal.g0.p(word, "word");
        this.f71886a = word;
    }

    @f50.z("word")
    public static /* synthetic */ void e() {
    }
}
