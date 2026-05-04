package dh;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.webview.sdk.Navigator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nnavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 navigator.kt\ncom/baicizhan/main/navigator/AbsNavigator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
/* loaded from: classes4.dex */
public abstract class a implements Navigator {

    /* renamed from: b, reason: collision with root package name */
    public static final int f47964b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public a f47965a;

    @m80.l
    public final a a() {
        return this.f47965a;
    }

    public abstract boolean b(@m80.k Uri uri, @m80.k Context context);

    public final void c(@m80.l a aVar) {
        this.f47965a = aVar;
    }

    @Override // com.baicizhan.client.business.webview.sdk.Navigator
    public boolean navigator(@m80.k Uri url, @m80.k Context context) {
        g0.p(url, "url");
        g0.p(context, "context");
        boolean b11 = b(url, context);
        Boolean valueOf = Boolean.valueOf(b11);
        if (!b11) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        a aVar = this.f47965a;
        Boolean valueOf2 = aVar != null ? Boolean.valueOf(aVar.navigator(url, context)) : null;
        if (valueOf2 != null) {
            return valueOf2.booleanValue();
        }
        return false;
    }
}
