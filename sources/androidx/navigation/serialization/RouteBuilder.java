package androidx.navigation.serialization;

import a00.r0;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import f50.i;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l50.b;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRouteBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteBuilder.kt\nandroidx/navigation/serialization/RouteBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1855#2,2:112\n*S KotlinDebug\n*F\n+ 1 RouteBuilder.kt\nandroidx/navigation/serialization/RouteBuilder\n*L\n88#1:112,2\n*E\n"})
/* loaded from: classes3.dex */
public final class RouteBuilder<T> {

    @k
    private final String path;

    @k
    private String pathArgs;

    @k
    private String queryArgs;

    @k
    private final i<T> serializer;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ParamType {
        PATH,
        QUERY
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParamType.values().length];
            try {
                iArr[ParamType.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParamType.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RouteBuilder(@k i<T> serializer) {
        g0.p(serializer, "serializer");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = serializer;
        this.path = serializer.a().k();
    }

    private final void addPath(String str) {
        this.pathArgs += '/' + str;
    }

    private final void addQuery(String str, String str2) {
        this.queryArgs += (this.queryArgs.length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    private final ParamType computeParamType(int i11, NavType<Object> navType) {
        return ((navType instanceof CollectionNavType) || this.serializer.a().l(i11)) ? ParamType.QUERY : ParamType.PATH;
    }

    public final void appendArg(int i11, @k String name, @k NavType<Object> type, @k List<String> value) {
        g0.p(name, "name");
        g0.p(type, "type");
        g0.p(value, "value");
        int i12 = WhenMappings.$EnumSwitchMapping$0[computeParamType(i11, type).ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                return;
            }
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                addQuery(name, (String) it.next());
            }
            return;
        }
        if (value.size() == 1) {
            addPath((String) r0.G2(value));
            return;
        }
        throw new IllegalArgumentException(("Expected one value for argument " + name + ", found " + value.size() + "values instead.").toString());
    }

    public final void appendPattern(int i11, @k String name, @k NavType<Object> type) {
        g0.p(name, "name");
        g0.p(type, "type");
        int i12 = WhenMappings.$EnumSwitchMapping$0[computeParamType(i11, type).ordinal()];
        if (i12 == 1) {
            addPath(b.f69927i + name + b.f69928j);
            return;
        }
        if (i12 != 2) {
            return;
        }
        addQuery(name, b.f69927i + name + b.f69928j);
    }

    @k
    public final String build() {
        return this.path + this.pathArgs + this.queryArgs;
    }

    public RouteBuilder(@k String path, @k i<T> serializer) {
        g0.p(path, "path");
        g0.p(serializer, "serializer");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = serializer;
        this.path = path;
    }
}
