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
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class bn extends an {

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54315h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54316i;

    /* renamed from: g, reason: collision with root package name */
    public long f54317g;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        f54315h = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"study_wiki_subitem_title"}, new int[]{1}, new int[]{R.layout.study_wiki_subitem_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54316i = sparseIntArray;
        sparseIntArray.put(R.id.voice, 2);
        sparseIntArray.put(R.id.sentence, 3);
        sparseIntArray.put(R.id.sentence_translate, 4);
        sparseIntArray.put(R.id.sentence_img, 5);
    }

    public bn(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f54315h, f54316i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f54317g = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f54207e);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54317g != 0) {
                    return true;
                }
                return this.f54207e.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(qn Title, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54317g |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54317g = 2L;
        }
        this.f54207e.invalidateAll();
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
        this.f54207e.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public bn(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ConstraintLayout) bindings[0], (TextView) bindings[3], (ImageView) bindings[5], (TextView) bindings[4], (qn) bindings[1], (ImageView) bindings[2]);
        this.f54317g = -1L;
        this.f54203a.setTag(null);
        setContainedBinding(this.f54207e);
        setRootTag(root);
        invalidateAll();
    }
}
