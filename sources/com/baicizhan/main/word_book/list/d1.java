package com.baicizhan.main.word_book.list;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public interface d1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a implements d1 {

        /* renamed from: b, reason: collision with root package name */
        public static final int f27053b = 0;

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final ij.a f27054a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ a c(a aVar, ij.a aVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar2 = aVar.f27054a;
            }
            return aVar.b(aVar2);
        }

        @m80.l
        public final ij.a a() {
            return this.f27054a;
        }

        @m80.k
        public final a b(@m80.l ij.a aVar) {
            return new a(aVar);
        }

        @m80.l
        public final ij.a d() {
            return this.f27054a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f27054a, ((a) obj).f27054a);
        }

        public int hashCode() {
            ij.a aVar = this.f27054a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @m80.k
        public String toString() {
            return "Confirm(exchangeInfo=" + this.f27054a + pn.j.f81007d;
        }

        public a(@m80.l ij.a aVar) {
            this.f27054a = aVar;
        }

        public /* synthetic */ a(ij.a aVar, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? null : aVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c implements d1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final c f27058a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final int f27059b = 0;

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1864246656;
        }

        @m80.k
        public String toString() {
            return "Success";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b implements d1 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f27055c = 0;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f27056a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f27057b;

        public b(@m80.k String message, @m80.k String jumpUrl) {
            kotlin.jvm.internal.g0.p(message, "message");
            kotlin.jvm.internal.g0.p(jumpUrl, "jumpUrl");
            this.f27056a = message;
            this.f27057b = jumpUrl;
        }

        public static /* synthetic */ b d(b bVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f27056a;
            }
            if ((i11 & 2) != 0) {
                str2 = bVar.f27057b;
            }
            return bVar.c(str, str2);
        }

        @m80.k
        public final String a() {
            return this.f27056a;
        }

        @m80.k
        public final String b() {
            return this.f27057b;
        }

        @m80.k
        public final b c(@m80.k String message, @m80.k String jumpUrl) {
            kotlin.jvm.internal.g0.p(message, "message");
            kotlin.jvm.internal.g0.p(jumpUrl, "jumpUrl");
            return new b(message, jumpUrl);
        }

        @m80.k
        public final String e() {
            return this.f27057b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f27056a, bVar.f27056a) && kotlin.jvm.internal.g0.g(this.f27057b, bVar.f27057b);
        }

        @m80.k
        public final String f() {
            return this.f27056a;
        }

        public int hashCode() {
            return (this.f27056a.hashCode() * 31) + this.f27057b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Failure(message=" + this.f27056a + ", jumpUrl=" + this.f27057b + pn.j.f81007d;
        }

        public /* synthetic */ b(String str, String str2, int i11, kotlin.jvm.internal.v vVar) {
            this(str, (i11 & 2) != 0 ? "" : str2);
        }
    }
}
