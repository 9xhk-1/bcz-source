package u0;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final z f91501a = new z();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.a<Long> f91502b = a.f91503a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f91503a = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReferenceImpl implements x00.a<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f91504a = new b();

        public b() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.a<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f91505a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j11) {
            super(0);
            this.f91505a = j11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Long invoke() {
            return Long.valueOf(this.f91505a);
        }
    }

    public final long a() {
        return f91502b.invoke().longValue();
    }

    public final void b() {
        f91502b = b.f91504a;
    }

    public final void c(long j11) {
        f91502b = new c(j11);
    }
}
