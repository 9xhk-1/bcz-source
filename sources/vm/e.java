package vm;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f94066a = new e("childrenAlpha");

    public e(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(@NonNull ViewGroup viewGroup) {
        Float f11 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f11 != null ? f11 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@NonNull ViewGroup viewGroup, @NonNull Float f11) {
        float floatValue = f11.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f11);
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            viewGroup.getChildAt(i11).setAlpha(floatValue);
        }
    }
}
