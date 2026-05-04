package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class fn extends en {

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54963e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54964f;

    /* renamed from: d, reason: collision with root package name */
    public long f54965d;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        f54963e = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"study_wiki_subitem_title"}, new int[]{1}, new int[]{R.layout.study_wiki_subitem_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54964f = sparseIntArray;
        sparseIntArray.put(R.id.pictogram, 2);
    }

    public fn(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f54963e, f54964f));
    }

    private boolean i(qn Title, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54965d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f54965d = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f54832c);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54965d != 0) {
                    return true;
                }
                return this.f54832c.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54965d = 2L;
        }
        this.f54832c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return i((qn) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54832c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public fn(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ConstraintLayout) bindings[0], (ImageView) bindings[2], (qn) bindings[1]);
        this.f54965d = -1L;
        this.f54830a.setTag(null);
        setContainedBinding(this.f54832c);
        setRootTag(root);
        invalidateAll();
    }
}
