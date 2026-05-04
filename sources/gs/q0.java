package gs;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class q0 extends p0 {

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56425e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56426f;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final a f56427b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56428c;

    /* renamed from: d, reason: collision with root package name */
    public long f56429d;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        f56425e = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        f56426f = null;
    }

    public q0(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 2, f56425e, f56426f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56429d;
            this.f56429d = 0L;
        }
        View.OnClickListener onClickListener = this.f56279a;
        if ((3 & j11) != 0) {
            this.f56427b.D(onClickListener);
        }
        if ((j11 & 2) != 0) {
            this.f56427b.V(getRoot().getResources().getString(R.string.friend_friend_tab_text));
        }
        ViewDataBinding.executeBindingsOn(this.f56427b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56429d != 0) {
                    return true;
                }
                return this.f56427b.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56429d = 2L;
        }
        this.f56427b.invalidateAll();
        requestRebind();
    }

    @Override // gs.p0
    public void j(@Nullable View.OnClickListener BackListener) {
        this.f56279a = BackListener;
        synchronized (this) {
            this.f56429d |= 1;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f56427b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (3 != variableId) {
            return false;
        }
        j((View.OnClickListener) variable);
        return true;
    }

    public q0(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0);
        this.f56429d = -1L;
        a aVar = (a) bindings[1];
        this.f56427b = aVar;
        setContainedBinding(aVar);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56428c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
