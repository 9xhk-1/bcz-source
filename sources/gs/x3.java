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
public class x3 extends w3 {

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57400n = null;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57401o;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57402l;

    /* renamed from: m, reason: collision with root package name */
    public long f57403m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57401o = sparseIntArray;
        sparseIntArray.put(R.id.titleBg, 1);
        sparseIntArray.put(R.id.icon, 2);
        sparseIntArray.put(R.id.closed, 3);
        sparseIntArray.put(R.id.title, 4);
        sparseIntArray.put(R.id.subtitle, 5);
        sparseIntArray.put(R.id.option_bg, 6);
        sparseIntArray.put(R.id.hard, 7);
        sparseIntArray.put(R.id.easy, 8);
        sparseIntArray.put(R.id.bad, 9);
        sparseIntArray.put(R.id.not_ready, 10);
        sparseIntArray.put(R.id.other, 11);
    }

    public x3(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 12, f57400n, f57401o));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f57403m = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57403m != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57403m = 1L;
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

    public x3(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[9], (ImageView) bindings[3], (TextView) bindings[8], (TextView) bindings[7], (ImageView) bindings[2], (TextView) bindings[10], (View) bindings[6], (TextView) bindings[11], (TextView) bindings[5], (TextView) bindings[4], (View) bindings[1]);
        this.f57403m = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57402l = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
