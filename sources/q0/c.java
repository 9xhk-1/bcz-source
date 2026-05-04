package q0;

import androidx.annotation.Px;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDimension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dimension.kt\ncoil/size/Dimension$Pixels\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @w00.g
        public final int f81358a;

        public a(@Px int i11) {
            super(null);
            this.f81358a = i11;
            if (i11 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f81358a == ((a) obj).f81358a;
        }

        public int hashCode() {
            return this.f81358a;
        }

        @m80.k
        public String toString() {
            return String.valueOf(this.f81358a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f81359a = new b();

        public b() {
            super(null);
        }

        @m80.k
        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public /* synthetic */ c(v vVar) {
        this();
    }

    public c() {
    }
}
