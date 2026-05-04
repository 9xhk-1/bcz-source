package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class tn extends sn {

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56922p = null;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56923q;

    /* renamed from: o, reason: collision with root package name */
    public long f56924o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56923q = sparseIntArray;
        sparseIntArray.put(R.id.animation_bg, 1);
        sparseIntArray.put(R.id.book_bg, 2);
        sparseIntArray.put(R.id.book_name, 3);
        sparseIntArray.put(R.id.current_learn, 4);
        sparseIntArray.put(R.id.delete, 5);
        sparseIntArray.put(R.id.book_finish_tips, 6);
        sparseIntArray.put(R.id.plan_progress_bar, 7);
        sparseIntArray.put(R.id.plan_progress_bar_masted, 8);
        sparseIntArray.put(R.id.plan_progress_bar_masted_dot, 9);
        sparseIntArray.put(R.id.wp_plan_master_desc, 10);
        sparseIntArray.put(R.id.plan_progress_bar_learned_dot, 11);
        sparseIntArray.put(R.id.wp_plan_learned_desc, 12);
        sparseIntArray.put(R.id.wp_plan_progress_value, 13);
    }

    public tn(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 14, f56922p, f56923q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56924o = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56924o != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56924o = 1L;
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

    public tn(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (View) bindings[1], (ImageView) bindings[2], (TextView) bindings[6], (TextView) bindings[3], (ConstraintLayout) bindings[0], (TextView) bindings[4], (TextView) bindings[5], (ProgressBar) bindings[7], (View) bindings[11], (ProgressBar) bindings[8], (View) bindings[9], (TextView) bindings[12], (TextView) bindings[10], (TextView) bindings[13]);
        this.f56924o = -1L;
        this.f56787e.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
