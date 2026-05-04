package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f1 extends e1 {

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54853q = null;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54854r;

    /* renamed from: p, reason: collision with root package name */
    public long f54855p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54854r = sparseIntArray;
        sparseIntArray.put(R.id.lookup_content_root, 1);
        sparseIntArray.put(R.id.top_bar, 2);
        sparseIntArray.put(R.id.camera_img, 3);
        sparseIntArray.put(R.id.cancel_lookup, 4);
        sparseIntArray.put(R.id.lookup_edit_bg, 5);
        sparseIntArray.put(R.id.lookup_edit, 6);
        sparseIntArray.put(R.id.lookup_clear, 7);
        sparseIntArray.put(R.id.relativeLayout, 8);
        sparseIntArray.put(R.id.lookup_tip, 9);
        sparseIntArray.put(R.id.fragment_container, 10);
        sparseIntArray.put(R.id.lookup_progress, 11);
        sparseIntArray.put(R.id.drag_highlight, 12);
        sparseIntArray.put(R.id.camera_tip, 13);
        sparseIntArray.put(R.id.tip_close, 14);
    }

    public f1(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 15, f54853q, f54854r));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f54855p = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54855p != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54855p = 1L;
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

    public f1(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (BottomSheetLayout) bindings[0], (ImageView) bindings[3], (LinearLayout) bindings[13], (TextView) bindings[4], (FrameLayout) bindings[12], (FrameLayout) bindings[10], (ImageView) bindings[7], (ConstraintLayout) bindings[1], (EditText) bindings[6], (View) bindings[5], (ProgressBar) bindings[11], (TextView) bindings[9], (RelativeLayout) bindings[8], (ImageView) bindings[14], (RelativeLayout) bindings[2]);
        this.f54855p = -1L;
        this.f54695a.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
