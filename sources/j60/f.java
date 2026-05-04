package j60;

import io.ktor.websocket.y;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u30.e0;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f63611g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f63612h = "Sec-WebSocket-Extensions";

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final boolean f63613a;

    /* renamed from: b, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f63614b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final boolean f63615c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f63616d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final boolean f63617e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final boolean f63618f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final f a(@k okhttp3.h responseHeaders) throws IOException {
            g0.p(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z11 = false;
            Integer num = null;
            boolean z12 = false;
            Integer num2 = null;
            boolean z13 = false;
            boolean z14 = false;
            for (int i11 = 0; i11 < size; i11++) {
                if (f0.c2(responseHeaders.h(i11), "Sec-WebSocket-Extensions", true)) {
                    String o11 = responseHeaders.o(i11);
                    int i12 = 0;
                    while (i12 < o11.length()) {
                        int i13 = i12;
                        int u11 = u50.f.u(o11, ',', i13, 0, 4, null);
                        int s11 = u50.f.s(o11, l70.f.f70689d, i13, u11);
                        String l02 = u50.f.l0(o11, i13, s11);
                        int i14 = s11 + 1;
                        if (f0.c2(l02, y.f62578e, true)) {
                            if (!z11) {
                                z14 = true;
                                while (i14 < u11) {
                                    int s12 = u50.f.s(o11, l70.f.f70689d, i14, u11);
                                    int s13 = u50.f.s(o11, '=', i14, s12);
                                    String l03 = u50.f.l0(o11, i14, s13);
                                    String G4 = s13 < s12 ? k0.G4(u50.f.l0(o11, s13 + 1, s12), "\"") : null;
                                    int i15 = s12 + 1;
                                    if (f0.c2(l03, y.f62577d, true)) {
                                        if (num != null) {
                                            z14 = true;
                                        }
                                        num = G4 != null ? e0.p1(G4) : null;
                                        i14 = num == null ? i15 : i15;
                                    } else if (f0.c2(l03, y.f62575b, true)) {
                                        if (z12) {
                                            z14 = true;
                                        }
                                        if (G4 != null) {
                                            z14 = true;
                                        }
                                        i14 = i15;
                                        z12 = true;
                                    } else if (f0.c2(l03, y.f62574a, true)) {
                                        if (num2 != null) {
                                            z14 = true;
                                        }
                                        num2 = G4 != null ? e0.p1(G4) : null;
                                        if (num2 == null) {
                                        }
                                    } else if (f0.c2(l03, y.f62576c, true)) {
                                        if (z13) {
                                            z14 = true;
                                        }
                                        if (G4 != null) {
                                            z14 = true;
                                        }
                                        i14 = i15;
                                        z13 = true;
                                    }
                                }
                                i12 = i14;
                                z11 = true;
                            }
                            z14 = true;
                        } else {
                            i12 = i14;
                            z14 = true;
                        }
                    }
                }
            }
            return new f(z11, num, z12, num2, z13, z14);
        }

        public a() {
        }
    }

    public f() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ f h(f fVar, boolean z11, Integer num, boolean z12, Integer num2, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = fVar.f63613a;
        }
        if ((i11 & 2) != 0) {
            num = fVar.f63614b;
        }
        if ((i11 & 4) != 0) {
            z12 = fVar.f63615c;
        }
        if ((i11 & 8) != 0) {
            num2 = fVar.f63616d;
        }
        if ((i11 & 16) != 0) {
            z13 = fVar.f63617e;
        }
        if ((i11 & 32) != 0) {
            z14 = fVar.f63618f;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        return fVar.g(z11, num, z12, num2, z15, z16);
    }

    public final boolean a() {
        return this.f63613a;
    }

    @l
    public final Integer b() {
        return this.f63614b;
    }

    public final boolean c() {
        return this.f63615c;
    }

    @l
    public final Integer d() {
        return this.f63616d;
    }

    public final boolean e() {
        return this.f63617e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f63613a == fVar.f63613a && g0.g(this.f63614b, fVar.f63614b) && this.f63615c == fVar.f63615c && g0.g(this.f63616d, fVar.f63616d) && this.f63617e == fVar.f63617e && this.f63618f == fVar.f63618f;
    }

    public final boolean f() {
        return this.f63618f;
    }

    @k
    public final f g(boolean z11, @l Integer num, boolean z12, @l Integer num2, boolean z13, boolean z14) {
        return new f(z11, num, z12, num2, z13, z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z11 = this.f63613a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        Integer num = this.f63614b;
        int hashCode = (i11 + (num == null ? 0 : num.hashCode())) * 31;
        ?? r22 = this.f63615c;
        int i12 = r22;
        if (r22 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode + i12) * 31;
        Integer num2 = this.f63616d;
        int hashCode2 = (i13 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.f63617e;
        int i14 = r23;
        if (r23 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode2 + i14) * 31;
        boolean z12 = this.f63618f;
        return i15 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final boolean i(boolean z11) {
        return z11 ? this.f63615c : this.f63617e;
    }

    @k
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f63613a + ", clientMaxWindowBits=" + this.f63614b + ", clientNoContextTakeover=" + this.f63615c + ", serverMaxWindowBits=" + this.f63616d + ", serverNoContextTakeover=" + this.f63617e + ", unknownValues=" + this.f63618f + ')';
    }

    public f(boolean z11, @l Integer num, boolean z12, @l Integer num2, boolean z13, boolean z14) {
        this.f63613a = z11;
        this.f63614b = num;
        this.f63615c = z12;
        this.f63616d = num2;
        this.f63617e = z13;
        this.f63618f = z14;
    }

    public /* synthetic */ f(boolean z11, Integer num, boolean z12, Integer num2, boolean z13, boolean z14, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? false : z13, (i11 & 32) != 0 ? false : z14);
    }
}
