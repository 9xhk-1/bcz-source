package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.home.experiment.u3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.n(message = "Former experimental version")
/* loaded from: classes4.dex */
public interface u3 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a implements u3 {

        /* renamed from: b, reason: collision with root package name */
        public static final int f21684b = 0;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final x00.a<yz.g2> f21685a;

        public a(@m80.k x00.a<yz.g2> onIntentNavigate) {
            kotlin.jvm.internal.g0.p(onIntentNavigate, "onIntentNavigate");
            this.f21685a = onIntentNavigate;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a c(a aVar, x00.a aVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar2 = aVar.f21685a;
            }
            return aVar.b(aVar2);
        }

        @m80.k
        public final x00.a<yz.g2> a() {
            return this.f21685a;
        }

        @m80.k
        public final a b(@m80.k x00.a<yz.g2> onIntentNavigate) {
            kotlin.jvm.internal.g0.p(onIntentNavigate, "onIntentNavigate");
            return new a(onIntentNavigate);
        }

        @m80.k
        public final x00.a<yz.g2> d() {
            return this.f21685a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f21685a, ((a) obj).f21685a);
        }

        public int hashCode() {
            return this.f21685a.hashCode();
        }

        @m80.k
        public String toString() {
            return "NoMoreReview(onIntentNavigate=" + this.f21685a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b implements u3 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f21686c = 0;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f21687a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final x00.a<yz.g2> f21688b;

        public b(@m80.k String intent, @m80.k x00.a<yz.g2> onIntentNavigate) {
            kotlin.jvm.internal.g0.p(intent, "intent");
            kotlin.jvm.internal.g0.p(onIntentNavigate, "onIntentNavigate");
            this.f21687a = intent;
            this.f21688b = onIntentNavigate;
        }

        public static final yz.g2 b() {
            return yz.g2.f100423a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b f(b bVar, String str, x00.a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f21687a;
            }
            if ((i11 & 2) != 0) {
                aVar = bVar.f21688b;
            }
            return bVar.e(str, aVar);
        }

        @m80.k
        public final String c() {
            return this.f21687a;
        }

        @m80.k
        public final x00.a<yz.g2> d() {
            return this.f21688b;
        }

        @m80.k
        public final b e(@m80.k String intent, @m80.k x00.a<yz.g2> onIntentNavigate) {
            kotlin.jvm.internal.g0.p(intent, "intent");
            kotlin.jvm.internal.g0.p(onIntentNavigate, "onIntentNavigate");
            return new b(intent, onIntentNavigate);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f21687a, bVar.f21687a) && kotlin.jvm.internal.g0.g(this.f21688b, bVar.f21688b);
        }

        @m80.k
        public final String g() {
            return this.f21687a;
        }

        @m80.k
        public final x00.a<yz.g2> h() {
            return this.f21688b;
        }

        public int hashCode() {
            return (this.f21687a.hashCode() * 31) + this.f21688b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Normal(intent=" + this.f21687a + ", onIntentNavigate=" + this.f21688b + pn.j.f81007d;
        }

        public /* synthetic */ b(String str, x00.a aVar, int i11, kotlin.jvm.internal.v vVar) {
            this(str, (i11 & 2) != 0 ? new x00.a() { // from class: com.baicizhan.main.home.experiment.v3
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 b11;
                    b11 = u3.b.b();
                    return b11;
                }
            } : aVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c implements u3 {

        /* renamed from: d, reason: collision with root package name */
        public static final int f21689d = 0;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f21690a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f21691b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final x00.p<Boolean, String, yz.g2> f21692c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@m80.k String study, @m80.k String review, @m80.k x00.p<? super Boolean, ? super String, yz.g2> onIntentNavigate) {
            kotlin.jvm.internal.g0.p(study, "study");
            kotlin.jvm.internal.g0.p(review, "review");
            kotlin.jvm.internal.g0.p(onIntentNavigate, "onIntentNavigate");
            this.f21690a = study;
            this.f21691b = review;
            this.f21692c = onIntentNavigate;
        }

        public static final yz.g2 b(boolean z11, String str) {
            kotlin.jvm.internal.g0.p(str, "<unused var>");
            return yz.g2.f100423a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c g(c cVar, String str, String str2, x00.p pVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cVar.f21690a;
            }
            if ((i11 & 2) != 0) {
                str2 = cVar.f21691b;
            }
            if ((i11 & 4) != 0) {
                pVar = cVar.f21692c;
            }
            return cVar.f(str, str2, pVar);
        }

        @m80.k
        public final String c() {
            return this.f21690a;
        }

        @m80.k
        public final String d() {
            return this.f21691b;
        }

        @m80.k
        public final x00.p<Boolean, String, yz.g2> e() {
            return this.f21692c;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.g0.g(this.f21690a, cVar.f21690a) && kotlin.jvm.internal.g0.g(this.f21691b, cVar.f21691b) && kotlin.jvm.internal.g0.g(this.f21692c, cVar.f21692c);
        }

        @m80.k
        public final c f(@m80.k String study, @m80.k String review, @m80.k x00.p<? super Boolean, ? super String, yz.g2> onIntentNavigate) {
            kotlin.jvm.internal.g0.p(study, "study");
            kotlin.jvm.internal.g0.p(review, "review");
            kotlin.jvm.internal.g0.p(onIntentNavigate, "onIntentNavigate");
            return new c(study, review, onIntentNavigate);
        }

        @m80.k
        public final x00.p<Boolean, String, yz.g2> h() {
            return this.f21692c;
        }

        public int hashCode() {
            return (((this.f21690a.hashCode() * 31) + this.f21691b.hashCode()) * 31) + this.f21692c.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f21691b;
        }

        @m80.k
        public final String j() {
            return this.f21690a;
        }

        @m80.k
        public String toString() {
            return "ReviewSuggestion(study=" + this.f21690a + ", review=" + this.f21691b + ", onIntentNavigate=" + this.f21692c + pn.j.f81007d;
        }

        public /* synthetic */ c(String str, String str2, x00.p pVar, int i11, kotlin.jvm.internal.v vVar) {
            this(str, str2, (i11 & 4) != 0 ? new x00.p() { // from class: com.baicizhan.main.home.experiment.w3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 b11;
                    b11 = u3.c.b(((Boolean) obj).booleanValue(), (String) obj2);
                    return b11;
                }
            } : pVar);
        }
    }
}
