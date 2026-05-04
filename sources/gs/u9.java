package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
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
public class u9 extends t9 {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56976i = null;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56977j;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56978g;

    /* renamed from: h, reason: collision with root package name */
    public long f56979h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56977j = sparseIntArray;
        sparseIntArray.put(R.id.mask, 1);
        sparseIntArray.put(R.id.content_view, 2);
        sparseIntArray.put(R.id.red_packet_bg, 3);
        sparseIntArray.put(R.id.red_packet_button, 4);
        sparseIntArray.put(R.id.red_packet_content, 5);
        sparseIntArray.put(R.id.close, 6);
    }

    public u9(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f56976i, f56977j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56979h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56979h != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56979h = 1L;
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

    public u9(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (ImageView) bindings[6], (ConstraintLayout) bindings[2], (View) bindings[1], (ImageView) bindings[3], (ImageView) bindings[4], (TextView) bindings[5]);
        this.f56979h = -1L;
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.f56978g = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
