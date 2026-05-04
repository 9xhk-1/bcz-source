package kk;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kk.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class s<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<Data> f66805a;

    /* renamed from: b, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f66806b;

    /* renamed from: c, reason: collision with root package name */
    public final List<? extends i<Data, ResourceType, Transcode>> f66807c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66808d;

    public s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.f66805a = cls;
        this.f66806b = pool;
        this.f66807c = (List) fl.m.d(list);
        this.f66808d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + com.alipay.sdk.m.u.i.f11099d;
    }

    public Class<Data> a() {
        return this.f66805a;
    }

    public u<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, @NonNull ik.e eVar2, int i11, int i12, i.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) fl.m.e(this.f66806b.acquire());
        try {
            return c(eVar, eVar2, i11, i12, aVar, list);
        } finally {
            this.f66806b.release(list);
        }
    }

    public final u<Transcode> c(com.bumptech.glide.load.data.e<Data> eVar, @NonNull ik.e eVar2, int i11, int i12, i.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f66807c.size();
        u<Transcode> uVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            try {
                uVar = this.f66807c.get(i13).a(eVar, i11, i12, eVar2, aVar);
            } catch (GlideException e11) {
                list.add(e11);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f66808d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f66807c.toArray()) + l50.b.f69928j;
    }
}
