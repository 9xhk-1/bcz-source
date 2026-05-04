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
public class zc extends yc {

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57771h = null;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57772i;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57773f;

    /* renamed from: g, reason: collision with root package name */
    public long f57774g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57772i = sparseIntArray;
        sparseIntArray.put(R.id.guide_content, 1);
        sparseIntArray.put(R.id.guide_line, 2);
        sparseIntArray.put(R.id.guide_dot, 3);
        sparseIntArray.put(R.id.guide_text, 4);
        sparseIntArray.put(R.id.next, 5);
    }

    public zc(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f57771h, f57772i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f57774g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57774g != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57774g = 1L;
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

    public zc(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[1], (ImageView) bindings[3], (View) bindings[2], (TextView) bindings[4], (ImageView) bindings[5]);
        this.f57774g = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57773f = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
