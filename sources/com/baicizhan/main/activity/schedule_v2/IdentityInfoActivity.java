package com.baicizhan.main.activity.schedule_v2;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.activity.schedule_v2.IdentityInfoActivity;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.json.JSONObject;
import va.f;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nIdentityInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityInfoActivity.kt\ncom/baicizhan/main/activity/schedule_v2/IdentityInfoActivity\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,55:1\n18#2,3:56\n*S KotlinDebug\n*F\n+ 1 IdentityInfoActivity.kt\ncom/baicizhan/main/activity/schedule_v2/IdentityInfoActivity\n*L\n22#1:56,3\n*E\n"})
/* loaded from: classes4.dex */
public abstract class IdentityInfoActivity extends BaseAppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f18941d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f18942e = 8;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f18943f = "identity";

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f18944g = "configuration";

    /* renamed from: h, reason: collision with root package name */
    public static final int f18945h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f18946i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f18947j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f18948k = 3;

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final String f18949l = "form";

    /* renamed from: a, reason: collision with root package name */
    public int f18950a = -1;

    /* renamed from: b, reason: collision with root package name */
    @k
    public String f18951b = "";

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f18952c = e0.c(new x00.a() { // from class: oe.y0
        @Override // x00.a
        public final Object invoke() {
            va.f M0;
            M0 = IdentityInfoActivity.M0(IdentityInfoActivity.this);
            return M0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public static final f M0(IdentityInfoActivity identityInfoActivity) {
        return new f(identityInfoActivity);
    }

    @k
    public final f E0() {
        return (f) this.f18952c.getValue();
    }

    @l
    public final String J0() {
        String str = this.f18951b;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return new JSONObject(new JSONObject(str).getString("data")).getString(y9.b.f99687c);
        } catch (Exception e11) {
            qb.c.c("IdentityInfoActivity", "", e11);
            return "";
        }
    }

    @k
    public final String K0() {
        return this.f18951b;
    }

    public final int L0() {
        return this.f18950a;
    }

    public final void N0(@k String str) {
        g0.p(str, "<set-?>");
        this.f18951b = str;
    }

    public final void O0(int i11) {
        this.f18950a = i11;
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        this.f18950a = getIntent().getIntExtra("form", 0);
        String stringExtra = getIntent().getStringExtra(f18944g);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f18951b = stringExtra;
    }
}
