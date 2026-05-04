package w40;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Object f95256a;

        public a(@m80.k Object conflicting) {
            g0.p(conflicting, "conflicting");
            this.f95256a = conflicting;
        }

        @Override // w40.g
        @m80.k
        public String a() {
            return "attempted to overwrite the existing value '" + this.f95256a + '\'';
        }

        @m80.k
        public final Object b() {
            return this.f95256a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f95257a = new b();

        @Override // w40.g
        @m80.k
        public String a() {
            return "expected an Int value";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public final int f95258a;

        public c(int i11) {
            this.f95258a = i11;
        }

        @Override // w40.g
        @m80.k
        public String a() {
            return "expected at least " + this.f95258a + " digits";
        }

        public final int b() {
            return this.f95258a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public final int f95259a;

        public d(int i11) {
            this.f95259a = i11;
        }

        @Override // w40.g
        @m80.k
        public String a() {
            return "expected at most " + this.f95259a + " digits";
        }

        public final int b() {
            return this.f95259a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements g {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f95260a;

        public e(@m80.k String expected) {
            g0.p(expected, "expected");
            this.f95260a = expected;
        }

        @Override // w40.g
        @m80.k
        public String a() {
            return "expected '" + this.f95260a + '\'';
        }

        @m80.k
        public final String b() {
            return this.f95260a;
        }
    }

    @m80.k
    String a();
}
