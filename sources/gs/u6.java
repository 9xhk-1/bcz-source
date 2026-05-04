package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class u6 extends t6 {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56964f = null;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56965g;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56966d;

    /* renamed from: e, reason: collision with root package name */
    public long f56967e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56965g = sparseIntArray;
        sparseIntArray.put(R.id.iv_close, 1);
        sparseIntArray.put(R.id.iv_ad, 2);
        sparseIntArray.put(R.id.tv_add, 3);
    }

    public u6(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f56964f, f56965g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56967e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56967e != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56967e = 1L;
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

    public u6(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[2], (ImageView) bindings[1], (TextView) bindings[3]);
        this.f56967e = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56966d = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
