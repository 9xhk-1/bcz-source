package vm;

import android.animation.TypeEvaluator;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d implements TypeEvaluator<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final d f94065a = new d();

    @NonNull
    public static d b() {
        return f94065a;
    }

    @Override // android.animation.TypeEvaluator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer evaluate(float f11, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f12 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f13 = f12 + (((((intValue2 >> 24) & 255) / 255.0f) - f12) * f11);
        float pow5 = pow2 + ((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f11);
        float pow6 = pow3 + (f11 * (((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3));
        return Integer.valueOf((Math.round(((float) Math.pow(pow + ((pow4 - pow) * f11), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f13 * 255.0f) << 24) | (Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow6, 0.45454545454545453d)) * 255.0f));
    }
}
