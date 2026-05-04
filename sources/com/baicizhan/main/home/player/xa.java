package com.baicizhan.main.home.player;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class xa {

    /* renamed from: c, reason: collision with root package name */
    public static final int f24326c = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f24327a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f24328b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends xa {

        /* renamed from: e, reason: collision with root package name */
        public static final int f24329e = 0;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final x00.a<yz.g2> f24330d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k x00.a<yz.g2> onClose) {
            super("点这里👆，可查看「单词列表」～", onClose, null);
            kotlin.jvm.internal.g0.p(onClose, "onClose");
            this.f24330d = onClose;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a e(a aVar, x00.a aVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar2 = aVar.f24330d;
            }
            return aVar.d(aVar2);
        }

        @Override // com.baicizhan.main.home.player.xa
        @m80.k
        public x00.a<yz.g2> a() {
            return this.f24330d;
        }

        @m80.k
        public final x00.a<yz.g2> c() {
            return this.f24330d;
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
            return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f24330d, ((a) obj).f24330d);
        }

        public int hashCode() {
            return this.f24330d.hashCode();
        }

        @m80.k
        public String toString() {
            return "WordList(onClose=" + this.f24330d + pn.j.f81007d;
        }
    }

    public /* synthetic */ xa(String str, x00.a aVar, kotlin.jvm.internal.v vVar) {
        this(str, aVar);
    }

    @m80.k
    public x00.a<yz.g2> a() {
        return this.f24328b;
    }

    @m80.k
    public final String b() {
        return this.f24327a;
    }

    public xa(String str, x00.a<yz.g2> aVar) {
        this.f24327a = str;
        this.f24328b = aVar;
    }
}
