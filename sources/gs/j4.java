package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j4 extends i4 {

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55423g = null;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55424h;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55425e;

    /* renamed from: f, reason: collision with root package name */
    public long f55426f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55424h = sparseIntArray;
        sparseIntArray.put(R.id.picker, 1);
        sparseIntArray.put(R.id.background, 2);
        sparseIntArray.put(R.id.cancel, 3);
        sparseIntArray.put(R.id.confirm, 4);
    }

    public j4(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f55423g, f55424h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55426f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55426f != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55426f = 1L;
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

    public j4(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (View) bindings[2], (TextView) bindings[3], (TextView) bindings[4], (DatePicker) bindings[1]);
        this.f55426f = -1L;
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.f55425e = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
