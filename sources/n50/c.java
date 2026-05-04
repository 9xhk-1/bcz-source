package n50;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l50.e0;
import l50.q1;
import m80.k;
import y40.i0;
import y40.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIoJsonStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IoJsonStreams.kt\nkotlinx/serialization/json/io/internal/JsonToIoStreamWriter\n+ 2 JsonStreams.kt\nkotlinx/serialization/json/internal/InternalJsonWriter$Companion\n*L\n1#1,41:1\n20#2,12:42\n*S KotlinDebug\n*F\n+ 1 IoJsonStreams.kt\nkotlinx/serialization/json/io/internal/JsonToIoStreamWriter\n*L\n28#1:42,12\n*E\n"})
/* loaded from: classes8.dex */
public final class c implements e0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f74474b;

    public c(@k x sink) {
        g0.p(sink, "sink");
        this.f74474b = sink;
    }

    @Override // l50.e0
    public void a(char c11) {
        i0.n(this.f74474b, c11);
    }

    @Override // l50.e0
    public void b(@k String text) {
        g0.p(text, "text");
        i0.n(this.f74474b, 34);
        int length = text.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = text.charAt(i12);
            if (charAt < q1.b().length && q1.b()[charAt] != null) {
                i0.p(this.f74474b, text, i11, i12);
                String str = q1.b()[charAt];
                g0.m(str);
                i0.p(this.f74474b, str, 0, str.length());
                i11 = i12 + 1;
            }
        }
        i0.p(this.f74474b, text, i11, text.length());
        i0.n(this.f74474b, 34);
    }

    @Override // l50.e0
    public void c(@k String text) {
        g0.p(text, "text");
        i0.r(this.f74474b, text, 0, 0, 6, null);
    }

    @Override // l50.e0
    public void writeLong(long j11) {
        c(String.valueOf(j11));
    }

    @Override // l50.e0
    public void release() {
    }
}
