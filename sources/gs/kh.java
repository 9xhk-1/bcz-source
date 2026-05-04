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
import com.baicizhan.main.customview.SwipeMenuLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class kh extends jh {

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55616n = null;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55617o;

    /* renamed from: m, reason: collision with root package name */
    public long f55618m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55617o = sparseIntArray;
        sparseIntArray.put(R.id.itemContent, 1);
        sparseIntArray.put(R.id.select_check, 2);
        sparseIntArray.put(R.id.iv_progress, 3);
        sparseIntArray.put(R.id.tv_word, 4);
        sparseIntArray.put(R.id.tv_review_info, 5);
        sparseIntArray.put(R.id.iv_more, 6);
        sparseIntArray.put(R.id.v_wiki_area, 7);
        sparseIntArray.put(R.id.tv_mean, 8);
        sparseIntArray.put(R.id.hide_mean_view, 9);
        sparseIntArray.put(R.id.tv_operate, 10);
        sparseIntArray.put(R.id.iv_collect, 11);
    }

    public kh(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 12, f55616n, f55617o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55618m = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55618m != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55618m = 1L;
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

    public kh(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (View) bindings[9], (ConstraintLayout) bindings[1], (ImageView) bindings[11], (ImageView) bindings[6], (ImageView) bindings[3], (ImageView) bindings[2], (SwipeMenuLayout) bindings[0], (TextView) bindings[8], (TextView) bindings[10], (TextView) bindings[5], (TextView) bindings[4], (View) bindings[7]);
        this.f55618m = -1L;
        this.f55507g.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
