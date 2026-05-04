package um;

import android.app.Activity;
import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@a
/* loaded from: classes6.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f92322a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Context f92323b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Activity f92324c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableState f92325d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableState f92326e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableState f92327f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public ActivityResultLauncher<String> f92328g;

    public f(@m80.k String permission, @m80.k Context context, @m80.k Activity activity) {
        g0.p(permission, "permission");
        g0.p(context, "context");
        g0.p(activity, "activity");
        this.f92322a = permission;
        this.f92323b = context;
        this.f92324c = activity;
        this.f92325d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(m.g(context, e())), null, 2, null);
        this.f92326e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(m.i(activity, e())), null, 2, null);
        this.f92327f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // um.h
    public boolean a() {
        return ((Boolean) this.f92326e.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // um.h
    public boolean b() {
        return ((Boolean) this.f92327f.getValue()).booleanValue();
    }

    @Override // um.h
    public void c() {
        g2 g2Var;
        ActivityResultLauncher<String> activityResultLauncher = this.f92328g;
        if (activityResultLauncher == null) {
            g2Var = null;
        } else {
            activityResultLauncher.launch(e());
            g2Var = g2.f100423a;
        }
        if (g2Var == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    @Override // um.h
    public boolean d() {
        return g();
    }

    @Override // um.h
    @m80.k
    public String e() {
        return this.f92322a;
    }

    @m80.l
    public final ActivityResultLauncher<String> f() {
        return this.f92328g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.f92325d.getValue()).booleanValue();
    }

    public final void h() {
        j(m.g(this.f92323b, e()));
    }

    public final void i() {
        m(m.i(this.f92324c, e()));
    }

    public void j(boolean z11) {
        n(z11);
        i();
    }

    public final void k(@m80.l ActivityResultLauncher<String> activityResultLauncher) {
        this.f92328g = activityResultLauncher;
    }

    public void l(boolean z11) {
        this.f92327f.setValue(Boolean.valueOf(z11));
    }

    public final void m(boolean z11) {
        this.f92326e.setValue(Boolean.valueOf(z11));
    }

    public final void n(boolean z11) {
        this.f92325d.setValue(Boolean.valueOf(z11));
    }
}
