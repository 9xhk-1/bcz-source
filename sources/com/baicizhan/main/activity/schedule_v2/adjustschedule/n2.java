package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19164a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends n2 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f19165c = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f19166b;

        public a(int i11) {
            super(null);
            this.f19166b = i11;
        }

        public static /* synthetic */ a c(a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f19166b;
            }
            return aVar.b(i11);
        }

        public final int a() {
            return this.f19166b;
        }

        @m80.k
        public final a b(int i11) {
            return new a(i11);
        }

        public final int d() {
            return this.f19166b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f19166b == ((a) obj).f19166b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f19166b);
        }

        @m80.k
        public String toString() {
            return "Disable(planCount=" + this.f19166b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends n2 {

        /* renamed from: d, reason: collision with root package name */
        public static final int f19167d = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f19168b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19169c;

        public b(int i11, int i12) {
            super(null);
            this.f19168b = i11;
            this.f19169c = i12;
        }

        public static /* synthetic */ b d(b bVar, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = bVar.f19168b;
            }
            if ((i13 & 2) != 0) {
                i12 = bVar.f19169c;
            }
            return bVar.c(i11, i12);
        }

        public final int a() {
            return this.f19168b;
        }

        public final int b() {
            return this.f19169c;
        }

        @m80.k
        public final b c(int i11, int i12) {
            return new b(i11, i12);
        }

        public final int e() {
            return this.f19168b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f19168b == bVar.f19168b && this.f19169c == bVar.f19169c;
        }

        public final int f() {
            return this.f19169c;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f19168b) * 31) + Integer.hashCode(this.f19169c);
        }

        @m80.k
        public String toString() {
            return "Enable(planCount=" + this.f19168b + ", remainDay=" + this.f19169c + pn.j.f81007d;
        }
    }

    public /* synthetic */ n2(kotlin.jvm.internal.v vVar) {
        this();
    }

    public n2() {
    }
}
