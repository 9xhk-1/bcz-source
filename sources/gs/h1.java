package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h1 extends g1 {

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55127g = null;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55128h;

    /* renamed from: f, reason: collision with root package name */
    public long f55129f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55128h = sparseIntArray;
        sparseIntArray.put(R.id.container, 1);
        sparseIntArray.put(R.id.placeholder, 2);
        sparseIntArray.put(R.id.view_pager, 3);
        sparseIntArray.put(R.id.bottom_navigation, 4);
    }

    public h1(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f55127g, f55128h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55129f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55129f != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55129f = 1L;
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

    public h1(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (BottomSheetLayout) bindings[0], (AHBottomNavigation) bindings[4], (FrameLayout) bindings[1], (FrameLayout) bindings[2], (ViewPager2) bindings[3]);
        this.f55129f = -1L;
        this.f54975a.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
