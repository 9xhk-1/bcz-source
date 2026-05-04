package g20;

import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f52608e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final h f52609f = new h(null, null, false, false, 8, null);

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final NullabilityQualifier f52610a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final MutabilityQualifier f52611b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f52612c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f52613d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final h a() {
            return h.f52609f;
        }

        public a() {
        }
    }

    public h(@m80.l NullabilityQualifier nullabilityQualifier, @m80.l MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12) {
        this.f52610a = nullabilityQualifier;
        this.f52611b = mutabilityQualifier;
        this.f52612c = z11;
        this.f52613d = z12;
    }

    public static /* synthetic */ h c(h hVar, NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nullabilityQualifier = hVar.f52610a;
        }
        if ((i11 & 2) != 0) {
            mutabilityQualifier = hVar.f52611b;
        }
        if ((i11 & 4) != 0) {
            z11 = hVar.f52612c;
        }
        if ((i11 & 8) != 0) {
            z12 = hVar.f52613d;
        }
        return hVar.b(nullabilityQualifier, mutabilityQualifier, z11, z12);
    }

    @m80.k
    public final h b(@m80.l NullabilityQualifier nullabilityQualifier, @m80.l MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12) {
        return new h(nullabilityQualifier, mutabilityQualifier, z11, z12);
    }

    public final boolean d() {
        return this.f52612c;
    }

    @m80.l
    public final MutabilityQualifier e() {
        return this.f52611b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f52610a == hVar.f52610a && this.f52611b == hVar.f52611b && this.f52612c == hVar.f52612c && this.f52613d == hVar.f52613d;
    }

    @m80.l
    public final NullabilityQualifier f() {
        return this.f52610a;
    }

    public final boolean g() {
        return this.f52613d;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f52610a;
        int hashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.f52611b;
        return ((((hashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31) + Boolean.hashCode(this.f52612c)) * 31) + Boolean.hashCode(this.f52613d);
    }

    @m80.k
    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f52610a + ", mutability=" + this.f52611b + ", definitelyNotNull=" + this.f52612c + ", isNullabilityQualifierForWarning=" + this.f52613d + ')';
    }

    public /* synthetic */ h(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z11, boolean z12, int i11, kotlin.jvm.internal.v vVar) {
        this(nullabilityQualifier, mutabilityQualifier, z11, (i11 & 8) != 0 ? false : z12);
    }
}
