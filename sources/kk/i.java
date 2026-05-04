package kk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: f, reason: collision with root package name */
    public static final String f66715f = "DecodePath";

    /* renamed from: a, reason: collision with root package name */
    public final Class<DataType> f66716a;

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends ik.f<DataType, ResourceType>> f66717b;

    /* renamed from: c, reason: collision with root package name */
    public final xk.e<ResourceType, Transcode> f66718c;

    /* renamed from: d, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f66719d;

    /* renamed from: e, reason: collision with root package name */
    public final String f66720e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<ResourceType> {
        @NonNull
        u<ResourceType> a(@NonNull u<ResourceType> uVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ik.f<DataType, ResourceType>> list, xk.e<ResourceType, Transcode> eVar, Pools.Pool<List<Throwable>> pool) {
        this.f66716a = cls;
        this.f66717b = list;
        this.f66718c = eVar;
        this.f66719d = pool;
        this.f66720e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + com.alipay.sdk.m.u.i.f11099d;
    }

    public u<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i11, int i12, @NonNull ik.e eVar2, a<ResourceType> aVar) throws GlideException {
        return this.f66718c.a(aVar.a(b(eVar, i11, i12, eVar2)), eVar2);
    }

    @NonNull
    public final u<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i11, int i12, @NonNull ik.e eVar2) throws GlideException {
        List<Throwable> list = (List) fl.m.e(this.f66719d.acquire());
        try {
            return c(eVar, i11, i12, eVar2, list);
        } finally {
            this.f66719d.release(list);
        }
    }

    @NonNull
    public final u<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i11, int i12, @NonNull ik.e eVar2, List<Throwable> list) throws GlideException {
        int size = this.f66717b.size();
        u<ResourceType> uVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            ik.f<DataType, ResourceType> fVar = this.f66717b.get(i13);
            try {
                if (fVar.b(eVar.a(), eVar2)) {
                    uVar = fVar.a(eVar.a(), i11, i12, eVar2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e11) {
                if (Log.isLoggable(f66715f, 2)) {
                    Log.v(f66715f, "Failed to decode data for " + fVar, e11);
                }
                list.add(e11);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f66720e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f66716a + ", decoders=" + this.f66717b + ", transcoder=" + this.f66718c + l50.b.f69928j;
    }
}
