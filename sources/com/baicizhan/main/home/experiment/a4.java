package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class a4 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21077a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends a4 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f21078e = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f21079b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final WinningType f21080c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f21081d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, @m80.k WinningType state, @m80.k String message) {
            super(null);
            kotlin.jvm.internal.g0.p(state, "state");
            kotlin.jvm.internal.g0.p(message, "message");
            this.f21079b = i11;
            this.f21080c = state;
            this.f21081d = message;
        }

        public static /* synthetic */ a e(a aVar, int i11, WinningType winningType, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f21079b;
            }
            if ((i12 & 2) != 0) {
                winningType = aVar.f21080c;
            }
            if ((i12 & 4) != 0) {
                str = aVar.f21081d;
            }
            return aVar.d(i11, winningType, str);
        }

        public final int a() {
            return this.f21079b;
        }

        @m80.k
        public final WinningType b() {
            return this.f21080c;
        }

        @m80.k
        public final String c() {
            return this.f21081d;
        }

        @m80.k
        public final a d(int i11, @m80.k WinningType state, @m80.k String message) {
            kotlin.jvm.internal.g0.p(state, "state");
            kotlin.jvm.internal.g0.p(message, "message");
            return new a(i11, state, message);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21079b == aVar.f21079b && this.f21080c == aVar.f21080c && kotlin.jvm.internal.g0.g(this.f21081d, aVar.f21081d);
        }

        public final int f() {
            return this.f21079b;
        }

        @m80.k
        public final String g() {
            return this.f21081d;
        }

        @m80.k
        public final WinningType h() {
            return this.f21080c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f21079b) * 31) + this.f21080c.hashCode()) * 31) + this.f21081d.hashCode();
        }

        @m80.k
        public String toString() {
            return "Appear(day=" + this.f21079b + ", state=" + this.f21080c + ", message=" + this.f21081d + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends a4 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final b f21082b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final int f21083c = 0;

        public b() {
            super(null);
        }
    }

    public /* synthetic */ a4(kotlin.jvm.internal.v vVar) {
        this();
    }

    public a4() {
    }
}
