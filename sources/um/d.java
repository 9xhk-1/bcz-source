package um;

import a00.i0;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@um.a
/* loaded from: classes6.dex */
public final class d implements um.b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<f> f92304a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<h> f92305b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final State f92306c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final State f92307d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final State f92308e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableState f92309f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public ActivityResultLauncher<String[]> f92310g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.a<Boolean> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            boolean z11;
            List<h> e11 = d.this.e();
            if (!(e11 instanceof Collection) || !e11.isEmpty()) {
                Iterator<T> it = e11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((h) it.next()).d()) {
                        if (!d.this.c().isEmpty()) {
                            z11 = false;
                        }
                    }
                }
            }
            z11 = true;
            return Boolean.valueOf(z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<List<? extends h>> {
        public b() {
            super(0);
        }

        @Override // x00.a
        @m80.k
        public final List<? extends h> invoke() {
            List<h> e11 = d.this.e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : e11) {
                if (!((h) obj).d()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
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
            List<h> e11 = d.this.e();
            boolean z11 = false;
            if (!(e11 instanceof Collection) || !e11.isEmpty()) {
                Iterator<T> it = e11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((h) it.next()).a()) {
                        z11 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    public d(@m80.k List<f> mutablePermissions) {
        g0.p(mutablePermissions, "mutablePermissions");
        this.f92304a = mutablePermissions;
        this.f92305b = mutablePermissions;
        this.f92306c = SnapshotStateKt.derivedStateOf(new b());
        this.f92307d = SnapshotStateKt.derivedStateOf(new a());
        this.f92308e = SnapshotStateKt.derivedStateOf(new c());
        this.f92309f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @Override // um.b
    public boolean a() {
        return ((Boolean) this.f92308e.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // um.b
    public boolean b() {
        return ((Boolean) this.f92309f.getValue()).booleanValue();
    }

    @Override // um.b
    @m80.k
    public List<h> c() {
        return (List) this.f92306c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // um.b
    public void d() {
        g2 g2Var;
        ActivityResultLauncher<String[]> activityResultLauncher = this.f92310g;
        if (activityResultLauncher == 0) {
            g2Var = null;
        } else {
            List<h> e11 = e();
            ArrayList arrayList = new ArrayList(i0.d0(e11, 10));
            Iterator<T> it = e11.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).e());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            activityResultLauncher.launch(array);
            g2Var = g2.f100423a;
        }
        if (g2Var == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    @Override // um.b
    @m80.k
    public List<h> e() {
        return this.f92305b;
    }

    @Override // um.b
    public boolean f() {
        return ((Boolean) this.f92307d.getValue()).booleanValue();
    }

    @m80.l
    public final ActivityResultLauncher<String[]> g() {
        return this.f92310g;
    }

    public final void h(@m80.l ActivityResultLauncher<String[]> activityResultLauncher) {
        this.f92310g = activityResultLauncher;
    }

    public void i(boolean z11) {
        this.f92309f.setValue(Boolean.valueOf(z11));
    }

    public final void j(@m80.k Map<String, Boolean> permissionsStatus) {
        Object obj;
        Boolean bool;
        g0.p(permissionsStatus, "permissionsStatus");
        for (String str : permissionsStatus.keySet()) {
            Iterator<T> it = this.f92304a.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (g0.g(((f) obj).e(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            f fVar = (f) obj;
            if (fVar != null && (bool = permissionsStatus.get(str)) != null) {
                fVar.j(bool.booleanValue());
            }
        }
    }
}
