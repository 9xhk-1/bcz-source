package com.baicizhan.client.business.util.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.animation.PropKvStoreDelegate;
import d10.f;
import h10.n;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import nc.b;
import x00.a;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PropKvStoreDelegate<T> implements f<Object, T> {
    public static final int $stable = 8;

    @k
    private final Class<T> clazz;

    @k
    private final c0 kv$delegate;

    @k
    private final String kvName;

    public PropKvStoreDelegate(@k String kvName, @k Class<T> clazz) {
        g0.p(kvName, "kvName");
        g0.p(clazz, "clazz");
        this.kvName = kvName;
        this.clazz = clazz;
        this.kv$delegate = e0.c(new a() { // from class: qa.a
            @Override // x00.a
            public final Object invoke() {
                nc.a kv_delegate$lambda$0;
                kv_delegate$lambda$0 = PropKvStoreDelegate.kv_delegate$lambda$0(PropKvStoreDelegate.this);
                return kv_delegate$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nc.a kv_delegate$lambda$0(PropKvStoreDelegate propKvStoreDelegate) {
        return b.c(propKvStoreDelegate.kvName);
    }

    @k
    public final Class<T> getClazz() {
        return this.clazz;
    }

    @k
    public final nc.a getKv() {
        Object value = this.kv$delegate.getValue();
        g0.o(value, "getValue(...)");
        return (nc.a) value;
    }

    @k
    public final String getKvName() {
        return this.kvName;
    }

    @Override // d10.f, d10.e
    @l
    public T getValue(@k Object thisRef, @k n<?> property) {
        g0.p(thisRef, "thisRef");
        g0.p(property, "property");
        return (T) BczJson.fromJson(getKv().getString(property.getName(), ""), (Class) this.clazz);
    }

    @Override // d10.f
    public void setValue(@k Object thisRef, @k n<?> property, @l T t11) {
        g0.p(thisRef, "thisRef");
        g0.p(property, "property");
        getKv().p(property.getName(), BczJson.toJson(t11));
    }
}
