package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class jn extends in {

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55548e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55549f;

    /* renamed from: d, reason: collision with root package name */
    public long f55550d;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        f55548e = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"study_wiki_subitem_title"}, new int[]{1}, new int[]{R.layout.study_wiki_subitem_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55549f = sparseIntArray;
        sparseIntArray.put(R.id.word_root, 2);
    }

    public jn(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 3, f55548e, f55549f));
    }

    private boolean i(qn Title, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55550d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55550d = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f55358b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55550d != 0) {
                    return true;
                }
                return this.f55358b.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55550d = 2L;
        }
        this.f55358b.invalidateAll();
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
        this.f55358b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public jn(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ConstraintLayout) bindings[0], (qn) bindings[1], (TextView) bindings[2]);
        this.f55550d = -1L;
        this.f55357a.setTag(null);
        setContainedBinding(this.f55358b);
        setRootTag(root);
        invalidateAll();
    }
}
