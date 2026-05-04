package u10;

import kotlin.jvm.internal.g0;
import p10.y0;
import v10.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l implements e20.b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final l f91523a = new l();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements e20.a {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final u f91524b;

        public a(@m80.k u javaElement) {
            g0.p(javaElement, "javaElement");
            this.f91524b = javaElement;
        }

        @Override // p10.x0
        @m80.k
        public y0 b() {
            y0 NO_SOURCE_FILE = y0.f78623a;
            g0.o(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // e20.a
        @m80.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public u c() {
            return this.f91524b;
        }

        @m80.k
        public String toString() {
            return a.class.getName() + ": " + c();
        }
    }

    @Override // e20.b
    @m80.k
    public e20.a a(@m80.k f20.l javaElement) {
        g0.p(javaElement, "javaElement");
        return new a((u) javaElement);
    }
}
