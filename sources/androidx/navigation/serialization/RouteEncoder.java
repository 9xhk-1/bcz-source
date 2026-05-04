package androidx.navigation.serialization;

import a00.l1;
import androidx.annotation.RestrictTo;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import f50.b0;
import f50.i;
import i50.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import o50.f;
import o50.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class RouteEncoder<T> extends b {
    private int elementIndex;

    @k
    private final Map<String, List<String>> map;

    @k
    private final i<T> serializer;

    @k
    private final f serializersModule;

    @k
    private final Map<String, NavType<Object>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteEncoder(@k i<T> serializer, @k Map<String, ? extends NavType<Object>> typeMap) {
        g0.p(serializer, "serializer");
        g0.p(typeMap, "typeMap");
        this.serializer = serializer;
        this.typeMap = typeMap;
        this.serializersModule = h.a();
        this.map = new LinkedHashMap();
        this.elementIndex = -1;
    }

    private final void internalEncodeValue(Object obj) {
        String i11 = this.serializer.a().i(this.elementIndex);
        NavType<Object> navType = this.typeMap.get(i11);
        if (navType != null) {
            this.map.put(i11, navType instanceof CollectionNavType ? ((CollectionNavType) navType).serializeAsValues(obj) : a00.g0.l(navType.serializeAsValue(obj)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + i11 + ". Please provide NavType through typeMap.").toString());
    }

    @Override // i50.b
    public boolean encodeElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        this.elementIndex = i11;
        return true;
    }

    @Override // i50.b, i50.h
    @k
    public i50.h encodeInline(@k h50.f descriptor) {
        g0.p(descriptor, "descriptor");
        if (RouteSerializerKt.isValueClass(descriptor)) {
            this.elementIndex = 0;
        }
        return super.encodeInline(descriptor);
    }

    @Override // i50.b, i50.h
    public void encodeNull() {
        internalEncodeValue(null);
    }

    @Override // i50.b, i50.h
    public <T> void encodeSerializableValue(@k b0<? super T> serializer, T t11) {
        g0.p(serializer, "serializer");
        internalEncodeValue(t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final Map<String, List<String>> encodeToArgMap(@k Object value) {
        g0.p(value, "value");
        super.encodeSerializableValue(this.serializer, value);
        return l1.D0(this.map);
    }

    @Override // i50.b
    public void encodeValue(@k Object value) {
        g0.p(value, "value");
        internalEncodeValue(value);
    }

    @Override // i50.h, i50.e
    @k
    public f getSerializersModule() {
        return this.serializersModule;
    }
}
