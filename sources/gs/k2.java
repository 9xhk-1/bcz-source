package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k2 extends j2 {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55563j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55564k;

    /* renamed from: i, reason: collision with root package name */
    public long f55565i;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f55563j = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"action_bar_basic"}, new int[]{2}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55564k = sparseIntArray;
        sparseIntArray.put(R.id.fragment_container, 3);
    }

    public k2(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f55563j, f55564k));
    }

    private boolean r(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55565i |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        int i11;
        synchronized (this) {
            j11 = this.f55565i;
            this.f55565i = 0L;
        }
        View.OnClickListener onClickListener = this.f55402e;
        String str = this.f55403f;
        boolean z11 = this.f55404g;
        boolean z12 = this.f55405h;
        long j12 = j11 & 40;
        if (j12 != 0) {
            if (j12 != 0) {
                j11 |= z11 ? 128L : 64L;
            }
            i11 = ViewDataBinding.getColorFromResource(getRoot(), z11 ? R.color.main_color_black : R.color.main_color_white);
        } else {
            i11 = 0;
        }
        long j13 = 48 & j11;
        if ((34 & j11) != 0) {
            this.f55398a.D(onClickListener);
        }
        if ((40 & j11) != 0) {
            this.f55398a.F(i11);
            this.f55398a.W(z11);
        }
        if (j13 != 0) {
            this.f55398a.R(z12);
        }
        if ((j11 & 36) != 0) {
            this.f55398a.V(str);
        }
        ViewDataBinding.executeBindingsOn(this.f55398a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55565i != 0) {
                    return true;
                }
                return this.f55398a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55565i = 32L;
        }
        this.f55398a.invalidateAll();
        requestRebind();
    }

    @Override // gs.j2
    public void m(@Nullable View.OnClickListener BackListener) {
        this.f55402e = BackListener;
        synchronized (this) {
            this.f55565i |= 2;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    @Override // gs.j2
    public void n(boolean Dark) {
        this.f55404g = Dark;
        synchronized (this) {
            this.f55565i |= 8;
        }
        notifyPropertyChanged(20);
        super.requestRebind();
    }

    @Override // gs.j2
    public void o(boolean ShowDivider) {
        this.f55405h = ShowDivider;
        synchronized (this) {
            this.f55565i |= 16;
        }
        notifyPropertyChanged(74);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return r((a) object, fieldId);
    }

    @Override // gs.j2
    public void p(@Nullable String Title) {
        this.f55403f = Title;
        synchronized (this) {
            this.f55565i |= 4;
        }
        notifyPropertyChanged(86);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55398a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (3 == variableId) {
            m((View.OnClickListener) variable);
            return true;
        }
        if (86 == variableId) {
            p((String) variable);
            return true;
        }
        if (20 == variableId) {
            n(((Boolean) variable).booleanValue());
            return true;
        }
        if (74 != variableId) {
            return false;
        }
        o(((Boolean) variable).booleanValue());
        return true;
    }

    public k2(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[2], (BottomSheetLayout) bindings[0], (LinearLayout) bindings[1], (FrameLayout) bindings[3]);
        this.f55565i = -1L;
        setContainedBinding(this.f55398a);
        this.f55399b.setTag(null);
        this.f55400c.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
