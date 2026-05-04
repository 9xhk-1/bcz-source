package gs;

import android.graphics.Bitmap;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b9 extends a9 implements a.InterfaceC0684a {

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54263m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54264n;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54265e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final md f54266f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f54267g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54268h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54269i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54270j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54271k;

    /* renamed from: l, reason: collision with root package name */
    public long f54272l;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f54263m = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"image_daka_loading_layout"}, new int[]{6}, new int[]{R.layout.image_daka_loading_layout});
        f54264n = null;
    }

    public b9(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f54263m, f54264n));
    }

    private boolean l(ObservableField<Bitmap> ViewmodelDakaImage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54272l |= 2;
        }
        return true;
    }

    private boolean m(ObservableInt ViewmodelStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54272l |= 1;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        td.b bVar;
        if (sourceId == 1) {
            td.b bVar2 = this.f54159d;
            if (bVar2 != null) {
                bVar2.c();
                return;
            }
            return;
        }
        if (sourceId != 2) {
            if (sourceId == 3 && (bVar = this.f54159d) != null) {
                bVar.k();
                return;
            }
            return;
        }
        td.b bVar3 = this.f54159d;
        if (bVar3 != null) {
            bVar3.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.b9.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54272l != 0) {
                    return true;
                }
                return this.f54266f.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54272l = 16L;
        }
        this.f54266f.invalidateAll();
        requestRebind();
    }

    @Override // gs.a9
    public void j(@Nullable td.b Viewmodel) {
        this.f54159d = Viewmodel;
        synchronized (this) {
            this.f54272l |= 8;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(ObservableBoolean ViewmodelChangePhotoMode, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54272l |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return m((ObservableInt) object, fieldId);
        }
        if (localFieldId == 1) {
            return l((ObservableField) object, fieldId);
        }
        if (localFieldId != 2) {
            return false;
        }
        return k((ObservableBoolean) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54266f.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((td.b) variable);
        return true;
    }

    public b9(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3, (LinearLayout) bindings[3], (ConstraintLayout) bindings[1], (ImageView) bindings[2]);
        this.f54272l = -1L;
        this.f54156a.setTag(null);
        this.f54157b.setTag(null);
        this.f54158c.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.f54265e = frameLayout;
        frameLayout.setTag(null);
        md mdVar = (md) bindings[6];
        this.f54266f = mdVar;
        setContainedBinding(mdVar);
        ImageView imageView = (ImageView) bindings[4];
        this.f54267g = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) bindings[5];
        this.f54268h = textView;
        textView.setTag(null);
        setRootTag(root);
        this.f54269i = new hs.a(this, 2);
        this.f54270j = new hs.a(this, 3);
        this.f54271k = new hs.a(this, 1);
        invalidateAll();
    }
}
