package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
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
public class pg extends og {

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56377h = null;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56378i;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56379f;

    /* renamed from: g, reason: collision with root package name */
    public long f56380g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56378i = sparseIntArray;
        sparseIntArray.put(R.id.sentence_en, 1);
        sparseIntArray.put(R.id.sentence_voice, 2);
        sparseIntArray.put(R.id.sentence_ch, 3);
        sparseIntArray.put(R.id.sentence_img, 4);
        sparseIntArray.put(R.id.sentence_source, 5);
    }

    public pg(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f56377h, f56378i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f56380g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56380g != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56380g = 1L;
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

    public pg(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[3], (TextView) bindings[1], (ImageView) bindings[4], (TextView) bindings[5], (LottieAnimationView) bindings[2]);
        this.f56380g = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56379f = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
