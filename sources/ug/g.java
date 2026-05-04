package ug;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final int f92208b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final long f92209a;

        public a() {
            this(0L, 1, null);
        }

        public static /* synthetic */ a c(a aVar, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = aVar.f92209a;
            }
            return aVar.b(j11);
        }

        public final long a() {
            return this.f92209a;
        }

        @k
        public final a b(long j11) {
            return new a(j11);
        }

        public final long d() {
            return this.f92209a;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f92209a == ((a) obj).f92209a;
        }

        public int hashCode() {
            return Long.hashCode(this.f92209a);
        }

        @k
        public String toString() {
            return "Membership(expiration=" + this.f92209a + j.f81007d;
        }

        public a(long j11) {
            this.f92209a = j11;
        }

        public /* synthetic */ a(long j11, int i11, v vVar) {
            this((i11 & 1) != 0 ? 0L : j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final int f92210b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final long f92211a;

        public b(long j11) {
            this.f92211a = j11;
        }

        public static /* synthetic */ b c(b bVar, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = bVar.f92211a;
            }
            return bVar.b(j11);
        }

        public final long a() {
            return this.f92211a;
        }

        @k
        public final b b(long j11) {
            return new b(j11);
        }

        public final long d() {
            return this.f92211a;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f92211a == ((b) obj).f92211a;
        }

        public int hashCode() {
            return Long.hashCode(this.f92211a);
        }

        @k
        public String toString() {
            return "Normal(vitality=" + this.f92211a + j.f81007d;
        }
    }
}
