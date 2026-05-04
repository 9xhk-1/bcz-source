package gs;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class z8 extends y8 implements a.InterfaceC0684a {

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57743m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57744n;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57745e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final md f57746f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f57747g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f57748h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57749i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57750j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f57751k;

    /* renamed from: l, reason: collision with root package name */
    public long f57752l;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f57743m = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"image_daka_loading_layout"}, new int[]{6}, new int[]{R.layout.image_daka_loading_layout});
        f57744n = null;
    }

    public z8(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f57743m, f57744n));
    }

    private boolean m(ObservableInt ViewmodelStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57752l |= 1;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        rd.b bVar;
        if (sourceId == 1) {
            rd.b bVar2 = this.f57564d;
            if (bVar2 != null) {
                bVar2.b();
                return;
            }
            return;
        }
        if (sourceId != 2) {
            if (sourceId == 3 && (bVar = this.f57564d) != null) {
                bVar.g();
                return;
            }
            return;
        }
        rd.b bVar3 = this.f57564d;
        if (bVar3 != null) {
            bVar3.a();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        long j12;
        String str;
        Drawable drawable;
        ObservableInt observableInt;
        synchronized (this) {
            j11 = this.f57752l;
            this.f57752l = 0L;
        }
        rd.b bVar = this.f57564d;
        Bitmap bitmap = null;
        if ((31 & j11) != 0) {
            if ((j11 & 25) != 0) {
                observableInt = bVar != null ? bVar.f83960c : null;
                updateRegistration(0, observableInt);
                if (observableInt != null) {
                    observableInt.get();
                }
            } else {
                observableInt = null;
            }
            long j13 = j11 & 26;
            j12 = 0;
            if (j13 != 0) {
                ObservableInt observableInt2 = bVar != null ? bVar.f83958a : null;
                updateRegistration(1, observableInt2);
                boolean z11 = (observableInt2 != null ? observableInt2.get() : 0) == 1;
                if (j13 != 0) {
                    j11 |= z11 ? 320L : 160L;
                }
                str = this.f57748h.getResources().getString(z11 ? R.string.daka_image_change_poster : R.string.daka_image_change_color);
                drawable = AppCompatResources.getDrawable(this.f57747g.getContext(), z11 ? R.drawable.ic_image_daka_switch : R.drawable.ic_image_daka_color);
            } else {
                str = null;
                drawable = null;
            }
            if ((j11 & 28) != 0) {
                ObservableField<Bitmap> observableField = bVar != null ? bVar.f83959b : null;
                updateRegistration(2, observableField);
                if (observableField != null) {
                    bitmap = observableField.get();
                }
            }
        } else {
            j12 = 0;
            str = null;
            drawable = null;
            observableInt = null;
        }
        if ((16 & j11) != j12) {
            this.f57561a.setOnClickListener(this.f57750j);
            this.f57562b.setOnClickListener(this.f57751k);
            this.f57746f.k(this.f57749i);
        }
        if ((28 & j11) != j12) {
            this.f57563c.setImageBitmap(bitmap);
        }
        if ((j11 & 25) != j12) {
            this.f57746f.l(observableInt);
        }
        if ((j11 & 26) != j12) {
            ImageViewBindingAdapter.setImageDrawable(this.f57747g, drawable);
            TextViewBindingAdapter.setText(this.f57748h, str);
        }
        ViewDataBinding.executeBindingsOn(this.f57746f);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f57752l != 0) {
                    return true;
                }
                return this.f57746f.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57752l = 16L;
        }
        this.f57746f.invalidateAll();
        requestRebind();
    }

    @Override // gs.y8
    public void j(@Nullable rd.b Viewmodel) {
        this.f57564d = Viewmodel;
        synchronized (this) {
            this.f57752l |= 8;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(ObservableField<Bitmap> ViewmodelDakaImage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57752l |= 4;
        }
        return true;
    }

    public final boolean l(ObservableInt ViewmodelDakaType, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57752l |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return m((ObservableInt) object, fieldId);
        }
        if (localFieldId == 1) {
            return l((ObservableInt) object, fieldId);
        }
        if (localFieldId != 2) {
            return false;
        }
        return k((ObservableField) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f57746f.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((rd.b) variable);
        return true;
    }

    public z8(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3, (LinearLayout) bindings[3], (ConstraintLayout) bindings[1], (ImageView) bindings[2]);
        this.f57752l = -1L;
        this.f57561a.setTag(null);
        this.f57562b.setTag(null);
        this.f57563c.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.f57745e = frameLayout;
        frameLayout.setTag(null);
        md mdVar = (md) bindings[6];
        this.f57746f = mdVar;
        setContainedBinding(mdVar);
        ImageView imageView = (ImageView) bindings[4];
        this.f57747g = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) bindings[5];
        this.f57748h = textView;
        textView.setTag(null);
        setRootTag(root);
        this.f57749i = new hs.a(this, 3);
        this.f57750j = new hs.a(this, 2);
        this.f57751k = new hs.a(this, 1);
        invalidateAll();
    }
}
