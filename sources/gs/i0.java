package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SeekBar;
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
public class i0 extends h0 {

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55243l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55244m;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55245j;

    /* renamed from: k, reason: collision with root package name */
    public long f55246k;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(10);
        f55243l = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55244m = sparseIntArray;
        sparseIntArray.put(R.id.chapter_list, 2);
        sparseIntArray.put(R.id.control_panel, 3);
        sparseIntArray.put(R.id.now_time, 4);
        sparseIntArray.put(R.id.seekbar, 5);
        sparseIntArray.put(R.id.end_time, 6);
        sparseIntArray.put(R.id.prev, 7);
        sparseIntArray.put(R.id.play, 8);
        sparseIntArray.put(R.id.next, 9);
    }

    public i0(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 10, f55243l, f55244m));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55246k |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f55246k;
            this.f55246k = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f55118a.F(0);
        }
        ViewDataBinding.executeBindingsOn(this.f55118a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55246k != 0) {
                    return true;
                }
                return this.f55118a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55246k = 2L;
        }
        this.f55118a.invalidateAll();
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
        this.f55118a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public i0(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[1], (ListView) bindings[2], (LinearLayout) bindings[3], (TextView) bindings[6], (ImageView) bindings[9], (TextView) bindings[4], (ImageView) bindings[8], (ImageView) bindings[7], (SeekBar) bindings[5]);
        this.f55246k = -1L;
        setContainedBinding(this.f55118a);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55245j = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
