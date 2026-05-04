package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.customview.SwipeMenuLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class dh extends ch {

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54630n = null;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54631o;

    /* renamed from: m, reason: collision with root package name */
    public long f54632m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54631o = sparseIntArray;
        sparseIntArray.put(R.id.itemContent, 1);
        sparseIntArray.put(R.id.word_voice, 2);
        sparseIntArray.put(R.id.word_more_info, 3);
        sparseIntArray.put(R.id.end_guide, 4);
        sparseIntArray.put(R.id.select_check, 5);
        sparseIntArray.put(R.id.word_en, 6);
        sparseIntArray.put(R.id.word_ch, 7);
        sparseIntArray.put(R.id.hide_en_view, 8);
        sparseIntArray.put(R.id.hide_ch_view, 9);
        sparseIntArray.put(R.id.item_area, 10);
        sparseIntArray.put(R.id.tvDelete, 11);
    }

    public dh(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 12, f54630n, f54631o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f54632m = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54632m != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54632m = 1L;
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

    public dh(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (Guideline) bindings[4], (View) bindings[9], (View) bindings[8], (View) bindings[10], (ConstraintLayout) bindings[1], (ImageView) bindings[5], (SwipeMenuLayout) bindings[0], (TextView) bindings[11], (TextView) bindings[7], (TextView) bindings[6], (TextView) bindings[3], (ImageView) bindings[2]);
        this.f54632m = -1L;
        this.f54465g.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
