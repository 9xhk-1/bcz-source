package gs;

import android.graphics.Typeface;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ij extends hj {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55331j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55332k;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55333h;

    /* renamed from: i, reason: collision with root package name */
    public long f55334i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55332k = sparseIntArray;
        sparseIntArray.put(R.id.bg_img, 1);
        sparseIntArray.put(R.id.book_tip, 2);
        sparseIntArray.put(R.id.book_name, 3);
        sparseIntArray.put(R.id.tip, 4);
        sparseIntArray.put(R.id.continue_to_others, 5);
        sparseIntArray.put(R.id.sub_tip, 6);
    }

    public ij(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f55331j, f55332k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55334i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55334i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55334i = 2L;
        }
        requestRebind();
    }

    @Override // gs.hj
    public void j(@Nullable Typeface AccentFont) {
        this.f55209g = AccentFont;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (1 != variableId) {
            return false;
        }
        j((Typeface) variable);
        return true;
    }

    public ij(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[1], (TextView) bindings[3], (LinearLayout) bindings[2], (TextView) bindings[5], (TextView) bindings[6], (TextView) bindings[4]);
        this.f55334i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55333h = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
