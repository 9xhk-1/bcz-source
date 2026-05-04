package nn;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import vm.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class b implements com.google.android.material.floatingactionbutton.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f75187a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ExtendedFloatingActionButton f75188b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<Animator.AnimatorListener> f75189c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final nn.a f75190d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public i f75191e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public i f75192f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Property<ExtendedFloatingActionButton, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(vm.b.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.L.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f75188b.L.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f11) {
            int colorForState = extendedFloatingActionButton.L.getColorForState(extendedFloatingActionButton.getDrawableState(), b.this.f75188b.L.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (vm.b.a(0.0f, Color.alpha(colorForState) / 255.0f, f11.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f11.floatValue() == 1.0f) {
                extendedFloatingActionButton.X(extendedFloatingActionButton.L);
            } else {
                extendedFloatingActionButton.X(valueOf);
            }
        }
    }

    public b(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton, nn.a aVar) {
        this.f75188b = extendedFloatingActionButton;
        this.f75187a = extendedFloatingActionButton.getContext();
        this.f75190d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final i a() {
        i iVar = this.f75192f;
        if (iVar != null) {
            return iVar;
        }
        if (this.f75191e == null) {
            this.f75191e = i.d(this.f75187a, g());
        }
        return (i) Preconditions.checkNotNull(this.f75191e);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    @CallSuper
    public void b() {
        this.f75190d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    @Nullable
    public i c() {
        return this.f75192f;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void e(@NonNull Animator.AnimatorListener animatorListener) {
        this.f75189c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void f(@Nullable i iVar) {
        this.f75192f = iVar;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    @NonNull
    public final List<Animator.AnimatorListener> getListeners() {
        return this.f75189c;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public AnimatorSet h() {
        return n(a());
    }

    @Override // com.google.android.material.floatingactionbutton.b
    @CallSuper
    public void k() {
        this.f75190d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void l(@NonNull Animator.AnimatorListener animatorListener) {
        this.f75189c.add(animatorListener);
    }

    @NonNull
    public AnimatorSet n(@NonNull i iVar) {
        ArrayList arrayList = new ArrayList();
        if (iVar.j("opacity")) {
            arrayList.add(iVar.f("opacity", this.f75188b, View.ALPHA));
        }
        if (iVar.j("scale")) {
            arrayList.add(iVar.f("scale", this.f75188b, View.SCALE_Y));
            arrayList.add(iVar.f("scale", this.f75188b, View.SCALE_X));
        }
        if (iVar.j("width")) {
            arrayList.add(iVar.f("width", this.f75188b, ExtendedFloatingActionButton.f31315i1));
        }
        if (iVar.j("height")) {
            arrayList.add(iVar.f("height", this.f75188b, ExtendedFloatingActionButton.f31316j1));
        }
        if (iVar.j("paddingStart")) {
            arrayList.add(iVar.f("paddingStart", this.f75188b, ExtendedFloatingActionButton.f31317k1));
        }
        if (iVar.j("paddingEnd")) {
            arrayList.add(iVar.f("paddingEnd", this.f75188b, ExtendedFloatingActionButton.f31318l1));
        }
        if (iVar.j("labelOpacity")) {
            arrayList.add(iVar.f("labelOpacity", this.f75188b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        vm.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    @CallSuper
    public void onAnimationStart(Animator animator) {
        this.f75190d.c(animator);
    }
}
