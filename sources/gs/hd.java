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
public class hd extends gd {

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55186k = null;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55187l;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55188i;

    /* renamed from: j, reason: collision with root package name */
    public long f55189j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55187l = sparseIntArray;
        sparseIntArray.put(R.id.img_bg, 1);
        sparseIntArray.put(R.id.iv_picture, 2);
        sparseIntArray.put(R.id.iv_logo, 3);
        sparseIntArray.put(R.id.iv_header, 4);
        sparseIntArray.put(R.id.tv_source, 5);
        sparseIntArray.put(R.id.tv_sentence_ch, 6);
        sparseIntArray.put(R.id.tv_sentence_en, 7);
        sparseIntArray.put(R.id.img_qrcode, 8);
    }

    public hd(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 9, f55186k, f55187l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55189j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55189j != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55189j = 1L;
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

    public hd(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[1], (ImageView) bindings[8], (TextView) bindings[4], (ImageView) bindings[3], (ImageView) bindings[2], (TextView) bindings[6], (TextView) bindings[7], (TextView) bindings[5]);
        this.f55189j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55188i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
