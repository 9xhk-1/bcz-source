package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class q9 extends p9 implements a.InterfaceC0684a {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56464j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56465k = null;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56466e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56467f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56468g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56469h;

    /* renamed from: i, reason: collision with root package name */
    public long f56470i;

    public q9(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f56464j, f56465k));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        je.a aVar;
        if (sourceId == 1) {
            je.a aVar2 = this.f56348d;
            if (aVar2 != null) {
                aVar2.w();
                return;
            }
            return;
        }
        if (sourceId != 2) {
            if (sourceId == 3 && (aVar = this.f56348d) != null) {
                aVar.v();
                return;
            }
            return;
        }
        je.a aVar3 = this.f56348d;
        if (aVar3 != null) {
            aVar3.t();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56470i;
            this.f56470i = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f56345a.setOnClickListener(this.f56467f);
            this.f56346b.setOnClickListener(this.f56468g);
            this.f56347c.setOnClickListener(this.f56469h);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56470i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56470i = 2L;
        }
        requestRebind();
    }

    @Override // gs.p9
    public void j(@Nullable je.a Viewmodel) {
        this.f56348d = Viewmodel;
        synchronized (this) {
            this.f56470i |= 1;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((je.a) variable);
        return true;
    }

    public q9(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[2], (TextView) bindings[3], (TextView) bindings[1]);
        this.f56470i = -1L;
        this.f56345a.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56466e = constraintLayout;
        constraintLayout.setTag(null);
        this.f56346b.setTag(null);
        this.f56347c.setTag(null);
        setRootTag(root);
        this.f56467f = new hs.a(this, 2);
        this.f56468g = new hs.a(this, 3);
        this.f56469h = new hs.a(this, 1);
        invalidateAll();
    }
}
