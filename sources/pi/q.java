package pi;

import androidx.lifecycle.Observer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f80611a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f80612b = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f80613a;

        public a(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f80613a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f80613a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f80613a.invoke(obj);
        }
    }
}
