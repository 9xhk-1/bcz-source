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
public class fd extends ed {

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54918m = null;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54919n;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54920k;

    /* renamed from: l, reason: collision with root package name */
    public long f54921l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54919n = sparseIntArray;
        sparseIntArray.put(R.id.img_bg, 1);
        sparseIntArray.put(R.id.legal, 2);
        sparseIntArray.put(R.id.img_header, 3);
        sparseIntArray.put(R.id.img_qrcode, 4);
        sparseIntArray.put(R.id.drawable_left, 5);
        sparseIntArray.put(R.id.date, 6);
        sparseIntArray.put(R.id.words_title, 7);
        sparseIntArray.put(R.id.days_title, 8);
        sparseIntArray.put(R.id.words, 9);
        sparseIntArray.put(R.id.days, 10);
    }

    public fd(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 11, f54918m, f54919n));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f54921l = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54921l != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54921l = 1L;
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

    public fd(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[6], (TextView) bindings[10], (TextView) bindings[8], (ImageView) bindings[5], (ImageView) bindings[1], (ImageView) bindings[3], (ImageView) bindings[4], (TextView) bindings[2], (TextView) bindings[9], (TextView) bindings[7]);
        this.f54921l = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54920k = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
