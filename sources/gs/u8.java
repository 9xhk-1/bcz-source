package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.aigestudio.wheelpicker.WheelPicker;
import com.baicizhan.main.customview.FixBugGroup;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class u8 extends t8 {

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56970v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56971w;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56972r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public final o4 f56973s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final Group f56974t;

    /* renamed from: u, reason: collision with root package name */
    public long f56975u;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(19);
        f56970v = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bcz_loading_view"}, new int[]{2}, new int[]{R.layout.bcz_loading_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56971w = sparseIntArray;
        sparseIntArray.put(R.id.noproguard_scroll, 3);
        sparseIntArray.put(R.id.main_content, 4);
        sparseIntArray.put(R.id.schedule_container, 5);
        sparseIntArray.put(R.id.noproguard_tips_one, 6);
        sparseIntArray.put(R.id.noproguard_tips_two, 7);
        sparseIntArray.put(R.id.noproguard_tips_group, 8);
        sparseIntArray.put(R.id.noproguard_picker_area, 9);
        sparseIntArray.put(R.id.noproguard_wheel_left, 10);
        sparseIntArray.put(R.id.noproguard_wheel_right, 11);
        sparseIntArray.put(R.id.noproguard_divider, 12);
        sparseIntArray.put(R.id.noproguard_wheel_left_picker, 13);
        sparseIntArray.put(R.id.noproguard_wheel_right_picker, 14);
        sparseIntArray.put(R.id.pickers, 15);
        sparseIntArray.put(R.id.all_kill_tips, 16);
        sparseIntArray.put(R.id.noproguard_confirm_bg, 17);
        sparseIntArray.put(R.id.noproguard_confirm_btn, 18);
    }

    public u8(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 19, f56970v, f56971w));
    }

    private boolean k(MutableLiveData<Boolean> LoadingVmShowContent, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56975u |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f56975u;
            this.f56975u = 0L;
        }
        ta.b bVar = this.f56857q;
        long j12 = j11 & 7;
        int i11 = 0;
        if (j12 != 0) {
            MutableLiveData<Boolean> mutableLiveData = bVar != null ? bVar.f90402d : null;
            updateLiveDataRegistration(0, mutableLiveData);
            boolean safeUnbox = ViewDataBinding.safeUnbox(mutableLiveData != null ? mutableLiveData.getValue() : null);
            if (j12 != 0) {
                j11 |= safeUnbox ? 16L : 8L;
            }
            if (!safeUnbox) {
                i11 = 8;
            }
        }
        if ((6 & j11) != 0) {
            this.f56973s.j(bVar);
        }
        if ((j11 & 7) != 0) {
            this.f56974t.setVisibility(i11);
        }
        ViewDataBinding.executeBindingsOn(this.f56973s);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56975u != 0) {
                    return true;
                }
                return this.f56973s.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56975u = 4L;
        }
        this.f56973s.invalidateAll();
        requestRebind();
    }

    @Override // gs.t8
    public void j(@Nullable ta.b LoadingVm) {
        this.f56857q = LoadingVm;
        synchronized (this) {
            this.f56975u |= 2;
        }
        notifyPropertyChanged(42);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return k((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f56973s.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (42 != variableId) {
            return false;
        }
        j((ta.b) variable);
        return true;
    }

    public u8(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (TextView) bindings[16], (ConstraintLayout) bindings[4], (View) bindings[17], (TextView) bindings[18], (View) bindings[12], (View) bindings[9], (NestedScrollView) bindings[3], (Group) bindings[8], (TextView) bindings[6], (TextView) bindings[7], (TextView) bindings[10], (WheelPicker) bindings[13], (TextView) bindings[11], (WheelPicker) bindings[14], (FixBugGroup) bindings[15], (FrameLayout) bindings[5]);
        this.f56975u = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56972r = constraintLayout;
        constraintLayout.setTag(null);
        o4 o4Var = (o4) bindings[2];
        this.f56973s = o4Var;
        setContainedBinding(o4Var);
        Group group = (Group) bindings[1];
        this.f56974t = group;
        group.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
