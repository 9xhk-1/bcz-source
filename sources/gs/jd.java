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
public class jd extends id {

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55488n = null;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55489o;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55490l;

    /* renamed from: m, reason: collision with root package name */
    public long f55491m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55489o = sparseIntArray;
        sparseIntArray.put(R.id.iv_logo, 1);
        sparseIntArray.put(R.id.tv_header, 2);
        sparseIntArray.put(R.id.tv_days, 3);
        sparseIntArray.put(R.id.tv_day_desc, 4);
        sparseIntArray.put(R.id.tv_title, 5);
        sparseIntArray.put(R.id.iv_streak, 6);
        sparseIntArray.put(R.id.img_qrcode, 7);
        sparseIntArray.put(R.id.v_avatar, 8);
        sparseIntArray.put(R.id.iv_head, 9);
        sparseIntArray.put(R.id.tv_name, 10);
        sparseIntArray.put(R.id.tv_date, 11);
    }

    public jd(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 12, f55488n, f55489o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55491m = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55491m != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55491m = 1L;
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

    public jd(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[7], (CircleImageView) bindings[9], (ImageView) bindings[1], (ImageView) bindings[6], (TextView) bindings[11], (TextView) bindings[4], (TextView) bindings[3], (TextView) bindings[2], (TextView) bindings[10], (TextView) bindings[5], (View) bindings[8]);
        this.f55491m = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55490l = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
