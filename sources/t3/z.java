package t3;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class z {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends z {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f89302a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends z {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ts.a<T, ?> f89303a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k ts.a<T, ?> adapter) {
            super(null);
            g0.p(adapter, "adapter");
            this.f89303a = adapter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b c(b bVar, ts.a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar = bVar.f89303a;
            }
            return bVar.b(aVar);
        }

        @m80.k
        public final ts.a<T, ?> a() {
            return this.f89303a;
        }

        @m80.k
        public final b<T> b(@m80.k ts.a<T, ?> adapter) {
            g0.p(adapter, "adapter");
            return new b<>(adapter);
        }

        @m80.k
        public final ts.a<T, ?> d() {
            return this.f89303a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && g0.g(this.f89303a, ((b) obj).f89303a);
        }

        public int hashCode() {
            return this.f89303a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Thrift(adapter=" + this.f89303a + ')';
        }
    }

    public /* synthetic */ z(kotlin.jvm.internal.v vVar) {
        this();
    }

    public z() {
    }
}
