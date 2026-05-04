package com.baicizhan.main.auth.onekey;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.auth.AccountVerificationActivity;
import com.baicizhan.main.auth.VerificationType;
import com.baicizhan.online.unified_user_service.UserLoginResult;
import com.google.gson.d;
import gi.c0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import ma.b;
import ma.r;
import ma.t;
import qb.c;
import qb0.h;
import tf.i0;
import tf.j0;
import tf.q;
import va.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nOneKeyPhoneHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneKeyPhoneHelper.kt\ncom/baicizhan/main/auth/onekey/OneKeyPhoneHelper\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,172:1\n35#2:173\n35#2:174\n39#2:175\n*S KotlinDebug\n*F\n+ 1 OneKeyPhoneHelper.kt\ncom/baicizhan/main/auth/onekey/OneKeyPhoneHelper\n*L\n55#1:173\n115#1:174\n125#1:175\n*E\n"})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f19955b = "OneKeyPhoneStrategy";

    /* renamed from: c, reason: collision with root package name */
    @l
    public static h f19956c;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f19954a = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final int f19957d = 8;

    public static /* synthetic */ void d(a aVar, Activity activity, VerificationType verificationType, UserLoginResult userLoginResult, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            userLoginResult = null;
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        aVar.c(activity, verificationType, userLoginResult, i11);
    }

    public static /* synthetic */ void k(a aVar, String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        aVar.j(str, z11, str2);
    }

    public static /* synthetic */ void m(a aVar, String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        aVar.l(str, z11, str2);
    }

    public static /* synthetic */ void q(a aVar, Activity activity, VerificationType verificationType, UserLoginResult userLoginResult, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            userLoginResult = null;
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        aVar.p(activity, verificationType, userLoginResult, i11);
    }

    public static final g2 r(f fVar, Activity activity, VerificationType verificationType, UserLoginResult userLoginResult, int i11, Boolean bool) {
        c.i(f19955b, "getPhoneFinishSubject onNext:" + bool, new Object[0]);
        if (bool.booleanValue()) {
            fVar.dismiss();
            a aVar = f19954a;
            aVar.c(activity, verificationType, userLoginResult, i11);
            h hVar = f19956c;
            if (hVar != null) {
                hVar.unsubscribe();
            }
            f19956c = null;
            if (verificationType == VerificationType.LOGIN_PHONE_DIRECTLY) {
                boolean i12 = aVar.i();
                j0 e11 = aVar.e();
                aVar.j(ma.a.f72772j3, i12, e11 != null ? e11.i() : null);
            }
        } else {
            fVar.show();
        }
        return g2.f100423a;
    }

    public static final void s(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public final void c(@k Activity activity, @k VerificationType type, @l UserLoginResult userLoginResult, int i11) {
        g0.p(activity, "activity");
        g0.p(type, "type");
        if (type == VerificationType.LOGIN_PHONE_DIRECTLY) {
            g(activity, type);
        } else {
            f(activity, type, userLoginResult, i11);
        }
    }

    @l
    public final j0 e() {
        return q.f90552a.a().b();
    }

    public final void f(@k Activity activity, @k VerificationType type, @l UserLoginResult userLoginResult, int i11) {
        g0.p(activity, "activity");
        g0.p(type, "type");
        c.i(f19955b, "current operator: " + c0.a(), new Object[0]);
        if (q.f90552a.a().e()) {
            OneKeyLoginActivity.f19939d.b(activity, type, userLoginResult, i11);
            return;
        }
        if (userLoginResult != null) {
            AccountVerificationActivity.f19901o.g(activity, type, userLoginResult.access_token, userLoginResult.force_bind_phone, userLoginResult, i11);
        }
        if (userLoginResult == null) {
            AccountVerificationActivity.a.f(AccountVerificationActivity.f19901o, activity, type, null, null, 0, false, 60, null);
        }
    }

    public final void g(@k Activity activity, @k VerificationType type) {
        g0.p(activity, "activity");
        g0.p(type, "type");
        if (q.f90552a.a().e()) {
            OneKeyLoginActivity.f19939d.a(activity, type);
        } else {
            AccountVerificationActivity.a.f(AccountVerificationActivity.f19901o, activity, type, null, null, 0, false, 60, null);
        }
    }

    public final boolean h() {
        return q.f90552a.a().e() && i0.f90531a.f();
    }

    public final boolean i() {
        return q.f90552a.a().e();
    }

    public final void j(@k String eventId, boolean z11, @l String str) {
        g0.p(eventId, "eventId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(b.f72892b0, c0.a());
        linkedHashMap2.put("success", Boolean.valueOf(z11));
        if (str == null) {
            str = "";
        }
        linkedHashMap2.put(b.f72898d0, str);
        linkedHashMap2.put(b.f72901e0, Boolean.valueOf(i0.f90531a.f()));
        linkedHashMap.put("extra_info", new d().z(linkedHashMap2));
        r.g().m(t.f73023v, eventId, linkedHashMap);
    }

    public final void l(@k String eventId, boolean z11, @l String str) {
        g0.p(eventId, "eventId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(b.f72892b0, c0.a());
        linkedHashMap.put("success", Boolean.valueOf(z11));
        if (str == null) {
            str = "";
        }
        linkedHashMap.put(b.f72898d0, str);
        linkedHashMap.put(b.f72901e0, Boolean.valueOf(i0.f90531a.f()));
        g2 g2Var = g2.f100423a;
        ma.l.e(t.f73023v, eventId, linkedHashMap);
    }

    @w00.k
    public final void n(@k Activity activity, @k VerificationType type) {
        g0.p(activity, "activity");
        g0.p(type, "type");
        q(this, activity, type, null, 0, 12, null);
    }

    @w00.k
    public final void o(@k Activity activity, @k VerificationType type, @l UserLoginResult userLoginResult) {
        g0.p(activity, "activity");
        g0.p(type, "type");
        q(this, activity, type, userLoginResult, 0, 8, null);
    }

    @w00.k
    public final void p(@k final Activity activity, @k final VerificationType type, @l final UserLoginResult userLoginResult, final int i11) {
        g0.p(activity, "activity");
        g0.p(type, "type");
        if (!i0.f90531a.f()) {
            if (type == VerificationType.LOGIN_PHONE_DIRECTLY) {
                boolean i12 = i();
                j0 e11 = e();
                j(ma.a.f72772j3, i12, e11 != null ? e11.i() : null);
            }
            c(activity, type, userLoginResult, i11);
            return;
        }
        final f fVar = new f(activity);
        fVar.setCancelable(false);
        h hVar = f19956c;
        if (hVar != null && !hVar.isUnsubscribed()) {
            hVar.unsubscribe();
        }
        rx.c<Boolean> I3 = q.f90552a.a().a().I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: tf.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 r11;
                r11 = com.baicizhan.main.auth.onekey.a.r(va.f.this, activity, type, userLoginResult, i11, (Boolean) obj);
                return r11;
            }
        };
        f19956c = I3.t5(new wb0.b() { // from class: tf.c0
            @Override // wb0.b
            public final void call(Object obj) {
                com.baicizhan.main.auth.onekey.a.s(x00.l.this, obj);
            }
        });
    }
}
