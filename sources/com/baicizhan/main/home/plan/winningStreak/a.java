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
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22986a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    /* renamed from: com.baicizhan.main.home.plan.winningStreak.a$a, reason: collision with other inner class name */
    public static final class C0316a extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C0316a f22987b = new C0316a();

        /* renamed from: c, reason: collision with root package name */
        public static final int f22988c = 0;

        public C0316a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f22989c = 0;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RankingStatus f22990b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k RankingStatus status) {
            super(null);
            g0.p(status, "status");
            this.f22990b = status;
        }

        public static /* synthetic */ b c(b bVar, RankingStatus rankingStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                rankingStatus = bVar.f22990b;
            }
            return bVar.b(rankingStatus);
        }

        @k
        public final RankingStatus a() {
            return this.f22990b;
        }

        @k
        public final b b(@k RankingStatus status) {
            g0.p(status, "status");
            return new b(status);
        }

        @k
        public final RankingStatus d() {
            return this.f22990b;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f22990b == ((b) obj).f22990b;
        }

        public int hashCode() {
            return this.f22990b.hashCode();
        }

        @k
        public String toString() {
            return "Ranking(status=" + this.f22990b + j.f81007d;
        }
    }

    public /* synthetic */ a(v vVar) {
        this();
    }

    public a() {
    }
}
