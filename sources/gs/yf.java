package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class yf extends xf {

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57598e = null;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57599f;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57600c;

    /* renamed from: d, reason: collision with root package name */
    public long f57601d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57599f = sparseIntArray;
        sparseIntArray.put(R.id.variant_ch, 1);
        sparseIntArray.put(R.id.variant_en, 2);
    }

    public yf(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f57598e, f57599f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f57601d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57601d != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57601d = 1L;
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

    public yf(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[1], (TextView) bindings[2]);
        this.f57601d = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57600c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
