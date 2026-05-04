package com.baicizhan.main.home.experiment;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class n5 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21315c = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f21316a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f21317b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends n5 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f21318e = 0;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final x00.a<yz.g2> f21319d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k x00.a<yz.g2> onClose) {
            super("点这里👆，可查看「单词列表」～", onClose, null);
            kotlin.jvm.internal.g0.p(onClose, "onClose");
            this.f21319d = onClose;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a e(a aVar, x00.a aVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar2 = aVar.f21319d;
            }
            return aVar.d(aVar2);
        }

        @Override // com.baicizhan.main.home.experiment.n5
        @m80.k
        public x00.a<yz.g2> a() {
            return this.f21319d;
        }

        @m80.k
        public final x00.a<yz.g2> c() {
            return this.f21319d;
        }

        @m80.k
        public final a d(@m80.k x00.a<yz.g2> onClose) {
            kotlin.jvm.internal.g0.p(onClose, "onClose");
            return new a(onClose);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f21319d, ((a) obj).f21319d);
        }

        public int hashCode() {
            return this.f21319d.hashCode();
        }

        @m80.k
        public String toString() {
            return "WordList(onClose=" + this.f21319d + pn.j.f81007d;
        }
    }

    public /* synthetic */ n5(String str, x00.a aVar, kotlin.jvm.internal.v vVar) {
        this(str, aVar);
    }

    @m80.k
    public x00.a<yz.g2> a() {
        return this.f21317b;
    }

    @m80.k
    public final String b() {
        return this.f21316a;
    }

    public n5(String str, x00.a<yz.g2> aVar) {
        this.f21316a = str;
        this.f21317b = aVar;
    }
}
