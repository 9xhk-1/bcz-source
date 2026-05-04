package zv;

import a00.i0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import zv.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ndev/icerock/moko/resources/desc/Utils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,38:1\n1557#2:39\n1628#2,3:40\n37#3,2:43\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ndev/icerock/moko/resources/desc/Utils\n*L\n13#1:39\n13#1:40,3\n13#1:43,2\n*E\n"})
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final p f102926a = new p();

    public final Context a(Context context) {
        n.a aVar = n.f102916a;
        if (aVar.a().a() == null) {
            return context;
        }
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(aVar.a().a());
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        g0.m(createConfigurationContext);
        return createConfigurationContext;
    }

    @m80.k
    public final Object[] b(@m80.k List<? extends Object> args, @m80.k Context context) {
        String a11;
        g0.p(args, "args");
        g0.p(context, "context");
        List<? extends Object> list = args;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (Object obj : list) {
            n nVar = obj instanceof n ? (n) obj : null;
            if (nVar != null && (a11 = nVar.a(context)) != null) {
                obj = a11;
            }
            arrayList.add(obj);
        }
        return arrayList.toArray(new Object[0]);
    }

    @m80.k
    public final Resources c(@m80.k Context context) {
        g0.p(context, "context");
        Resources resources = a(context).getResources();
        g0.o(resources, "getResources(...)");
        return resources;
    }
}
