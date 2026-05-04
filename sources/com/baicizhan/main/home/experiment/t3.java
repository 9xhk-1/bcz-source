package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class t3 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21670a = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class a extends t3 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f21671c = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final Throwable f21672b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ a c(a aVar, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = aVar.f21672b;
            }
            return aVar.b(th2);
        }

        @m80.l
        public final Throwable a() {
            return this.f21672b;
        }

        @m80.k
        public final a b(@m80.l Throwable th2) {
            return new a(th2);
        }

        @m80.l
        public final Throwable d() {
            return this.f21672b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f21672b, ((a) obj).f21672b);
        }

        public int hashCode() {
            Throwable th2 = this.f21672b;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @m80.k
        public String toString() {
            return "Error(error=" + this.f21672b + pn.j.f81007d;
        }

        public a(@m80.l Throwable th2) {
            super(null);
            this.f21672b = th2;
        }

        public /* synthetic */ a(Throwable th2, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b extends t3 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final b f21673b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final int f21674c = 0;

        public b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class c extends t3 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f21675c = 8;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final s3 f21676b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k s3 homeModel) {
            super(null);
            kotlin.jvm.internal.g0.p(homeModel, "homeModel");
            this.f21676b = homeModel;
        }

        public static /* synthetic */ c c(c cVar, s3 s3Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                s3Var = cVar.f21676b;
            }
            return cVar.b(s3Var);
        }

        @m80.k
        public final s3 a() {
            return this.f21676b;
        }

        @m80.k
        public final c b(@m80.k s3 homeModel) {
            kotlin.jvm.internal.g0.p(homeModel, "homeModel");
            return new c(homeModel);
        }

        @m80.k
        public final s3 d() {
            return this.f21676b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.g0.g(this.f21676b, ((c) obj).f21676b);
        }

        public int hashCode() {
            return this.f21676b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Success(homeModel=" + this.f21676b + pn.j.f81007d;
        }
    }

    public /* synthetic */ t3(kotlin.jvm.internal.v vVar) {
        this();
    }

    public t3() {
    }
}
