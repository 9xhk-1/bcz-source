package com.baicizhan.main.home.player;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class t6 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f24187b = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f24188a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends t6 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f24189e = 0;

        /* renamed from: c, reason: collision with root package name */
        public final int f24190c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f24191d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@DrawableRes int i11, @m80.k String title) {
            super(title, null);
            kotlin.jvm.internal.g0.p(title, "title");
            this.f24190c = i11;
            this.f24191d = title;
        }

        public static /* synthetic */ a e(a aVar, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f24190c;
            }
            if ((i12 & 2) != 0) {
                str = aVar.f24191d;
            }
            return aVar.d(i11, str);
        }

        @Override // com.baicizhan.main.home.player.t6
        @m80.k
        public String a() {
            return this.f24191d;
        }

        public final int b() {
            return this.f24190c;
        }

        @m80.k
        public final String c() {
            return this.f24191d;
        }

        @m80.k
        public final a d(@DrawableRes int i11, @m80.k String title) {
            kotlin.jvm.internal.g0.p(title, "title");
            return new a(i11, title);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f24190c == aVar.f24190c && kotlin.jvm.internal.g0.g(this.f24191d, aVar.f24191d);
        }

        public final int f() {
            return this.f24190c;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f24190c) * 31) + this.f24191d.hashCode();
        }

        @m80.k
        public String toString() {
            return "Composite(icon=" + this.f24190c + ", title=" + this.f24191d + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends t6 {

        /* renamed from: d, reason: collision with root package name */
        public static final int f24192d = 0;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f24193c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k String title) {
            super(title, null);
            kotlin.jvm.internal.g0.p(title, "title");
            this.f24193c = title;
        }

        public static /* synthetic */ b d(b bVar, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f24193c;
            }
            return bVar.c(str);
        }

        @Override // com.baicizhan.main.home.player.t6
        @m80.k
        public String a() {
            return this.f24193c;
        }

        @m80.k
        public final String b() {
            return this.f24193c;
        }

        @m80.k
        public final b c(@m80.k String title) {
            kotlin.jvm.internal.g0.p(title, "title");
            return new b(title);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.g0.g(this.f24193c, ((b) obj).f24193c);
        }

        public int hashCode() {
            return this.f24193c.hashCode();
        }

        @m80.k
        public String toString() {
            return "Label(title=" + this.f24193c + pn.j.f81007d;
        }
    }

    public /* synthetic */ t6(String str, kotlin.jvm.internal.v vVar) {
        this(str);
    }

    @m80.k
    public String a() {
        return this.f24188a;
    }

    public t6(String str) {
        this.f24188a = str;
    }
}
