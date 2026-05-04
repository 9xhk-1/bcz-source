package zd;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import y9.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDiscoveryTester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiscoveryTester.kt\ncom/baicizhan/main/activity/discovery/DiscoveryTester\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public static WeakReference<Fragment> f102550b;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f102549a = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f102551c = 8;

    @k
    public final Fragment a() {
        Object c11 = e.f().c(y9.c.f99701i, y9.b.f99687c);
        if (c11 == null) {
            c11 = "https://group.baicizhan.com/study_together";
        }
        Arguments arguments = new Arguments();
        g0.n(c11, "null cannot be cast to non-null type kotlin.String");
        arguments.setDefaultUrl((String) c11);
        arguments.setUrlStrategy(0);
        arguments.deserialize(arguments.getArguments());
        BczWebFragment newInstance = BczWebFragment.newInstance(arguments);
        f102550b = new WeakReference<>(newInstance);
        g0.o(newInstance, "also(...)");
        return newInstance;
    }

    @k
    public final String b() {
        Object c11 = e.f().c(y9.c.f99701i, "id");
        if (c11 == null) {
            return "study_together";
        }
        g0.n(c11, "null cannot be cast to non-null type kotlin.String");
        return (String) c11;
    }

    public final boolean c() {
        return true;
    }
}
