package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class we extends ve {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57320j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57321k;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57322h;

    /* renamed from: i, reason: collision with root package name */
    public long f57323i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57321k = sparseIntArray;
        sparseIntArray.put(R.id.sentence_en, 1);
        sparseIntArray.put(R.id.sentence_voice, 2);
        sparseIntArray.put(R.id.sentence_ch, 3);
        sparseIntArray.put(R.id.sentence_img, 4);
        sparseIntArray.put(R.id.tag_source_container, 5);
        sparseIntArray.put(R.id.sentence_tags_container, 6);
        sparseIntArray.put(R.id.sentence_source, 7);
    }

    public we(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, f57320j, f57321k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f57323i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57323i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57323i = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        return true;
    }

    public we(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[3], (TextView) bindings[1], (ImageView) bindings[4], (TextView) bindings[7], (LinearLayout) bindings[6], (LottieAnimationView) bindings[2], (LinearLayout) bindings[5]);
        this.f57323i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57322h = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
