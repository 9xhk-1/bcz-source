package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
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
public class b4 extends a4 {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54225j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54226k;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54227h;

    /* renamed from: i, reason: collision with root package name */
    public long f54228i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54226k = sparseIntArray;
        sparseIntArray.put(R.id.title_img, 1);
        sparseIntArray.put(R.id.img_padding, 2);
        sparseIntArray.put(R.id.title_container, 3);
        sparseIntArray.put(R.id.bczDialog_titleText, 4);
        sparseIntArray.put(R.id.bczDialog_contentView, 5);
        sparseIntArray.put(R.id.button_area, 6);
        sparseIntArray.put(R.id.close, 7);
    }

    public b4(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, f54225j, f54226k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f54228i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54228i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54228i = 1L;
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

    public b4(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (FrameLayout) bindings[5], (TextView) bindings[4], (FrameLayout) bindings[6], (ImageView) bindings[7], (View) bindings[2], (FrameLayout) bindings[3], (ImageView) bindings[1]);
        this.f54228i = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f54227h = linearLayout;
        linearLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
