package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class mg extends lg {

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55907e = null;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55908f;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55909c;

    /* renamed from: d, reason: collision with root package name */
    public long f55910d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55908f = sparseIntArray;
        sparseIntArray.put(R.id.sentence_pager, 1);
        sparseIntArray.put(R.id.indicator_layout, 2);
    }

    public mg(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f55907e, f55908f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55910d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55910d != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55910d = 1L;
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

    public mg(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[2], (ViewPager2) bindings[1]);
        this.f55910d = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55909c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
