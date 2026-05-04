package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.util.report.ExposureConstraintLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class zd extends yd {

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57775g = null;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57776h;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ExposureConstraintLayout f57777e;

    /* renamed from: f, reason: collision with root package name */
    public long f57778f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57776h = sparseIntArray;
        sparseIntArray.put(R.id.type_image, 1);
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.desc, 3);
        sparseIntArray.put(R.id.new_tag, 4);
    }

    public zd(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f57775g, f57776h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f57778f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57778f != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57778f = 1L;
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

    public zd(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[3], (ImageView) bindings[4], (TextView) bindings[2], (ImageView) bindings[1]);
        this.f57778f = -1L;
        ExposureConstraintLayout exposureConstraintLayout = (ExposureConstraintLayout) bindings[0];
        this.f57777e = exposureConstraintLayout;
        exposureConstraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
