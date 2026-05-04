package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
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
public class w1 extends v1 {

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57256p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57257q;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57258n;

    /* renamed from: o, reason: collision with root package name */
    public long f57259o;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        f57256p = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57257q = sparseIntArray;
        sparseIntArray.put(R.id.buy, 2);
        sparseIntArray.put(R.id.image, 3);
        sparseIntArray.put(R.id.title, 4);
        sparseIntArray.put(R.id.desc, 5);
        sparseIntArray.put(R.id.chapter_list, 6);
        sparseIntArray.put(R.id.control_panel, 7);
        sparseIntArray.put(R.id.now_time, 8);
        sparseIntArray.put(R.id.seekbar, 9);
        sparseIntArray.put(R.id.end_time, 10);
        sparseIntArray.put(R.id.prev, 11);
        sparseIntArray.put(R.id.play, 12);
        sparseIntArray.put(R.id.next, 13);
    }

    public w1(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 14, f57256p, f57257q));
    }

    private boolean i(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57259o |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f57259o;
            this.f57259o = 0L;
        }
        if ((j11 & 2) != 0) {
            this.f57106a.F(ViewDataBinding.getColorFromResource(getRoot(), R.color.main_color_white));
            this.f57106a.V(getRoot().getResources().getString(R.string.fm_reading_plan));
            this.f57106a.W(false);
        }
        ViewDataBinding.executeBindingsOn(this.f57106a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f57259o != 0) {
                    return true;
                }
                return this.f57106a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57259o = 2L;
        }
        this.f57106a.invalidateAll();
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
        this.f57106a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public w1(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[1], (FrameLayout) bindings[2], (ListView) bindings[6], (LinearLayout) bindings[7], (TextView) bindings[5], (TextView) bindings[10], (ImageView) bindings[3], (ImageView) bindings[13], (TextView) bindings[8], (ImageView) bindings[12], (ImageView) bindings[11], (SeekBar) bindings[9], (TextView) bindings[4]);
        this.f57259o = -1L;
        setContainedBinding(this.f57106a);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57258n = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
