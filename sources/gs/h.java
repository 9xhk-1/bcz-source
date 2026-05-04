package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.main.activity.aiclass.video.BczVideoView;
import com.baicizhan.main.activity.aiclass.video.VideoControllerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h extends g {

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55114f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55115g;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55116d;

    /* renamed from: e, reason: collision with root package name */
    public long f55117e;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f55114f = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"ai_class_loading"}, new int[]{1}, new int[]{R.layout.ai_class_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55115g = sparseIntArray;
        sparseIntArray.put(R.id.video, 2);
        sparseIntArray.put(R.id.controller, 3);
    }

    public h(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f55114f, f55115g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f55117e = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f54968a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55117e != 0) {
                    return true;
                }
                return this.f54968a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(q3 AiClassLoading, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55117e |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55117e = 2L;
        }
        this.f54968a.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return i((q3) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54968a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public h(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (q3) bindings[1], (VideoControllerView) bindings[3], (BczVideoView) bindings[2]);
        this.f55117e = -1L;
        setContainedBinding(this.f54968a);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.f55116d = frameLayout;
        frameLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
