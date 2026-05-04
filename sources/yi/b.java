package yi;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.jiongji.andriod.card.R;
import gi.m0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.text.Regex;
import m80.k;
import m80.l;
import u30.f0;
import u30.k0;
import u30.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {
    public static final void b(@k final ImageView imageView, @k LifecycleOwner owner, @k LiveData<Boolean> play) {
        g0.p(imageView, "<this>");
        g0.p(owner, "owner");
        g0.p(play, "play");
        imageView.setImageResource(R.drawable.ic_searchwords_voice_2);
        play.observe(owner, new Observer() { // from class: yi.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                b.c(imageView, (Boolean) obj);
            }
        });
    }

    public static final void c(ImageView imageView, Boolean bool) {
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                Drawable drawable = imageView.getResources().getDrawable(R.drawable.animation_searchwords_voice);
                g0.n(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                imageView.setImageDrawable(animationDrawable);
                animationDrawable.start();
                return;
            }
            if (booleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            Drawable drawable2 = imageView.getDrawable();
            if (drawable2 != null && (drawable2 instanceof AnimationDrawable)) {
                ((AnimationDrawable) drawable2).stop();
            }
            imageView.setImageResource(R.drawable.ic_searchwords_voice_2);
        }
    }

    public static final void d(@k TextView textView, @l String str, @l String str2, @l String str3) {
        g0.p(textView, "<this>");
        m0.j.m(str).e(pb.a.a().getResources().getColor(R.color.main_color_main_word)).f(str2).g(str3, pb.a.a().getResources().getColor(R.color.main_color_weak_divider)).c().l().d().i(textView);
    }

    public static final void e(@k TextView textView, @l String str, @l String str2, @l String str3, boolean z11, boolean z12) {
        String str4;
        g0.p(textView, "<this>");
        int color = pb.a.a().getResources().getColor(R.color.main_color_weak_divider);
        if (str == null || !k0.n3(str, "#", false, 2, null)) {
            str4 = str;
        } else {
            o find$default = Regex.find$default(new Regex("#([^#]+)#"), str, 0, 2, null);
            if (find$default != null) {
                str2 = find$default.b().get(1);
            }
            str4 = f0.z2(str, "#", "", false, 4, null);
        }
        m0.j g11 = m0.j.m(str4).e(pb.a.a().getResources().getColor(R.color.main_blue)).f(str2).g(str3, color);
        if (z11) {
            g11.c().l();
        }
        if (!z12) {
            g11.d();
        }
        g11.i(textView);
    }

    public static /* synthetic */ void f(TextView textView, String str, String str2, String str3, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        if ((i11 & 16) != 0) {
            z12 = true;
        }
        e(textView, str, str2, str3, z11, z12);
    }
}
