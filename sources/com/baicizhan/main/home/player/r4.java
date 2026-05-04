package com.baicizhan.main.home.player;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.home.player.r4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface r4 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a implements r4 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f23949c = 0;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f23950a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final x00.a<yz.g2> f23951b;

        public a(@m80.k String intent, @m80.k x00.a<yz.g2> onIntentNavigate) {
            kotlin.jvm.internal.g0.p(intent, "intent");
            kotlin.jvm.internal.g0.p(onIntentNavigate, "onIntentNavigate");
            this.f23950a = intent;
            this.f23951b = onIntentNavigate;
        }

        public static final yz.g2 b() {
            return yz.g2.f100423a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a f(a aVar, String str, x00.a aVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aVar.f23950a;
            }
            if ((i11 & 2) != 0) {
                aVar2 = aVar.f23951b;
            }
            return aVar.e(str, aVar2);
        }

        @m80.k
        public final String c() {
            return this.f23950a;
        }

        @m80.k
        public final x00.a<yz.g2> d() {
            return this.f23951b;
        }

        @m80.k
        public final a e(@m80.k String intent, @m80.k x00.a<yz.g2> onIntentNavigate) {
            kotlin.jvm.internal.g0.p(intent, "intent");
            kotlin.jvm.internal.g0.p(onIntentNavigate, "onIntentNavigate");
            return new a(intent, onIntentNavigate);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f23950a, aVar.f23950a) && kotlin.jvm.internal.g0.g(this.f23951b, aVar.f23951b);
        }

        @m80.k
        public final String g() {
            return this.f23950a;
        }

        @m80.k
        public final x00.a<yz.g2> h() {
            return this.f23951b;
        }

        public int hashCode() {
            return (this.f23950a.hashCode() * 31) + this.f23951b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Intent(intent=" + this.f23950a + ", onIntentNavigate=" + this.f23951b + pn.j.f81007d;
        }

        public /* synthetic */ a(String str, x00.a aVar, int i11, kotlin.jvm.internal.v vVar) {
            this(str, (i11 & 2) != 0 ? new x00.a() { // from class: com.baicizhan.main.home.player.q4
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 b11;
                    b11 = r4.a.b();
                    return b11;
                }
            } : aVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b implements r4 {

        /* renamed from: b, reason: collision with root package name */
        public static final int f23952b = 0;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final x00.l<Integer, yz.g2> f23953a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@m80.k x00.l<? super Integer, yz.g2> onPerform) {
            kotlin.jvm.internal.g0.p(onPerform, "onPerform");
            this.f23953a = onPerform;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b c(b bVar, x00.l lVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = bVar.f23953a;
            }
            return bVar.b(lVar);
        }

        @m80.k
        public final x00.l<Integer, yz.g2> a() {
            return this.f23953a;
        }

        @m80.k
        public final b b(@m80.k x00.l<? super Integer, yz.g2> onPerform) {
            kotlin.jvm.internal.g0.p(onPerform, "onPerform");
            return new b(onPerform);
        }

        @m80.k
        public final x00.l<Integer, yz.g2> d() {
            return this.f23953a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.g0.g(this.f23953a, ((b) obj).f23953a);
        }

        public int hashCode() {
            return this.f23953a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Invoker(onPerform=" + this.f23953a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c implements r4 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final c f23954a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final int f23955b = 0;
    }
}
