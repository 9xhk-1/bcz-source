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
public class c7 extends b7 {

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54407g = null;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54408h;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54409e;

    /* renamed from: f, reason: collision with root package name */
    public long f54410f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54408h = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.tv_subtitle, 2);
        sparseIntArray.put(R.id.tv_positive, 3);
        sparseIntArray.put(R.id.tv_negative, 4);
    }

    public c7(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f54407g, f54408h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f54410f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54410f != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54410f = 1L;
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

    public c7(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[4], (TextView) bindings[3], (TextView) bindings[2], (TextView) bindings[1]);
        this.f54410f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54409e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
