package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j1 extends i1 {

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55394q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55395r;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55396o;

    /* renamed from: p, reason: collision with root package name */
    public long f55397p;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        f55394q = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic", "fail_and_retry_layout"}, new int[]{4, 5}, new int[]{R.layout.action_bar_basic, R.layout.fail_and_retry_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55395r = sparseIntArray;
        sparseIntArray.put(R.id.bottom_barrier, 6);
        sparseIntArray.put(R.id.collect_panel, 7);
        sparseIntArray.put(R.id.word_all_check, 8);
        sparseIntArray.put(R.id.check_text, 9);
        sparseIntArray.put(R.id.cancel_collect_btn, 10);
        sparseIntArray.put(R.id.do_collect_btn, 11);
        sparseIntArray.put(R.id.word_num_text, 12);
        sparseIntArray.put(R.id.study_btn, 13);
    }

    public j1(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 14, f55394q, f55395r));
    }

    private boolean k(a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55397p |= 1;
        }
        return true;
    }

    private boolean r(f7 RetryLayout, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55397p |= 8;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0137  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.j1.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55397p != 0) {
                    return true;
                }
                return this.f55247a.hasPendingBindings() || this.f55254h.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55397p = 256L;
        }
        this.f55247a.invalidateAll();
        this.f55254h.invalidateAll();
        requestRebind();
    }

    @Override // gs.i1
    public void j(@Nullable com.baicizhan.main.examassistant.t1 Model) {
        this.f55260n = Model;
        synchronized (this) {
            this.f55397p |= 128;
        }
        notifyPropertyChanged(43);
        super.requestRebind();
    }

    public final boolean l(LiveData<Boolean> ModelAllWordPage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55397p |= 16;
        }
        return true;
    }

    public final boolean m(LiveData<Boolean> ModelLoading, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55397p |= 4;
        }
        return true;
    }

    public final boolean n(LiveData<Boolean> ModelShowMenu, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55397p |= 2;
        }
        return true;
    }

    public final boolean o(LiveData<Boolean> ModelShowStudyPanel, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55397p |= 64;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return k((a) object, fieldId);
            case 1:
                return n((LiveData) object, fieldId);
            case 2:
                return m((LiveData) object, fieldId);
            case 3:
                return r((f7) object, fieldId);
            case 4:
                return l((LiveData) object, fieldId);
            case 5:
                return p((LiveData) object, fieldId);
            case 6:
                return o((LiveData) object, fieldId);
            default:
                return false;
        }
    }

    public final boolean p(LiveData<Integer> ModelWordCount, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55397p |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55247a.setLifecycleOwner(lifecycleOwner);
        this.f55254h.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (43 != variableId) {
            return false;
        }
        j((com.baicizhan.main.examassistant.t1) variable);
        return true;
    }

    public j1(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7, (a) bindings[4], (Barrier) bindings[6], (TextView) bindings[10], (TextView) bindings[9], (LinearLayout) bindings[7], (TextView) bindings[1], (TextView) bindings[11], (f7) bindings[5], (TextView) bindings[13], (LinearLayout) bindings[3], (ImageView) bindings[8], (RecyclerView) bindings[2], (TextView) bindings[12]);
        this.f55397p = -1L;
        setContainedBinding(this.f55247a);
        this.f55252f.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55396o = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f55254h);
        this.f55256j.setTag(null);
        this.f55258l.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
