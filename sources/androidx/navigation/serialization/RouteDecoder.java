package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import f50.e;
import i50.a;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import o50.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/RouteDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
/* loaded from: classes3.dex */
public final class RouteDecoder extends a {
    private int elementIndex;

    @k
    private String elementName;

    @k
    private final f serializersModule;

    @k
    private final ArgStore store;

    public RouteDecoder(@k Bundle bundle, @k Map<String, ? extends NavType<?>> typeMap) {
        g0.p(bundle, "bundle");
        g0.p(typeMap, "typeMap");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = o50.k.a();
        this.store = new BundleArgStore(bundle, typeMap);
    }

    private final Object internalDecodeValue() {
        Object obj = this.store.get(this.elementName);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(("Unexpected null value for non-nullable argument " + this.elementName).toString());
    }

    @Override // i50.d
    public int decodeElementIndex(@k h50.f descriptor) {
        String i11;
        g0.p(descriptor, "descriptor");
        int i12 = this.elementIndex;
        do {
            i12++;
            if (i12 >= descriptor.h()) {
                return -1;
            }
            i11 = descriptor.i(i12);
        } while (!this.store.contains(i11));
        this.elementIndex = i12;
        this.elementName = i11;
        return i12;
    }

    @Override // i50.a, i50.f
    @k
    public i50.f decodeInline(@k h50.f descriptor) {
        g0.p(descriptor, "descriptor");
        if (RouteSerializerKt.isValueClass(descriptor)) {
            this.elementName = descriptor.i(0);
            this.elementIndex = 0;
        }
        return super.decodeInline(descriptor);
    }

    @Override // i50.a, i50.f
    public boolean decodeNotNullMark() {
        return this.store.get(this.elementName) != null;
    }

    @Override // i50.a, i50.f
    @l
    public Void decodeNull() {
        return null;
    }

    public final <T> T decodeRouteWithArgs$navigation_common_release(@k e<? extends T> deserializer) {
        g0.p(deserializer, "deserializer");
        return (T) super.decodeSerializableValue(deserializer);
    }

    @Override // i50.a, i50.f
    public <T> T decodeSerializableValue(@k e<? extends T> deserializer) {
        g0.p(deserializer, "deserializer");
        return (T) internalDecodeValue();
    }

    @Override // i50.a
    @k
    public Object decodeValue() {
        return internalDecodeValue();
    }

    @Override // i50.f, i50.d
    @k
    public f getSerializersModule() {
        return this.serializersModule;
    }

    public RouteDecoder(@k SavedStateHandle handle, @k Map<String, ? extends NavType<?>> typeMap) {
        g0.p(handle, "handle");
        g0.p(typeMap, "typeMap");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = o50.k.a();
        this.store = new SavedStateArgStore(handle, typeMap);
    }

    public static /* synthetic */ void getSerializersModule$annotations() {
    }
}
