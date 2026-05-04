package k3;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class m3 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends m3 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f65446a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends m3 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<l3> f65447a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65448b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k List<l3> units, int i11) {
            super(null);
            kotlin.jvm.internal.g0.p(units, "units");
            this.f65447a = units;
            this.f65448b = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b d(b bVar, List list, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = bVar.f65447a;
            }
            if ((i12 & 2) != 0) {
                i11 = bVar.f65448b;
            }
            return bVar.c(list, i11);
        }

        @m80.k
        public final List<l3> a() {
            return this.f65447a;
        }

        public final int b() {
            return this.f65448b;
        }

        @m80.k
        public final b c(@m80.k List<l3> units, int i11) {
            kotlin.jvm.internal.g0.p(units, "units");
            return new b(units, i11);
        }

        public final int e() {
            return this.f65448b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f65447a, bVar.f65447a) && this.f65448b == bVar.f65448b;
        }

        @m80.k
        public final List<l3> f() {
            return this.f65447a;
        }

        public int hashCode() {
            return (this.f65447a.hashCode() * 31) + Integer.hashCode(this.f65448b);
        }

        @m80.k
        public String toString() {
            return "UnitContent(units=" + this.f65447a + ", curIdx=" + this.f65448b + ')';
        }
    }

    public /* synthetic */ m3(kotlin.jvm.internal.v vVar) {
        this();
    }

    public m3() {
    }
}
