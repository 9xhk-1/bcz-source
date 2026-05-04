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
public class m3 extends l3 {

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55838o = null;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55839p;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55840m;

    /* renamed from: n, reason: collision with root package name */
    public long f55841n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55839p = sparseIntArray;
        sparseIntArray.put(R.id.book_bg, 1);
        sparseIntArray.put(R.id.book_name, 2);
        sparseIntArray.put(R.id.reset, 3);
        sparseIntArray.put(R.id.review_round, 4);
        sparseIntArray.put(R.id.book_finish_tips, 5);
        sparseIntArray.put(R.id.plan_progress_bar, 6);
        sparseIntArray.put(R.id.plan_progress_bar_masted, 7);
        sparseIntArray.put(R.id.plan_progress_bar_masted_dot, 8);
        sparseIntArray.put(R.id.wp_plan_master_desc, 9);
        sparseIntArray.put(R.id.plan_progress_bar_learned_dot, 10);
        sparseIntArray.put(R.id.wp_plan_learned_desc, 11);
        sparseIntArray.put(R.id.wp_plan_progress_value, 12);
    }

    public m3(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 13, f55838o, f55839p));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55841n = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55841n != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55841n = 1L;
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

    public m3(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[1], (TextView) bindings[5], (TextView) bindings[2], (ProgressBar) bindings[6], (View) bindings[10], (ProgressBar) bindings[7], (View) bindings[8], (TextView) bindings[3], (TextView) bindings[4], (TextView) bindings[11], (TextView) bindings[9], (TextView) bindings[12]);
        this.f55841n = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55840m = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
