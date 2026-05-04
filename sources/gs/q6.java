package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.online.user_study_api.CalendarResignInfo;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class q6 extends p6 {

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56454p = null;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56455q;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56456n;

    /* renamed from: o, reason: collision with root package name */
    public long f56457o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56455q = sparseIntArray;
        sparseIntArray.put(R.id.top_guide, 5);
        sparseIntArray.put(R.id.repair_image, 6);
        sparseIntArray.put(R.id.desc, 7);
        sparseIntArray.put(R.id.expand_collapse, 8);
        sparseIntArray.put(R.id.repair_gray_line, 9);
        sparseIntArray.put(R.id.repair_cooper_image, 10);
        sparseIntArray.put(R.id.repair_cancel, 11);
        sparseIntArray.put(R.id.repair_confirm, 12);
    }

    public q6(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 13, f56454p, f56455q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        long j12;
        String str;
        String str2;
        String str3;
        String str4;
        int i11;
        synchronized (this) {
            j11 = this.f56457o;
            this.f56457o = 0L;
        }
        md.q qVar = this.f56316m;
        if ((15 & j11) != 0) {
            if ((j11 & 13) != 0) {
                LiveData<CalendarResignInfo> g11 = qVar != null ? qVar.g() : null;
                int i12 = 0;
                updateLiveDataRegistration(0, g11);
                CalendarResignInfo value = g11 != null ? g11.getValue() : null;
                if (value != null) {
                    i12 = value.getCopper_cost();
                    str3 = value.getTitle();
                    i11 = value.getCount();
                } else {
                    str3 = null;
                    i11 = 0;
                }
                str4 = i12 + this.f56309f.getResources().getString(R.string.calendar_repair_copper_cost_suffix);
                StringBuilder sb2 = new StringBuilder();
                j12 = 0;
                sb2.append(this.f56312i.getResources().getString(R.string.calendar_repair_count_prefix));
                sb2.append(i11);
                str2 = sb2.toString();
            } else {
                j12 = 0;
                str2 = null;
                str4 = null;
                str3 = null;
            }
            if ((j11 & 14) != j12) {
                MutableLiveData<String> i13 = qVar != null ? qVar.i() : null;
                updateLiveDataRegistration(1, i13);
                r11 = this.f56314k.getResources().getString(R.string.calendar_repair_copper_hold_prefix) + (i13 != null ? i13.getValue() : null);
            }
            str = r11;
            r11 = str4;
        } else {
            j12 = 0;
            str = null;
            str2 = null;
            str3 = null;
        }
        if ((j11 & 13) != j12) {
            TextViewBindingAdapter.setText(this.f56309f, r11);
            TextViewBindingAdapter.setText(this.f56312i, str2);
            TextViewBindingAdapter.setText(this.f56313j, str3);
        }
        if ((j11 & 14) != j12) {
            TextViewBindingAdapter.setText(this.f56314k, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56457o != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56457o = 8L;
        }
        requestRebind();
    }

    @Override // gs.p6
    public void j(@Nullable md.q RepairModel) {
        this.f56316m = RepairModel;
        synchronized (this) {
            this.f56457o |= 4;
        }
        notifyPropertyChanged(56);
        super.requestRebind();
    }

    public final boolean k(LiveData<CalendarResignInfo> RepairModelCalendarResignInfo, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56457o |= 1;
        }
        return true;
    }

    public final boolean l(MutableLiveData<String> RepairModelHoldCopper, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56457o |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return k((LiveData) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return l((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (56 != variableId) {
            return false;
        }
        j((md.q) variable);
        return true;
    }

    public q6(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (TextView) bindings[7], (ImageView) bindings[8], (TextView) bindings[11], (TextView) bindings[12], (ImageView) bindings[10], (TextView) bindings[3], (View) bindings[9], (ImageView) bindings[6], (TextView) bindings[2], (TextView) bindings[1], (TextView) bindings[4], (Guideline) bindings[5]);
        this.f56457o = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56456n = constraintLayout;
        constraintLayout.setTag(null);
        this.f56309f.setTag(null);
        this.f56312i.setTag(null);
        this.f56313j.setTag(null);
        this.f56314k.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
