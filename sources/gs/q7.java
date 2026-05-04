package gs;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.aigestudio.wheelpicker.WheelPicker;
import com.baicizhan.main.activity.schedule_v2.mutimode.ModelListView;
import com.baicizhan.main.customview.FixBugGroup;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class q7 extends p7 {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts F;

    @Nullable
    public static final SparseIntArray G;

    @NonNull
    public final ConstraintLayout B;

    @Nullable
    public final o4 C;

    @NonNull
    public final Group D;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(28);
        F = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bcz_loading_view"}, new int[]{6}, new int[]{R.layout.bcz_loading_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.noproguard_scroll, 7);
        sparseIntArray.put(R.id.main_content, 8);
        sparseIntArray.put(R.id.schedule_container, 9);
        sparseIntArray.put(R.id.noproguard_tips_finish_date_title, 10);
        sparseIntArray.put(R.id.noproguard_tips_finish_date, 11);
        sparseIntArray.put(R.id.noproguard_tips_everyday_cost, 12);
        sparseIntArray.put(R.id.tips_date_group, 13);
        sparseIntArray.put(R.id.noproguard_tips_select_book, 14);
        sparseIntArray.put(R.id.noproguard_tips_select_book_info, 15);
        sparseIntArray.put(R.id.noproguard_tips_expected_time_title, 16);
        sparseIntArray.put(R.id.noproguard_tips_expected_time, 17);
        sparseIntArray.put(R.id.tips_new_time_group, 18);
        sparseIntArray.put(R.id.group_expected_time, 19);
        sparseIntArray.put(R.id.tips_barrier, 20);
        sparseIntArray.put(R.id.noproguard_word_title, 21);
        sparseIntArray.put(R.id.noproguard_day_title, 22);
        sparseIntArray.put(R.id.noproguard_divider, 23);
        sparseIntArray.put(R.id.all_kill_tips, 24);
        sparseIntArray.put(R.id.commom, 25);
        sparseIntArray.put(R.id.noproguard_confirm_bg, 26);
        sparseIntArray.put(R.id.noproguard_confirm_btn, 27);
    }

    public q7(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 28, F, G));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        long j12;
        float f11;
        int i11;
        int i12;
        int i13;
        synchronized (this) {
            j11 = this.E;
            this.E = 0L;
        }
        com.baicizhan.main.activity.schedule_v2.adjustschedule.e eVar = this.f56342z;
        ta.b bVar = this.A;
        long j13 = j11 & 21;
        int i14 = 0;
        if (j13 != 0) {
            LiveData<Boolean> K = eVar != null ? eVar.K() : null;
            updateLiveDataRegistration(0, K);
            boolean safeUnbox = ViewDataBinding.safeUnbox(K != null ? K.getValue() : null);
            if (j13 != 0) {
                j11 |= safeUnbox ? 21760L : 10880L;
            }
            Resources resources = this.f56335s.getResources();
            i12 = safeUnbox ? resources.getInteger(R.integer.word_plan_adjust_visible_count_small) : resources.getInteger(R.integer.word_plan_adjust_visible_count);
            i13 = safeUnbox ? 0 : 8;
            j12 = 0;
            f11 = this.f56326j.getResources().getDimension(safeUnbox ? R.dimen.word_plan_wheel_height_small : R.dimen.word_plan_wheel_height);
            i11 = safeUnbox ? this.f56323g.getResources().getInteger(R.integer.word_plan_adjust_visible_count_small) : this.f56323g.getResources().getInteger(R.integer.word_plan_adjust_visible_count);
        } else {
            j12 = 0;
            f11 = 0.0f;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        long j14 = j11 & 26;
        if (j14 != j12) {
            MutableLiveData<Boolean> mutableLiveData = bVar != null ? bVar.f90402d : null;
            updateLiveDataRegistration(1, mutableLiveData);
            boolean safeUnbox2 = ViewDataBinding.safeUnbox(mutableLiveData != null ? mutableLiveData.getValue() : null);
            if (j14 != j12) {
                j11 |= safeUnbox2 ? 64L : 32L;
            }
            i14 = safeUnbox2 ? 0 : 8;
        }
        if ((24 & j11) != j12) {
            this.C.j(bVar);
        }
        if ((j11 & 26) != j12) {
            this.D.setVisibility(i14);
        }
        if ((j11 & 21) != j12) {
            com.baicizhan.main.activity.schedule_v2.adjustschedule.l2.c(this.f56323g, i11);
            com.baicizhan.main.activity.schedule_v2.adjustschedule.l2.a(this.f56326j, Float.valueOf(f11));
            com.baicizhan.main.activity.schedule_v2.adjustschedule.l2.c(this.f56335s, i12);
            this.f56338v.setVisibility(i13);
        }
        ViewDataBinding.executeBindingsOn(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.C.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.E = 16L;
        }
        this.C.invalidateAll();
        requestRebind();
    }

    @Override // gs.p7
    public void k(@Nullable ta.b LoadingVm) {
        this.A = LoadingVm;
        synchronized (this) {
            this.E |= 8;
        }
        notifyPropertyChanged(42);
        super.requestRebind();
    }

    @Override // gs.p7
    public void l(@Nullable com.baicizhan.main.activity.schedule_v2.adjustschedule.e Model) {
        this.f56342z = Model;
        synchronized (this) {
            this.E |= 4;
        }
        notifyPropertyChanged(43);
        super.requestRebind();
    }

    public final boolean m(MutableLiveData<Boolean> LoadingVmShowContent, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 2;
        }
        return true;
    }

    public final boolean n(LiveData<Boolean> ModelMutiMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return n((LiveData) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return m((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.C.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (43 == variableId) {
            l((com.baicizhan.main.activity.schedule_v2.adjustschedule.e) variable);
            return true;
        }
        if (42 != variableId) {
            return false;
        }
        k((ta.b) variable);
        return true;
    }

    public q7(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (TextView) bindings[24], (FixBugGroup) bindings[25], (Group) bindings[19], (ConstraintLayout) bindings[8], (View) bindings[26], (TextView) bindings[27], (WheelPicker) bindings[3], (TextView) bindings[22], (View) bindings[23], (View) bindings[1], (NestedScrollView) bindings[7], (TextView) bindings[12], (TextView) bindings[17], (TextView) bindings[16], (TextView) bindings[11], (TextView) bindings[10], (TextView) bindings[14], (TextView) bindings[15], (WheelPicker) bindings[2], (TextView) bindings[21], (FrameLayout) bindings[9], (ModelListView) bindings[4], (Barrier) bindings[20], (Group) bindings[13], (Group) bindings[18]);
        this.E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.B = constraintLayout;
        constraintLayout.setTag(null);
        o4 o4Var = (o4) bindings[6];
        this.C = o4Var;
        setContainedBinding(o4Var);
        Group group = (Group) bindings[5];
        this.D = group;
        group.setTag(null);
        this.f56323g.setTag(null);
        this.f56326j.setTag(null);
        this.f56335s.setTag(null);
        this.f56338v.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
