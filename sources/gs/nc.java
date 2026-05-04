package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class nc extends mc {

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56044l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56045m;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56046g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56047h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final tc f56048i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final oc f56049j;

    /* renamed from: k, reason: collision with root package name */
    public long f56050k;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        f56044l = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{4}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56045m = sparseIntArray;
        sparseIntArray.put(R.id.search_bar, 5);
        sparseIntArray.put(R.id.search_frame, 6);
        sparseIntArray.put(R.id.search_small_lens, 7);
        sparseIntArray.put(R.id.search_clear, 8);
        sparseIntArray.put(R.id.search_box, 9);
    }

    public nc(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 10, f56044l, f56045m));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56050k |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56050k;
            this.f56050k = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f55888a.F(ViewDataBinding.getColorFromResource(getRoot(), R.color.main_color_white));
            this.f55888a.V(getRoot().getResources().getString(R.string.friend_search_title));
        }
        ViewDataBinding.executeBindingsOn(this.f55888a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56050k != 0) {
                    return true;
                }
                return this.f55888a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56050k = 2L;
        }
        this.f55888a.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return i((a) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55888a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public nc(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[4], (FrameLayout) bindings[5], (EditText) bindings[9], (ImageView) bindings[8], (RelativeLayout) bindings[6], (ImageView) bindings[7]);
        this.f56050k = -1L;
        setContainedBinding(this.f55888a);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56046g = constraintLayout;
        constraintLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[1];
        this.f56047h = frameLayout;
        frameLayout.setTag(null);
        Object obj = bindings[2];
        this.f56048i = obj != null ? tc.a((View) obj) : null;
        Object obj2 = bindings[3];
        this.f56049j = obj2 != null ? oc.a((View) obj2) : null;
        setRootTag(root);
        invalidateAll();
    }
}
