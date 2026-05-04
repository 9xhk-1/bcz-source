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
import com.baicizhan.client.business.widget.CircleImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ld extends kd {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55764j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55765k;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55766h;

    /* renamed from: i, reason: collision with root package name */
    public long f55767i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55765k = sparseIntArray;
        sparseIntArray.put(R.id.color_bg, 1);
        sparseIntArray.put(R.id.img_bg, 2);
        sparseIntArray.put(R.id.img_header, 3);
        sparseIntArray.put(R.id.img_qrcode, 4);
        sparseIntArray.put(R.id.avatar, 5);
        sparseIntArray.put(R.id.name, 6);
        sparseIntArray.put(R.id.date, 7);
    }

    public ld(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, f55764j, f55765k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55767i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55767i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55767i = 1L;
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

    public ld(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (CircleImageView) bindings[5], (View) bindings[1], (TextView) bindings[7], (ImageView) bindings[2], (ImageView) bindings[3], (ImageView) bindings[4], (TextView) bindings[6]);
        this.f55767i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55766h = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
