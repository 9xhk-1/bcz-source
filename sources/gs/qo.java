package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class qo extends po {

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56545d = null;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56546e;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56547b;

    /* renamed from: c, reason: collision with root package name */
    public long f56548c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56546e = sparseIntArray;
        sparseIntArray.put(R.id.text, 1);
    }

    public qo(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 2, f56545d, f56546e));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56548c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56548c != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56548c = 1L;
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

    public qo(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[1]);
        this.f56548c = -1L;
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.f56547b = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
