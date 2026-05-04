package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class z5 extends y5 {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57734c = null;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57735d = null;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57736a;

    /* renamed from: b, reason: collision with root package name */
    public long f57737b;

    public z5(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 1, f57734c, f57735d));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f57737b = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57737b != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57737b = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public z5(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0);
        this.f57737b = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f57736a = linearLayout;
        linearLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
