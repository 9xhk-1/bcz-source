package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class f {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f71897b = {yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.e
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = f.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<String, Boolean> f71898a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<f> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71899a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71899a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.CheckNextLevelRspVo", aVar, 1);
            l2Var.q("availability", false);
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
            return new f50.i[]{f.f71897b[0].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final f e(@m80.k i50.f decoder) {
            Map map;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = f.f71897b;
            int i11 = 1;
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                map = (Map) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), null);
            } else {
                boolean z11 = true;
                int i12 = 0;
                Map map2 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else {
                        if (decodeElementIndex != 0) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        map2 = (Map) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), map2);
                        i12 = 1;
                    }
                }
                map = map2;
                i11 = i12;
            }
            beginStructure.endStructure(fVar);
            return new f(i11, map, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k f value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            f.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<f> serializer() {
            return a.f71899a;
        }

        public b() {
        }
    }

    public /* synthetic */ f(int i11, Map map, x2 x2Var) {
        if (1 != (i11 & 1)) {
            j50.h2.b(i11, 1, a.f71899a.a());
        }
        this.f71898a = map;
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f1(d3.f63348a, j50.i.f63378a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f f(f fVar, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = fVar.f71898a;
        }
        return fVar.e(map);
    }

    @w00.o
    public static final /* synthetic */ void i(f fVar, i50.e eVar, h50.f fVar2) {
        eVar.encodeSerializableElement(fVar2, 0, f71897b[0].getValue(), fVar.f71898a);
    }

    @m80.k
    public final Map<String, Boolean> d() {
        return this.f71898a;
    }

    @m80.k
    public final f e(@m80.k Map<String, Boolean> availability) {
        kotlin.jvm.internal.g0.p(availability, "availability");
        return new f(availability);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.g0.g(this.f71898a, ((f) obj).f71898a);
    }

    @m80.k
    public final Map<String, Boolean> g() {
        return this.f71898a;
    }

    public int hashCode() {
        return this.f71898a.hashCode();
    }

    @m80.k
    public String toString() {
        return "CheckNextLevelRspVo(availability=" + this.f71898a + ')';
    }

    public f(@m80.k Map<String, Boolean> availability) {
        kotlin.jvm.internal.g0.p(availability, "availability");
        this.f71898a = availability;
    }

    @f50.z("availability")
    public static /* synthetic */ void h() {
    }
}
