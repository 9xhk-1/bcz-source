package en;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import fn.u5;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final u5 f50034a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map<Integer, fn.j> f50035b;

    static {
        u5 u5Var = new u5();
        f50034a = u5Var;
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_primary), u5Var.P2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_primary), u5Var.y2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_primary_inverse), u5Var.p2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_primary_container), u5Var.Q2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_primary_container), u5Var.z2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_secondary), u5Var.V2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_secondary), u5Var.C2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_secondary_container), u5Var.W2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_secondary_container), u5Var.D2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_tertiary), u5Var.l3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary), u5Var.I2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_tertiary_container), u5Var.m3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary_container), u5Var.J2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_background), u5Var.g2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_background), u5Var.v2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface), u5Var.b3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_surface), u5Var.G2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_variant), u5Var.k3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_surface_variant), u5Var.H2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_inverse), u5Var.q2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_surface_inverse), u5Var.o2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_bright), u5Var.c3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_dim), u5Var.i3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_container), u5Var.d3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_container_low), u5Var.g3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_container_high), u5Var.e3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_container_lowest), u5Var.h3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_surface_container_highest), u5Var.f3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_outline), u5Var.M2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_outline_variant), u5Var.N2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_error), u5Var.k2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_error), u5Var.w2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_error_container), u5Var.l2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_on_error_container), u5Var.x2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_control_activated), u5Var.h2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_control_normal), u5Var.j2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_control_highlight), u5Var.i2());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse), u5Var.r3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse), u5Var.t3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled), u5Var.u3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse_disable_only), u5Var.s3());
        hashMap.put(Integer.valueOf(R.color.material_personalized_color_text_hint_foreground_inverse), u5Var.q3());
        f50035b = Collections.unmodifiableMap(hashMap);
    }

    @NonNull
    public static Map<Integer, Integer> a(@NonNull fn.k kVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, fn.j> entry : f50035b.entrySet()) {
            hashMap.put(entry.getKey(), Integer.valueOf(entry.getValue().h(kVar)));
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
