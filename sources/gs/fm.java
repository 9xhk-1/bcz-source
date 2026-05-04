package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class fm extends em {

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54960d = null;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54961e;

    /* renamed from: c, reason: collision with root package name */
    public long f54962c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54961e = sparseIntArray;
        sparseIntArray.put(R.id.tip_close, 1);
    }

    public fm(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 2, f54960d, f54961e));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f54962c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54962c != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54962c = 1L;
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

    public fm(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (LinearLayout) bindings[0], (ImageView) bindings[1]);
        this.f54962c = -1L;
        this.f54828a.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
