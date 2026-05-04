package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.widget.WikiVideoView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class pn extends on {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56416f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56417g;

    /* renamed from: e, reason: collision with root package name */
    public long f56418e;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f56416f = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"study_wiki_subitem_title"}, new int[]{1}, new int[]{R.layout.study_wiki_subitem_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56417g = sparseIntArray;
        sparseIntArray.put(R.id.videoContainer, 2);
        sparseIntArray.put(R.id.video, 3);
    }

    public pn(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f56416f, f56417g));
    }

    private boolean i(qn Title, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56418e |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56418e = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f56264b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56418e != 0) {
                    return true;
                }
                return this.f56264b.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56418e = 2L;
        }
        this.f56264b.invalidateAll();
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
        this.f56264b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public pn(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (ConstraintLayout) bindings[0], (qn) bindings[1], (WikiVideoView) bindings[3], (FrameLayout) bindings[2]);
        this.f56418e = -1L;
        this.f56263a.setTag(null);
        setContainedBinding(this.f56264b);
        setRootTag(root);
        invalidateAll();
    }
}
