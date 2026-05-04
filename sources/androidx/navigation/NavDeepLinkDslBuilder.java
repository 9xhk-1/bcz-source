package androidx.navigation;

import a00.l1;
import androidx.navigation.NavDeepLink;
import androidx.navigation.serialization.RouteSerializerKt;
import f50.k0;
import h10.d;
import h10.r;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@NavDeepLinkDsl
@u0({"SMAP\nNavDeepLinkDslBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkDslBuilder.kt\nandroidx/navigation/NavDeepLinkDslBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
/* loaded from: classes3.dex */
public final class NavDeepLinkDslBuilder {

    @l
    private String action;

    @k
    private final NavDeepLink.Builder builder;

    @l
    private String mimeType;

    @l
    private d<?> route;

    @k
    private Map<r, ? extends NavType<?>> typeMap;

    @l
    private String uriPattern;

    public NavDeepLinkDslBuilder() {
        this.builder = new NavDeepLink.Builder();
        this.typeMap = l1.z();
    }

    @k
    public final NavDeepLink build$navigation_common_release() {
        NavDeepLink.Builder builder = this.builder;
        String str = this.uriPattern;
        if (str == null && this.action == null && this.mimeType == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.");
        }
        if (str != null) {
            builder.setUriPattern(str);
        }
        String str2 = this.action;
        if (str2 != null) {
            builder.setAction(str2);
        }
        String str3 = this.mimeType;
        if (str3 != null) {
            builder.setMimeType(str3);
        }
        return builder.build();
    }

    @l
    public final String getAction() {
        return this.action;
    }

    @l
    public final String getMimeType() {
        return this.mimeType;
    }

    @l
    public final String getUriPattern() {
        return this.uriPattern;
    }

    public final void setAction(@l String str) {
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.action = str;
    }

    public final void setMimeType(@l String str) {
        this.mimeType = str;
    }

    public final void setUriPattern(@l String str) {
        this.uriPattern = str;
    }

    public NavDeepLinkDslBuilder(@k String basePath, @k d<?> route, @k Map<r, NavType<?>> typeMap) {
        g0.p(basePath, "basePath");
        g0.p(route, "route");
        g0.p(typeMap, "typeMap");
        this.builder = new NavDeepLink.Builder();
        this.typeMap = l1.z();
        if (basePath.length() > 0) {
            this.uriPattern = RouteSerializerKt.generateRoutePattern(k0.h(route), typeMap, basePath);
            this.route = route;
            this.typeMap = typeMap;
            return;
        }
        throw new IllegalArgumentException("The basePath for NavDeepLink from KClass cannot be empty");
    }
}
