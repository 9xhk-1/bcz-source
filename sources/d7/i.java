package d7;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f47300a = new a();

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 74047634;
        }

        @m80.k
        public String toString() {
            return "Completed";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final String f47301a;

        public b(@m80.l String str) {
            this.f47301a = str;
        }

        public static /* synthetic */ b c(b bVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f47301a;
            }
            return bVar.b(str);
        }

        @m80.l
        public final String a() {
            return this.f47301a;
        }

        @m80.k
        public final b b(@m80.l String str) {
            return new b(str);
        }

        @m80.l
        public final String d() {
            return this.f47301a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && g0.g(this.f47301a, ((b) obj).f47301a);
        }

        public int hashCode() {
            String str = this.f47301a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @m80.k
        public String toString() {
            return "Error(msg=" + this.f47301a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final c f47302a = new c();

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 758301997;
        }

        @m80.k
        public String toString() {
            return "Idle";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final d f47303a = new d();

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 2014163267;
        }

        @m80.k
        public String toString() {
            return "Loading";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final e f47304a = new e();

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -1218302905;
        }

        @m80.k
        public String toString() {
            return "Paused";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements i {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final f f47305a = new f();

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1183948853;
        }

        @m80.k
        public String toString() {
            return "Playing";
        }
    }
}
