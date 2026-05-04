package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class zm extends ym {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57804j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57805k;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57806h;

    /* renamed from: i, reason: collision with root package name */
    public long f57807i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57805k = sparseIntArray;
        sparseIntArray.put(R.id.wiki_list, 2);
        sparseIntArray.put(R.id.noproguard_bottom_bg, 3);
        sparseIntArray.put(R.id.noproguard_kill, 4);
        sparseIntArray.put(R.id.noproguard_continue_learn, 5);
        sparseIntArray.put(R.id.noproguard_bottom_group, 6);
    }

    public zm(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f57804j, f57805k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f57807i;
            this.f57807i = 0L;
        }
        StudyWikiV2ViewModel studyWikiV2ViewModel = this.f57661g;
        long j12 = j11 & 7;
        int i11 = 0;
        if (j12 != 0) {
            SingleLiveEvent<Boolean> i12 = studyWikiV2ViewModel != null ? studyWikiV2ViewModel.i() : null;
            updateLiveDataRegistration(0, i12);
            boolean safeUnbox = ViewDataBinding.safeUnbox(i12 != null ? i12.getValue() : null);
            if (j12 != 0) {
                j11 |= safeUnbox ? 16L : 8L;
            }
            if (!safeUnbox) {
                i11 = 8;
            }
        }
        if ((j11 & 7) != 0) {
            this.f57659e.setVisibility(i11);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57807i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57807i = 4L;
        }
        requestRebind();
    }

    @Override // gs.ym
    public void j(@Nullable StudyWikiV2ViewModel Viewmodel) {
        this.f57661g = Viewmodel;
        synchronized (this) {
            this.f57807i |= 2;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(SingleLiveEvent<Boolean> ViewmodelLoadingStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57807i |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return k((SingleLiveEvent) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((StudyWikiV2ViewModel) variable);
        return true;
    }

    public zm(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (View) bindings[3], (Group) bindings[6], (TextView) bindings[5], (ImageView) bindings[4], (ProgressBar) bindings[1], (RecyclerView) bindings[2]);
        this.f57807i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57806h = constraintLayout;
        constraintLayout.setTag(null);
        this.f57659e.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
