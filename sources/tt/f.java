package tt;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import androidx.annotation.NonNull;
import qt.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends e {
    public f(@NonNull b.a aVar) {
        super(aVar);
    }

    @Override // tt.e
    @NonNull
    public PropertyValuesHolder n(boolean z11) {
        int i11;
        int i12;
        String str;
        if (z11) {
            i12 = this.f90919l;
            i11 = (int) (i12 * this.f90920m);
            str = e.f90917r;
        } else {
            i11 = this.f90919l;
            i12 = (int) (i11 * this.f90920m);
            str = e.f90918s;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i11, i12);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
