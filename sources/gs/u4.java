package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class u4 extends t4 {

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56954e = null;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56955f;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56956c;

    /* renamed from: d, reason: collision with root package name */
    public long f56957d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56955f = sparseIntArray;
        sparseIntArray.put(R.id.image, 1);
        sparseIntArray.put(R.id.text, 2);
    }

    public u4(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f56954e, f56955f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56957d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56957d != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56957d = 1L;
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

    public u4(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[1], (TextView) bindings[2]);
        this.f56957d = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f56956c = linearLayout;
        linearLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
