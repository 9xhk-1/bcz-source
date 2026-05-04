package gs;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class l6 extends k6 {

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55716d = null;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55717e;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55718b;

    /* renamed from: c, reason: collision with root package name */
    public long f55719c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55717e = sparseIntArray;
        sparseIntArray.put(R.id.compose, 1);
    }

    public l6(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 2, f55716d, f55717e));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55719c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55719c != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55719c = 1L;
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

    public l6(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ComposeView) bindings[1]);
        this.f55719c = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55718b = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
