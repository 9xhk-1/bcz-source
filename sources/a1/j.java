package a1;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import c40.x;
import c40.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x<com.airbnb.lottie.k> f1327a = z.c(null, 1, null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableState f1328b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableState f1329c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final State f1330d = SnapshotStateKt.derivedStateOf(new c());

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final State f1331e = SnapshotStateKt.derivedStateOf(new a());

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final State f1332f = SnapshotStateKt.derivedStateOf(new b());

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final State f1333g = SnapshotStateKt.derivedStateOf(new d());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.a<Boolean> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf((j.this.getValue() == null && j.this.getError() == null) ? false : true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<Boolean> {
        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(j.this.getError() != null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.a<Boolean> {
        public c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(j.this.getValue() == null && j.this.getError() == null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.a<Boolean> {
        public d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(j.this.getValue() != null);
        }
    }

    public final synchronized void c(@m80.k com.airbnb.lottie.k composition) {
        g0.p(composition, "composition");
        if (isComplete()) {
            return;
        }
        j(composition);
        this.f1327a.c0(composition);
    }

    public final synchronized void f(@m80.k Throwable error) {
        g0.p(error, "error");
        if (isComplete()) {
            return;
        }
        g(error);
        this.f1327a.r(error);
    }

    public final void g(Throwable th2) {
        this.f1329c.setValue(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a1.i
    @m80.l
    public Throwable getError() {
        return (Throwable) this.f1329c.getValue();
    }

    @Override // a1.i
    @m80.l
    public Object i(@m80.k j00.c<? super com.airbnb.lottie.k> cVar) {
        return this.f1327a.i(cVar);
    }

    @Override // a1.i
    public boolean isComplete() {
        return ((Boolean) this.f1331e.getValue()).booleanValue();
    }

    @Override // a1.i
    public boolean isLoading() {
        return ((Boolean) this.f1330d.getValue()).booleanValue();
    }

    public final void j(com.airbnb.lottie.k kVar) {
        this.f1328b.setValue(kVar);
    }

    @Override // a1.i
    public boolean l() {
        return ((Boolean) this.f1333g.getValue()).booleanValue();
    }

    @Override // a1.i
    public boolean m() {
        return ((Boolean) this.f1332f.getValue()).booleanValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    @m80.l
    public com.airbnb.lottie.k getValue() {
        return (com.airbnb.lottie.k) this.f1328b.getValue();
    }
}
