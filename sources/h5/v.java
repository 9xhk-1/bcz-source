package h5;

import j50.d3;
import j50.h2;
import j50.l1;
import j50.l2;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class v {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f58459a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f58460b;

    /* renamed from: c, reason: collision with root package name */
    public final long f58461c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<v> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f58462a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f58462a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.model.IpAvatarSpeechSnapshot", aVar, 3);
            l2Var.q("resourceId", false);
            l2Var.q("autoSpeechText", false);
            l2Var.q("showAt", false);
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
            d3 d3Var = d3.f63348a;
            return new f50.i[]{d3Var, d3Var, l1.f63406a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final v e(@m80.k i50.f decoder) {
            String str;
            int i11;
            String str2;
            long j11;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(fVar, 0);
                i11 = 7;
                str2 = beginStructure.decodeStringElement(fVar, 1);
                j11 = beginStructure.decodeLongElement(fVar, 2);
            } else {
                str = null;
                boolean z11 = true;
                long j12 = 0;
                String str3 = null;
                int i12 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        str = beginStructure.decodeStringElement(fVar, 0);
                        i12 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str3 = beginStructure.decodeStringElement(fVar, 1);
                        i12 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        j12 = beginStructure.decodeLongElement(fVar, 2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                str2 = str3;
                j11 = j12;
            }
            String str4 = str;
            beginStructure.endStructure(fVar);
            return new v(i11, str4, str2, j11, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k v value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            v.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<v> serializer() {
            return a.f58462a;
        }

        public b() {
        }
    }

    public /* synthetic */ v(int i11, String str, String str2, long j11, x2 x2Var) {
        if (7 != (i11 & 7)) {
            h2.b(i11, 7, a.f58462a.a());
        }
        this.f58459a = str;
        this.f58460b = str2;
        this.f58461c = j11;
    }

    public static /* synthetic */ v e(v vVar, String str, String str2, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vVar.f58459a;
        }
        if ((i11 & 2) != 0) {
            str2 = vVar.f58460b;
        }
        if ((i11 & 4) != 0) {
            j11 = vVar.f58461c;
        }
        return vVar.d(str, str2, j11);
    }

    @w00.o
    public static final /* synthetic */ void l(v vVar, i50.e eVar, h50.f fVar) {
        eVar.encodeStringElement(fVar, 0, vVar.f58459a);
        eVar.encodeStringElement(fVar, 1, vVar.f58460b);
        eVar.encodeLongElement(fVar, 2, vVar.f58461c);
    }

    @m80.k
    public final String a() {
        return this.f58459a;
    }

    @m80.k
    public final String b() {
        return this.f58460b;
    }

    public final long c() {
        return this.f58461c;
    }

    @m80.k
    public final v d(@m80.k String resourceId, @m80.k String autoSpeechText, long j11) {
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        kotlin.jvm.internal.g0.p(autoSpeechText, "autoSpeechText");
        return new v(resourceId, autoSpeechText, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.g0.g(this.f58459a, vVar.f58459a) && kotlin.jvm.internal.g0.g(this.f58460b, vVar.f58460b) && this.f58461c == vVar.f58461c;
    }

    @m80.k
    public final String f() {
        return this.f58460b;
    }

    @m80.k
    public final String h() {
        return this.f58459a;
    }

    public int hashCode() {
        return (((this.f58459a.hashCode() * 31) + this.f58460b.hashCode()) * 31) + Long.hashCode(this.f58461c);
    }

    public final long j() {
        return this.f58461c;
    }

    @m80.k
    public String toString() {
        return "IpAvatarSpeechSnapshot(resourceId=" + this.f58459a + ", autoSpeechText=" + this.f58460b + ", showAt=" + this.f58461c + ')';
    }

    public v(@m80.k String resourceId, @m80.k String autoSpeechText, long j11) {
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        kotlin.jvm.internal.g0.p(autoSpeechText, "autoSpeechText");
        this.f58459a = resourceId;
        this.f58460b = autoSpeechText;
        this.f58461c = j11;
    }

    @f50.z("autoSpeechText")
    public static /* synthetic */ void g() {
    }

    @f50.z("resourceId")
    public static /* synthetic */ void i() {
    }

    @f50.z("showAt")
    public static /* synthetic */ void k() {
    }
}
