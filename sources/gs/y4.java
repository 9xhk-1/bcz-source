package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class y4 extends x4 {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57550f = null;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57551g;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57552d;

    /* renamed from: e, reason: collision with root package name */
    public long f57553e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57551g = sparseIntArray;
        sparseIntArray.put(R.id.confirm_bg, 2);
    }

    public y4(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f57550f, f57551g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f57553e;
            this.f57553e = 0L;
        }
        String str = this.f57406c;
        if ((j11 & 3) != 0) {
            TextViewBindingAdapter.setText(this.f57405b, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57553e != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57553e = 2L;
        }
        requestRebind();
    }

    @Override // gs.x4
    public void j(@Nullable String BtnTitle) {
        this.f57406c = BtnTitle;
        synchronized (this) {
            this.f57553e |= 1;
        }
        notifyPropertyChanged(9);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (9 != variableId) {
            return false;
        }
        j((String) variable);
        return true;
    }

    public y4(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (View) bindings[2], (TextView) bindings[1]);
        this.f57553e = -1L;
        this.f57405b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57552d = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
