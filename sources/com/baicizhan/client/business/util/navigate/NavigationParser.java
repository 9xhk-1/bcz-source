package com.baicizhan.client.business.util.navigate;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.util.navigate.NavigationIntent;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.client.business.webview.sdk.NavigatorMgr;
import jc.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nNavigationParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationParser.kt\ncom/baicizhan/client/business/util/navigate/NavigationParser\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n18#2,3:91\n1#3:94\n*S KotlinDebug\n*F\n+ 1 NavigationParser.kt\ncom/baicizhan/client/business/util/navigate/NavigationParser\n*L\n33#1:91,3\n*E\n"})
/* loaded from: classes4.dex */
public final class NavigationParser implements com.baicizhan.client.business.webview.sdk.Navigator {
    private final /* synthetic */ com.baicizhan.client.business.webview.sdk.Navigator $$delegate_0;

    @k
    public static final NavigationParser INSTANCE = new NavigationParser();
    public static final int $stable = 8;

    private NavigationParser() {
        com.baicizhan.client.business.webview.sdk.Navigator navigator = NavigatorMgr.INSTANCE.getNavigator();
        this.$$delegate_0 = navigator == null ? new com.baicizhan.client.business.webview.sdk.Navigator() { // from class: com.baicizhan.client.business.util.navigate.NavigationParser.1
            @Override // com.baicizhan.client.business.webview.sdk.Navigator
            public boolean navigator(Uri url, Context context) {
                g0.p(url, "url");
                g0.p(context, "context");
                c.q("NavigationParser", "Illegal navigator!", new Object[0]);
                return false;
            }
        } : navigator;
    }

    public static /* synthetic */ boolean navigate$default(NavigationParser navigationParser, Context context, String str, OpenNavigateListener openNavigateListener, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            openNavigateListener = null;
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        return navigationParser.navigate(context, str, openNavigateListener, i11);
    }

    public static /* synthetic */ NavigationIntent parse$default(NavigationParser navigationParser, String str, OpenNavigateListener openNavigateListener, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            openNavigateListener = null;
        }
        return navigationParser.parse(str, openNavigateListener);
    }

    public final boolean navigate(@k Context context, @l String str, @l OpenNavigateListener openNavigateListener, int i11) {
        g0.p(context, "context");
        NavigationIntent<? extends Object> parse = parse(str, openNavigateListener);
        c.b("NavigationParser", "parsed nav: " + parse, new Object[0]);
        if (parse instanceof NavigationIntent.Native) {
            NavigationIntent.Native r11 = (NavigationIntent.Native) parse;
            return navigateNatively(context, r11.getIntent(), i11) || navigator(r11.getIntent(), context);
        }
        if (parse instanceof NavigationIntent.Web) {
            return BczWebExecutorKt.startNormalWeb$default(context, ((NavigationIntent.Web) parse).getIntent(), null, false, 0, null, 60, null);
        }
        if (parse instanceof NavigationIntent.WebIntent) {
            return BczWebHelperKt.startNewWebActivity(context, ((NavigationIntent.WebIntent) parse).getIntent());
        }
        c.d("NavigationParser", "unsupported for [" + str + "]", new Object[0]);
        return false;
    }

    public final boolean navigateNatively(@k Context context, @k Uri uri, int i11) {
        g0.p(context, "context");
        g0.p(uri, "uri");
        try {
            if (context instanceof FragmentActivity) {
                Intent intent = new Intent(a.f64014a);
                intent.setData(uri);
                ((FragmentActivity) context).startActivityForResult(intent, i11);
                return true;
            }
            Intent intent2 = new Intent(a.f64014a);
            intent2.setData(uri);
            context.startActivity(intent2);
            return true;
        } catch (Exception e11) {
            c.d("NavigationParser", e11.getMessage(), new Object[0]);
            return false;
        }
    }

    @Override // com.baicizhan.client.business.webview.sdk.Navigator
    public boolean navigator(@k Uri url, @k Context context) {
        g0.p(url, "url");
        g0.p(context, "context");
        return this.$$delegate_0.navigator(url, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (r9 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b A[Catch: Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:15:0x0004, B:18:0x000c, B:21:0x0025, B:24:0x0036, B:26:0x0040, B:31:0x004b, B:34:0x005c, B:36:0x007b, B:5:0x010d, B:38:0x0055, B:41:0x0066, B:44:0x006d, B:45:0x0077, B:46:0x0080, B:48:0x0086, B:51:0x008c, B:53:0x0096, B:58:0x00a1, B:61:0x00af, B:63:0x00a8, B:66:0x00b6, B:69:0x00bd, B:71:0x00c7, B:75:0x00ce, B:77:0x00d8, B:82:0x00e3, B:85:0x00f1, B:86:0x00ea, B:89:0x00f7, B:92:0x00fe, B:93:0x0107), top: B:14:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x010d A[Catch: Exception -> 0x0052, TRY_LEAVE, TryCatch #0 {Exception -> 0x0052, blocks: (B:15:0x0004, B:18:0x000c, B:21:0x0025, B:24:0x0036, B:26:0x0040, B:31:0x004b, B:34:0x005c, B:36:0x007b, B:5:0x010d, B:38:0x0055, B:41:0x0066, B:44:0x006d, B:45:0x0077, B:46:0x0080, B:48:0x0086, B:51:0x008c, B:53:0x0096, B:58:0x00a1, B:61:0x00af, B:63:0x00a8, B:66:0x00b6, B:69:0x00bd, B:71:0x00c7, B:75:0x00ce, B:77:0x00d8, B:82:0x00e3, B:85:0x00f1, B:86:0x00ea, B:89:0x00f7, B:92:0x00fe, B:93:0x0107), top: B:14:0x0004 }] */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.baicizhan.client.business.util.navigate.NavigationIntent<? extends java.lang.Object> parse(@m80.l java.lang.String r13, @m80.l com.baicizhan.client.business.util.navigate.OpenNavigateListener r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.navigate.NavigationParser.parse(java.lang.String, com.baicizhan.client.business.util.navigate.OpenNavigateListener):com.baicizhan.client.business.util.navigate.NavigationIntent");
    }
}
