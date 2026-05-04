package l30;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69772a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends g {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final a f69773b = new a();

        public a() {
            super(false, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends g {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69774b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k String error) {
            super(false, null);
            g0.p(error, "error");
            this.f69774b = error;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends g {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final c f69775b = new c();

        public c() {
            super(true, null);
        }
    }

    public /* synthetic */ g(boolean z11, kotlin.jvm.internal.v vVar) {
        this(z11);
    }

    public final boolean a() {
        return this.f69772a;
    }

    public g(boolean z11) {
        this.f69772a = z11;
    }
}
