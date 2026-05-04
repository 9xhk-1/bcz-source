package vm;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f extends Property<Drawable, Integer> {

    /* renamed from: b, reason: collision with root package name */
    public static final Property<Drawable, Integer> f94067b = new f();

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap<Drawable, Integer> f94068a;

    public f() {
        super(Integer.class, "drawableAlphaCompat");
        this.f94068a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(@NonNull Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@NonNull Drawable drawable, @NonNull Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
