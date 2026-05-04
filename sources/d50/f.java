package d50;

import kotlin.jvm.internal.g0;
import m80.k;
import x00.q;
import y40.h0;
import y40.t;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d50.b f47269a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final d50.c f47270b = new c();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final d50.a f47271c = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements d50.a {
        @Override // d50.a
        public t a(t segment) {
            g0.p(segment, "segment");
            return segment.f();
        }

        @Override // d50.b
        public byte b(t segment, int i11) {
            g0.p(segment, "segment");
            return f.f47269a.b(segment, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements d50.b {
        @Override // d50.b
        public byte b(t segment, int i11) {
            g0.p(segment, "segment");
            return segment.o(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements d50.c {
        @Override // d50.c
        public void a(t segment, int i11, byte b11, byte b12, byte b13, byte b14) {
            g0.p(segment, "segment");
            segment.E(i11, b11, b12, b13, b14);
        }

        @Override // d50.c
        public void b(t segment, int i11, byte b11, byte b12, byte b13) {
            g0.p(segment, "segment");
            segment.D(i11, b11, b12, b13);
        }

        @Override // d50.c
        public void c(t segment, int i11, byte b11) {
            g0.p(segment, "segment");
            segment.B(i11, b11);
        }

        @Override // d50.c
        public void d(t segment, int i11, byte b11, byte b12) {
            g0.p(segment, "segment");
            segment.C(i11, b11, b12);
        }
    }

    @h0
    public static final /* synthetic */ void g(d50.b bVar, t segment, q<? super byte[], ? super Integer, ? super Integer, g2> readAction) {
        g0.p(bVar, "<this>");
        g0.p(segment, "segment");
        g0.p(readAction, "readAction");
        readAction.invoke(segment.b(true), Integer.valueOf(segment.h()), Integer.valueOf(segment.d()));
    }

    @v0
    @h0
    public static /* synthetic */ void b() {
    }

    @v0
    @h0
    public static /* synthetic */ void d() {
    }

    @v0
    @h0
    public static /* synthetic */ void f() {
    }
}
