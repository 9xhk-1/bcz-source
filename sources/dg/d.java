package dg;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
/* loaded from: classes4.dex */
public abstract class d<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f47957a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends d {

        /* renamed from: c, reason: collision with root package name */
        public static final int f47958c = 8;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f47959b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k Throwable exception) {
            super(null);
            g0.p(exception, "exception");
            this.f47959b = exception;
        }

        public static /* synthetic */ a c(a aVar, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = aVar.f47959b;
            }
            return aVar.b(th2);
        }

        @k
        public final Throwable a() {
            return this.f47959b;
        }

        @k
        public final a b(@k Throwable exception) {
            g0.p(exception, "exception");
            return new a(exception);
        }

        @k
        public final Throwable d() {
            return this.f47959b;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && g0.g(this.f47959b, ((a) obj).f47959b);
        }

        public int hashCode() {
            return this.f47959b.hashCode();
        }

        @Override // dg.d
        @k
        public String toString() {
            return "Failure(exception=" + this.f47959b + j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f47960b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final int f47961c = 0;

        public b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c<T> extends d<T> {

        /* renamed from: c, reason: collision with root package name */
        public static final int f47962c = 0;

        /* renamed from: b, reason: collision with root package name */
        public final T f47963b;

        public c(T t11) {
            super(null);
            this.f47963b = t11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c c(c cVar, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = cVar.f47963b;
            }
            return cVar.b(obj);
        }

        public final T a() {
            return this.f47963b;
        }

        @k
        public final c<T> b(T t11) {
            return new c<>(t11);
        }

        public final T d() {
            return this.f47963b;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && g0.g(this.f47963b, ((c) obj).f47963b);
        }

        public int hashCode() {
            T t11 = this.f47963b;
            if (t11 == null) {
                return 0;
            }
            return t11.hashCode();
        }

        @Override // dg.d
        @k
        public String toString() {
            return "Success(data=" + this.f47963b + j.f81007d;
        }
    }

    public /* synthetic */ d(v vVar) {
        this();
    }

    @k
    public String toString() {
        if (this instanceof c) {
            return "Success[data=" + ((c) this).d() + "]";
        }
        if (!(this instanceof a)) {
            if (g0.g(this, b.f47960b)) {
                return "Loading";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "Failure[exception=" + ((a) this).d() + "]";
    }

    public d() {
    }
}
