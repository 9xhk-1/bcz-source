package w20;

import d30.n;
import e30.c1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSamConversionResolverImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SamConversionResolverImpl.kt\norg/jetbrains/kotlin/resolve/sam/SamConversionResolverImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1755#2,3:181\n*S KotlinDebug\n*F\n+ 1 SamConversionResolverImpl.kt\norg/jetbrains/kotlin/resolve/sam/SamConversionResolverImpl\n*L\n39#1:181,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Iterable<Object> f94738a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d30.b<p10.b, c1> f94739b;

    public b(@k n storageManager, @k Iterable<? extends Object> samWithReceiverResolvers) {
        g0.p(storageManager, "storageManager");
        g0.p(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f94738a = samWithReceiverResolvers;
        this.f94739b = storageManager.i();
    }
}
