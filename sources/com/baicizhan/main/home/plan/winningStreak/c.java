package com.baicizhan.main.home.plan.winningStreak;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22996a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f22997b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final int f22998c = 0;

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends c {

        /* renamed from: d, reason: collision with root package name */
        public static final int f22999d = 0;

        /* renamed from: b, reason: collision with root package name */
        public final int f23000b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final WinningStreakStatus f23001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, @k WinningStreakStatus status) {
            super(null);
            g0.p(status, "status");
            this.f23000b = i11;
            this.f23001c = status;
        }

        public static /* synthetic */ b d(b bVar, int i11, WinningStreakStatus winningStreakStatus, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f23000b;
            }
            if ((i12 & 2) != 0) {
                winningStreakStatus = bVar.f23001c;
            }
            return bVar.c(i11, winningStreakStatus);
        }

        public final int a() {
            return this.f23000b;
        }

        @k
        public final WinningStreakStatus b() {
            return this.f23001c;
        }

        @k
        public final b c(int i11, @k WinningStreakStatus status) {
            g0.p(status, "status");
            return new b(i11, status);
        }

        public final int e() {
            return this.f23000b;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f23000b == bVar.f23000b && this.f23001c == bVar.f23001c;
        }

        @k
        public final WinningStreakStatus f() {
            return this.f23001c;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f23000b) * 31) + this.f23001c.hashCode();
        }

        @k
        public String toString() {
            return "WinningStreak(days=" + this.f23000b + ", status=" + this.f23001c + j.f81007d;
        }
    }

    public /* synthetic */ c(v vVar) {
        this();
    }

    public c() {
    }
}
