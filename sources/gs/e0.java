package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e0 extends d0 {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54691j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54692k;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54693h;

    /* renamed from: i, reason: collision with root package name */
    public long f54694i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54692k = sparseIntArray;
        sparseIntArray.put(R.id.action_bar, 1);
        sparseIntArray.put(R.id.back_img, 2);
        sparseIntArray.put(R.id.tab, 3);
        sparseIntArray.put(R.id.title, 4);
        sparseIntArray.put(R.id.badge_text, 5);
        sparseIntArray.put(R.id.single_container, 6);
        sparseIntArray.put(R.id.pager, 7);
    }

    public e0(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, f54691j, f54692k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f54694i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f54694i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54694i = 1L;
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

    public e0(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (RelativeLayout) bindings[1], (ImageView) bindings[2], (TextView) bindings[5], (ViewPager2) bindings[7], (FrameLayout) bindings[6], (TabLayout) bindings[3], (TextView) bindings[4]);
        this.f54694i = -1L;
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f54693h = linearLayout;
        linearLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
