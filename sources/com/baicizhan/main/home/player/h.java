package com.baicizhan.main.home.player;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a implements h {

        /* renamed from: b, reason: collision with root package name */
        public static final int f23648b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f23649a;

        public a(int i11) {
            this.f23649a = i11;
        }

        public static /* synthetic */ a c(a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f23649a;
            }
            return aVar.b(i11);
        }

        public final int a() {
            return this.f23649a;
        }

        @m80.k
        public final a b(int i11) {
            return new a(i11);
        }

        public final int d() {
            return this.f23649a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f23649a == ((a) obj).f23649a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f23649a);
        }

        @m80.k
        public String toString() {
            return "Learnt(masteredCount=" + this.f23649a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f23650a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f23651b = 0;
    }
}
