package gt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final int f57821d;

    public c(CharSequence charSequence, float f11, @LayoutRes int i11) {
        super(charSequence, f11);
        this.f57821d = i11;
    }

    public static c d(CharSequence charSequence, float f11, @LayoutRes int i11) {
        return new c(charSequence, f11, i11);
    }

    public static c e(CharSequence charSequence, @LayoutRes int i11) {
        return d(charSequence, 1.0f, i11);
    }

    public View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(this.f57821d, viewGroup, false);
    }
}
