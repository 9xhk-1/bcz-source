package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.tabs.TabLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k9 extends j9 {

    @Nullable
    public static final ViewDataBinding.IncludedLayouts A = null;

    @Nullable
    public static final SparseIntArray B;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55585x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public final sb f55586y;

    /* renamed from: z, reason: collision with root package name */
    public long f55587z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.nested_scroll_view, 4);
        sparseIntArray.put(R.id.content_container, 5);
        sparseIntArray.put(R.id.word_info_container, 6);
        sparseIntArray.put(R.id.word, 7);
        sparseIntArray.put(R.id.collect, 8);
        sparseIntArray.put(R.id.phonetic_container, 9);
        sparseIntArray.put(R.id.phonetic_us, 10);
        sparseIntArray.put(R.id.voice_us, 11);
        sparseIntArray.put(R.id.phonetic_uk, 12);
        sparseIntArray.put(R.id.voice_uk, 13);
        sparseIntArray.put(R.id.meanings_container, 14);
        sparseIntArray.put(R.id.applicable_scopes, 15);
        sparseIntArray.put(R.id.exam_info, 16);
        sparseIntArray.put(R.id.tab_container, 17);
        sparseIntArray.put(R.id.tab_layout, 18);
        sparseIntArray.put(R.id.custom_indicator, 19);
        sparseIntArray.put(R.id.tab_content_container, 20);
        sparseIntArray.put(R.id.bottom_buttons, 21);
        sparseIntArray.put(R.id.btn_report_word, 22);
        sparseIntArray.put(R.id.btn_report, 23);
    }

    public k9(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 24, A, B));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        synchronized (this) {
            j11 = this.f55587z;
            this.f55587z = 0L;
        }
        com.baicizhan.main.wikiv2.lookup.wikiv2.o0 o0Var = this.f55468w;
        long j12 = j11 & 7;
        int i11 = 0;
        if (j12 != 0) {
            LiveData<Boolean> L = o0Var != null ? o0Var.L() : null;
            updateLiveDataRegistration(0, L);
            boolean safeUnbox = ViewDataBinding.safeUnbox(L != null ? L.getValue() : null);
            if (j12 != 0) {
                j11 |= safeUnbox ? 16L : 8L;
            }
            if (!safeUnbox) {
                i11 = 8;
            }
        }
        if ((j11 & 7) != 0) {
            this.f55455j.setVisibility(i11);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55587z != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55587z = 4L;
        }
        requestRebind();
    }

    @Override // gs.j9
    public void j(@Nullable com.baicizhan.main.wikiv2.lookup.wikiv2.o0 Viewmodel) {
        this.f55468w = Viewmodel;
        synchronized (this) {
            this.f55587z |= 2;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(LiveData<Boolean> ViewmodelIsLoading, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55587z |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return k((LiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((com.baicizhan.main.wikiv2.lookup.wikiv2.o0) variable);
        return true;
    }

    public k9(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (TextView) bindings[15], (LinearLayout) bindings[21], (TextView) bindings[23], (TextView) bindings[22], (ImageView) bindings[8], (LinearLayout) bindings[5], (View) bindings[19], (FrameLayout) bindings[2], (TextView) bindings[16], (ProgressBar) bindings[1], (LinearLayout) bindings[14], (NestedScrollView) bindings[4], (LinearLayout) bindings[9], (TextView) bindings[12], (TextView) bindings[10], (FrameLayout) bindings[17], (FrameLayout) bindings[20], (TabLayout) bindings[18], (LottieAnimationView) bindings[13], (LottieAnimationView) bindings[11], (AppCompatTextView) bindings[7], (ConstraintLayout) bindings[6]);
        this.f55587z = -1L;
        this.f55453h.setTag(null);
        this.f55455j.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55585x = constraintLayout;
        constraintLayout.setTag(null);
        Object obj = bindings[3];
        this.f55586y = obj != null ? sb.a((View) obj) : null;
        setRootTag(root);
        invalidateAll();
    }
}
