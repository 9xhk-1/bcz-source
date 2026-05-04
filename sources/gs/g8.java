package gs;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g8 extends f8 {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55014c = null;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55015d = null;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55016a;

    /* renamed from: b, reason: collision with root package name */
    public long f55017b;

    public g8(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 1, f55014c, f55015d));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55017b = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55017b != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55017b = 1L;
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

    public g8(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0);
        this.f55017b = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55016a = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
