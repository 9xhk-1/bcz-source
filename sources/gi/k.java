package gi;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.online.notify.Notify;
import gi.k;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nCommonUtils2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils2.kt\ncom/baicizhan/main/utils/CommonUtils2\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,145:1\n18#2,3:146\n18#2,3:149\n*S KotlinDebug\n*F\n+ 1 CommonUtils2.kt\ncom/baicizhan/main/utils/CommonUtils2\n*L\n132#1:146,3\n134#1:149,3\n*E\n"})
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final k f53781a = new k();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f53782b = "https://wap.cmpassport.com/resources/html/contract.html";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f53783c = "https://ms.zzx9.cn/html/oauth/protocol2.html";

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f53784d = "https://e.189.cn/sdk/agreement/content.do?type=main&appKey=&hidetop=true&returnUrl=";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f53785e = "登录";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f53786f = "绑定";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f53787g = "确认";

    /* renamed from: h, reason: collision with root package name */
    public static final int f53788h = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f53789a;

        public a(x00.a<g2> aVar) {
            this.f53789a = aVar;
        }

        public static final void b(View view) {
            view.setEnabled(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(final View widget) {
            kotlin.jvm.internal.g0.p(widget, "widget");
            widget.setEnabled(false);
            widget.postDelayed(new Runnable() { // from class: gi.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.a.b(widget);
                }
            }, 1000L);
            this.f53789a.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            kotlin.jvm.internal.g0.p(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setUnderlineText(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpannableString f(k kVar, Activity activity, String str, boolean z11, x00.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            aVar = null;
        }
        return kVar.e(activity, str, z11, aVar);
    }

    public static final g2 g(WeakReference weakReference, x00.a aVar) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            BczWebHelperKt.startBczProtocolWeb(activity);
            if (aVar != null) {
                aVar.invoke();
            }
        }
        return g2.f100423a;
    }

    public static final g2 h(WeakReference weakReference, x00.a aVar) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            BczWebHelperKt.startPrivacyProtocolWeb(activity);
            if (aVar != null) {
                aVar.invoke();
            }
        }
        return g2.f100423a;
    }

    public static final g2 i(WeakReference weakReference, x00.a aVar) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            BczWebHelperKt.startChildProtocolWeb(activity);
            if (aVar != null) {
                aVar.invoke();
            }
        }
        return g2.f100423a;
    }

    public static final g2 j(WeakReference weakReference, int i11, x00.a aVar) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            String str = i11 != 1 ? i11 != 2 ? i11 != 3 ? "" : f53784d : f53783c : f53782b;
            if (str.length() > 0) {
                BczWebExecutorKt.startNormalWeb$default(activity, str, null, false, 0, null, 60, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }
        return g2.f100423a;
    }

    @w00.k
    @w00.o
    public static final boolean l(@m80.k Activity activity) {
        kotlin.jvm.internal.g0.p(activity, "activity");
        return n(activity, 0.0f, 2, null);
    }

    @w00.k
    @w00.o
    public static final boolean m(@m80.k Activity activity, float f11) {
        kotlin.jvm.internal.g0.p(activity, "activity");
        return ((float) xb.f.f(activity)) / ((float) xb.f.i(activity)) >= f11;
    }

    public static /* synthetic */ boolean n(Activity activity, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 2.0f;
        }
        return m(activity, f11);
    }

    @w00.o
    @m80.k
    public static final String o(@m80.l Notify notify) {
        if (notify == null) {
            return "";
        }
        String str = notify.aid;
        String str2 = null;
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        String str3 = notify.title;
        if (str3 != null && str3.length() != 0) {
            str2 = str3;
        }
        return str2 == null ? "" : str2;
    }

    @m80.k
    public final SpannableString e(@m80.k Activity activity, @m80.k String type, boolean z11, @m80.l final x00.a<g2> aVar) {
        String str;
        String str2;
        kotlin.jvm.internal.g0.p(activity, "activity");
        kotlin.jvm.internal.g0.p(type, "type");
        final WeakReference weakReference = new WeakReference(activity);
        String str3 = type + "代表你已同意 用户协议、隐私政策" + (z11 ? "、" : " 和 ") + "儿童隐私政策";
        k kVar = f53781a;
        a k11 = kVar.k(new x00.a() { // from class: gi.f
            @Override // x00.a
            public final Object invoke() {
                g2 g11;
                g11 = k.g(weakReference, aVar);
                return g11;
            }
        });
        a k12 = kVar.k(new x00.a() { // from class: gi.g
            @Override // x00.a
            public final Object invoke() {
                g2 h11;
                h11 = k.h(weakReference, aVar);
                return h11;
            }
        });
        a k13 = kVar.k(new x00.a() { // from class: gi.h
            @Override // x00.a
            public final Object invoke() {
                g2 i11;
                i11 = k.i(weakReference, aVar);
                return i11;
            }
        });
        final int i11 = 0;
        a k14 = kVar.k(new x00.a() { // from class: gi.i
            @Override // x00.a
            public final Object invoke() {
                g2 j11;
                j11 = k.j(weakReference, i11, aVar);
                return j11;
            }
        });
        String str4 = "";
        if (z11) {
            if ("".length() > 0) {
                String str5 = "认证服务条款";
                str2 = str5;
                str4 = " 及 " + ((Object) str5);
            } else {
                str2 = "";
            }
            str = str2;
        } else {
            str = "";
        }
        String str6 = str3 + str4;
        SpannableString spannableString = new SpannableString(str6);
        spannableString.setSpan(k11, u30.k0.J3(str6, "用户协议", 0, false, 6, null), u30.k0.J3(str6, "用户协议", 0, false, 6, null) + 4, 34);
        spannableString.setSpan(k12, u30.k0.J3(str6, "隐私政策", 0, false, 6, null), u30.k0.J3(str6, "隐私政策", 0, false, 6, null) + 4, 34);
        spannableString.setSpan(k13, u30.k0.J3(str6, "儿童隐私政策", 0, false, 6, null), u30.k0.J3(str6, "儿童隐私政策", 0, false, 6, null) + 6, 34);
        if (z11) {
            spannableString.setSpan(k14, u30.k0.J3(str6, str, 0, false, 6, null), u30.k0.J3(str6, str, 0, false, 6, null) + str.length(), 34);
        }
        return spannableString;
    }

    public final a k(x00.a<g2> aVar) {
        return new a(aVar);
    }
}
