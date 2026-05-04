package com.baicizhan.main.home.player;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class b8 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f23475b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f23476a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends b8 {

        /* renamed from: h, reason: collision with root package name */
        public static final int f23477h = 0;

        /* renamed from: c, reason: collision with root package name */
        public final int f23478c;

        /* renamed from: d, reason: collision with root package name */
        public final int f23479d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f23480e;

        /* renamed from: f, reason: collision with root package name */
        public final int f23481f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final String f23482g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, int i12, @m80.k String rewardDescription, @DrawableRes int i13, @m80.k String rewardCountDescription) {
            super(i11, null);
            kotlin.jvm.internal.g0.p(rewardDescription, "rewardDescription");
            kotlin.jvm.internal.g0.p(rewardCountDescription, "rewardCountDescription");
            this.f23478c = i11;
            this.f23479d = i12;
            this.f23480e = rewardDescription;
            this.f23481f = i13;
            this.f23482g = rewardCountDescription;
        }

        public static /* synthetic */ a h(a aVar, int i11, int i12, String str, int i13, String str2, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = aVar.f23478c;
            }
            if ((i14 & 2) != 0) {
                i12 = aVar.f23479d;
            }
            if ((i14 & 4) != 0) {
                str = aVar.f23480e;
            }
            if ((i14 & 8) != 0) {
                i13 = aVar.f23481f;
            }
            if ((i14 & 16) != 0) {
                str2 = aVar.f23482g;
            }
            String str3 = str2;
            String str4 = str;
            return aVar.g(i11, i12, str4, i13, str3);
        }

        @Override // com.baicizhan.main.home.player.b8
        public int a() {
            return this.f23478c;
        }

        public final int b() {
            return this.f23478c;
        }

        public final int c() {
            return this.f23479d;
        }

        @m80.k
        public final String d() {
            return this.f23480e;
        }

        public final int e() {
            return this.f23481f;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23478c == aVar.f23478c && this.f23479d == aVar.f23479d && kotlin.jvm.internal.g0.g(this.f23480e, aVar.f23480e) && this.f23481f == aVar.f23481f && kotlin.jvm.internal.g0.g(this.f23482g, aVar.f23482g);
        }

        @m80.k
        public final String f() {
            return this.f23482g;
        }

        @m80.k
        public final a g(int i11, int i12, @m80.k String rewardDescription, @DrawableRes int i13, @m80.k String rewardCountDescription) {
            kotlin.jvm.internal.g0.p(rewardDescription, "rewardDescription");
            kotlin.jvm.internal.g0.p(rewardCountDescription, "rewardCountDescription");
            return new a(i11, i12, rewardDescription, i13, rewardCountDescription);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f23478c) * 31) + Integer.hashCode(this.f23479d)) * 31) + this.f23480e.hashCode()) * 31) + Integer.hashCode(this.f23481f)) * 31) + this.f23482g.hashCode();
        }

        public final int i() {
            return this.f23479d;
        }

        @m80.k
        public final String j() {
            return this.f23482g;
        }

        @m80.k
        public final String k() {
            return this.f23480e;
        }

        public final int l() {
            return this.f23481f;
        }

        @m80.k
        public String toString() {
            return "Done(progress=" + this.f23478c + ", next=" + this.f23479d + ", rewardDescription=" + this.f23480e + ", rewardIcon=" + this.f23481f + ", rewardCountDescription=" + this.f23482g + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends b8 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f23483e = 0;

        /* renamed from: c, reason: collision with root package name */
        public final int f23484c;

        /* renamed from: d, reason: collision with root package name */
        public final int f23485d;

        public b(int i11, int i12) {
            super(i11, null);
            this.f23484c = i11;
            this.f23485d = i12;
        }

        public static /* synthetic */ b e(b bVar, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = bVar.f23484c;
            }
            if ((i13 & 2) != 0) {
                i12 = bVar.f23485d;
            }
            return bVar.d(i11, i12);
        }

        @Override // com.baicizhan.main.home.player.b8
        public int a() {
            return this.f23484c;
        }

        public final int b() {
            return this.f23484c;
        }

        public final int c() {
            return this.f23485d;
        }

        @m80.k
        public final b d(int i11, int i12) {
            return new b(i11, i12);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f23484c == bVar.f23484c && this.f23485d == bVar.f23485d;
        }

        public final int f() {
            return this.f23485d;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f23484c) * 31) + Integer.hashCode(this.f23485d);
        }

        @m80.k
        public String toString() {
            return "OnGoing(progress=" + this.f23484c + ", target=" + this.f23485d + pn.j.f81007d;
        }
    }

    public /* synthetic */ b8(int i11, kotlin.jvm.internal.v vVar) {
        this(i11);
    }

    public int a() {
        return this.f23476a;
    }

    public b8(int i11) {
        this.f23476a = i11;
    }
}
