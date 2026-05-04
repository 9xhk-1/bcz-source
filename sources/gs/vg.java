package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class vg extends ug {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57177j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57178k;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57179h;

    /* renamed from: i, reason: collision with root package name */
    public long f57180i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57178k = sparseIntArray;
        sparseIntArray.put(R.id.word_layout, 1);
        sparseIntArray.put(R.id.word, 2);
        sparseIntArray.put(R.id.split_text_layout, 3);
        sparseIntArray.put(R.id.img_collect, 4);
        sparseIntArray.put(R.id.phonetic, 5);
        sparseIntArray.put(R.id.voice_img, 6);
        sparseIntArray.put(R.id.exam_text, 7);
    }

    public vg(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 8, f57177j, f57178k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f57180i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57180i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57180i = 1L;
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

    public vg(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[7], (ImageView) bindings[4], (TextView) bindings[5], (LinearLayout) bindings[3], (LottieAnimationView) bindings[6], (AppCompatTextView) bindings[2], (FrameLayout) bindings[1]);
        this.f57180i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57179h = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
