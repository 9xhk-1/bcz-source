package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class mo extends lo {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55953i = null;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55954j = null;

    /* renamed from: h, reason: collision with root package name */
    public long f55955h;

    public mo(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f55953i, f55954j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f55955h;
            this.f55955h = 0L;
        }
        View.OnClickListener onClickListener = this.f55810g;
        if ((j11 & 3) != 0) {
            this.f55805b.setOnClickListener(onClickListener);
            this.f55806c.setOnClickListener(onClickListener);
            this.f55807d.setOnClickListener(onClickListener);
            this.f55808e.setOnClickListener(onClickListener);
            this.f55809f.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55955h != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55955h = 2L;
        }
        requestRebind();
    }

    @Override // gs.lo
    public void j(@Nullable View.OnClickListener ItemClick) {
        this.f55810g = ItemClick;
        synchronized (this) {
            this.f55955h |= 1;
        }
        notifyPropertyChanged(32);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (32 != variableId) {
            return false;
        }
        j((View.OnClickListener) variable);
        return true;
    }

    public mo(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ConstraintLayout) bindings[0], (TextView) bindings[3], (TextView) bindings[4], (TextView) bindings[5], (TextView) bindings[1], (TextView) bindings[2]);
        this.f55955h = -1L;
        this.f55804a.setTag(null);
        this.f55805b.setTag(null);
        this.f55806c.setTag(null);
        this.f55807d.setTag(null);
        this.f55808e.setTag(null);
        this.f55809f.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
