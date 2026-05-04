package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.aigestudio.wheelpicker.WheelPicker;
import com.jiongji.andriod.card.R;
import com.kyleduo.switchbutton.SwitchButton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g0 extends f0 {

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54971l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54972m;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54973j;

    /* renamed from: k, reason: collision with root package name */
    public long f54974k;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f54971l = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{1}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f54972m = sparseIntArray;
        sparseIntArray.put(R.id.switcher, 2);
        sparseIntArray.put(R.id.pick_date_btn, 3);
        sparseIntArray.put(R.id.select_time, 4);
        sparseIntArray.put(R.id.notice_date_picker, 5);
        sparseIntArray.put(R.id.notice_am, 6);
        sparseIntArray.put(R.id.notice_hour, 7);
        sparseIntArray.put(R.id.notice_minute, 8);
    }

    public g0(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 9, f54971l, f54972m));
    }

    private boolean k(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54974k |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f54974k;
            this.f54974k = 0L;
        }
        View.OnClickListener onClickListener = this.f54852i;
        if ((6 & j11) != 0) {
            this.f54844a.D(onClickListener);
        }
        if ((j11 & 4) != 0) {
            this.f54844a.F(ViewDataBinding.getColorFromResource(getRoot(), R.color.main_color_white));
            this.f54844a.V(getRoot().getResources().getString(R.string.setting_remind_system));
        }
        ViewDataBinding.executeBindingsOn(this.f54844a);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54974k != 0) {
                    return true;
                }
                return this.f54844a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54974k = 4L;
        }
        this.f54844a.invalidateAll();
        requestRebind();
    }

    @Override // gs.f0
    public void j(@Nullable View.OnClickListener BackListener) {
        this.f54852i = BackListener;
        synchronized (this) {
            this.f54974k |= 2;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return k((a) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54844a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (3 != variableId) {
            return false;
        }
        j((View.OnClickListener) variable);
        return true;
    }

    public g0(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (a) bindings[1], (WheelPicker) bindings[6], (LinearLayout) bindings[5], (WheelPicker) bindings[7], (WheelPicker) bindings[8], (RelativeLayout) bindings[3], (TextView) bindings[4], (SwitchButton) bindings[2]);
        this.f54974k = -1L;
        setContainedBinding(this.f54844a);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54973j = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
