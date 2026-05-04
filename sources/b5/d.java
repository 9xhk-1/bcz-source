package b5;

import j50.d3;
import j50.l2;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class d implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f5806a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5807b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<d> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5808a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5808a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.impl.unity.command.AppInfoRsp", aVar, 2);
            l2Var.q("version", false);
            l2Var.q("versionCode", false);
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
            return new f50.i[]{d3.f63348a, j50.l1.f63406a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final d e(@m80.k i50.f decoder) {
            String str;
            long j11;
            int i11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(fVar, 0);
                j11 = beginStructure.decodeLongElement(fVar, 1);
                i11 = 3;
            } else {
                str = null;
                long j12 = 0;
                boolean z11 = true;
                int i12 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        str = beginStructure.decodeStringElement(fVar, 0);
                        i12 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        j12 = beginStructure.decodeLongElement(fVar, 1);
                        i12 |= 2;
                    }
                }
                j11 = j12;
                i11 = i12;
            }
            String str2 = str;
            beginStructure.endStructure(fVar);
            return new d(i11, str2, j11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k d value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            d.g(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<d> serializer() {
            return a.f5808a;
        }

        public b() {
        }
    }

    public /* synthetic */ d(int i11, String str, long j11, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f5808a.a());
        }
        this.f5806a = str;
        this.f5807b = j11;
    }

    public static /* synthetic */ d d(d dVar, String str, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dVar.f5806a;
        }
        if ((i11 & 2) != 0) {
            j11 = dVar.f5807b;
        }
        return dVar.c(str, j11);
    }

    @w00.o
    public static final /* synthetic */ void g(d dVar, i50.e eVar, h50.f fVar) {
        eVar.encodeStringElement(fVar, 0, dVar.f5806a);
        eVar.encodeLongElement(fVar, 1, dVar.f5807b);
    }

    @m80.k
    public final String a() {
        return this.f5806a;
    }

    public final long b() {
        return this.f5807b;
    }

    @m80.k
    public final d c(@m80.k String version, long j11) {
        kotlin.jvm.internal.g0.p(version, "version");
        return new d(version, j11);
    }

    @m80.k
    public final String e() {
        return this.f5806a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.g0.g(this.f5806a, dVar.f5806a) && this.f5807b == dVar.f5807b;
    }

    public final long f() {
        return this.f5807b;
    }

    public int hashCode() {
        return (this.f5806a.hashCode() * 31) + Long.hashCode(this.f5807b);
    }

    @m80.k
    public String toString() {
        return "AppInfoRsp(version=" + this.f5806a + ", versionCode=" + this.f5807b + ')';
    }

    public d(@m80.k String version, long j11) {
        kotlin.jvm.internal.g0.p(version, "version");
        this.f5806a = version;
        this.f5807b = j11;
    }
}
