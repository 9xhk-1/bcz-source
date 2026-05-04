package vm;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class c {
    public static void a(@NonNull AnimatorSet animatorSet, @NonNull List<Animator> list) {
        int size = list.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Animator animator = list.get(i11);
            j11 = Math.max(j11, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j11);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
